package com.shamal.dsa.sorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] data = {100,10,90,20,80,30,70,40,60,50};
        for(int x:data){
            System.out.print(x+" ");
        }
        System.out.println();

        selectionSort(data);
        for(int x:data){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int [] data){
        for(int i=0;i<data.length;i++){
            int mindIndex = i;
            for(int j =i+1;j< data.length;j++){
                if(data[j]<data[mindIndex]){
                    mindIndex=j;
                }
            }
swap(mindIndex,i,data);
        }
    }

    private static void swap(int a,int b,int [] data){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}


