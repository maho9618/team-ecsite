package jp.co.internous.topaz.model.domain;

import java.sql.Timestamp;

import jp.co.internous.topaz.model.form.UserForm;

//mst_userのドメイン
public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	//コンストラクタ
	public MstUser() {}
	
	//コンストラクタ
	//@param f ユーザーフォーム
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		familyNameKana = f.getFamilyNameKana();
		firstNameKana = f.getFirstNameKana();
		gender = f.getGender();
	}
	
	//setter,getter追加
	
	//idを取得する
	public int getId() {
		return id;
	}
	
	//idを設定する
	public void setId(int id) {
		this.id = id;
	}
	
	//ユーザー名を取得する
	public String getUserName() {
		return userName;
	}
	
	//ユーザー名を設定する
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//パスワードを取得する
	public String getPassword() {
		return password;
	}
	
	//パスワードを設定する
	public void setPassword(String password) {
		this.password = password;
	}
	
	//姓を取得する
	public String getFamilyName() {
		return familyName;
	}
	
	//姓を設定する
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	//名を取得する
	public String getFirstName() {
		return firstName;
	}
	
	//名を設定する
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//姓ひらがなを取得する
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	//姓ひらがなを設定する
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	//名ひらがなを取得する
	public String getFirstNameKana() {
		return firstNameKana;
	}
	
	//名ひらがなを設定する
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	//性別を取得する
	public byte getGender() {
		return gender;
	}
	
	//性別を設定する
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	//登録日時を取得する
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	//登録日時を設定する
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	//更新日時を取得する
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	//更新日時を設定する
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
