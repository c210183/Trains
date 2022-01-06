package jp.ac.ccmc.transportation;

import jp.ac.ccmc.transportation.components.Pantograph;

// 電車
public class ElectricTrain extends Train {
    Pantograph pantograph;  // パンタグラフ

    public ElectricTrain(int capacity, int sheets) {
        super(capacity, sheets);
        this.pantograph = new Pantograph();
    }

    @Override
    public double run() {
        System.out.println("Electric Engine");
        return 70.0;
    }
}
