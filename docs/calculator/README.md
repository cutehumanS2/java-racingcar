# 🚀 TDD - 문자열 덧셈 계산기

## 🛠 구현 기능 목록

* [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
* [x] 빈 문자열인 경우 0을 반환한다.
* [x] null 값을 입력할 경우 0을 반환한다.
* [x] 문자열이 주어지면 `쉼표(,)` 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
* [x] 문자열이 주어지면 `콜론(:)` 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
* [x] 기본 구분자인 `쉼표(,)`, `콜론(:)`외에 커스텀 구분자를 지정할 수 있다. 
커스텀 구분자는 문자열 앞부분의 `//`와 `\n` 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
커스텀 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
* [x] 주어진 문자열이 `숫자 이외의 값` 또는 `음수`를 전달할 경우 `RuntimeException 예외를 throw` 한다.

## 역할

### StringCalculator

문자열 계산기이다. 문자열을 계산하는 책임을 가지고 있고, 현재 문자를 구분자로 자르고 더하는 기능을 가지고 있다.

### NaturalNumber

자연수를 나타내기 위한 포장 객체이다. 요구사항에 맞춰 검증하기 위한 검증 로직을 포함하고 있다.