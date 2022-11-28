package jp.co.internous.topaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.topaz.model.domain.MstUser;
import jp.co.internous.topaz.model.form.UserForm;
import jp.co.internous.topaz.model.mapper.MstUserMapper;
import jp.co.internous.topaz.model.session.LoginSession;

//ユーザー登録処理を行うコントローラー
@Controller

//URLでアクセスできるように設定
@RequestMapping("/topaz/user")
public class UserController {
	
	//Mapperをインスタンス化
	@Autowired
	private MstUserMapper mstUserMapper;
	
	//loginSessionをインスタンス化
	@Autowired
	private LoginSession loginSession;
	
	//トップページに遷移
	@RequestMapping("/")
	public String index(Model m) {
		
		//渡したいデータをモデルオブジェクトに追加
		m.addAttribute("loginSession", loginSession);
		
		return "register_user";
	}
	
	//ユーザー名重複チェックを行う
	@RequestMapping("/duplicatedUserName")
	@ResponseBody
	public boolean duplicatedUserName(@RequestBody UserForm form ) {
		
		//ユーザー名でユーザーを検索する
		int count = mstUserMapper.findCountByUserName(form.getUserName());
		
		//検索結果が存在していた場合のみ処理
		return count > 0;
	}

	//ユーザー情報登録を行う
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		
		//MstUserをインスタンス化
		MstUser user = new MstUser(f);
		
		//MstUserに渡した値をDBにインサート
		int count = mstUserMapper.insert(user);
		
		return count > 0;
	}
	
}
