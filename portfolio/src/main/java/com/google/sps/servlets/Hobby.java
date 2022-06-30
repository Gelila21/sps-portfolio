package com.google.sps.servlets;

import java.io.IOException;

//import javax.servlet.ServletOutputStream;
import com.google.sps.servlets.GHobby;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;


@WebServlet("/hobby")
public class Hobby extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        GHobby Hobject = new GHobby("Sketching","Skating", "Reading");

        String obj = convertToJsonUsingGson(Hobject);
      response.setContentType("application/json;");
      response.getWriter().println(obj);

       
    }

    

    private String convertToJsonUsingGson(GHobby myHobby ) {
        Gson gson = new Gson();
        String json = gson.toJson(myHobby);
        return json;
      }
}
