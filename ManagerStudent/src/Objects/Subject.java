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
public class Subject {
    private String CodeSubject;
    private String Name;
    private int Credits;
    //cac ham init
    public Subject(){
        CodeSubject =new String();
        Name=new String();
        Credits=0;
    }
    public Subject(String codeSubject,String name,int credits){
        CodeSubject=new String(codeSubject);
        Name=new String(name);
        Credits=credits;
    }
    public Subject(Subject subject){
        CodeSubject=new String(subject.CodeSubject);
        Name=new String(subject.Name);
        Credits=subject.Credits;
    }
    //ham set du lieu
    public void set(String codeSubject,String name,int credits){
        CodeSubject=codeSubject;
        Name=name;
        Credits=credits;
    }
    public void set(Subject subject){
        CodeSubject=subject.CodeSubject;
        Name=subject.Name;
        Credits=subject.Credits;
    }
    //ham get du lieu
    public String getName(){
        return Name;
    }
    public String getCode(){
        return CodeSubject;
    }
    public int getCredits(){
        return Credits;
    }
    public Subject get(){
        Subject subject=new Subject();
        subject.set(CodeSubject,Name,Credits);
        return subject;
    }
    public String toString(){
        return CodeSubject+" - "+Name+" - "+Credits;
    }
}
