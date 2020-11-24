/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import Objects.Date;
/**
 *
 * @author mrx
 */
public class Note extends Date{
    private String Content;
    private Date DayWrite;
    //cac ham init
    public Note(){
        Content=new String();
        DayWrite=new Date();
    }
    public Note(String content){
        Content=new String(content);
        DayWrite=new Date();
    }
    public Note(Note note){
        Content=new String(note.Content);
        DayWrite=new Date(note.DayWrite);
    }
    //ham set du lieu
    public void set(String content,Date day){
        Content=content;
        DayWrite=day;
    }
    public void set(Note note){
        Content=note.Content;
        DayWrite=note.DayWrite;
    }
    //ham get du lieu
    public Note get(){
        Note note=new Note();
        note.Content=Content;
        note.DayWrite=DayWrite;
        return note;
    }
    public String getConten(){
        return Content;
    }
    public Date getDayWrite(){
        return DayWrite;
    }
    public String toStirng(){
        return Content+ " - " + DayWrite;
    }
}

