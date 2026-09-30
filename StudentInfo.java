public class StudentInfo {
    String name;
    int age;
    String branch;

    StudentInfo(){
        name = "Irfan";
        age = 18;
        branch = "CSE"; 
    }
    StudentInfo(String name , int age , String branch){ 
        this.name = name;
        this.age = age;
        this.branch = branch;
    }
    void dis(){ 
        System.out.println(name);
    }
    public static void main(String[] args){
        StudentInfo s = new StudentInfo();
        StudentInfo s1 = new StudentInfo("irf",13,"ECE");
        s.dis();
        s1.dis();
    }
} 
