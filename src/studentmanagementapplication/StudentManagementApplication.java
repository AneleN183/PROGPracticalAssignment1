package studentmanagementapplication;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
public class StudentManagementApplication {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    
    do{
        //Display the menu
        System.out.println("Menu");
        System.out.println(" 1. Capture a new student");
        System.out.println(" 2. Search for a student");
        System.out.println(" 3. Delete a student");
        System.out.println(" 4. Print student report");
        System.out.println(" 5. Exit application"); 
        System.out.println("Enter your choice");
        //Get user input
        
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                //Add code for Option 1
                break;
            
            case 2:
                System.out.println("You selected Option 2");
                //Add code for Option 2
                break;
                
            case 3:
                System.out.println("You selected Option 3");
                //Add code for Option 3
                break;
                
            case 4:
                System.out.println("You selected Option 4");
                //Add code for Option 4 
                break;
                
            case 5:
                System.out.println("Exiting...");
                break;
                
            default:
                System.out.println("Invalid choice. please try again");
                
    }
    } while (choice !=4);
    
        scanner.close();
        
        //Capture user ID 
        System.out.print("Enter Student id");
        int id = scanner.nextInt();
        scanner.nextLine(); //Consume the newline left by nextInt();
        
        //Capture Student name
        System.out.print("Enter Student name");
        String name = scanner.nextLine();
        scanner.nextInt();
        
        //Capture Student Age
        System.out.print("Enter Student age");
        int age = scanner.nextInt();
        scanner.nextLine(); //Consume the newline left by nextInt;
        
        //Capture Student Email
        System.out.print("Enter Student email");
        String email = scanner.nextLine();
        scanner.nextInt(); 
        
        //Capture student course
        System.out.print("Enter Student course");
        String course = scanner.nextLine();
        
        
        
       //Display captured information
       System.out.println("Menu");
       System.out.println("Student ID" + 10111);
       System.out.println("Student Name:" + Smith);
       System.out.println("Student Age:" + 21);
       System.out.println("Student Email:" + asmith@hmail); 
       System.out.println(" Student Course:" + DISD); 
       
       scanner.close();
       
       int userInput  = 0;
       boolean validInput = false;
       //Loop until valid input is received
       while (!validInput){
           try { 
               System.out.print( "Please enter Student Age:");
               userInput = scanner.nextInt(); //Attempt to get Student Age input
               validInput = true; //If successful, set the flag to two 
           } catch (InputMismatchException ime) {
               //Handle the case where input is not student age
               System.out.print("Invalid input. Please enter valid Student Age");
               scanner.next(); //Clear the invalid input
           }
       }
        System.out.println("You entered:" + userInput);
        scanner.close();
        
        System.out.print("Save your work");
        String data = scanner.nextLine();
        //File where data will be saved
        
        String filename = "output.txt";
        //Try to save the data to the file
        
        try (FileWriter fileWriter = new FileWriter(filename, true)){
            fileWriter.write( data + "\n"); //Append data to the file
            System.out.println("Data has been successfully saved to" +filename);
            
        }catch (IOException e){ 
            //Handle any IO errors
            System.out.println("An error occurred while saving the data");
            e.printStackTrace();
            
        }
        scanner.close();
        
        int[] studentIDs = {10111, 10112, 10113, 10114, 10115};
        
        
        System.out.print("Enter the student ID to search:");
        int searchID = scanner.nextInt();
        
        boolean found = false;
        for (int id: studentIDs) {
    if (id == searchID){
        found = true;
        break;
    }
}
     if (found){
         System.out.println("Student ID" + searchID + "found.");
     }else{
         System.out.println("Student ID" + searchID + "not found");
     } 
     
     
    
     
   
     System.out.print("Enter the student ID to delete");
     int deleteID = scanner.nextInt();
     
    
     int [] newStudentIDs = new int [studentIDs.length - 1];
     int index = 0;
     
         if (id == deleteID){
             found = true;
             continue;
         }
         if (index < newStudentIDs.length){
             newStudentIDs[index++] = id;
         }
     }
if (found){ 
    System.out.println("Student ID" + deleteIDs + "deleted.");
    System.out.println("Updated ID" + Arrays.toString("newStudentsID")); 
} else {
    System.out.println("StudentIDs" + deleteID + "not found.");

scanner.close();
     
//Sample data
List <Integer> ID = Arrays.asList(10111,10112,10113);
List <String> Name = Arrays.asList("J. Bloggs","J. Doe", "P. Parker");
List <Integer> Age = Arrays.asList(19, 21, 20);
List <String> Email = Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com");
List <String> Course = Arrays.asList("disd", "disd", "disd");

//Header
System.out.println("**************Student Report***************");
System.out.printf("%-10s %-10s %-10s %n", ID, Name,Age, Email, Course);

//Separator
System.out.println("---------------------");

//Report Content
double totalStudents = 0;

for (int i = 0; i < ID.size(); i++) {
    System.out.printf("%-10s %-10d $%-9.2f%n", ID.get(i), Name.get(i, Age.get(i), Email.get(i), Course.get(i));
    
}
//Footer 
System.out.println("----------------------");
     System.out.printf("Total Student: $%.2f%n", totalStudents);
     System.out.println("************************"); 

// Exit with status code 0 (success)
System.exit(0);

// Exit wit non-zerso status code (error)
System.exit(1); 





        
    
           

