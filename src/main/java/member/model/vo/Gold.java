package member.model.vo;

public class Gold extends Member{

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateinterest() {
        return getPoint() * 0.05;
    }

    public int buy() {
        return 10;
    }
}
