package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.MissionDetails;

public class MissionDetailsHelper {
    
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StarWarsWebAppLayton");

    public void insertNewMissionDetails(MissionDetails md) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(md);
        em.getTransaction().commit();
        em.close();
    }

    public List<MissionDetails> getMissions() {
        EntityManager em = emfactory.createEntityManager();
        List<MissionDetails> allMissions = em.createQuery("SELECT m FROM MissionDetails m").getResultList();
        return allMissions;
    }
    
    public List<MissionDetails> showAllMissions() {
        EntityManager em = emfactory.createEntityManager();
        List<MissionDetails> allMissions = em.createQuery("SELECT m FROM MissionDetails m").getResultList();
        return allMissions;
    }
    
    public void deleteMission(MissionDetails toDelete) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<MissionDetails> typedQuery = em.createQuery("select mission from MissionDetails mission where mission.id = :selectedId", MissionDetails.class);
        typedQuery.setParameter("selectedId", toDelete.getId());
        typedQuery.setMaxResults(1);
        MissionDetails result = typedQuery.getSingleResult();
        em.remove(result);
        em.getTransaction().commit();
        em.close();
    }
    public MissionDetails searchForMissionDetailsById(Integer tempId) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        MissionDetails found = em.find(MissionDetails.class, tempId);
        em.close();
        return found;
    }
    
    public void updateMission(MissionDetails missionToUpdate) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(missionToUpdate);
        em.getTransaction().commit();
        em.close();
    }
    
    public void updateMissionDetails(MissionDetails missionToUpdate) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(missionToUpdate);
        em.getTransaction().commit();
        em.close();
    }
}