package impl;

import dao.GoodsInfoDao;
import entity.GoodsInfoEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by fangngng on 2016/1/21.
 */
public class GoodsInfoImpl extends SuperDao implements GoodsInfoDao {
    static Logger logger = Logger.getLogger(LoginDaoImpl.class.toString());
    Connect2Table connect2Table = new Connect2Table();
    Session session1 = connect2Table.getSession();

    @Override
    public List<GoodsInfoEntity> getAllGoods() {
        GoodsInfoEntity goodsInfoEntity = null;
        List<GoodsInfoEntity> re = new ArrayList<>();

        try{
            String hql = " from GoodsInfoEntity ";
            Query q = session1.createQuery(hql);
            re = q.list();
        }catch (Exception e){
            logger.info(e.toString());
        }
        if(!re.isEmpty()){
            return re;
        }else{
            return null;
        }
    }
}
