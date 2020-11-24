/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import Objects.*;

/**
 *
 * @author mrx
 */
public class Study {
    private int Semester;
    private String SchoolYear;
    private Subject subject;
    private Score score;
    private Student student;
    //cac ham init
    public Study(){
        Semester=0;
        SchoolYear=new String();
        subject=new Subject();
        score=new Score();
        student=new Student();
    }
    public Study(int semester,String schoolYear,Subject s,Score sc,Student st){
        Semester=semester;
        SchoolYear=new String(schoolYear);
        subject=new Subject(s);
        score=new Score(sc);
        student=new Student(st);
    }
    public Study(Study study){
        Semester=study.Semester;
        SchoolYear=new String(study.SchoolYear);
        subject=new Subject(study.subject);
        score=new Score(study.score);
        student=new Student(study.student);
    }
    //cac ham set du lieu
    public void set(int semester,String schoolYear,Subject s,Score sc,Student st){
        Semester=semester;
        SchoolYear=new String(schoolYear);
        subject=new Subject(s);
        score=new Score(sc);
        student=new Student(st);
    }
    public void Set(Study study){
        Semester=study.Semester;
        SchoolYear=new String(study.SchoolYear);
        subject=new Subject(study.subject);
        score=new Score(study.score);
        student=new Student(study.student);
    }
    //cac ham get du lieu
    public int getSemester(){
        return Semester;
    }
    public String getSchoolYear(){
        return SchoolYear;
    }
    public Subject getSuject(){
        return subject;
    }
    public Score getScore(){
        return score;
    }
    public Student getStudent(){
        return student;
    }
    public Study get(){
        Study study=new Study(Semester,SchoolYear,subject,score,student);
        return study;
    }
    public String toString(){
        return student.getInfo().getName()+" hoc "+subject.getName() +" - "+subject.getCode()+" duoc diem "+ score.toString() +"\nHK:"
                +Semester+" - "+SchoolYear;
    }
}
