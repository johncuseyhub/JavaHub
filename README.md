
# Java Hub              

<img src="https://github.com/johncuseyhub/GettingStarted/blob/main/HubBanner.png" alt="John Cusey Hub Logo" height="150" width="1000">

<img 
src="https://github.com/johncuseyhub/GettingStarted/blob/main/LogoOrganizations/Java.PNG" 
alt="Java 9" 
height="100px"/> 

# Cheat Sheet
### Abstract Methods and Classes
An abstract method can declared implementation or not. An abstract class cannot be instantiated.   

```Java
public abstract class Shape {

    public Shape() {}

    private String color;
   
   abstract public double area();

       public boolean isBlue(){
        return this.color.toUpperCase() == "BLUE";
    }

}
```
Square class extends the Shape class.

```Java
public class Square extends Shape {

     private double width = 0;
    private double length = 0;

    @Override
    public double area() {
        return this.width * this.length;
    }
}
```

# Collection Iterator

### Getting the iterator

```Java
Iterator<String> itr = bandMembers.iterator(); 
```
### Iterate the collection

```Java
while(itr.hasNext()){  
     System.out.println(itr.next());  
 }
```
### Remove element from collection 
```Java
itr.remove();
```

# Enumerations    

```Java
public enum CarSize{
  SMALL(1), MEDIUM(2), LARGE(3), EXTRALARGE(4);
    
  private int size;

  CarSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  } 
}
```
