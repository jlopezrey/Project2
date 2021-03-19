package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true){

            menu();
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice){
                case 1:
                    System.out.println("Please describe a task");
                    String a = input.nextLine();
                    addPriority(Priority,i);
                    addTask(tasks,a);
                    break;
                case 2:
                    System.out.println("Please enter the number for what task you would like deleted.");
                    listTask(tasks);
                    int i = input.nextInt();
                    deleteTask(tasks,i);
                    break;
                case 3:
                    System.out.println("Please enter the number for what task you would like updated");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Please enter the new task description");
                    a = input.nextLine();
                    updateTask(tasks,i,a);
                    break;
                case 4:
                    listTask(tasks);
                    break;
                case 0:
                    endProgram();




            }
        }



    }

    static void endProgram(){
        System.exit(0);
    }

    public static void menu(){
        System.out.println("Please choose an option");
        System.out.println("(1) Add a task");
        System.out.println("(2) Remove a task");
        System.out.println("(3) Update a task");
        System.out.println("(4) List all tasks");
        System.out.println("(0) Exit");
    }
    private static void deleteTask(ArrayList<String> tasks, int index) {
        tasks.remove(index);
    }

    private static void updateTask(ArrayList<String> tasks, int index, String desc) {
        tasks.set(index, desc);
    }

    private static void listTask(ArrayList<String> tasks) {
        for (int i = 0; i <tasks.size(); i++){
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    private static void addTask(ArrayList<String> tasks, String desc) {
        tasks.add(desc);
    }
    private static void addPriority(ArrayList<String> tasks, String desc) {
        tasks.add(desc);
    }



}
