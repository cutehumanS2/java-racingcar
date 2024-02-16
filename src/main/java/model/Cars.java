package model;

import static util.ErrorMessage.ERROR_DUPLICATED_NAME;
import static util.ErrorMessage.ERROR_NAME_COUNT;
import static util.Util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private static final int MIN_CAR_NAME_COUNT = 2;
    private static final int MIN_POSITION = 0;
    private static final String NEW_LINE = "\n";

    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars from(List<String> names) {
        validate(names);

        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(Car.from(name));
        }
        return new Cars(cars);
    }

    private static void validate(List<String> names) {
        checkDuplicatedName(names);
        checkNameCount(names);
    }

    private static void checkDuplicatedName(List<String> names) {
        long nameCount = names.stream().distinct().count();
        if (names.size() != nameCount) {
            throw new IllegalArgumentException(ERROR_DUPLICATED_NAME.getMessage());
        }
    }

    private static void checkNameCount(List<String> names) {
        if (names.size() < MIN_CAR_NAME_COUNT) {
            throw new IllegalArgumentException(ERROR_NAME_COUNT.getMessage());
        }
    }

    public void moveCars() {
        for (Car car : cars) {
            car.moveForward(generateRandomNumber());
        }
    }

    public List<String> findWinnerNames() {
        int maxPosition = getMaxPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(MIN_POSITION);
    }


    @Override
    public String toString() {
        StringBuilder allTrace = new StringBuilder();
        for (Car car : cars) {
            allTrace.append(car).append(NEW_LINE);
        }
        return allTrace.toString();
    }
}
