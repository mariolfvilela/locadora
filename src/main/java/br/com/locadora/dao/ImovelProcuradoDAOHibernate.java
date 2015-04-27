package br.com.locadora.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.locadora.modelo.Imovel;
import br.com.locadora.modelo.ImovelProcurado;
import br.com.locadora.modelo.MensagemFuncionario;
import br.com.locadora.rn.ImovelProcuradoRN;
import br.com.locadora.rn.MensagemFuncionarioRN;
import br.com.locadora.util.HibernateUtil;

public class ImovelProcuradoDAOHibernate implements ImovelProcuradoDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}
	@Override
	public void salvar(ImovelProcurado imovelProcurado) {
		this.session.save(imovelProcurado);
	}

	@Override
	public void atualizar(ImovelProcurado imovelProcurado) {
		this.session.update(imovelProcurado);
	}

	@Override
	public void excluir(ImovelProcurado imovelProcurado) {
		this.session.delete(imovelProcurado);

	}

	@Override
	public ImovelProcurado carregar(Integer imoProId) {
		return (ImovelProcurado) this.session.get(ImovelProcurado.class, imoProId);
	}

	@Override
	public ImovelProcurado buscarPorImovelProcurado(String imovelProcurado) {
		String hql = "select e from ImovelProcurado e where e.emaEndereco = :imovelProcurado";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("imovelProcurado", imovelProcurado);
		return (ImovelProcurado) consulta.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ImovelProcurado> listar() {
		return this.session.createCriteria(ImovelProcurado.class).list();
	}
	@Override
	public void procurarImovel(Imovel imovel) {
		List<ImovelProcurado> listaImoveisProcurados=new ImovelProcuradoRN().listar();
		for(ImovelProcurado imo: listaImoveisProcurados){
			String sql=imo.getImoProSql()+" AND (imo.imoId="+imovel.getImoId()+")";
			Query  query=session.createQuery(sql);
			Imovel imovel2=(Imovel) query.uniqueResult();
			if(imovel2!=null){
				MensagemFuncionario mensagemFuncionario=new MensagemFuncionario();
				mensagemFuncionario.setFuncionario(imovel.getFuncionario());
				mensagemFuncionario.setMenFunRemetente("Sistema de Procura de Imovel");
				mensagemFuncionario.setMenFunDataCriacao(new Date());
				mensagemFuncionario.setMenFunId(2);
				mensagemFuncionario.setMenFunMensagem("Sistema encontrou um imovel que estava sendo procurado, sendo o imovel:"+imovel.getImoId());
				mensagemFuncionario.setMenFunVisualizada(false);
				new MensagemFuncionarioRN().salvar(mensagemFuncionario);
				
				Session sessao =  HibernateUtil.getSessionFactory()
						.getCurrentSession();
				sessao.evict(imovel2);
				sessao.evict(mensagemFuncionario);
			}
		}
		
	}

}
