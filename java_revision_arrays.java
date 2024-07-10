package com.ascoders;

public class java_revision_arrays {
    public static void main(String[] args) {
     /*   System.out.println("The Result of arrays");
        int[] marks=new int[9];
        marks[0]=99;
        marks[1]=98;
        marks[2]=97;
        marks[3]=96;
        marks[4]=95;
        marks[5]=94;
        marks[6]=93;
        marks[7]=92;
        marks[8]=91;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        } *///{
        //multi dimensional arrays(third dimension)
       /* int[]city;
        int[][]buildings;
        int[][][]flats;
        flats=new int [2][3][4];
        flats[0][0][0]=999;
        flats[0][0][1]=998;
        flats[0][0][2]=997;
        flats[0][0][3]=996;
        flats[0][1][0]=995;
        flats[0][1][1]=994;
        flats[0][1][2]=993;
        flats[0][1][3]=992;
        flats[0][2][0]=991;
        flats[0][2][1]=990;
        flats[0][2][2]=989;
        flats[0][2][3]=987;
        flats[1][0][0]=986;
        flats[1][0][1]=985;
        flats[1][0][2]=984;
        flats[1][0][3]=983;
        flats[1][1][0]=982;
        flats[1][1][1]=981;
        flats[1][1][2]=980;
        flats[1][1][3]=979;
        flats[1][2][0]=978;
        flats[1][2][1]=977;
        flats[1][2][2]=976;
        flats[1][2][3]=975;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            for(int k=0;k<flats[i][j].length;k++){
                System.out.print(flats[i][j][k]);
                  System.out.print(" ");
            }
                System.out.println("\n");

            }
            System.out.println("\n");
            }
        }   */
    //multi dimensional arrays(forth dimension)
    /*    int[]state;
        int[][]city;
    int[][][][]building;
    int[][][][]flats;
    flats=new int[2][3][4][5];
    flats[0][0][0][0]=999;
    flats[0][0][0][1]=999;
    flats[0][0][0][2]=999;
    flats[0][0][0][3]=999;
    flats[0][0][0][4]=999;
    flats[0][0][1][0]=999;
    flats[0][0][1][1]=999;
    flats[0][0][1][2]=999;
    flats[0][0][1][3]=999;
    flats[0][0][1][4]=999;
    flats[0][0][2][0]=999;
    flats[0][0][2][1]=999;
    flats[0][0][2][2]=999;
    flats[0][0][2][3]=999;
    flats[0][0][2][4]=999;
    flats[0][0][3][0]=999;
    flats[0][0][3][1]=999;
    flats[0][0][3][2]=999;
    flats[0][0][3][3]=999;
    flats[0][0][3][4]=999;
    flats[0][1][0][0]=999;
    flats[0][1][0][1]=999;
    flats[0][1][0][2]=999;
    flats[0][1][0][3]=999;
    flats[0][1][0][4]=999;
    flats[0][1][1][0]=999;
    flats[0][1][1][1]=999;
    flats[0][1][1][2]=999;
    flats[0][1][1][3]=999;
    flats[0][1][1][4]=999;
    flats[0][1][2][0]=999;
    flats[0][1][2][1]=999;
    flats[0][1][2][2]=999;
    flats[0][1][2][3]=999;
    flats[0][1][2][4]=999;
    flats[0][1][3][0]=999;
    flats[0][1][3][1]=999;
    flats[0][1][3][2]=999;
    flats[0][1][3][3]=999;
    flats[0][1][3][4]=999;
    flats[0][2][0][0]=999;
    flats[0][2][0][1]=999;
    flats[0][2][0][2]=999;
    flats[0][2][0][3]=999;
    flats[0][2][0][4]=999;
    flats[0][2][1][0]=999;
    flats[0][2][1][1]=999;
    flats[0][2][1][2]=999;
    flats[0][2][1][3]=999;
    flats[0][2][1][4]=999;
    flats[0][2][2][0]=999;
    flats[0][2][2][1]=999;
    flats[0][2][2][2]=999;
    flats[0][2][2][3]=999;
    flats[0][2][2][4]=999;
    flats[0][2][3][0]=999;
    flats[0][2][3][1]=999;
    flats[0][2][3][2]=999;
    flats[0][2][3][3]=999;
    flats[0][2][3][4]=999;
    flats[1][0][0][0]=999;
    flats[1][0][0][1]=999;
    flats[1][0][0][2]=999;
    flats[1][0][0][3]=999;
    flats[1][0][0][4]=999;
    flats[1][0][1][0]=999;
    flats[1][0][1][1]=999;
    flats[1][0][1][2]=999;
    flats[1][0][1][3]=999;
    flats[1][0][1][4]=999;
    flats[1][0][2][0]=999;
    flats[1][0][2][1]=999;
    flats[1][0][2][2]=999;
    flats[1][0][2][3]=999;
    flats[1][0][2][4]=999;
    flats[1][0][3][0]=999;
    flats[1][0][3][1]=999;
    flats[1][0][3][2]=999;
    flats[1][0][3][3]=999;
    flats[1][0][3][4]=999;
    flats[1][1][0][0]=999;
    flats[1][1][0][1]=999;
    flats[1][1][0][2]=999;
    flats[1][1][0][3]=999;
    flats[1][1][0][4]=999;
    flats[1][1][1][0]=999;
    flats[1][1][1][1]=999;
    flats[1][1][1][2]=999;
    flats[1][1][1][3]=999;
    flats[1][1][1][4]=999;
    flats[1][1][2][0]=999;
    flats[1][1][2][1]=999;
    flats[1][1][2][2]=999;
    flats[1][1][2][3]=999;
    flats[1][1][2][4]=999;
    flats[1][1][3][0]=999;
    flats[1][1][3][1]=999;
    flats[1][1][3][2]=999;
    flats[1][1][3][3]=999;
    flats[1][1][3][4]=999;
    flats[1][2][0][0]=999;
    flats[1][2][0][1]=999;
    flats[1][2][0][2]=999;
    flats[1][2][0][3]=999;
    flats[1][2][0][4]=999;
    flats[1][2][1][0]=999;
    flats[1][2][1][1]=999;
    flats[1][2][1][2]=999;
    flats[1][2][1][3]=999;
    flats[1][2][1][4]=999;
    flats[1][2][2][0]=999;
    flats[1][2][2][1]=999;
    flats[1][2][2][2]=999;
    flats[1][2][2][3]=999;
    flats[1][2][2][4]=999;
    flats[1][2][3][0]=999;
    flats[1][2][3][1]=999;
    flats[1][2][3][2]=999;
    flats[1][2][3][3]=999;
    flats[1][2][3][4]=999;
        {
            for(int i=0;i<flats.length;i++){
              for(int j=0;j<flats[i].length;j++){
                   for(int k=0;k<flats[i][j].length;k++){
                        for(int l=0;l<flats[i][j][k].length;l++){
                            System.out.print(flats[i][j][k][l]);
                            System.out.print(" ");
            }
                       System.out.println("\n");
        }
    }}               }*/
    int[] marks=new int[5];
        marks[0]=99;
        marks[1]=98;
        marks[2]=97;
        marks[3]=96;
        marks[4]=95;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    } }


