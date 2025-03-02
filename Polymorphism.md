![image](https://github.com/user-attachments/assets/af1cd032-d80f-49fc-9475-99702f731cd5)

![image](https://github.com/user-attachments/assets/429a1c72-e715-4953-b289-8f5036c49fd0)

![image](https://github.com/user-attachments/assets/8b353655-f1a6-41e0-8d9f-9d087774fd33) ![image](https://github.com/user-attachments/assets/0d45934f-9870-41cf-800f-fda6562659da)

![image](https://github.com/user-attachments/assets/e6cec016-0dc4-4e48-be15-4a0f0782f417)
```
class Shape {
 void draw()
 {
 System.out.println("Drawing Shape");
 }
}
class Circle extends Shape{
 @Override
 void draw() {
 System.out.println("Drawing circle");
 }
}
class Rectangle extends Shape{
 @Override
 void draw() {
 System.out.println("Drawing Rectangle");
 }
}
public class Test2{
 public static void main(String[] args) {
 Shape shape=new Shape();
 shape.draw();
 Circle circle=new Circle();
 circle.draw();;
 Rectangle rectangle=new Rectangle();
 rectangle.draw();
 Shape shape1=new Circle();
 Shape shape2=new Rectangle();
 shape1.draw();
 shape2.draw();
 //Circle circle1=new Shape();
 }
}
```
![image](https://github.com/user-attachments/assets/6e1010e1-c8d2-445f-8ccc-db5f223c210b)
```
public class OverloadingDemo {
 public int add(int a,int b)
 {
 return a+b;
 }
 public int add(int a,int b,int c)
 {
 return a+b+c;
```
