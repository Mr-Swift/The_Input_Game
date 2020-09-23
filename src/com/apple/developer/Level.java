package com.apple.developer;

/**
 * 等级类
 * @author Administrator
 */
public class Level {
    //级别号
    private int levelNo;
    //字符串的长度
    private int strLength;
    //当前级别输入字符串的次数
    private int strTimes;
    //当前的级别限制时间
    private long timeLimit;
    //级别的每次得分
    private int perScore;

    public Level() {}
    public Level(int levelNo, int strLength, int strTimes, long timeLimit,
                 int perScore) {
        this.levelNo = levelNo;
        this.strLength = strLength;
        this.strTimes = strTimes;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }
    //alt+shift+s
    public int getLevelNo() {
        return levelNo;
    }
    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }
    public int getStrLength() {
        return strLength;
    }
    public void setStrLength(int strLength) {
        this.strLength = strLength;
    }
    public int getStrTimes() {
        return strTimes;
    }
    public void setStrTimes(int strTimes) {
        this.strTimes = strTimes;
    }
    public long getTimeLimit() {
        return timeLimit;
    }
    public void setTimeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
    }
    public int getPerScore() {
        return perScore;
    }
    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }
}
