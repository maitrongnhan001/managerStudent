/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.NoteList;
/**
 *
 * @author mrx
 */
public class Note extends NoteList{
    private NoteList noteList;
    private int STT;
    private String Content;
    //funtion init
    public Note(){
        noteList =new NoteList();
        STT=0;
        Content=new String("Enter note");
    }
    public Note(NoteList nls,int stt,String content){
        noteList =new NoteList(nls);
        STT=stt;
        Content=new String(content);
    }
    //funtion set data
    public void setAllData(NoteList nls,int stt,String content){
        noteList =new NoteList(nls);
        STT=stt;
        Content=new String(content);
    }
    public void setStt(int stt){
        STT=stt;
    }
    public void setNoteList(NoteList nls){
        noteList=nls;
    }
    public void setContent(String content){
        Content=content;
    }
    //funtion get data
    public int getStt(){
        return STT;
    }
    public NoteList getNoteList(){
        return noteList;
    }
    public String getContent(){
        return Content;
    }
}

