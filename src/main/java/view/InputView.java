package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class InputView {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public List<String> readCarNames() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return splitNames(bufferedReader.readLine());
    }

    private List<String> splitNames(String names) {
        String[] splitNames = names.split(",");
        return Arrays.asList(splitNames);
    }

}