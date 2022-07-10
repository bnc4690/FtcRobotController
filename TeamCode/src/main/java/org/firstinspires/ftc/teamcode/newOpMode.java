package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp
public class newOpMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {


        RevTouchSensor touch_sensor = hardwareMap.get(RevTouchSensor.class, "touch_sensor");
        int number = 0;
        telemetry.addData("number", number);
        telemetry.update();

        waitForStart();

        while(opModeIsActive()){
            if (touch_sensor.isPressed()){
                telemetry.addData("Sensor", "Pressed");
            }else{
                telemetry.addData("Sensor", "Not Pressed"); 
            }
            telemetry.update();
        }

    }
}
