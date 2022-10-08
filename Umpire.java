package com.game;

public class Umpire {

    public String umpirename = "马云";//名字
    public int playerScore;//玩家得分
    public int robotScore;//机器人得分
    //构造方法
    public Umpire(){

    }

    public Umpire(String name, int playerScore, int robotScore) {
        this.umpirename = umpirename;
        this.playerScore = playerScore;
        this.robotScore = robotScore;
    }

//    public void check(int pNum, int rNum, String pName, String rName){//判断胜负方法
//
//        if (pNum == rNum){
//            System.out.println("平局");
//        }else if (pNum == 1 && rNum == 2 ||pNum == 2 && rNum == 3 ||pNum == 3 && rNum == 1 ){
//            System.out.println(pName+"赢");
//            playerScore += 2;
//        }else {
//            System.out.println(rName+"赢");
//            robotScore += 2;
//        }
//    }

    //裁判的方法 输赢 输赢+得分 得分  (程序的解耦)
    public int win(int playNum,Robot robot){
        if (playNum == 1 && robot.robotNum == 2 ||playNum == 2 && robot.robotNum == 3 ||playNum == 3 && robot.robotNum == 1){
            return 0;//玩家赢
        }else if(playNum == robot.robotNum) {
            return 2;//平局
        }else {
            return 1;//机器人赢
        }
    }


    @Override
    public String toString() {
        return "Umpire{" +
                "umpirename='" + umpirename + '\'' +
                ", playerScore=" + playerScore +
                ", robotScore=" + robotScore +
                '}';
    }
}
