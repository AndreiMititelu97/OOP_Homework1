package Andrei.poo.test1.util;
import Andrei.poo.test1.Comparable;


public class ComparableStack {
    private Comparable[] vector;
    private int size;
    private int index = 0;

    public ComparableStack(int size){
        this.size = size;
        vector = new Comparable[size];
    }

    public void printElements(){
        for(int i = index - 1; i >= 0; i--){
            System.out.println(vector[i]);
        }
    }

    public boolean addElement(Comparable element){
        if(index == size){
            System.out.println("Stack is full");
            return false;
        }

        vector[index++] = element;
        return true;
    }

    public Comparable removeElement(){
        if(index == 0){
            System.out.println("Stack is empty");
            return null;
        }

        return vector[--index];
    }

    public void sortElement(){
        boolean sorted = true;

        for(int j = 0; j < vector.length; j++){
            for(int i = 0; i < vector.length - 1; i++){
                if (vector[i].compare(vector[i + 1]) > 1){
                    sorted = false;
                    Comparable aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                }
            }
        }
    }
}
