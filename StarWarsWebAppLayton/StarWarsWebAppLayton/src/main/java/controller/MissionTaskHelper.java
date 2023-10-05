package controller; // or another appropriate package you're using

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.MissionTask; 

public class MissionTaskHelper {

    private static EntityManagerFactory emf = 
        Persistence.createEntityManagerFactory("StarWarsWebAppLayton");  
    
    public void insertMissionTask(MissionTask mt) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(mt);
        em.getTransaction().commit();
        em.close();
    }

    public List<MissionTask> showAllTasks() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<MissionTask> typedQuery = em.createQuery("SELECT mt FROM MissionTask mt", MissionTask.class);
        List<MissionTask> allTasks = typedQuery.getResultList();
        em.close();
        return allTasks;
    }
    public MissionTask searchForMissionTaskById(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        MissionTask found = em.find(MissionTask.class, id);
        em.close();
        return found;
    }

}