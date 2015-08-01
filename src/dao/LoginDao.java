package dao;

import entity.LoginUserEntity;

/**
 * Created by fa on 2015/4/9.
 */
public interface LoginDao {
    public LoginUserEntity findById(Object id);

    public LoginUserEntity findByName(Object name,Object pwd);

}
