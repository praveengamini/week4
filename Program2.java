public class Program2 {
    public static void main(String[] args) {
        Program2 obj1 = new Program2("praveen",548,92.5,"MVGR",33);
        System.out.println("\n"+" details of student1: ");
        obj1.display();
        Program2 obj2 = new Program2();
        System.out.println("\n"+" details of student2: ");
        obj2.display();
        
    }
    String fullName;
    int rollNum;
    double semPerentage;
     String collegeName;
    int collegeCode;
    Program2()
    {
        this(null,0,0.0,"MVGR",33);
    }
    Program2(String fullName,int rollNum, double semPerentage,String collegeName,int collegeCode )
    {
        this.fullName=fullName;
        this.rollNum=rollNum;
        this.semPerentage=semPerentage;
        this.collegeName=collegeName;
        this.collegeCode=collegeCode;
    }
    void display() {
        System.out.println(
                "Full Name: " + this.fullName +
                "\nRoll Number: " + this.rollNum +
                "\nSemester Percentage: " + this.semPerentage +
                "\nCollege Name: " + this.collegeName +
                "\nCollege Code: " + this.collegeCode
        );
    
    }
        protected void finalize()  
        {  
        System.out.println("Object is destroyed by the Garbage Collector");  
        }  
    }
