package com.ascoders;

public class java_chap_06_practice_set {
    public static void main(String[] args) {
        //Q-1
      /*float [] marks=new float[5];
        marks[0]=105;
        marks[1]=100;
        marks[2]=101;
        marks[3]=102;
        marks[4]=103;
        float sum=0;
        for(int i=0;i<=4;i++){
            sum=sum + marks[i];
        }
        System.out.println(sum);
    }}*/
        //Q-2
      /*  float num=99.9f;
        float [] marks={99.9f,98.9f,97.9f,96.9f,95.9f};
        boolean isInArray=false;
        for(float elements:marks){
            if(num==elements){
                isInArray=true;
                break;
            } }if(isInArray){
            System.out.println("This Value is present in the array");
        } else{
            System.out.println("This Value is not present in the array");
        }*/
        //Q-3
       /* System.out.println("The Average Marks of Whole Class :");
        float average=0;
    float [] marks={99.9f,98.9f,97.9f,96.9f,95.9f,94.9f,93.9f,92.9f,91.9f,90.9f};
    for(int i=0;i<marks.length;i++){
        average=average+marks[i]/marks.length;
    }
        System.out.println(average);
    }}         */
        //Q-4
  /* float [][] mat1={{45.4564f,54.554544f,54446.54f},
                    {45.5494f,649.5949494f,45.65949f}};
   float [][] mat2={{5549.64949f,54.4999f,212.494f},
                    {449.649f,48497.6448f,364664.16494f}};
   float [][] result={{0,0,0},
                     {0,0,0}};
      for(int i=0;i<mat1.length;i++){
          for(int j=0;j<mat1[i].length;j++){
           result[i][j]=mat1[i][j]+mat2[i][j];
             System.out.print(result[i][j]);
              System.out.print(" ");
          }
          System.out.println("");
      } */
       //Q-5
    /*    int [] arr={23,43,65,78,52} ;
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        System.out.println("This program will reverse the problem");
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }    for(int ele:arr){
            System.out.print(ele+" ");
    }*/
        //Q-6
      /*  int [] arr={12,34,75,457} ;
        int max=Integer.MIN_VALUE;
        for(int ele:arr) {
            if(ele>max){
                max=ele;
            }

            
        }   System.out.println("The max. value is:"+max);      }*/
        //Q-7
       /* int [] arr={12,42,54,19,654,98} ;
        int min=Integer.MAX_VALUE;
        for(int ele:arr){
          if(min>ele){
              min=ele;
          }
        }
        System.out.println("The min. value is :" +min); }}*/
         //Q-8
       /* int [] arr={1,2,121,243,563};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted =false;
                break;
            }
        } if(isSorted){
            System.out.println("The array is Sorted");
        }  else{
            System.out.println("The array is not Sorted");
        } */

    }}
