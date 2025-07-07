/**
 * SimpleClass.java - Demonstrates basic Object-Oriented Programming concepts
 * Perfect introduction to classes, objects, constructors, and methods
 */

// Class definition
class Student {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String major;
    private double gpa;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.major = "Undeclared";
        this.gpa = 0.0;
    }
    
    // Parameterized constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = 0.0;
    }
    
    // Constructor with all parameters
    public Student(String name, int age, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }
    
    // Getter methods (accessors)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getMajor() {
        return major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods (mutators)
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Instance methods
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("---");
    }
    
    public String getClassification() {
        if (gpa >= 3.5) {
            return "Honor Student";
        } else if (gpa >= 3.0) {
            return "Good Standing";
        } else if (gpa >= 2.0) {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }
    
    public boolean isEligibleForHonors() {
        return gpa >= 3.5;
    }
    
    public void study(String subject) {
        System.out.println(name + " is studying " + subject);
    }
    
    public void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            double oldGpa = this.gpa;
            this.gpa = newGpa;
            System.out.println(name + "'s GPA updated from " + oldGpa + " to " + newGpa);
        } else {
            System.out.println("Invalid GPA. Must be between 0.0 and 4.0");
        }
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, major='%s', gpa=%.2f}", 
                           name, age, major, gpa);
    }
}

// Main class to demonstrate the Student class
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("=== Object-Oriented Programming Demo ===");
        
        // Creating objects using different constructors
        System.out.println("\n=== Creating Students ===");
        
        // Using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (default): " + student1);
        
        // Using parameterized constructor
        Student student2 = new Student("Alice Johnson", 20, "Computer Science");
        System.out.println("Student 2: " + student2);
        
        // Using constructor with all parameters
        Student student3 = new Student("Bob Smith", 22, "Mathematics", 3.7);
        System.out.println("Student 3: " + student3);
        
        // Using setter methods
        System.out.println("\n=== Using Setter Methods ===");
        student1.setName("Charlie Brown");
        student1.setAge(19);
        student1.setMajor("Physics");
        student1.setGpa(3.2);
        
        System.out.println("Student 1 after updates: " + student1);
        
        // Using getter methods
        System.out.println("\n=== Using Getter Methods ===");
        System.out.println("Student 2's name: " + student2.getName());
        System.out.println("Student 2's age: " + student2.getAge());
        System.out.println("Student 2's major: " + student2.getMajor());
        System.out.println("Student 2's GPA: " + student2.getGpa());
        
        // Using instance methods
        System.out.println("\n=== Using Instance Methods ===");
        student2.displayInfo();
        student3.displayInfo();
        
        // Testing business logic methods
        System.out.println("\n=== Student Classifications ===");
        System.out.println(student1.getName() + " - " + student1.getClassification());
        System.out.println(student2.getName() + " - " + student2.getClassification());
        System.out.println(student3.getName() + " - " + student3.getClassification());
        
        // Testing boolean methods
        System.out.println("\n=== Honor Roll Eligibility ===");
        System.out.println(student1.getName() + " eligible for honors: " + student1.isEligibleForHonors());
        System.out.println(student2.getName() + " eligible for honors: " + student2.isEligibleForHonors());
        System.out.println(student3.getName() + " eligible for honors: " + student3.isEligibleForHonors());
        
        // Using action methods
        System.out.println("\n=== Student Activities ===");
        student1.study("Quantum Physics");
        student2.study("Data Structures");
        student3.study("Calculus");
        
        // Updating GPA
        System.out.println("\n=== GPA Updates ===");
        student2.updateGpa(3.8);
        student1.updateGpa(3.6);
        student3.updateGpa(4.5); // Invalid GPA
        
        // Final display
        System.out.println("\n=== Final Student Information ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        
        // Array of objects
        System.out.println("\n=== Array of Objects ===");
        Student[] classroom = {student1, student2, student3};
        
        System.out.println("Classroom roster:");
        for (int i = 0; i < classroom.length; i++) {
            System.out.println((i + 1) + ". " + classroom[i].getName() + 
                             " (GPA: " + classroom[i].getGpa() + ")");
        }
        
        // Finding honor students
        System.out.println("\nHonor Students:");
        for (Student student : classroom) {
            if (student.isEligibleForHonors()) {
                System.out.println("🌟 " + student.getName());
            }
        }
    }
}
