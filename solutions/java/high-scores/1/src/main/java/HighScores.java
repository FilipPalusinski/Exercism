import java.util.List;
import java.util.ArrayList;

class HighScores {
    private List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.getLast();
    }

    Integer personalBest() {
        Integer highestScore = 0;
        for(Integer score : scores) {
            if(score >  highestScore){
                highestScore = score;
            }
        }
        return highestScore;
    }

    List<Integer> personalTopThree() {
    return scores.stream()
            .sorted((a, b) -> b - a)
            .limit(3)
            .toList();
    }

}
