public class RecNSqure{
  private int width;
  private int height;

  public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
  }

  public int getArea() {
      return width * height;
  }

  public int getPerimeter() {
      return 2 * (width + height);
  }
}

public class Square extends Rectangle {

  public Square(int side) {
      super(side, side); 
  }
}

Square mySquare = new Square(5);

System.out.println("Area of square: " + mySquare.getArea());
System.out.println("Perimeter of square: " + mySquare.getPerimeter());