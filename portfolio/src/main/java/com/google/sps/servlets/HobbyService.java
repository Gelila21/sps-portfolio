package com.google.sps.servlets;

import java.util.ArrayList;
import java.util.List;

public class HobbyService implements IhobbyS {


    @Override
    public List<Hobby> getHobbies() {

        List<Hobby> hobbies = new ArrayList<>();

        hobbies.add(new Hobby(1L, "Bratislava"));
        hobbies.add(new Hobby(2L, "Budapest"));
        hobbies.add(new Hobby(3L, "Prague"));
        hobbies.add(new Hobby(4L, "Warsaw"));
        

        return hobbies;
    }
}
