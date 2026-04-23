package com.shamal.dsa.searching.linear;

public class Linear {

    public static void main(String[] args) {

        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int x : data) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("SEARCH RESULT : "+linear(data,10));
        System.out.println("SEARCH RESULT : "+linear(data,100));
        System.out.println("SEARCH RESULT : "+linear(data,40));
        System.out.println("SEARCH RESULT : "+linear(data,50));
        System.out.println("SEARCH RESULT : "+linear(data,0));
    }

    public static int linear(int []data , int x){
        int result =-1;
            for(int i=0;i< data.length;i++){
                if(x == data[i]){
                    result = data[i];
                }
            }
        return result;
    }
}