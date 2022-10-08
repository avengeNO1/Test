package com.game;

import java.util.Scanner;

public class Player {//玩家


    public String playerName;//名字
    public int playNum;//出拳数

    //构造方法
    public Player(){

    }

    public Player(String playerName, int num) {
        this.playerName = playerName;
        this.playNum = playNum;
    }

    //出拳方法
    public int Finger(){//出拳是为了给裁判看。所以要直接返回出拳数
        Scanner sc = new Scanner(System.in);
        playNum  = sc.nextInt();
        return playNum;
    }

    //展示出拳显示到控制台，来查看过程。出拳是数字，但是看的是时候是中文
    public String showFinger(int playNum){
        if (playNum == 1){
            return "石头";
        }else if (playNum == 2){
            return "剪刀";
        }else {
            return "布";
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playNum=" + playNum +
                '}';
    }
}
