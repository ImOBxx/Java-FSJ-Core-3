
class Student1 {  // Changed class name to Student1
    int rollno;
    String name;
    
    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }
    
    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

class TestStudent4 {
    public static void main(String args[]) {
        Student1 s1 = new Student1();  // Changed to Student1
        Student1 s2 = new Student1();  // Changed to Student1
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
