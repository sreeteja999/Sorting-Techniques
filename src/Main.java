import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter total no of elements in list");
        int n=s.nextInt();

        System.out.println("enter numbers for sorting");
        int[] array= new int[n] ;
        for(int i=0 ; i<n ;i++){
            array[i]=s.nextInt();
        }


        //Display original array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Sorting :
            bubblesort(array);
            selectionsort(array);
            insertionSort(array);

    }
    public static void bubblesort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) { //compare adjacent elements and swap accordingly
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("BB sort :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public  static  void selectionsort(int[] array){
        for(int i=array.length; i>0 ; i--){
            int maxpos = 0,j,temp ;
            for ( j=1;j<i;j++){     //Loop for finding position of maximum element
                if(array[j]>array[maxpos]){
                    maxpos=j;
                }
            }
            temp = array[i-1];     //swap max element in list with element at final position in list
            array[i-1]=array[maxpos];
            array[maxpos]=temp;
        }
        System.out.println("Sel sort");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public  static void insertionSort(int[] array){
        for(int i = 1;i<array.length; i++){
            int value = array[i];
            int pos = i;
            while(pos>0 && array[pos-1]>value){
                array[pos]=array[pos-1];
                pos=pos-1;
            }
            array[pos]=value;
        }
        System.out.println("Ins sort");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    }

