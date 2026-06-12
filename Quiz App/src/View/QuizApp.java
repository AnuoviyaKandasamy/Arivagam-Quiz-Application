package View;

import Model.Questions;
import Controller.QuestionService;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Questions[] questions = {

                // JAVA - EASY (10)
                new Questions("Java is  ?", new String[]{"Language","Animal","Bike"}, 'a',"Java","Easy"),
                new Questions("JVM stands for?", new String[]{"Java Virtual Machine","Java Variable Method","Joint VM"}, 'a',"Java","Easy"),
                new Questions("Extension of Java file?", new String[]{".java",".class",".js"}, 'a',"Java","Easy"),
                new Questions("Which keyword is used for class?", new String[]{"class","Class","define"}, 'a',"Java","Easy"),
                new Questions("Java is platform ?", new String[]{"Independent","Dependent","None"}, 'a',"Java","Easy"),
                new Questions("Default value of int?", new String[]{"0","null","1"}, 'a',"Java","Easy"),
                new Questions("Which is not primitive?", new String[]{"int","String","char"}, 'b',"Java","Easy"),
                new Questions("main method return type?", new String[]{"void","int","String"}, 'a',"Java","Easy"),
                new Questions("Which symbol ends statement?", new String[]{";",".",":"}, 'a',"Java","Easy"),
                new Questions("Java supports OOP?", new String[]{"Yes","No","Partial"}, 'a',"Java","Easy"),

                //  JAVA - MEDIUM (10)
                new Questions("OOPS stands for?", new String[]{"Object Oriented Programming","Only One Program","None"}, 'a',"Java","Medium"),
                new Questions("Which is not OOP concept?", new String[]{"Encapsulation","Polymorphism","Compilation"}, 'c',"Java","Medium"),
                new Questions("Inheritance keyword?", new String[]{"extends","implements","inherit"}, 'a',"Java","Medium"),
                new Questions("Interface keyword?", new String[]{"interface","Interface","intf"}, 'a',"Java","Medium"),
                new Questions("Abstract class keyword?", new String[]{"abstract","abs","base"}, 'a',"Java","Medium"),
                new Questions("Method overloading means?", new String[]{"Same name diff params","Same name same params","None"}, 'a',"Java","Medium"),
                new Questions("Constructor name same as?", new String[]{"Class","Method","Variable"}, 'a',"Java","Medium"),
                new Questions("Which package for Scanner?", new String[]{"java.util","java.io","java.lang"}, 'a',"Java","Medium"),
                new Questions("Final keyword means?", new String[]{"Constant","Variable","Loop"}, 'a',"Java","Medium"),
                new Questions("Super keyword refers to?", new String[]{"Parent class","Child class","Same class"}, 'a',"Java","Medium"),

                // JAVA - HARD (10)
                new Questions("JIT stands for?", new String[]{"Just In Time","Java In Time","Joint Interpreter"}, 'a',"Java","Hard"),
                new Questions("Garbage collection is?", new String[]{"Memory cleanup","Compilation","Execution"}, 'a',"Java","Hard"),
                new Questions("Which is thread safe?", new String[]{"Vector","ArrayList","HashMap"}, 'a',"Java","Hard"),
                new Questions("Which is immutable?", new String[]{"String","StringBuilder","StringBuffer"}, 'a',"Java","Hard"),
                new Questions("Deadlock occurs when?", new String[]{"Threads wait forever","Compile error","Runtime error"}, 'a',"Java","Hard"),
                new Questions("Serialization means?", new String[]{"Object to byte stream","Byte to object","None"}, 'a',"Java","Hard"),
                new Questions("Transient keyword?", new String[]{"Skip serialization","Store data","Loop"}, 'a',"Java","Hard"),
                new Questions("Volatile keyword?", new String[]{"Thread visibility","Loop","Class"}, 'a',"Java","Hard"),
                new Questions("Lambda introduced in?", new String[]{"Java 8","Java 7","Java 6"}, 'a',"Java","Hard"),
                new Questions("Stream API used for?", new String[]{"Data processing","UI","Thread"}, 'a',"Java","Hard"),


                // MYSQL - EASY (10)
                new Questions("SQL stands for?", new String[]{"Structured Query Language","Simple Query Language","None"}, 'a',"MySQL","Easy"),
                new Questions("Command to fetch data?", new String[]{"SELECT","GET","FETCH"}, 'a',"MySQL","Easy"),
                new Questions("Insert data?", new String[]{"INSERT","ADD","PUT"}, 'a',"MySQL","Easy"),
                new Questions("Delete data?", new String[]{"DELETE","REMOVE","DROP"}, 'a',"MySQL","Easy"),
                new Questions("Update data?", new String[]{"UPDATE","MODIFY","CHANGE"}, 'a',"MySQL","Easy"),
                new Questions("Primary key?", new String[]{"Unique","Duplicate","Null"}, 'a',"MySQL","Easy"),
                new Questions("Which is DB?", new String[]{"MySQL","HTML","CSS"}, 'a',"MySQL","Easy"),
                new Questions("Table is?", new String[]{"Rows & Columns","Only rows","Only columns"}, 'a',"MySQL","Easy"),
                new Questions("Which keyword sorts?", new String[]{"ORDER BY","SORT","ARRANGE"}, 'a',"MySQL","Easy"),
                new Questions("NULL means?", new String[]{"No value","Zero","Empty string"}, 'a',"MySQL","Easy"),

                //  DS - EASY (10)
                new Questions("Stack follows?", new String[]{"LIFO","FIFO","Random"}, 'a',"DS","Easy"),
                new Questions("Queue follows?", new String[]{"FIFO","LIFO","None"}, 'a',"DS","Easy"),
                new Questions("Array index starts?", new String[]{"0","1","-1"}, 'a',"DS","Easy"),
                new Questions("Linked list uses?", new String[]{"Pointers","Indexes","None"}, 'a',"DS","Easy"),
                new Questions("Binary tree max children?", new String[]{"2","3","4"}, 'a',"DS","Easy"),
                new Questions("Stack operation?", new String[]{"Push","Insert","Add"}, 'a',"DS","Easy"),
                new Questions("Queue operation?", new String[]{"Enqueue","Push","Add"}, 'a',"DS","Easy"),
                new Questions("Search best case?", new String[]{"O(1)","O(n)","O(log n)"}, 'a',"DS","Easy"),
                new Questions("Linear search?", new String[]{"Sequential","Binary","Hash"}, 'a',"DS","Easy"),
                new Questions("DS stands for?", new String[]{"Data Structure","Data System","None"}, 'a',"DS","Easy")


        };

        System.out.println("Enter Category (Java / MySQL / DS):");
        String category = sc.next();

        System.out.println("Enter Level (Easy / Medium / Hard):");
        String level = sc.next();

        QuestionService service = new QuestionService();

        while (true){
            System.out.println("\n--- QUIZ MENU---");
            System.out.println("1. Start Quiz...");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Starting Quiz....");
                System.out.println("Category:" + category);
                System.out.println("Level:"+level);
                System.out.println("-------------------------------");
                service.startQuiz(questions, category, level);
            }
            else if(choice == 2){
                System.out.println("Exiting ... Thank you!");
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}