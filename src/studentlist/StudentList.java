/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Ali Alsudani
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int a;
        //int[] a1=new int[5];//integer array of size 5
        Student[] sList=new Student[4];// student array of size 4
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<sList.length; i++)
        {
            System.out.println("Enter student id:");
            int id=sc.nextInt();
            
            System.out.println("Enter student name:");
            String name=sc.next();
            
            Student s1=new Student(id,name);
            sList[i]=s1;
            
            
        }
        for(int i=0; i<sList.length;i++)
        {
            System.out.println("Student id:" +sList[i].getStudId()+ "Student Name:" +sList[i].getStudName());
        }
        
    }

}
