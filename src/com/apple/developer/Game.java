package com.apple.developer;

import java.util.Random;

public class Game {
    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer(){
        return this.player;
    }
    /**
     * 系统产生的随机字符串：
     *    玩家等级发生变化：字符串的长度会变长
     * @return
     */
    public String GenStr(int length){
        Random r = new Random();
        String message = "";
        for(int i = 0 ;i<length;i++){
            int num = r.nextInt(26);
            switch (num) {
                case 0:
                    message = message +"a";
                    break;
                case 1:
                    message = message +"b";
                    break;
                case 2:
                    message = message +"c";
                    break;
                case 3:
                    message = message +"d";
                    break;
                case 4:
                    message = message +"e";
                    break;
                case 5:
                    message = message +"f";
                    break;
                case 6:
                    message = message +"g";
                    break;
                case 7:
                    message = message +"h";
                    break;
                case 8:
                    message = message +"i";
                    break;
                case 9:
                    message = message +"j";
                    break;
                case 10:
                    message = message +"k";
                    break;
                case 11:
                    message = message +"l";
                    break;
                case 12:
                    message = message +"m";
                    break;
                case 13:
                    message = message +"n";
                    break;
                case 14:
                    message = message +"o";
                    break;
                case 15:
                    message = message +"p";
                    break;
                case 16:
                    message = message +"q";
                    break;
                case 17:
                    message = message +"r";
                    break;
                case 18:
                    message = message +"s";
                    break;
                case 19:
                    message = message +"t";
                    break;
                case 20:
                    message = message +"u";
                    break;
                case 21:
                    message = message +"v";
                    break;
                case 22:
                    message = message +"w";
                    break;
                case 23:
                    message = message +"x";
                    break;
                case 24:
                    message = message +"y";
                    break;
                case 25:
                    message = message +"z";
                    break;
                default:
                    break;
            }
        }
        return message ;
    }

    /**
     * 比较系统的输出和用户的输入
     * @param out:系统的输出
     * @param in：玩家的输入
     */
    public void compareResult(String out,String in) {
        if(out.equals(in)==false){
            System.out.println("输入错误，游戏结束！");
            System.exit(0);
        }
        if(out.equals(in)==true){
            return ;
        }
    }
}
