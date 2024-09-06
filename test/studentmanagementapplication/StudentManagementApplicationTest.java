package Student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.ArrayList;

public class Student {
    
    private static Student SearchStudent (ArrayList<Student> students, String string) {
        throw new UnsupportedOperationException ("Not supported yet.");
    }
    
    private static boolean DeleteStudent (ArrayList<Student> students, String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public class StudentTest {
        
        @Test
        public void TestSaveStudent() {
            ArrayList<Student> students = new ArrayLsit <>;
            Student.Save.Student (students); //Simulate user input or modify SaveStudent to accept parameters directly for testing
        
                    
        // Assuming that the last added student is correct
        Student student = students.get(students.size() - 1);
        assertNotNull(student);
        assertEquals("123", student.getId()); // Replace with the expected ID or modify for actual testing
        assertEquals("John Doe", student.getName()); //Replace with the expected name or modify for actual testing
        }
        
        @Test
        public void TestSearchStudent() {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new student("123", "John Doe", 18, john@example.com));
            
            Student result = Student.SearchStudent(students, "123");
            assertNotNull(result);
            assertEquals("123", result.getId());
            
                    } 
        @Test
        public void TestSearchstudent_StudentNotFound(){
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("123", "John Doe", 18, john@example.com, disd));
            
            Student result = Student.Searchstudent(students,"456");
            assertNull(result);
        }
        
        @Test
        public void TestDeleteStudent() {
            ArrayList<Student> students = new ArraysList<>();
            students.add(new Student("123", "John Doe", 18,"john@example.com", "disd"));
            
            boolean result = Student.DeleteStudent (students, "123");
            assertTrue(result);
            assertEquals(0,students.size());
            }
        
        @Test
        public void TestDeleteStudent_StudentNotFound {
        ArrayList<Student> students = new ArrayList<>;
        students.add(new Student("123", "John Doe", 18,"john@example.com", disd));
        
        boolean result = Student.DeleteStudent(students, "456");
        assertFalse(result);
        assertEquals( 1, students.size());
    }
        
        @Test
        public void TestStudentAge_StudentAgeValid() {
            int age = 18;
            boolean isValid = age >= 16;
            assertTrue(isValid);
        }
        
        @Test
        public void TestStudentAge_StudentAgeInvalid() {
            int age = 15;
            boolean isValid = age >=16;
            assertFalse(isValid);
        }
        
        @Test
        public void TestStudentAge_StudentAgeInvalidCharacters() { 
            try {
                Integer.parseInt("invalid");
                fail("Expected NumberFormatException");
            } catch (NumberFormatException e) {
                assertTrue(true); // Test passes if NumberFormatException is thrown
                
            }
        }
        
        
                    
        
        
        
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentManagementApplication.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
