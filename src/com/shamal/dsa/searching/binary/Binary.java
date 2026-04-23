package com.shamal.dsa.searching.binary;

public class Binary {

    public static void main(String[] args) {

        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("SEARCH RESULT : "+binarySearch(data,10));
        System.out.println("SEARCH RESULT : "+binarySearch(data,100));
        System.out.println("SEARCH RESULT : "+binarySearch(data,40));
        System.out.println("SEARCH RESULT : "+binarySearch(data,50));
        System.out.println("SEARCH RESULT : "+binarySearch(data,0));

    }

    public static int binarySearch(int [] data,int x){

        int result =0;
        int low =  0;
        int high = data.length;
        int mid;

            while(low<=high){
                mid=(low+high)/2;

                if(x == data[mid]){
                   result=data[mid];
                   break;
                }
                else if(x < data[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        return result;
    }
}