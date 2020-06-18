package com.hackerRank.Arrays2D;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Queen {

    static class  Coordinate{
        int row;
        int col;

        public Coordinate(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }



    public static void main(String[] args) {

        List<Coordinate> coordinates= new ArrayList<>();
        coordinates.add(new Coordinate(2, 0));
        coordinates.add(new Coordinate(3, 1));

        coordinates.add(new Coordinate(1, 7));
        coordinates.add(new Coordinate(2, 6));

        coordinates.add(new Coordinate(7, 1));
        coordinates.add(new Coordinate(6, 2));

        coordinates.add(new Coordinate(7, 5));
        coordinates.add(new Coordinate(6, 4));

        coordinates.add(new Coordinate(5, 0));
        coordinates.add(new Coordinate(5, 1));

        coordinates.add(new Coordinate(5, 7));
        coordinates.add(new Coordinate(5, 6));

        coordinates.add(new Coordinate(2, 3));
        coordinates.add(new Coordinate(1, 3));

        coordinates.add(new Coordinate(7, 3));
        coordinates.add(new Coordinate(6, 3));

        coordinates.add(new Coordinate(7, 6));
        coordinates.add(new Coordinate(6, 1));

        Coordinate queen=new Coordinate(0, 0);

        coordinates= getObstaclesInQueenPath(coordinates,queen);
        HashMap<String,Coordinate> hash=get8ObstaclesInQueenPath(coordinates,queen);
        HashMap<String,Coordinate> dummy= new HashMap<>();
        calculateTheDistance(dummy,queen,7);

    }

    private static void calculateTheDistance(HashMap<String, Coordinate> hash, Coordinate queen,
                                             Integer n) {
        int count=0;
        if (hash.containsKey("leftTop")){
            Coordinate leftTop= hash.get("leftTop");
            count+=(queen.row-leftTop.row)-1;
        }else{
            count+=queen.col;
        }
        if (hash.containsKey("rightTop")){
            Coordinate rightTop= hash.get("rightTop");
            count+=Math.abs(queen.row-rightTop.row)-1;


        }else{
            count+=queen.row+queen.col<n? queen.row: n-queen.col;
        }
        if (hash.containsKey("rightBottom")){
            Coordinate rightBottom= hash.get("rightBottom");
            count+=Math.abs(queen.row-rightBottom.row)-1;


        }else{
            count+=n-queen.row<n-queen.col? n-queen.row: n-queen.col;
        }
        if (hash.containsKey("leftBottom")){
            Coordinate leftBottom= hash.get("leftBottom");
            count+=Math.abs(queen.row-leftBottom.row)-1;


        }else{
            count+=queen.col+queen.row>n?n-queen.col:queen.row;
        }
        if (hash.containsKey("left")){
            Coordinate left= hash.get("left");
            count+=Math.abs(queen.col-left.col)-1;


        }else{
            count+=queen.col;
        }
        if (hash.containsKey("right")){
            Coordinate right= hash.get("right");
            count+=Math.abs(queen.col-right.col)-1;


        }else{
            count+=n-queen.col;
        }
        if (hash.containsKey("top")){
            Coordinate top= hash.get("top");

        }else{
            count+=queen.row;
        }
        if (hash.containsKey("bottom")){
            Coordinate bottom= hash.get("bottom");

        }else{
            count+=n-queen.row;
        }
        System.out.println(count);
    }


    static List<Coordinate> getObstaclesInQueenPath(List<Coordinate> obstacles,
                                             Coordinate queenPosition){

        List<Coordinate> obstaclesInQueenPath= new ArrayList<>();
        for (Coordinate obstacle : obstacles) {
            if(obstacle.row==queenPosition.row ||
               obstacle.col==queenPosition.col ||
               getSlope(obstacle,queenPosition)==1){
                obstaclesInQueenPath.add(obstacle);
            }
        }

        return obstaclesInQueenPath;

    }

    static HashMap<String,Coordinate> get8ObstaclesInQueenPath(List<Coordinate> obstacles,
                                             Coordinate queen){
        HashMap<String,Coordinate> obs= new HashMap<>();
        int nearLeftTop=Integer.MAX_VALUE;
        int nearLeftBottom=Integer.MAX_VALUE;
        int nearRightTop=Integer.MAX_VALUE;
        int nearRightBottom=Integer.MAX_VALUE;
        int nearLeft=Integer.MAX_VALUE;
        int nearRight=Integer.MAX_VALUE;
        int nearTop=Integer.MAX_VALUE;
        int nearBottom=Integer.MAX_VALUE;

        List<Coordinate> obstaclesInQueenPath= new ArrayList<>();
        for (Coordinate obstacle : obstacles) {
            int rowDiff=queen.row-obstacle.row;
            int colDiff=queen.col-obstacle.col;
            if(rowDiff>0 && colDiff>0){
                if(nearLeftTop>rowDiff){
                    nearLeftTop=rowDiff;
                    obs.put("leftTop", obstacle);
                }
            }else if(rowDiff>0 && colDiff<0){
                if(nearRightTop>rowDiff){
                    nearRightTop=rowDiff;
                    obs.put("rightTop", obstacle);
                }
            }else if(rowDiff<0 && colDiff<0){
                if(nearRightBottom>Math.abs(rowDiff)){
                    nearRightBottom=Math.abs(rowDiff);
                    obs.put("rightBottom", obstacle);
                }
            }else if(rowDiff<0 && colDiff>0){
                if(nearLeftBottom>Math.abs(rowDiff)){
                    nearLeftBottom=Math.abs(rowDiff);
                    obs.put("leftBottom", obstacle);
                }
            }else if(rowDiff==0 && colDiff>0){
                if(nearLeft>Math.abs(colDiff)){
                    nearLeft=Math.abs(colDiff);
                    obs.put("left", obstacle);
                }
            }else if(rowDiff==0 && colDiff<0){
                if(nearRight>Math.abs(colDiff)){
                    nearRight=Math.abs(colDiff);
                    obs.put("right", obstacle);
                }

            }else if(rowDiff>0 && colDiff==0){
                if(nearTop>Math.abs(rowDiff)){
                    nearTop=Math.abs(rowDiff);
                    obs.put("top", obstacle);
                }
            }else if(rowDiff<0 && colDiff==0){
                if(nearBottom>Math.abs(rowDiff)){
                    nearBottom=Math.abs(rowDiff);
                    obs.put("bottom", obstacle);
                }
            }

        }

        return obs;

    }

    private static int getSlope(Coordinate obstacle, Coordinate queen){
        return Math.abs( (queen.row-obstacle.row)/(queen.col-obstacle.col));
    }


}
