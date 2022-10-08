package com.game;

import java.util.Random;

public class Robot {//机器人

    public String robotName;//名字
    public int robotNum;//出拳数
    //构造方法
    public Robot(){
    }

    public Robot(String robotName, int robotNum) {
       this.robotName = robotName;
        this.robotNum = robotNum;
    }

    //出拳方法
    public int Finger(){//出拳是为了给裁判看。所以要直接返回出拳数
        Random random = new Random();
        robotNum = random.nextInt(3)+1;

        return robotNum;
    }

    //展示出拳显示到控制台，来查看过程。出拳是数字，但是看的是时候是中文
    public String showFinger(int robotNum){
        if (robotNum == 1){
            return "石头";
        }else if (robotNum == 2){
            return "剪刀";
        }else {
            return "布";
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "RobotName='" + robotName + '\'' +
                ", RobotNum=" + robotNum +
                '}';
    }
}