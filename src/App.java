import jp.ac.ccmc.transportation.BulletTrain;
import jp.ac.ccmc.transportation.ElectricTrain;
import jp.ac.ccmc.transportation.MaglevTrain;
import jp.ac.ccmc.transportation.SteamTrain;
import jp.ac.ccmc.transportation.Train;

public class App {
    public static void main(String[] args) throws Exception {
        Train train = null;

        int rand = (int)(Math.random() * 4);
        System.out.println("rand:" + rand);

        switch(rand) {
            case 0:
                train = new SteamTrain(50, 20);
                break;
            
            case 1:
                train = new ElectricTrain(160, 80);
                break;

            case 2:
                train = new BulletTrain(100, 50);
                break;

            case 3:
                train = new MaglevTrain(100, 50);
                break;
        }

        double speed = train.run();
        System.out.println(train);
        System.out.println("Speed:" + speed);
    }
}
