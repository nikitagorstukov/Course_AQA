package school.lesson4;

import java.util.Scanner;

public class Park {
        public static Scanner ob=new Scanner(System.in);
public info info;
public String park;
public Park(){
        System.out.print("Парк Горького");
        setPark(ob.next());
        info=new info();
        }
public String getPark(){
        return park;
        }
        public void setPark(String park){
        this.park=park;
        }
        public class info{
        int pr,st,sq;
public info(){
        System.out.print("Кол-во Аттракционов:");
        setPr(ob.nextInt());
        System.out.print("Время их работы:");
        setSt(ob.nextInt());
        System.out.print("Стоимость:");
        setSq(ob.nextInt());
        }
        public int getPr(){
        return pr;
        }
        public void setPr(int pr){
        this.pr=pr;
        }
        public int getSt(){
        return st;
        }
        public void setSt(int st){
        this.st=st;
        }
        public int getSq(){
        return sq;
        }
        public void setSq(int sq){
        this.sq=sq;
        }
        public void print(){
        System.out.print("В Парке"+getPark()+""+getPr()+"аттракционнов,"+getSt()+"время работы: "+getSq()+"стоимость");
        }
        }
        static public void main(String[]args){
        Park ct=new Park();
        ct.info.print();
        }
}
