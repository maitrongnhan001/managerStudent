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
public class Human extends Date{
    private String Name;
    private String Nationality;
    private Date BirthDay;
    //cac ham khoi tao
    public Human(){
        Name=new String("null");
        Nationality=new String("null");
        BirthDay=new Date();
    }
    public Human(Human human){
        Name=new String(human.Name);
        Nationality=new String(human.Nationality);
        BirthDay=new Date(human.BirthDay);
    }
    public Human(String name,String nationality,Date birthDay){
        if(!check(name,nationality)){
            Name=new String("null");
            Nationality=new String("null");
            BirthDay=new Date();
            return;
        }
        Name=new String(name);
        Nationality=new String(nationality);
        BirthDay=new Date(birthDay);
    }
    //ham set du lieu
    public void set(Human human){
        Name=human.Name;
        Nationality=human.Nationality;
        BirthDay=human.BirthDay;
    }
    public void set(String name,String nationality,Date birthday){
        if(!check(name,nationality)){
            BirthDay=birthday;
            return;
        }
        Name=name;
        Nationality=nationality;
        BirthDay=birthday;
    }
    public Boolean check(String name,String nationality){
        if(name==""){
            return false;
        }
        if(nationality==""){
            return false;
        }
        return true;
    }
    //ham get du lieu
    public Human get(){
        Human human=new Human(Name,Nationality,BirthDay);
        human.BirthDay=BirthDay;
        human.Name=Name;
        human.Nationality=Nationality;
        return human;
    }
    public String getName(){
        return Name;
    }
    public String getNationality(){
        return Nationality;
    }
    public Date getBirthDay(){
        return super.get();
    }
    public String toString(){
        return Name +" - "+Nationality+" - "+BirthDay;
    }
}
