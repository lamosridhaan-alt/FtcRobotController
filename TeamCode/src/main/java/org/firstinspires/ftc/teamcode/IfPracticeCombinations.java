package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPracticeCombinations extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "In dead zone");
        }
        if (gamepad1.a) {
            motorSpeed = motorSpeed * 0.5;
        }
        telemetry.addData("Left Stick value", leftY);
    }
}

/*
make a turbo button where the motor speed multiplies my 0.5 is a button not pressed and otherwise use standard speed
 */

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