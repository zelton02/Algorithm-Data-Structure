public class AccountTest {
    Account account1 = new Account(200000.00, 1122, 4.5);
    account1.withdraw(2500.00);
    account1.deposit(3000.00);
    System.out.println("Balance: "+ )
}

<!-- Rectangle -->
public Box extends Rectangle{

    public Box(double init_length, double init_width, double init_depth){
        super(init_length, init_width)
        this.depth = init_depth;
    }

    @Override
    public double area(){
        return (6 * super.length * super.width)
        <!-- return 6 * super.area() -->
    }

    public double volume(){}
}

<!-- Client -->

public class Client{
    Rectangle rectangle = new Rectangle(10, 12);
    Sysout(rectangle.area());
    Box box = new Box(10, 12, 8);
    Sysout(box.area());
    Sysout(box.volume());
}

<!-- PartTimeLecturer -->

public class PartTimeLecturer extends Lecturer{
    private String name;
    private int id;
    private double teachingHour;

    public PartTimeLecturer(){
        super("default name", 0);
        teachingHour = 0;
    }

    public PartTimeLecturer(){
        super()
    }

    public PartTimeLecturer(name, id, teachingHour){
        super(name, id);
        this.teachingHours = teachingHours;

    }
}

<!-- Cars -->

public class Car extends LandVehicle{
    public double weight(){
        return 0.0;
    }
    
}