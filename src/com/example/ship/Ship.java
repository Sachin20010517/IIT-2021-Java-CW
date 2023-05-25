package com.example.ship;

import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;

public class Ship {
    public static void main(String[] args) {
        String[] array_cabin = new String[12];

        System.out.println("\n\n             Views All cabins!!                 ");

        Scanner input = new Scanner(System.in);

        String option= "A";

        while (!(option.equals("Q"))){

            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Please select an option");
            System.out.println("A) Adds customer to cabin");
            System.out.println("V) Views All cabins");
            System.out.println("E) Display Empty cabins");
            System.out.println("D) Delete customer from cabin\n ");
            System.out.println("F) Find cabin from customer name ");
            System.out.println("S) Store program data into file");
            System.out.println("L) Load program data from file");
            System.out.println("O) View passengersOrdered alphabetically by name");
            System.out.println("    0) Quit");
            System.out.println("------------------------------------------------------------------------------------");

            System.out.print("\nPlease Enter Your Option : _ _ _ _ ");
            try {
                option =input.nextLine();
                switch (option){
                    case "A":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                             Adds customer to cabin                                \n");
                        addMethod(array_cabin);
                        break;
                    case "V":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                            Views All cabins                                 \n");
                        viewsAllCabins(array_cabin);
                        break;
                    case "E":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                             Display Empty cabins                               \n");
                        displayEmptyCabins();
                        break;
                    case "D":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                            Delete Customer from Cabin                                 \n");
                        deleteCabins(array_cabin);
                        break;
                    case "F":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                             Find cabin from customer name                                \n");
                        findCabin(array_cabin);
                        break;
                    case "S":
                        System.out.println("\n-----------------------------------------------------------------------------------");
                        System.out.println("                             Store program data into file                             \n");
                        Save(array_cabin);
                        break;
                    case "Q":
                        System.out.println("\n                          You exited from the program.                              ");
                        System.out.println("                            Thank You!!                                        ");
                        break;
                    default:
                        System.out.println("Please Enter Valid Character");
                }
            }catch (Exception e){
                System.out.println("Error"+e);
            }



        }




    }



    private static void addMethod(String[] _arrayCabin) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name :");
        String name=input.nextLine();
        /*
        System.out.print("Please Enter Valid Email :");
        String email=input.nextLine();
        while (!(email.contains("@") && email.contains("gmail.com"))){
            System.out.println("        Please include an '@' & 'gmail.com' in the Email address. "+email+" is missing an '@' or 'gmail.com'  ");
            System.out.print("Please Again Input Your Correct Email :");
            email=input.nextLine();
        }*/
        System.out.println("\nThere are 12 Cabins in this Cruise Ship. Gentleman please Reserve Your Cabin");
        System.out.print("\nPlease Enter the Cabin Number that You Want :");

       

        int _cabinNumber=input.nextInt();
        if(_arrayCabin[(_cabinNumber - 1)] == null){
            _arrayCabin[(_cabinNumber-1)]=name;
            System.out.print("   ** Thank You! "+name+", You booked Cabin No. " + _cabinNumber + "  successfully!! **\n\n");
        }else {
            System.out.println("    Sorry!!. This Cabin already booked.Please select another Cabin.\n");
        }


    }

    private static void viewsAllCabins(String[] _arrayCabin) {

        for (int i=0;i< _arrayCabin.length;i++){

            if (_arrayCabin[i]== null){
                System.out.println("Cabin No."+(i+1)+"  :  ______This is Empty Cabin_____");
            }
            else{
                System.out.println("Cabin No."+(i+1)+"  : "+_arrayCabin[i]);
            }

        }


    }

    private static void deleteCabins(String[] arrayCabin) {
        //System.out.println("Please Enter Your Valid Email for Confirm whether it is a Cabin you have reserved Yourself or Not");
        Scanner input= new Scanner(System.in);
        //String Email=input.nextLine();
        System.out.println("Please Enter Your Name :");
        String Name=input.nextLine();

        for (int i=0;i<arrayCabin.length;i++){
            if (Objects.equals(arrayCabin[i], Name)){
                arrayCabin[i]=null;
                System.out.println("        "+Name+", Delete You from cabin successfully\n");
                break;
            }
        }

    }

    private static void Save(String[] ArrayCabin){
        try {
            FileWriter file_Writer= new FileWriter("Save.txt");
            int count=1;
            for (String i:ArrayCabin){
                if (i == null){
                    file_Writer.write("Cabin No."+count);
                    file_Writer.write(" : ______This is Empty Cabin_____\n");
                }
                else {
                    file_Writer.write("Cabin No."+count+": ");
                    file_Writer.write(i+"\n");
                }
                count++;
            }
            file_Writer.close();
        }catch (Exception e){
            System.out.println("There is an Error: "+e);
        }

        System.out.println("\n    Successfully saved to the file");


    }

    private static void findCabin(String[] arrayCabin) {
        System.out.println("Enter Customer Name : ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();

        int i=0;

        while (i<arrayCabin.length){
            if (Objects.equals(arrayCabin[i], name)){
                System.out.println("\n"+name+"'s Cabin Number is "+(i+1));
                break;
            }
            i++;
        }

    }

    private static void displayEmptyCabins() {
        System.out.println("Hi");
    }





}
