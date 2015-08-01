package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;
import entity.LoginUserEntity;
import entity.UserInfoEntity;
import impl.UserDaoImpl;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpSession;

/**
 * Created by fa on 2015/4/12.
 */
public class MainAction extends ActionSupport {
    private String addr;
    private String tel;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String execute() throws Exception {
        if(addr!=null ) {
            if(tel.length()==11 || tel.length()==7 || tel.length()==8){
                UserDao UserDao = new UserDaoImpl();
                UserInfoEntity user = UserDao.findUserByPhone(tel.toString().trim());
                if(user != null) {
                    HttpSession session = ServletActionContext.getRequest().getSession();
                    session.setAttribute("username",user.getUserName());
                    session.setAttribute("userID",user.getUserId());
                    session.setAttribute("userAddr",user.getUserAddr());
                    session.setAttribute("userTel",user.getUserPhone());
                    return "success";
                }
                else{

                }
                //判断用户联系方式是否存在
                //判断用户是否存在，存在，调用用户信息；不存在，注册新用户；
                //开始订单
                //进入个人中心-未处理订单管理
                return "success";
            }
            return "error";
        }else {
            return "error";
        }
    }
}
