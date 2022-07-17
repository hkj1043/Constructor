class Car {
    String color;
    String gearType;
    int door;
    Car(){      //코드 중복 제거
        this("white","auto",4); //this()를 통해 같은 클래스의 매개변수를 3개 받을 수 있는 다른 생성자 호출
    }
    Car(String color,String gearType, int door){//생성자 호출 시 매개변수 값 지정
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class be40_6 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("black","manual",4);

        System.out.println("car의 기본 속성");
        System.out.println("색상: "+car.color+"\n"+"기어타입: "+car.gearType+"\n"+"문개수: "+car.door);
        System.out.println("----------------------------------------------------");
        System.out.println("car2의 사용자지정 속성");
        System.out.println("색상: "+car2.color+"\n"+"기어타입: "+car2.gearType+"\n"+"문개수: "+car2.door);
    }
}

