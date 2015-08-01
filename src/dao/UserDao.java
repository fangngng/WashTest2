package dao;

import entity.UserInfoEntity;

/**
 * Created by fangng on 2015/7/9.
 */
public interface UserDao {

    public UserInfoEntity findUserById(int id);

    public UserInfoEntity findUserByPhone(String phone);

}
