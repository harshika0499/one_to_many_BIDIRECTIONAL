package onetomany_DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_DTO.Hospital;

public class DAO
{
	public void Insert(Hospital h)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(h);
		et.commit();
	}

	public void Update(int id, Hospital h)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Hospital h1   =   em.find(Hospital.class, id);

		if(h1!=null)
		{
			et.begin();
			h1.setId(id);
			h1.setB(h1.getB());
			em.merge(h1);
			et.commit();
		}
		else
		{
			System.out.println("invalid id");
		}
	}
	
	public void fetch(int id)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		Hospital h2  =   em.find(Hospital.class, id);
		System.out.println(h2);
	}
	
	public void delete(int id)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Hospital h3  =   em.find(Hospital.class, id);
		et.begin();
		em.remove(h3);
		et.commit();
	}
	
}
