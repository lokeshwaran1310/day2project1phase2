package com.day2project2phase2;

/**
 * Hello world!
 *
 */public class App 
{
    public static void main( String[] args )
    {     
      Ticketservice ts=new Ticketservice();
      User u1=new User(101,"lokesh","lokesh@gmail.com");
      Ticket t1=new Ticket(1,"issue1",u1);
      ts.addTicket(t1);
      System.out.println("Ticket list");
      ts.disp();
      System.out.println("-----------------------------------------------------------------");
      User u2=new User(102,"hari","hari@gmail.com");
     Ticket t2=new Ticket(2,"issue2",u2);
     ts.addTicket(t2);
     Ticket t3=new Ticket(3,"issue3",u2);
     ts.addTicket(t3);
     System.out.println("Ticket list");
     ts.disp();
     System.out.println("-----------------------------------------------------------------");
     t1.close();
     t1.display();
     System.out.println("-----------------------------------------------------------------");
   
     t2.display();
     System.out.println("-----------------------------------------------------------------");
   
     t3.display();
     System.out.println("-----------------------------------------------------------------");
  


    }
}
