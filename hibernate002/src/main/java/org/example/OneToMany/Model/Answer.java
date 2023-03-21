package org.example.OneToMany.Model;


import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    public Answer() {
    }

    public Answer(String answer, boolean correctFlag) {
        this.answer = answer;
        this.correctFlag = correctFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrectFlag() {
        return correctFlag;
    }

    public void setCorrectFlag(boolean correctFlag) {
        this.correctFlag = correctFlag;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String answer;
    private boolean correctFlag;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", correctFlag=" + correctFlag +
                '}';
    }
}
