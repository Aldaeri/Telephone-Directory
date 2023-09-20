/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telephonedirectory;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author osama
 */
public class ShowAllNameOfPersons
{

    void showAllNameOfPersons() throws FileNotFoundException, IOException
    {
        
        File f = new File("src\\telephonedirectory\\InfoForPerson.txt");
        {
            // This code is used to list all persons in the list 
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            BufferedReader reader = new BufferedReader(new InputStreamReader(dis));
            String st;
            ArrayList al = new ArrayList();
            while ((st = reader.readLine()) != null)
            {
                al.add(st);
            }
            Iterator itr;
            for (itr = al.iterator();
                    itr.hasNext();)
            {
                String str = itr.next().toString();
                String[] splitSt = str.split(" ");
                String id = "", na = "", ada = "", ph = "";
                for (int i = 0; i < splitSt.length; i++)
                {
                    id = splitSt[0];
                    na = splitSt[1];
                    ada = splitSt[2];
                    ph = splitSt[3];
                }
                System.out.println(id + " " + na + " " + ada + " " + ph);
            }
        }
    }

}
