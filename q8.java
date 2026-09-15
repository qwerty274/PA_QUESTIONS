import java.util.*;
class q8{
    public static char calculateGrade(int marks){
        if(marks >=90 && marks <=100){
            return 'A';
        }
        else if(marks >=80 && marks <90){
            return 'B';
        }
        else if(marks >=70 && marks <80){
            return 'C';
        }
        else if(marks >=60 && marks <70){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            System.out.print(calculateGrade(marks) + " ");
        }
        
    }
}