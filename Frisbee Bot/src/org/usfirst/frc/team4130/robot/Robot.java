package org.usfirst.frc.team4130.robot;

import com.ctre.phoenix.MotorControl.CAN.TalonSRX;
import com.ctre.phoenix.MotorControl.ControlMode;
import com.ctre.phoenix.MotorControl.ControlMode.SmartControlMode;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team4130.robot.RobotMap;

public class Robot extends IterativeRobot {
	
	@Override
	public void robotInit() {
		RobotMap.init();
	}


	@Override
	public void autonomousInit() {
	
	}

	@Override
	public void autonomousPeriodic() {

	}
	@Override
	public void teleopInit() {
		
		RobotMap.Shooter1.setControlMode(SmartControlMode.kPercentVbus);
		RobotMap.Shooter2.setControlMode(SmartControlMode.kPercentVbus);
		
	}

	
	@Override
	public void teleopPeriodic() {
		
		RobotMap.Shooter1.set(RobotMap.gpad.getRawButton(1) ? 1 : 0);
		RobotMap.Shooter2.set(RobotMap.gpad.getRawButton(1) ? 1 : 0);
		double  LeftYaxis = RobotMap.gpad.getRawAxis(1) ;
		RobotMap.leftDrive1.set(LeftYaxis);
		double rightYaxis = RobotMap.gpad.getRawAxis(5) ;
		RobotMap.rightDrive1.set(rightYaxis);
	}

	
	@Override
	public void testPeriodic() {
	}
}

