/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author salon
 */
public class StudentQuizScores {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> studentQuiz = new HashMap<>();

        UserIO userIO = new UserIOImpl();

        int numberStudent = userIO.readInt("How many students in the class?");
        for (int i = 1; i <= numberStudent; i++) {
            ArrayList<Integer> score = new ArrayList<>();
            String studentName = userIO.readString("Enter Student Name:");

            score.add(userIO.readInt("Enter Score Obtained in first Quiz:"));
            score.add(userIO.readInt("Enter Score Obtained in second Quiz:"));
            score.add(userIO.readInt("Enter Score Obtained in third Quiz:"));

            studentQuiz.put(studentName, score);

        }
        Set<String> keys = studentQuiz.keySet();
        for (String sName : keys) {
            System.out.println(sName + " : " + studentQuiz.get(sName));
            

        }

    }
}
