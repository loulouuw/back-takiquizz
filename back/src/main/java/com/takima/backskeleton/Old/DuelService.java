//package com.takima.backskeleton.services;
//
//import com.takima.backskeleton.DAO.DuelDao;
//import com.takima.backskeleton.models.Duel;
//import com.takima.backskeleton.models.Player;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class DuelService {
//    @Autowired
//
//    private DuelDao duelDao;
//
//    public Duel saveDuel(Duel duel) {return duelDao.save(duel);}
//
//    public void deleteDuel(Long id) {
//        duelDao.deleteById(id);
//    }
//
//    public Optional<Duel> getDuelById(Long id) {
//        return duelDao.findById(id);
//    }
//
//
//}