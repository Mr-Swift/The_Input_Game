package com.apple.developer;

import java.util.Scanner;

public class Player {
    //玩家当前级别
    private int levelNo;
    //玩家当前得分
    private int perScore;
    //玩家的开始时间
    private long startTime;
    //玩家的已用时间
    private long elapsedTime;

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getLevelNo(){
        return this.levelNo;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }
    public int getPerSocre(){
        return this.perScore;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getStartTime() {
        return this.startTime ;
    }
    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public long getElapsedTime() {
        return this.elapsedTime ;
    }
    @Override
    public String toString(){
        return "玩家的当前级别："+this.levelNo+",当前得分为："+this.perScore+",已用时间："+this.elapsedTime;
    }

    //玩
    public void play(){
        Scanner input =new Scanner(System.in);
        //玩家和电脑玩
        Game g = new Game();
        //外层循环：一共玩多少级。
        for(int i = 0 ;i<LevelParam.LEVEL_PARAMS.length;i++){
            //升级
            this.levelNo++;
            this.setPerScore(0);
            setStartTime(System.currentTimeMillis());
            for(int j=0;j< LevelParam.LEVEL_PARAMS[i].getStrTimes();j++) {
                String out = g.GenStr(LevelParam.LEVEL_PARAMS[i].getStrLength());
                System.out.println("系统输出："+out);
                System.out.print("请输入：");
                String in = input.next();
                g.compareResult(out, in);
                setElapsedTime((System.currentTimeMillis()-this.getStartTime())/1000);
                setPerScore(getPerSocre()+2*this.getLevelNo());
                if(getElapsedTime()>LevelParam.LEVEL_PARAMS[i].getTimeLimit()){
                    System.out.println("对不起，您的手速太慢，已经超时。游戏结束！");
                    System.exit(0);
                }
                System.out.println("当前玩家级别"+this.getLevelNo()+"当前的分是"+this.getPerSocre()+"已用时间为"+this.getElapsedTime()+"秒");
                if((this.getLevelNo()==LevelParam.LEVEL_PARAMS[i].getLevelNo() ) && this.getPerSocre()>=LevelParam.LEVEL_PARAMS[i].getPerScore())
                    System.out.println("恭喜您，通关了整个游戏！");
            }
        }
    }
}
