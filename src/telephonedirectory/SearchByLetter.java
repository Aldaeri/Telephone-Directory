/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telephonedirectory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class SearchByLetter
{

    static Scanner scan = new Scanner(System.in);

    public void SearchByLetter() throws IOException
    {
        //This code is to list all persons whose names starts with a letter the user will enter
        System.out.print("Enter A letter in a lower case: ");
        char nu = scan.next().charAt(0);
        File fi = new File("src\\telephonedirectory\\InfoForPerson.txt");
        BufferedReader freader = new BufferedReader(new FileReader(fi));
        String s;
        while ((s = freader.readLine()) != null)
        {
            String[] stn = s.split(" ");
            String id = stn[0];
            String nmLower = stn[1].toLowerCase();
            String nm = stn[1];
            String age = stn[2];
            String phoneNo = stn[3];
            char[] Pname = nmLower.toCharArray();
            if (Pname[0] == nu)
            {
                System.out.print(id + "-");
                System.out.print(nm + " ");
                System.out.print(age + " ");
                System.out.println(phoneNo);
            }
        }
        freader.close();
    }
}
