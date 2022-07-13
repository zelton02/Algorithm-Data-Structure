public class PartTimeLecturer extends Lecturer{

    private double teachingHour;

    public PartTimeLecturer(){
        super();
    };

    

    public PartTimeLecturer(String name, int id, double teachingHour) {
        super(name, id);
        this.teachingHour = teachingHour;
    }



    @Override
    public double salary() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
