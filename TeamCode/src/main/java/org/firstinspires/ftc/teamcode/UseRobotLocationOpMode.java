package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationPractice robotLocationPractice = new RobotLocationPractice(0);


    @Override
    public void init() {
        robotLocationPractice.setAngle(0);
        robotLocationPractice.setX(0);
    }

    @Override
    public void loop() {
    if (gamepad1.a){
        robotLocationPractice.turnRobot(0.1);
    }
        else if (gamepad1.b) {
            robotLocationPractice.turnRobot(-0.1);
    }
        if (gamepad1.dpad_left) {
            robotLocationPractice.changeX(0.1);
        }
        else if (gamepad1.dpad_right) {
            robotLocationPractice.changeX(-0.1);
        }
        if (gamepad1.dpad_down) {
            robotLocationPractice.changeY(0.1);
        }
        else if (gamepad1.dpad_up) {
            robotLocationPractice.changeY(-0.1);
        }


        telemetry.addData("Heading", robotLocationPractice.getHeading());
        telemetry.addData("Get Angle", robotLocationPractice.getAngle());
        telemetry.addData("X", robotLocationPractice.getX());
        telemetry.addData("Y", robotLocationPractice.getY());
    }
}

/*
1. add a double getAngle to your robotLocationPractice, and display this in your opmode
2. Inside RoboLocationPractice, create double x , void change( double change amount), double get x, then set x
3. inside op mode, when left d pad pressed add 0.1 to x, when right d pad press -0.1 to x then telemetry display x value
4. add in support for y as well dpad up is -0.1 and down is 0.1
 */