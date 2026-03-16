package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPracticeWithDouble extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double leftY = gamepad1.left_stick_y;

        if (leftY < 0) {
            telemetry.addData("Left Stick", "is Negative");
        }
        else if (leftY > 0.5) {
            telemetry.addData("Left Stick", "Greater than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "Is greater than 0");
        }
        else {
            telemetry.addData("Left Stick", "is Zero!");
        }

        telemetry.addData("Left Stick value", leftY);
    }
}

/*
AND - &&
OR  - ||
NOT - !

if (leftY < 0 && leftY > 0.5) {

if (leftY < 0 || rightY < 0) {

if (!(leftY < 0.1)) {

boolean clawClosed

if (!clawClosed) {
 */