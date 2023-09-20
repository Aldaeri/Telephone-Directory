/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonedirectory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class TelephoneDirectory
{

    // Declerations of variables frp the menu
    static int menu = 0;
    static boolean quit = true;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        do
        {
            //                   The menu of choice for the user
            System.out.println("\n         Welcome in Telephone Directory        ");
            System.out.println();
            System.out.println("1. Add a new person to the Telephone Directory.");
            System.out.println("2. Search for person in the Telephone Directory.");
            System.out.println("3. List of all persons saved in Telephone Directory.");
            System.out.println("4. List of all persons that begin their names with a particular character.");
            System.out.println("5. List of persons specific between two id.");
            System.out.println("6. Exit.");
            System.out.println("");
            //                     End of menu
            System.out.print("Please enter your choice: ");
            menu = scan.nextInt();
            System.out.println();
            //When the user enters his choice, one of the cases will be excuted
            switch (menu)
            {
                case 1:
                    try
                    {
                        InsertNewPerson insert = new InsertNewPerson();
                        insert.InsertNewPerson();
                        System.out.println("");
                        System.out.println("---------------------------------------------------------------------------------");
                } catch (IOException e)
                {
                    System.out.println("You have Entered invalid data\n");
                    continue;
                }
                break;

                case 2:
                    SearchForPerson search = new SearchForPerson();
                    search.SearchForPerson();
                    System.out.println("---------------------------------------------------------------------------------");

                    break;
                case 3:
                    ShowAllNameOfPersons showAllNameOfPersons = new ShowAllNameOfPersons();
                    showAllNameOfPersons.showAllNameOfPersons();
                    System.out.println("---------------------------------------------------------------------------------");

                    break;
                case 4:
                    SearchByLetter searchByLetter = new SearchByLetter();
                    searchByLetter.SearchByLetter();
                    System.out.println("---------------------------------------------------------------------------------");

                    break;
                case 5:
                    SearchUsingTwoId searchUsingTwoId = new SearchUsingTwoId();
                    searchUsingTwoId.SearchUsingTwoId();
                    System.out.println("---------------------------------------------------------------------------------");

                    break;
                case 6:
                    // This lets the user exits the menu and close the program
                    quit = false;
                    break;
                default:
                    System.out.println("          Invalid Entry!\n\n");
            }
        } while (quit);
        //end of the loop
    }
}
