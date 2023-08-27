package Andrei;
import java.util.Scanner;
import Andrei.poo.test1.util.ComparableStack;
import java.util.Random;
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scan.nextInt();

        ComparableStack c1 = new ComparableStack(size);
        c1.printElements();

        int count = 0;
        while(count < 5){
            Random random = new Random();

            Student student = new Student();
            student.setName("Stud_ELTH_" + count);
            student.setAttendance(random.nextInt(10));

            c1.addElement(student);
            count++;
        }
        c1.printElements();
        System.out.println();

        count = 0;
        while(count < 2){
            c1.removeElement();
            count++;
        }
        c1.printElements();
        System.out.println();

        count = 0;
        while(count < 4){
            c1.removeElement();
            count++;
        }
        c1.printElements();
        System.out.println();


        count = 0;
        while(count < 5){
            Random random = new Random();

            Student student = new Student();
            student.setName("Stud_ELTH_" + count);
            student.setAttendance(random.nextInt(10));

            c1.addElement(student);
            count++;
        }
        c1.sortElement();
        c1.printElements();
    }
}
