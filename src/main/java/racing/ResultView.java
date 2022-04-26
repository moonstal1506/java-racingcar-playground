package racing;

import java.util.List;

public class ResultView {

    public void showWinners(List<String> winners) {
        String names = String.join(",", winners);
        System.out.println(names+"가 최종 우승했습니다.");
    }
}
