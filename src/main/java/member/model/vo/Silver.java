package member.model.vo;

public class Silver extends Member{
    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateinterest() {
        return this.getPoint() * 0.02;
    }

    public int buy() {
        return 100;
    }
}