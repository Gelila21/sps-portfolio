package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;



@WebServlet(name = "GetHobbies", urlPatterns = {"/GetHobbies"})
public class Hobbies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("application/json;charset=UTF-8");

        ServletOutputStream out = response.getOutputStream();

        List<Hobby> hobbies = new HobbyService().getHobbies();

        var converter = new JsonConverter();
        String output = converter.convertToJson(hobbies);

        out.print(output);
    }
}
