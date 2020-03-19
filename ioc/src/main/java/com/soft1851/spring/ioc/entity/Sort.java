package com.soft1851.spring.ioc.entity;/*@ClassName Sort
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/10
 *@Version 1.0
 **/

public class Sort {
    int [] arr ={1,48,521,874,456};

    public  int[] bubbleSort(){
        for(int i= 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
    public int[] selectSort(){
        int minIndex;
        int temp;
        for(int i =0;i<arr.length-1;i++){
            minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return  arr;
    }
}
