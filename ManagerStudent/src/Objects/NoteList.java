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
public class NoteList {
    private int ID;
    private String Name;
    private int AmountNote;
    //cac ham init
    public NoteList(){
        Name=new String();
        AmountNote=0;
        ID=0;
    }
    public NoteList(int id){
        Name=new String();
        AmountNote=0;
        ID=id;
    }
    public NoteList(int id,String name,int amountNote){
        int i;
        Name=name;
        ID=id;
        if(!check(amountNote))
            return;
        AmountNote=amountNote;
    }
    public NoteList(NoteList noteList){
        int i;
        ID=noteList.ID;
        Name=noteList.Name;
        AmountNote=noteList.AmountNote;
    }
    //cac ham set du lieu
    public void set(int id, String name){
        ID=id;
        Name=name;
    }
    public void set(NoteList noteList){
        int i;
        ID= noteList.ID;
        Name=noteList.Name;
        AmountNote=noteList.AmountNote;

    }
    public Boolean check(int amount){
        if(amount<0){
            return false;
        }
        return true;
    }
    //cac ham get du lieu
    public String getName(){
        return Name;
    }
    public int getAmount(){
        return AmountNote;
    }
    public int getID(){
        return ID;
    }

    public NoteList get(){
        NoteList noteList=new NoteList();
        noteList.ID=ID;
        noteList.Name=Name;
        noteList.AmountNote=AmountNote;
        int i;
        return noteList;
    }
    public String toString(){
        String resuft= Name+" - "+AmountNote+"\n";
        int i;
        return resuft;
    }
}
