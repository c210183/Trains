package jp.ac.ccmc.transportation;

// リニアモーターカー
public class MaglevTrain  extends Train {
    public MaglevTrain(int capacity, int sheets) {
        super(capacity, sheets);
    }

    @Override
    public double run() {
        System.out.println("Magnetic Levitation Engine");
        return 500.0;
    }
}
