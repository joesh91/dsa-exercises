package com.shamal.dsa.sorting.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {

        int [] data = {100,10,90,20,80,30,70,40,60,50};

        for(int x:data){
            System.out.print(x+" ");
        }
        System.out.println();
        insertionSorts(data);

        System.out.println("AFTER SORTED :");
        for(int x:data){
            System.out.print(x+" ");
        }
    }

    public static void insertionSorts(int []data){
                for(int i=1;i < data.length;i++){
                    int key = data[i];
                    int j=i-1;

                        while(j>=0 && data[j] > key){
                            data[j+1] = data[j];
                            j--;
                        }
                        data[j+1]=key;
                }
    }
}
