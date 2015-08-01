package impl;

import dao.UserDao;
import entity.UserInfoEntity;
import entity.UserInfoEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by fangng on 2015/7/9.
 */
public class UserDaoImpl extends SuperDao implements UserDao {

    static Logger logger = Logger.getLogger(LoginDaoImpl.class.toString());
    Connect2Table connect2Table = new Connect2Table();
    Session session1 = connect2Table.getSession();

    @Override
    public UserInfoEntity findUserByPhone(String phone) {
        UserInfoEntity UserInfoEntity = null;
        List<UserInfoEntity> re = new ArrayList<UserInfoEntity>();

        try {
            String hql = "from UserInfoEntity where userPhone =:phone ";
            Query q = session1.createQuery(hql);
            q.setString("phone", phone.toString().trim());
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

    @Override
    public UserInfoEntity findUserById(int id) {
        UserInfoEntity UserInfoEntity = null;
        List<UserInfoEntity> re = new ArrayList<UserInfoEntity>();

        try {
            String hql = "from UserInfoEntity where userId =:id ";
            Query q = session1.createQuery(hql);
            q.setInteger("id", id);
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
