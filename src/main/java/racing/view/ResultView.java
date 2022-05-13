package racing.view;

import racing.model.Racing;

public class ResultView {

    private static final String RESULT = "실행 결과";
    private static final String WINNER = "가 최종 우승했습니다.";

    public static void showHistory(Racing racing){
        System.out.println(RESULT);
        System.out.println(racing.getHistory());
    }

    public static void showWinner(Racing racing){
        System.out.println(racing.getWinnersName()+ WINNER);
    }
}
