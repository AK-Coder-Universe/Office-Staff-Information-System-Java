package Aakash.Collage;


import java.util.Scanner;

abstract class Staff{
    protected int id ;
    protected String name;

    public Staff(int id , String name){
        this.id = id;
        this.name= name;
    }
    public abstract void displayDetails();
}

 class OfficeStaff extends Staff{
    private String department;

    public OfficeStaff(int id,String name,String department){
        super(id,name);
        this.department = department;
    }
    public void displayDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name :"+name);
        System.out.println("Department :"+department);
        System.out.println("----------------------------");
    }
 }

public class StaffDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Office Staff Member :");
        int n = sc.nextInt();
        sc.nextLine();

        OfficeStaff [] staffArray = new OfficeStaff[n];

          for(int i= 0 ; i<n ; i++) {
              System.out.println("\n Every details of Staff " + (i + 1) +":");
              System.out.println("Enter ID :");
              int id = sc.nextInt();
              sc.nextLine();
              System.out.println("Enter Name :");
              String name = sc.nextLine();

              System.out.println("Enter Department :");
              String department = sc.nextLine();

              staffArray[i] = new OfficeStaff(id, name, department);
          }
        System.out.println(" \n Details of all Office Staff : ");
          for(OfficeStaff staff : staffArray){
              staff.displayDetails();
          }
          sc.close();
    }
}
