package Andrei;

import Andrei.poo.test1.Comparable;

public class Student extends Comparable {
    private String name;
    private int attendance;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAttendance(){
        return attendance;
    }

    public void setAttendance(int attendance){
        this.attendance = attendance;
    }

    @Override
    public int compare(Comparable other){
        if(other instanceof Student){
            Student otherStudent = (Student) other;

            return Integer.compare(this.attendance, otherStudent.attendance);
        }
        return super.compare(other);
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Attendance: %d", name, attendance);
    }
}
