package vn.edu.iuh.fit.www_lab_week_01.repositories;

import vn.edu.iuh.fit.www_lab_week_01.connect.Connect;
import vn.edu.iuh.fit.www_lab_week_01.entities.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private Connection connection;

    public AccountRepository() {
        connection = Connect.getConnection();
    }

    public boolean insertAccount(Account account) throws Exception {
        String sql= "insert into account values(?,?,?,?,?,?)";
        PreparedStatement ps= connection.prepareStatement(sql);
        ps.setString(1, account.getAccount_id());
        ps.setString(2, account.getFull_name());
        ps.setString(3, account.getPassword());
        ps.setString(4, account.getEmail());
        ps.setString(5, account.getPhone());
        ps.setInt(6, account.getStatus());
        return ps.executeUpdate() > 0;
    }

    public boolean updateAccount(Account account) throws Exception {
        String sql= "update account set full_name =?, password=?, status=?, where account_id =?";
        PreparedStatement ps= connection.prepareStatement(sql);
        ps.setString(1, account.getFull_name());
        ps.setString(2, account.getPassword());
        ps.setInt(3, account.getStatus());
        ps.setString(4, account.getAccount_id());
        return ps.executeUpdate() > 0;
    }

    public boolean deleteAccount(String id) throws Exception {
        String sql= "delete from account where account_id=?";
        PreparedStatement ps= connection.prepareStatement(sql);
        ps.setString(1, id);
        return ps.executeUpdate() > 0;
    }

    public List<Account> getAll() throws Exception {
        List<Account>list= new ArrayList<>();
        String sql= "select * from where = ?";
        PreparedStatement ps= connection.prepareStatement(sql);
        ResultSet rs= ps.executeQuery();
        while (rs.next()) {
            Account account= new Account(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6));
            list.add(account);
        }
        return list;
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
