package com.game;

import java.util.Scanner;

/**
 *
 * 控制游戏过程
 */

public class Game {

    public void run(){

        //欢迎界面封装
        welcome();//就是this.welcome（）
        System.out.println("请输入您的名字：");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.next();

        //游戏开始
        // 游戏对象初始化 玩家 电脑 裁判
        Player player = new Player();
        player.playerName = playerName;
        Robot robot = new Robot("AI",0);
        Umpire umpire = new Umpire(" 哈哈",0,0);

       while (umpire.playerScore < 10 && umpire.robotScore < 10){

           System.out.println("输入数字 1 - 石头 2 - 剪刀 3 - 布  8 --退出   0--重新开始");

           //出拳 为了等到比较的两个出拳数
           int playerNum = player.Finger();
           int robotNum = robot.Finger();
           if (playerNum == 8){
               System.out.println("GameOver");
               break;
           }else if (playerNum == 0){
               //置空
               umpire.robotScore = 0;
               umpire.playerScore = 0;
               System.out.println("游戏重新开始");
           }else if (playerNum >= 1 && playerNum <= 3){
               //显示出拳 为了玩家可以查看整个游戏过程
               String pf = player.showFinger(playerNum);
               String rf = robot.showFinger(robotNum);
               System.out.println(player.playerName+"出"+pf);
               System.out.println(robot.robotName+"出"+rf);

               //判断赢家
               int win = umpire.win(playerNum,robot);

               //游戏整个得分机制 要和胜负分开
               if(win == 0){
                   System.out.println(umpire.umpirename+"判定本局是："+playerName+"胜利");
                   umpire.playerScore += 2;
               }else if (win == 1){
                   System.out.println(umpire.umpirename+"判定本局是："+robot.robotName+"胜利");
                   umpire.robotScore += 2;
               }else {
                   System.out.println(umpire.umpirename+"判定本局是平局");
               }

               System.out.println("当前比分"+umpire.playerScore+"："+umpire.robotScore);
           }else {
               System.out.println("输入有误");
               continue;
           }

       }

       //游戏结束
        if (umpire.playerScore==10){
            System.out.println("最后是"+playerName+"胜利");
            System.exit(0);
        }else if (umpire.robotScore==10){
            System.out.println("最后是"+robot.robotName+"胜利");
            System.exit(0);
        }
    }

    public void welcome(){
        System.out.println("================");
        System.out.println("欢迎进入猜拳游戏");
        System.out.println("================");
    }
}
