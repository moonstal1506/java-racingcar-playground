package racing;

public class Main {

    public static void playRacingGame(){
        InputView inputView = new InputView();
        Racing racing = new Racing(inputView.inputName());
        int times=inputView.inputTimes();
        System.out.println();
        System.out.println("실행결과");

        for(int i=0;i<times;i++){
            racing.playGame();
            System.out.println();
        }
        ResultView resultView =new ResultView();
        resultView.showWinners(racing.pickWinner());
    }

    public static void main(String[] args) {
        playRacingGame();
    }
}
