package cn.itcast.invoice.auth.dep.dao.dao;

import cn.itcast.invoice.auth.dep.vo.DepModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao  
 *
 */
public interface DepDao extends BaseDao<DepModel> {
}
/*   gf
public void save(DepModel dm); 
public void update(DepModel dm); f
f 
public void delete(DepModel dm);

 public DepModel get(Long uuid);
public List<DepModel> getAll();
 public List<DepModel> getAll(DepQueryModel dqm,Integer pageNum,Integer pageCount);
public Integer getCount(DepQueryModel dqm);
*/
