package jp.co.internous.topaz.model.form;

import java.io.Serializable;

//ユーザーフォーム
public class UserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	private String newPassword;
	private String newPasswordConfirm;
	
	//setter,getter追加
	
	//ユーザー名を取得
	public String getUserName() {
		return userName;
	}
	
	//ユーザー名を設定
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//パスワードを取得
	public String getPassword() {
		return password;
	}
	
	//パスワードを設定
	public void setPassword(String password) {
		this.password = password;
	}
	
	//姓を取得
	public String getFamilyName() {
		return familyName;
	}
	
	//姓を設定
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	//名を取得
	public String getFirstName() {
		return firstName;
	}
	
	//名を設定
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//姓ひらがなを取得
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	//姓ひらがなを設定
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	//名ひらがなを取得
	public String getFirstNameKana() {
		return firstNameKana;
	}
	
	//名ひらがなを設定
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	//性別を取得
	public byte getGender() {
		return gender;
	}
	
	//性別を設定
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	//新パスワードを取得する
	public String getNewPassword() {
		return newPassword;
	}
	
	//新パスワードを設定する
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	//新パスワード（確認）を取得する
	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}
	
	//新パスワード（確認）を設定する
	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
	}

}
