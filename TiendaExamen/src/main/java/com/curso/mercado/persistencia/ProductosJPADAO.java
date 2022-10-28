package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.entidades.Producto;

public class ProductosJPADAO implements GenericDAO<Producto> {
	EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("OracleHRPU");
	EntityManager em = factory.createEntityManager();

	@Override
	public void add(Producto entidad) {
		em.getTransaction().begin();
		em.persist(entidad);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Producto> getAll() {
		Query q = em.createNamedQuery("Select p From Producto p ");
		return q.getResultList();
	}

	@Override
	public Producto getByID(int id) {
		return em.find(Producto.class, id);
	}

	@Override
	public void delete(int id) {
		em.getTransaction().begin();
		Producto p = em.find(Producto.class, id);	
		em.remove(p);
		em.getTransaction().commit();
	}

	@Override
	public void update(Producto entidad) {
		em.getTransaction().begin();
		em.merge(entidad);
		em.getTransaction().commit();
		
	}

}
