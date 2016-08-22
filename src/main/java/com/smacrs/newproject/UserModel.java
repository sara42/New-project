package com.smacrs.newproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {

	private String UserEmail;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;

	private String UserName;
	private String UserAdress;
	private int UserAge;
	private int UserSalary;

	public UserModel() {
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserAdress() {
		return UserAdress;
	}

	public void setUserAdress(String userAdress) {
		UserAdress = userAdress;
	}

	public int getUserAge() {
		return UserAge;
	}

	public void setUserAge(int userAge) {
		UserAge = userAge;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getUserSalary() {
		return UserSalary;
	}

	public void setUserSalary(int userSalary) {
		UserSalary = userSalary;
	}

	@Override
	public String toString() {
		return "UserModel [UserEmail=" + UserEmail + ", UserID=" + UserID + ", UserName=" + UserName + ", UserAdress="
				+ UserAdress + ", UserAge=" + UserAge + ", UserSalary=" + UserSalary + "]";
	}

}
