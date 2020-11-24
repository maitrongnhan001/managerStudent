/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author mrx
 */
public class Date {
        private int Day,Month,Year;
    //cac ham khoi tao
    public Date(){
        Day=0;
        Month=0;
        Year=0;
    }
    public Date(int day,int month, int year){
        if(!checkDay(day,month,year))
        {
            Day=0;
            Month=0;
            Year=0;
            return;
        }
        Day=day;
        Month=month;
        Year=year;
    }
    public Date(Date day){
        Day=day.Day;
        Month=day.Month;
        Year=day.Year;
    }
    //cac phuong thuc

    //phuong thuc cai dat
    public void set(int day,int month,int year){
        if(!checkDay(day,month,year))
            return;
        Day=day;
        Month=month;
        Year=year;
    }
    public void set(Date day){
        Day=day.Day;
        Month=day.Month;
        Year=day.Year;
    }
    //Ham kiem tra ngay thang nam co chinh xac hay khong
    public Boolean checkDay(int day,int month,int year){
        //nam nhuan chia het cho 4, nguoc lai la nam khong nhuan
        if(year%4==0){//day la nam nhuan
            if(month<=12){
                switch (month) {
                    case 1 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 2 :
                        if(day<=29){//nam nhuan co 29 ngaay
                            return true;
                        }else{
                            return false;
                        }
                    case 3 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 4 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 5 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 6 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 7 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 8 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 9 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 10 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 11 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 12 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    default:
                        break;
                }
            }else{
                return false;
            }
        }else{//nam khong nhuan
            if(month<=12){
                switch (month) {
                    case 1 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 2 :
                        if(day<=28){//nam khong nhuan co 28 ngay
                            return true;
                        }else{
                            return false;
                        }
                    case 3 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 4 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 5 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 6 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 7 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 8 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 9 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 10 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    case 11 :
                        if(day<=30){
                            return true;
                        }else{
                            return false;
                        }
                    case 12 :
                        if(day<=31){
                            return true;
                        }else{
                            return false;
                        }
                    default:
                        break;
                }
            }else{
                return false;
            }
        }
        return false;
    }
    //ham get du lieu
    public Date get(){
        Date day=new Date(Day,Month,Year);
        return day;
    }
    
    public String toString(){
        return Day+" / "+Month+" / "+Year;
    }
}
