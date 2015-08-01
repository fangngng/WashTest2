package impl;

import dao.LoginDao;
import entity.LoginUserEntity;
import org.hibernate.Query;
import org.hibernate.Session;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by fa on 2015/4/9.
 */
public class LoginDaoImpl extends SuperDao implements LoginDao {
    static Logger logger = Logger.getLogger(LoginDaoImpl.class.toString());
    Connect2Table connect2Table = new Connect2Table();
    Session session1 = connect2Table.getSession();

    /**
     * 根据ID返回用户，无则返回null
     * @param id
     * @return
     */
    @Override
    public LoginUserEntity findById(Object id) {

        LoginUserEntity LoginUserEntity = null;
        try {
//            Session session = sessionFactory.openSession();

            LoginUserEntity = (LoginUserEntity) session1.load(LoginUserEntity.class, (Serializable) id);
            logger.info("id:" + id);

        } catch (Exception e) {
            logger.info(e.toString());
        }
        return LoginUserEntity;
    }

    /**
     * 根据用户名和密码获取用户，无则返回null
     * @param name
     * @param pwd
     * @return
     */
    @Override
    public LoginUserEntity findByName(Object name, Object pwd) {
        LoginUserEntity LoginUserEntity = null;
        List<LoginUserEntity> re = new ArrayList<LoginUserEntity>();

        try {

            String hql = "from LoginUserEntity where loginName =:name and loginPwd =:pwd  ";
            Query q = session1.createQuery(hql);
            q.setString("name", name.toString().trim());
            q.setString("pwd", pwd.toString().trim());
            re = q.list();

        } catch (Exception e) {
            logger.info(e.toString());
        }
        if (!re.isEmpty()) {
            return re.get(0);
        } else {
            return null;
        }
    }

}
