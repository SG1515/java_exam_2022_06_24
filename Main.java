package org.example;

import java.io.IOException;


// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

class Main {
    public static void main(String[] args) {

        // 구현시작
        Car car1 = new Car();
        Car car2 = new Car();
        // 구현끝

        car1.MaxSpeed = 230;   //3. car1의 최고 속력을 setting
        car2.MaxSpeed = 210;

        car1.달리다(); // 1. 원본 클래스에 달리다()함수 만들어주자
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        car2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class Car {
    // 구현
    int MaxSpeed;
    void 달리다(){ // 2. 달리다함수
        System.out.println("자동차가 최고속력 " + MaxSpeed + "달립니다.");
    }
}