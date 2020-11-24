/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import Objects.Human;

/**
 *
 * @author mrx
 */
public class Student extends Human{
    private String CodeStudent;
    private Human Information;
    //cac ham xay dung
    public Student(){
        CodeStudent=new String();
        Information=new Human();
    }
    public Student(String Code){
        /*
        if(!check()){
            return;
        }*/
        CodeStudent=new String(Code);
        Information=new Human();
    }
    public Student(String Code, Human info){
        /*
        if(!check()){
            return;
        }
        */
        CodeStudent=new String(Code);
        Information=new Human(info);
    }
    public Student(Student student){
        CodeStudent=new String(student.CodeStudent);
        Information=new Human(student.Information);
    }
    //ham get du lieu
    public void set(String Code, Human info){
        /*
        if(!check()){
            return;
        }
        */
        CodeStudent=new String(Code);
        Information.set(info);
    }
    public void set(Student student){
        CodeStudent=new String(student.CodeStudent);
        Information.set(student.Information);
    }
    
    public Boolean check(){
        //kiem tra co trung voi cac ma so sinh vien khac trong co so du lieu khong

        //kiem tra ma so sinh vien co dung dinh dang khong
        if(CodeStudent.length()!=8){
            return false;
        }
        String firstIndex,servenIndex;
        firstIndex=CodeStudent.substring(0,1);
        servenIndex=CodeStudent.substring(1);
        System.out.print(servenIndex);
        int a;
        try{
            a=Integer.parseInt(firstIndex);
            a=Integer.parseInt(servenIndex);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    //ham get du lieu
    public String getCodeStudent(){
        return CodeStudent;
    }
    public Human getInfo(){
        return Information.get();
    }
    public Student getStudent(){
        Student student=new Student();
        student.CodeStudent=CodeStudent;
        student.Information=Information;
        return student;
    }
}
