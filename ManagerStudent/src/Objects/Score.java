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
public class Score {
    private float NumberScore;
    private String Classification;
    //cac ham init
    public Score(){
        NumberScore=0;
        Classification=new String();
    }
    public Score(float numberScore){
        if(!check(numberScore))
            return;
        NumberScore=numberScore;
        Classification=new String(setClassification(numberScore));
    }
    public Score(Score score){
        NumberScore=score.NumberScore;
        Classification=new String(score.Classification);
    }
    //cac ham set du lieu
    public void set(float numberScore){
        if(!check(numberScore))
            return;
        NumberScore=numberScore;
        Classification=setClassification(numberScore);
    }
    public void set(Score score){
        NumberScore=score.NumberScore;
        Classification=score.Classification;
    }
    //ham check du lieu
    public Boolean check(float score){
        return (score>=0 && score<=10)? true : false;
    }
    //ham set loai diem
    public String setClassification(float score){
        if(score>=9 && score<=10)
            return "A";
        else
            if(score>=8)
                return "B+";
            else
                if(score>=7)
                    return "B";
                else
                    if(score>=6)
                        return "C+";
                    else
                        if(score>=5)
                            return "C";
                        else
                            if(score>=4)
                                return "D";
        return "F";
    }
    //cac ham get du lieu
    public float getNumberScore(){
        return NumberScore;
    }
    public String getClassification(){
        return Classification;
    }
    public Score get(){
        Score score=new Score(NumberScore);
        return score;
    }
    public String toString(){
        return NumberScore+" - "+Classification;
    }
}
