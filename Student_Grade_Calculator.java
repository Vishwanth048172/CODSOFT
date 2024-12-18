import java.util.Scanner;

public class Student_Grade_Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of subjects:");
        int ns=sc.nextInt();
        int total=0;
        for(int i=0;i<ns;i++){
            System.out.println("Enter the marks obtained in "+(i+1)+": ");
            int marks=sc.nextInt();
            total+=marks;
        }
        double averP=(double)total/ns;
    char Grade;
    if(averP>=90){
        Grade='O';
    }
    else if(averP>=80){
        Grade='A';
    }
    else if(averP>=70){
        Grade='B';
    }
    else if(averP>=60){
        Grade='C';
    }
    else if(averP>=50){
        Grade='D';
    }
    else if(averP>=40){
        Grade='E';
    }
    else{
        Grade='F';
    }
    System.out.println("Total marks scored is "+total);
    System.out.println("Average percentsge gained is "+ averP +"%");
    System.out.println("Grade is "+Grade);
    }
}