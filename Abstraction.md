![image](https://github.com/user-attachments/assets/8746494a-a588-4513-aebe-249ec7562edf)
# Abstract class cannot create object like below
![image](https://github.com/user-attachments/assets/940f80b2-7bab-44e4-aa5a-e84567733d1b)
# Non Abstract class can create object like below
![image](https://github.com/user-attachments/assets/c2edb15d-fbd9-4408-aad8-8aaaf1c735a8)
![image](https://github.com/user-attachments/assets/2ba1625a-886a-4a69-afe1-19823842b6d2)
# Exmaple-1
```
abstract class CarFactory{
    /////Necessary Property
    void tyre(){
        System.out.println("4 Tyre");
    }
    /////Necessary Property
    void engine(){
        System.out.println("1 Enginee");
    }
    /////Asbtract method which there is no implementation
     abstract void airbags();
}
class WagonCar extends CarFactory{
void airbags(){
    System.out.println("No Airbags");
}
}
class AltoCar extends CarFactory{
    void airbags(){
    System.out.println("No Airbags");
    }
}
class AudiCar extends CarFactory{
    void airbags(){
    System.out.println("4 Airbags");
    }
}
class BMWCar extends CarFactory{
    void airbags(){
    System.out.println("6 Airbags"); 
    }
}
class RollsRoyceCar extends CarFactory{
    void airbags(){
    System.out.println("8 Airbags");    
    }
}
public class  Abstract1{
    public static void main(String[] args){
    AltoCar al=new AltoCar();
    al.tyre();
    al.engine();
    al.airbags();
    System.out.println();
    AudiCar ad=new AudiCar();
    ad.tyre();
    ad.engine();
    ad.airbags();
    System.out.println();
    WagonCar wg=new WagonCar();
    wg.tyre();
    wg.engine();
    wg.airbags();
    System.out.println();
    BMWCar bmw=new BMWCar();
    bmw.tyre();
    bmw.engine();
    bmw.airbags();
    System.out.println();
    RollsRoyceCar rlrc=new RollsRoyceCar();
    rlrc.tyre();
    rlrc.engine();
    rlrc.airbags();
}
}
```
# Output:
```
4 Tyre
1 Enginee
No Airbags

4 Tyre
1 Enginee
4 Airbags

4 Tyre
1 Enginee
No Airbags

4 Tyre
1 Enginee
6 Airbags

4 Tyre
1 Enginee
8 Airbags
```
# Exmaple-2
```
abstract class Parent{
    void gold(){
        System.out.println("1 Kg Gold");
    }
    abstract void land();
}
class Child1 extends Parent{
    //////gold land
    void land(){
        System.out.println("Open Restaurant");
    }
}
class Child2 extends Parent{
    //////gold land
    void land(){
        System.out.println("Gym Restaurant");
    }
}
class Child3 extends Parent{
    //////gold land
    void land(){
        System.out.println("Hostel Restaurant");
    }
}
public class Abstract2{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.gold();
        c1.land();
        System.out.println();
        Child2 c2 = new Child2();
        c2.gold();
        c2.land();
        System.out.println();
        Child3 c3 = new Child3();
        c3.gold();
        c3.land();
        System.out.println();
    }
}
```
# Output:
```
1 Kg Gold
Open Restaurant

1 Kg Gold
Gym Restaurant

1 Kg Gold
Hostel Restaurant
```
![image](https://github.com/user-attachments/assets/4d4813f6-f80c-4168-9ddc-8349fb0cf154)
