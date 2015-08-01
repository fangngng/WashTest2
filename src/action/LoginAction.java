package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.LoginDao;
import entity.LoginUserEntity;
import impl.LoginDaoImpl;

/**
 * Created by fa on 2015/4/14.
 */
public class LoginAction extends ActionSupport {
    private String name;
    private String passwd;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String execute() throws Exception {
        LoginDao loginDao = new LoginDaoImpl();
//        LoginUserEntity LoginUserEntity =  loginDao.findByName(name,passwd);
        LoginUserEntity LoginUserEntity =  loginDao.findByName(getName(),getPasswd());
        if(getName().equals(LoginUserEntity.getLoginName())&&getPasswd().equals(LoginUserEntity.getLoginPwd())){
            return "success";
        }else {
            return "error";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
