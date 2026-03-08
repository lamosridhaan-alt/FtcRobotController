package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 27136;
        double motorSpeed = 0.75;
        boolean clawClosed= true;
        String teamname = "Shark Bots";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", teamname);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {
    /*
    1.change the string variable :name" to your team name
    2.create a int variable called motor angle and store a angle between 0-180. display in your init method
     */
    }
}
