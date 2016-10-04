package hello.form;

import java.util.List;


public class FormBean {

	public FormBean(){}

	/**
	 * 基本的にAjax通信時、この配列に値を格納する
	 */
	private List<String> strList;

	/**
	 * エラー(成功)メッセージの返却値を格納。
	 * [[true,sMsg].[false,eMsg],...]
	 */
	private List<List<String>> rtnList;

	/**
	 * 画面遷移の判断で使用する。	※消去予定
	 */
	private Boolean valid;

	/**
	 * 画面コード
	 */
	private String displayCode;

	//ユーザ基本情報-ここから////////////////////////////////

	/**
	 * 会社コード
	 */
	private String companyCode;

	/**
	 * 社員番号
	 */
	private String employeeNumber;

	/**
	 * 画面から送られた社員名(UserName)
	 */
	private String userName;

	/**
	 * 画面から送られたUserID
	 */
	private String userNumber;

	/**
	 * 画面に返す業務リスト
	 */
	private List<String> workTypeList;

	/**
	 * 場所コード
	 */
	private String placeCode;

	/**
	 * 出勤ステータス
	 */
	private String attendWorkStatus;

	/**
	 * 退勤ステータス
	 */
	private String leaveWorkStatus;


	//ユーザ基本情報-ここまで////////////////////////////////

	/**
	 * エラーが起きた時にメッセージを格納する為のリスト
	 */
	private List<List<String>> messageList;




	//以下 getter 及び setter

	public List<String> getStrList() {
		return strList;
	}
	public void setStrList(List<String> strList) {
		this.strList = strList;
	}
	public Boolean isValid() {
		return valid;
	}
	public void setValid(Boolean boolean1) {
		this.valid = boolean1;
	}
	public List<List<String>> getRtnList() {
		return rtnList;
	}
	public void setRtnList(List<List<String>> rtnList) {
		this.rtnList = rtnList;
	}
	public String getDisplayCode() {
		return displayCode;
	}
	public void setDisplayCode(String displayCode) {
		this.displayCode = displayCode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getWorkTypeList() {
		return workTypeList;
	}
	public void setWorkTypeList(List<String> workTypeList) {
		this.workTypeList = workTypeList;
	}
	public List<List<String>> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<List<String>> messageList) {
		this.messageList = messageList;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getAttendWorkStatus() {
		return attendWorkStatus;
	}
	public void setAttendWorkStatus(String attendWorkStatus) {
		this.attendWorkStatus = attendWorkStatus;
	}
	public String getLeaveWorkStatus() {
		return leaveWorkStatus;
	}
	public void setLeaveWorkStatus(String leaveWorkStatus) {
		this.leaveWorkStatus = leaveWorkStatus;
	}

}

