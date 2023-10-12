package vn.edu.iuh.fit.www_lab_week_01.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.www_lab_week_01.services.AccountServices;

import java.io.IOException;

@WebServlet(name="AccountController", value = "/account")
public class ControllerServlet extends HttpServlet {
    private AccountServices accountServices;

    public ControllerServlet() {
        accountServices= new AccountServices();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
