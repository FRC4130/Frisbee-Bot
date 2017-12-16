package org.usfirst.frc.team4130.robot;

import com.ctre.phoenix.MotorControl.CAN.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;

public class RobotMap{
		
		public static TalonSRX  Shooter1 = new TalonSRX(1);
		public static TalonSRX Shooter2 = new TalonSRX(2);
		
		public static Joystick gpad = new Joystick(0);	
		
	}