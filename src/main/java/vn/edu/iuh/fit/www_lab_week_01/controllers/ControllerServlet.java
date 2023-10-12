package vn.edu.iuh.fit.www_lab_week_01.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.www_lab_week_01.entities.Account;
import vn.edu.iuh.fit.www_lab_week_01.repositories.AccountRepository;
import vn.edu.iuh.fit.www_lab_week_01.services.AccountServices;

import java.io.IOException;
import java.util.List;

@WebServlet(name="AccountController", value = "/account")
public class ControllerServlet extends HttpServlet {
    private AccountServices accountServices;

    public ControllerServlet() {
        accountServices= new AccountServices();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action= req.getParameter("action");
        try {
            AccountRepository accountRepository= new AccountRepository();

            List<Account> listAccount = accountRepository.getAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
