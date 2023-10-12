package vn.edu.iuh.fit.www_lab_week_01.repositories;

import vn.edu.iuh.fit.www_lab_week_01.connect.Connection;
import vn.edu.iuh.fit.www_lab_week_01.entities.Account;

public class AccountRepository {
    private Connection connection;

    public AccountRepository() {
        connection = Connection.getConnection();
    }

    public boolean insertAccount(Account account) throws Exception {
        String sql= "insert into account values(?,?,?,?,?,?,?)";
        //PreparedStatement ps= connection.prepareStatement(sql);

        return false;
    }

    //    private EntityManager em;
//    private EntityTransaction etr;
//
//    public AccountRepository() {
//        em= Persistence.createEntityManagerFactory("lab_week_01").createEntityManager();
//        etr=em.getTransaction();
//    }
//
//    public boolean insertAcc(Account account) {
//        try {
//            etr.begin();
//            em.persist(account);
//            etr.commit();
//            return  true;
//        } catch (Exception e) {
//            etr.rollback();
//            e.printStackTrace();
//        }
//        return false;
//    }
}
