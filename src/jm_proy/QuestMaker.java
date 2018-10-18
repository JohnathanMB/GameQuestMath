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
public class QuestMaker {
    
    ListQuests listQuest = new ListQuests();
    
    public Quest doQuest(int i){
        
        String questTxt = listQuest.questions[i];
        String ansCorrect = listQuest.ansCorrect[i];
        String ansNoCorrect1 = listQuest.ansNoCorrect1[i];
        String ansNoCorrect2 = listQuest.ansNoCorrect2[i];
        String ansNoCorrect3 = listQuest.ansNoCorrect3[i];
        
        Quest quest = new Quest(questTxt, 
                ansCorrect, 
                ansNoCorrect1, 
                ansNoCorrect2, 
                ansNoCorrect3
        );
        
        return quest;
    }
    
    public boolean isCorrect(int i, String ans){
        boolean boolAns = false;
        if(listQuest.ansCorrect[i].equals(ans)){
            boolAns = true;
        }
        return boolAns;
    }
    
}
