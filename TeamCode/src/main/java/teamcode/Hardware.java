package teamcode;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Hardware  {

    public CRServo CRServo1;                  //  Hub port 0     CRServo1
    public Rev2mDistanceSensor DSensor1;           //  I2C port 0     DSensor
    public DigitalChannel digitalTouch;
    HardwareMap hwMap;

    private ElapsedTime period  = new ElapsedTime();

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        digitalTouch = hwMap.get(DigitalChannel.class, "Touch"); //port 1 LMAO
        CRServo1         = hwMap.get(CRServo.class, "CRServo1");
        DSensor1        = hwMap.get(Rev2mDistanceSensor.class, "DSensor");
    }


}




