package member.model.vo;

public class Vip extends Member{
    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateinterest() {
        return this.getPoint() * 0.1;
    }

    public int buy() {
        return 100;
    }
}

