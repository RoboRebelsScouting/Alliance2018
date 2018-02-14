package sample;

/**
 * Created by jelmhurst on 3/20/2017.
 */
public class AllianceData {
    int robot1;
    int robot2;
    int robot3;

    // these numbers are combined averages for the alliance
    double avgAutoScale;
    double avgAutoSwitch;
    double avgTeleScale;
    double avgTeleSwitch;
    double avgVault;
    double avgClimbs;

    // strength of alliance
    double allianceStrength;

    // given the 5 factors, calculate a strength number
    public void calcStrength() {
        double strength = 0.0;

        strength += (int) (avgAutoScale) * 2;
        strength += avgTeleScale;
        strength += (int) (avgAutoSwitch) * 2;
        strength += avgTeleSwitch;
        int vaultPoints = (int)(avgVault) * 5;
        strength += vaultPoints;
        int climbPoints = (int)(avgClimbs) * 30;
        strength += climbPoints;

        allianceStrength = strength;
    }

}
