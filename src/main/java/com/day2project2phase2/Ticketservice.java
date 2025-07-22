package com.day2project2phase2;
import java.util.ArrayList;
import java.util.List;
public class Ticketservice {
    List <Ticket> ticlist=new ArrayList<>();
    public void addTicket(Ticket t){
        ticlist.add(t);
    }
    public void disp(){
        for(Ticket t:ticlist){
            System.out.println(t.getId()+" "+t.getTitle()+" "+t.getStatus());
        }
    }

}


