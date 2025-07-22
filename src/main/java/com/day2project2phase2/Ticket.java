package com.day2project2phase2;

public class Ticket {
    //properties
    private int id;
    private String title;
    private String status;
    private User user;
    //constructor
   public Ticket(int id,String title,User user){
        this.id=id;
        this.title=title;
        this.status="open";
        this.user=user;
    }
    public int getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getStatus() {
        return status;
    }
    public void display(){
        System.out.println("TICKET INFORMATION");
        System.out.println("Ticket Id:"+this.id+"\n"+"Title:"+this.title+"\n"+"Status:"+this.status);
        this.user.userdisplay();
    }
    public void close(){
        this.status="closed";
    }

}
