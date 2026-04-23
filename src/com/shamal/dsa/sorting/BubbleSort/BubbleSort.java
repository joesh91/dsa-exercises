package com.shamal.dsa.sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int [] data = {100,10,90,20,80,30,70,40,60,50};
        for(int x:data){
            System.out.print(x+" ");
        }
        System.out.println();

        bubbleSort(data);
        for(int x:data){
            System.out.print(x+" ");
        }
    }

    public static void bubbleSort(int [] data){
        for(int i = data.length-1;i>=1;i--){
            for(int j =0;j<i;j++){
                    if(data[j+1]<data[j]){
                        swap(j,j+1,data);
                    }
                }
            }
        }

    private static void swap(int a,int b,int [] data){
            int temp = data[a];
            data[a] = data[b];
            data[b] =  temp;
        }
    }