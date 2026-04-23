package com.shamal.dsa.searching.binaryrecursion;

public class BinaryRecursion {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("SEARCH RESULT : "+binaryRecursion(data,10));
        System.out.println("SEARCH RESULT : "+binaryRecursion(data,100));
        System.out.println("SEARCH RESULT : "+binaryRecursion(data,40));
        System.out.println("SEARCH RESULT : "+binaryRecursion(data,50));
        System.out.println("SEARCH RESULT : "+binaryRecursion(data,0));
    }

    public static int binaryRecursion(int [] data,int x){

        return binaryRecursion(data,x,0, data.length-1);
    }

    public static int binaryRecursion(int [] data,int x,int low,int high){

        if(low>high){
            return -1;
        }
            int mid=(low+high)/2;

            if(x==data[mid]){
                return data[mid];
            }
            else if(x > data[mid]){
                low = mid+1;
                return binaryRecursion(data,x,low,high);
            }
            else{
                high=mid-1;
                return binaryRecursion(data,x,low,high);
            }
    }
}