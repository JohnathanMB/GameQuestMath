/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm_proy;

/**
 *
 * @author monitorvdo10
 */
public class Quest {
    private String question;
    private String ansCorrect;
    private String ansNoCorrect1;
    private String ansNoCorrect2;
    private String ansNoCorrect3;
    
    public Quest(String question,
            String ansCorrect,
            String ansNoCorrect1,
            String ansNoCorrect2,
            String ansNoCorrect3){
        
        this.question = question;
        this.ansCorrect = ansCorrect;
        this.ansNoCorrect1 = ansNoCorrect1;
        this.ansNoCorrect2 = ansNoCorrect2;
        this.ansNoCorrect3 = ansNoCorrect3;
        
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnsCorrect() {
        return ansCorrect;
    }

    public void setAnsCorrect(String ansCorrect) {
        this.ansCorrect = ansCorrect;
    }

    public String getAnsNoCorrect1() {
        return ansNoCorrect1;
    }

    public void setAnsNoCorrect1(String ansNoCorrect1) {
        this.ansNoCorrect1 = ansNoCorrect1;
    }

    public String getAnsNoCorrect2() {
        return ansNoCorrect2;
    }

    public void setAnsNoCorrect2(String ansNoCorrect2) {
        this.ansNoCorrect2 = ansNoCorrect2;
    }

    public String getAnsNoCorrect3() {
        return ansNoCorrect3;
    }

    public void setAnsNoCorrect3(String ansNoCorrect3) {
        this.ansNoCorrect3 = ansNoCorrect3;
    }
    
}
