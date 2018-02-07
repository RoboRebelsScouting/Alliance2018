package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jelmhurst on 3/20/2017.
 */
public class RobotData {
    public int robotNumber;

    public List<Integer> matchList;

    public int matches;

    public DataGroup totalSwitch;
    public DataGroup totalScale;

    public DataGroup teleSwitch;
    public DataGroup autoSwitch;

    public DataGroup autoCross;

    public DataGroup teleScale;
    public DataGroup autoScale;

    public DataGroup climb;

    public DataGroup vault;

    public double accuracy;
    public int accuracyRank;
    public int approaches;

    public RobotData() {
        robotNumber = 0;
        matches = 0;
        totalSwitch = new DataGroup();
        totalScale = new DataGroup();
        teleSwitch = new DataGroup();
        autoSwitch = new DataGroup();
        autoCross = new DataGroup();
        autoScale = new DataGroup();
        teleScale = new DataGroup();
        vault = new DataGroup();
        climb = new DataGroup();

        accuracy = 0;
        accuracyRank = 0;

        matchList = new ArrayList<Integer>();
    }
}
