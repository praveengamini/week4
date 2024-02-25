public class Program1 {
    public static void main(String[] args) {
        Program1 obj = new Program1("praveen",548,92.5,"MVGR",33);
        obj.display();
        
    }
    String fullName;
    int rollNum;
    double semPerentage;
     String collegeName;
    int collegeCode;
    Program1(String fullName,int rollNum, double semPerentage,String collegeName,int collegeCode )
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
