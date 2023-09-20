/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telephonedirectory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class InsertNewPerson
{

    static Scanner scan = new Scanner(System.in);

    void InsertNewPerson() throws IOException
    {
        // This code is used to make the id incremented automaticlly and enter person's information

        String[] PersonInfo = new String[4];
        File fileId = new File("src\\telephonedirectory\\InfoForPerson.txt");
        BufferedReader freaders = new BufferedReader(new FileReader(fileId));
        String strn;
        while ((strn = freaders.readLine()) != null)
        {
            String[] st = strn.split(" ");
            PersonInfo[0] = st[0];
        }
        if (PersonInfo[0] == null || PersonInfo[0].equals(""))
        {
            PersonInfo[0] = "0";
        }
        int ID = Integer.parseInt(PersonInfo[0]);
        ID++;
        //Entering other infromation of the person
        try
        {
            System.out.print("Enter Name: ");
            PersonInfo[1] = scan.next();
            System.out.print("Enter Age: ");
            PersonInfo[2] = scan.next();
            Integer Age = Integer.parseInt(PersonInfo[2]);
            System.out.print("Enter Phone Number: ");
            PersonInfo[3] = scan.next();
            Integer Phone = Integer.parseInt(PersonInfo[3]);
            FileWriter fw = new FileWriter(new File("src\\telephonedirectory\\InfoForPerson.txt"), true);
            BufferedWriter out = new BufferedWriter(fw);
            out.write(ID + " " + PersonInfo[1] + " " + PersonInfo[2] + " " + PersonInfo[3]);
            System.out.println("\nSave Successfully");
            out.newLine();
            out.close();
        } catch (NumberFormatException e)
        {
            System.out.println("Please try again and enter a correct number.");
        }

    }
}
