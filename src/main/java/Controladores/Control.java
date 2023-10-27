package Controladores;

import Daos.Accesos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Accesos acceso = new Accesos("Usu","Acceso usuarios biblioteca");
		Accesos acceso2 = new Accesos("Emp","Empleados biblioteca");
		em.persist(acceso);
		em.persist(acceso2);
		em.getTransaction().commit();
		em.close();

	}

}
