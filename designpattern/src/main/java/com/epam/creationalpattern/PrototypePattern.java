package com.epam.creationalpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface Prototype {

     public Prototype getClone();
    
}


class StudentDetails implements Prototype{
    
   private int id;
   private String name, branch;
   private double year;
   private String address;
    
   public StudentDetails(){
            System.out.println("   Student record of college ");
            System.out.println("---------------------------------------------");
            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Ebranch"+"\t"+"Eyear"+"\t\t"+"Eaddress");
    
}

 public  StudentDetails(int id, String name, String branch, double year, String address) {
        
        this();
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.address = address;
    }
    
  public void showRecord(){
        
        System.out.println(id+"\t"+name+"\t"+branch+"\t"+year+"\t"+address);
   }

   
    public Prototype getClone() {
        
        return new StudentDetails(id,name,branch,year,address);
    }
}


class PrototypePattern{
    
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter student Id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.print("\n");
        
        
        System.out.print("Enter student Name: ");
        String ename=br.readLine();
        System.out.print("\n");
        
        
        System.out.print("Enter  branch: ");
        String ebranch=br.readLine();
        System.out.print("\n");
        
        
        System.out.print("Enter student Address: ");
        String eaddress=br.readLine();
        System.out.print("\n");
        
        
        System.out.print("Enter student year: ");
        double eyear= Double.parseDouble(br.readLine());
        System.out.print("\n");
         
        StudentDetails e1=new StudentDetails(eid,ename,ebranch,eyear,eaddress);
        
        e1.showRecord();
        System.out.println("\n");
        StudentDetails e2=(StudentDetails) e1.getClone();
        
        e2.showRecord();
    }   
}
