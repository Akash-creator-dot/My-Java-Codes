package com.ascoders;

public class java_chap_06 {
    public static void main(String[] args) {
     /* int [] marks=new int[5];
        marks[0]=98;
        marks[1]=97;
        marks[2]=96;
        marks[3]=95;
        marks[4]=99;
        System.out.println(marks[4]);  */
       /* int [] marks;
        marks=new int [5];
         marks[0]=99;
         marks[1]=98;
         marks[2]=97;
         marks[3]=96;
         marks[4]=95;
        System.out.println(marks[4]);  */
        /*int [] marks={99,98,97,96,95};
        System.out.println(marks[4]);
        System.out.println(marks.length); */
        //Displaying whole array at once
      /*  int [] marks={99,98,97,96,95};
       for(int i=4;i>=0;i--){
           System.out.println(marks[i]);
       }

    }}*/
// multidimensional array
/*int [] marks;
int [][] flats;
flats=new int [2][3];
 flats[0][0]=100;
 flats[0][1]=101;
 flats[0][2]=102;
 flats[1][0]=103;
 flats[1][1]=104;
 flats[1][2]=105;
 for(int i=0;i<flats.length;i++){
     for(int j=0;j<flats[i].length;j++){
         System.out.print(flats[i][j]);
         System.out.print(" ");
     }
     System.out.println('\n');
    }}}      */
   int[]buildings;
    int[][]lobbies;
    int[][][]flats;
    flats=new int [2][3][4];
    flats[0][0][0]=100;
    flats[0][0][1]=101;
    flats[0][0][2]=102;
    flats[0][0][3]=103;
    flats[0][1][0]=104;
    flats[0][1][1]=105;
    flats[0][1][2]=106;
    flats[0][1][3]=107;
    flats[0][2][0]=108;
    flats[0][2][1]=109;
    flats[0][2][2]=110;
    flats[0][2][3]=111;
    flats[1][0][0]=112;
    flats[1][0][1]=113;
    flats[1][0][2]=114;
    flats[1][0][3]=115;
    flats[1][1][0]=116;
    flats[1][1][1]=117;
    flats[1][1][2]=118;
    flats[1][1][3]=119;
    flats[1][2][0]=120;
    flats[1][2][1]=121;
    flats[1][2][2]=122;
    flats[1][2][3]=123;
    for(int i=0;i<flats.length;i++){
    for(int j=0;j<flats[i].length;j++){
        for(int k=0;k<flats[i][j].length;k++){
            System.out.print(flats[i][j][k]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
    }
    }  }