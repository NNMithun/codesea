package com.hackerRank.Arrays2D;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Queen {

    class Coordinate{
        int row;
        int col;
    }
    public static void main(String[] args) {


    }


    List<Coordinate> getObstaclesInQueenPath(List<Coordinate> obstacles,
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

    List<Coordinate> get8ObstaclesInQueenPath(List<Coordinate> obstacles,
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

        return obstaclesInQueenPath;

    }

    private int getSlope(Coordinate obstacle, Coordinate queen){
        return Math.abs( (queen.row-obstacle.row)/(queen.col-obstacle.col));
    }


}
