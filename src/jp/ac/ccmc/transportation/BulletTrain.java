package jp.ac.ccmc.transportation;

// 新幹線
public class BulletTrain extends ElectricTrain {
    public BulletTrain(int capacity, int sheets) {
        super(capacity, sheets);
    }

    @Override
    public double run() {
        System.out.println("Electric Engine");
        return 200.0;
    }
}
