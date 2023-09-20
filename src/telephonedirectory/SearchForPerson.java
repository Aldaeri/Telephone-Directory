/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telephonedirectory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class SearchForPerson
{
    static Scanner scan = new Scanner(System.in);
    public void SearchForPerson()
    {
        
        // This code is to searchForPerson for a person's information using his/her name
        System.out.print("Enter name to search information: ");
        String n = scan.next();
        File f = new File("src\\telephonedirectory\\InfoForPerson.txt");
        try
        {
            BufferedReader freader = new BufferedReader(new FileReader(f));
            String s;
            boolean found = false;
            while ((s = freader.readLine()) != null)
            {
                String[] st = s.split(" ");
                String id = st[0];
                String nm = st[1];
                String age = st[2];
                String phoneNo = st[3];
                if (n.equals(nm))
                {
                    System.out.println("***********Information for " + nm + "**************");
                    System.out.println("age : " + age);
                    System.out.println("PhoneNo : " + phoneNo);
                    found = true;
                }
            }
            if (!found)
            {
                System.out.println("\nThis name does not exist in the Telephone Directory.\n");
            }
            freader.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
