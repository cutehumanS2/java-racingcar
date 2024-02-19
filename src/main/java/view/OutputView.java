package view;

import java.util.List;

public class OutputView {

    private static final String WINNER_NAME_DELIMITER = ", ";
    private static final String NAME_DELIMITER = " : ";
    private static final String TRACE = "-";

    public void writeResultMessage() {
        System.out.println(System.lineSeparator() + "실행 결과");
    }

    public void writeRoundResult(String name, int position) {
        System.out.println(String.format("%s %s %s",
                name, NAME_DELIMITER, TRACE.repeat(position)));
    }

    public void writeWinners(List<String> names) {
        String winners = String.join(WINNER_NAME_DELIMITER, names);
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
