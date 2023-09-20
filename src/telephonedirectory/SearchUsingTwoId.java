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
import java.util.InputMismatchException;

/**
 *
 * @author osama
 */
public class SearchUsingTwoId
{

    static Scanner scan = new Scanner(System.in);

    public void SearchUsingTwoId() throws IOException
    {
        //This code lists persons with in a range that the user will determine
        try
        {
            int num1, num2 = 0;
            try
            {

                System.out.print("Enter the first id: ");
                num1 = scan.nextInt();
                System.out.print("Enter the last id: ");
                num2 = scan.nextInt();
                File fil = new File("src\\telephonedirectory\\InfoForPerson.txt");

                BufferedReader freader = new BufferedReader(new FileReader(fil));
                String s;
                while ((s = freader.readLine()) != null)
                {
                    String[] stn = s.split(" ");
                    String id = stn[0];
                    String nm = stn[1];
                    String age = stn[2];
                    String phoneNo = stn[3];
                    Integer number1 = Integer.parseInt(id);
                    if ((number1 >= num1) && (number1 <= num2))
                    {
                        System.out.print(id + "-");
                        System.out.print(nm + " ");
                        System.out.print(age + " ");
                        System.out.println(phoneNo);
                    }

                }
                freader.close();
            } catch (InputMismatchException e)
            {
                System.out.println("Please try again and enter a correct number.");
            }
        } catch (IOException | NumberFormatException e)
        {
            System.out.println("Please try again and enter a correct number.");
        }

    }
}
