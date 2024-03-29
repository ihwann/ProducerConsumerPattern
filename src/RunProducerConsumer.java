/*
○ 과제 내용
        - words.txt 파일의 단어를 복수의 파일로 분리하는 프로그램을 객체 지향 설계의 SOLID 원칙에 따라 구현합니다.
        · https://ko.wikipedia.org/wiki/SOLID_(객체_지향_설계)

        - words.txt 파일의 각 라인은 1개의 단어를 포함하고 있습니다.
        · 단어는 알파벳으로 시작하며 대소문자는 구분하지 않습니다.
        · 알파벳 외 문자로 시작하는 단어는 유효하지 않습니다.
        예) ab!23 (유효함), A12bd (유효함), 123abc (유효하지않음)



        ○ 요구사항
        1. 프로그램의 실행 argument로 3개의 값을 입력
        - 처리해야 할 파일경로 (예: words.txt 파일경로)
        - 결과 파일들을 저장 할 디렉토리 경로
        - 병렬 처리를 위한 파티션 수 N (1 < N < 27)
        2. Producer-Consumer 디자인 패턴을 응용해 아래의 요구사항에 따라 로직 구현
        - Producer 요구사항
        a. 파일에서 각 라인을 읽어온다.
        b. 각 라인의 주어진 단어가 유효한지 정규표현식을 활용해 검사한다.
        · 유효한 단어에 대한 설명은 과제설명 항목2 참고
        c. 유효하지 않은 단어들은 처리를 생략한다.
        d. 유효한 단어들은 N개의 파티션으로 나눠서 Consumer에 전달한다.
        · 파티션 수는 프로그램의 실행 argument로 입력 받는다.
        · 동일한 단어는 항상 동일한 파티션에 포함되야 한다.
        - Consumer 요구사항
        a. 파티션에서 순차적으로 단어를 1개씩 가져온다.
        b. 단어의 첫 알파벳에 해당하는 파일이 존재하지 않으면 새로 만들고, 존재한다면 기존 파일 끝에 주어진 단어를 추가한다. (대소문자 구분없음)
        예) 단어가 apple 또는 Apple이라면 a.txt 파일에 해당 단어를 append

        3. 프로그램 종료시 사용된 리소스를 올바르게 정리
        4. 주요 고려사항과 클래스 설계를 README.md에 서술
*/

import Producer.Producer;

public class RunProducerConsumer {
    public static void main(String[] args) {
        System.out.println("start Producer-Consumer Pattern");

        Producer producer = new Producer();

        producer.runProducer();
    }
}
