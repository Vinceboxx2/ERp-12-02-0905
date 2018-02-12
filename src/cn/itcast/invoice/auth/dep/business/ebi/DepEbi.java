package cn.itcast.invoice.auth.dep.business.ebi;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.auth.dep.vo.DepModel;
import cn.itcast.invoice.util.base.BaseEbi;

/**
 * this is an interface based on DepEbi
 *
 */
@Transactional
public interface DepEbi extends BaseEbi<DepModel> {
}


/*
public void save(DepModel dm);
   
public void update(DepModel dm);
 
public void delete(DepModel dm);
 
public DepModel get(Long uuid);
 
public List<DepModel> getAll();

/** 
 * Ã¥Ë†â€ Ã©Â¡ÂµÃ¨Å½Â·Ã¥ï¿½â€“Ã¦â€¢Â°Ã¦ï¿½Â®
 * @param dqm Ã¦Å¸Â¥Ã¨Â¯Â¢Ã¦ï¿½Â¡Ã¤Â»Â¶
 * @param pageNum Ã©Â¡ÂµÃ§Â ï¿½Ã¥â‚¬Â¼
 * @param pageCount Ã¦Â¯ï¿½Ã©Â¡ÂµÃ¦ËœÂ¾Ã§Â¤ÂºÃ¦â€¢Â°
 * @return
 */ 
/*	public List<DepModel> getAll(DepQueryModel dqm, Integer pageNum,Integer pageCount);
      
public Integer getCount(DepQueryModel dqm); 
*/
