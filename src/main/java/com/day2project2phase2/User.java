package com.day2project2phase2;

public class User {
    private int uid;
    private String name;
    private String email;
    public User(int uid,String name,String email){
        this.uid=uid;
        this.name=name;
        this.email=email;
    }
    public int getUid() {
        return uid;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void userdisplay(){
        System.out.println("USER INFORMATION");
        System.out.println("User id:"+this.uid+"\n"+"User Name:"+this.name+"\n"+"User mail:"+this.email);
}

}
