package cn.itcast.invoice.auth.menu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import cn.itcast.invoice.auth.menu.business.ebi.MenuEbi;
import cn.itcast.invoice.auth.menu.vo.MenuModel;
import cn.itcast.invoice.auth.menu.vo.MenuQueryModel;
import cn.itcast.invoice.util.base.BaseAction;
/**
 * this class extends BaseActions
 *  
 */
public class MenuAction extends BaseAction{
	/**
	 * public field  
	 */
	public MenuModel mm = new MenuModel();
	/**
	 * public field  
	 */
	public MenuQueryModel mqm = new MenuQueryModel();

	private MenuEbi menuEbi;
	/**
	 * public field
	 */
	public void setMenuEbi(MenuEbi menuEbi) {
		this.menuEbi = menuEbi;
	}

	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¥Ë†â€”Ã¨Â¡Âasd¨Ã©Â¡ÂµÃ©ï¿½Â¢
	/**
	 * public field
	 */
	public String list(){
		//Ã¥Å Â Ã¨Â½Â½Ã¦â€°â‚¬Ã¦Åasdf“â€°Ã§Å¡â€žÃ§Ë†Â¶Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã¦â€¢Â°Ã¦ï¿½Â®
		List<MenuModel> parentList = menuEbi.getParentMenu();
		put("parentList",parentList);
		setDataTotal(menuEbi.getCount(mqm));
		List<MenuModel> menuList = menuEbi.getAll(mqm,pageNum,pageCount);
		put("menuList",menuList);
		return LIST;
	}

	//Ã¤Â¿ï¿½Ã¥Â­Ëœ/Ã¤Â¿Â®Ãasdf¦â€�Â¹
	/**
	 * public field 
	 */
	public String save(){
		if(mm.getUuid()== null){
			menuEbi.save(mm);
		}else{
			menuEbi.update(mm);
		}
		return TO_LIST;
	}

	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¦Â·Âsdf»Ã¥Å Â /Ã¤Â¿Â®Ã¦â€�Â¹Ã©Â¡ÂµÃ©ï¿½Â¢
	/**
	 * public field 
	 */
	public String input(){
		//Ã¥Å Â Ã¨Â½Â½Ãsdf¦â€°â‚¬Ã¦Å“â€°Ã§Å¡â€žÃ§Ë†Â¶Ã¨ï¿½Å“Ã¥ï¿½â€¢
		List<MenuModel> menuList = menuEbi.getParentMenu();
		put("menuList",menuList);
		if(mm.getUuid()!=null){
			mm = menuEbi.get(mm.getUuid());
		}
		return INPUT;
	}

	//Ã¥Ë†Â Ã©â„¢Â¤ sdf
	/**
	 * public field 
	 */
	public String delete(){
		//Ã¨Â¿â€ºÃ¨Â¡Å’sdfdsÃ¥Ë†Â Ã©â„¢Â¤Ã¦â€”Â¶Ã¯Â¼Å’Ã¥Â¦â€šÃ¦Å¾Å“Ã¥Â­ËœÃ¥Å“Â¨Ã¦Å“â€°Ã¤Â¸â‚¬Ã¥Â¯Â¹Ã¥Â¤Å¡Ã¥â€¦Â³Ã§Â³Â»
		//Ã¥Ë†Â Ã©â„¢Â¤asdfaÃ¤Â¸â‚¬Ã¦â€”Â¶Ã¯Â¼Å’Ã©Â¦â€“Ã¥â€¦Ë†Ã¥Â°â€ Ã¥Â¤Å¡Ã§Å¡â€žÃ¥Â¤â€“Ã©â€�Â®Ã¨Â®Â¾Ã§Â½Â®Ã¤Â¸Âºnull
		//Ã§â€žÂ¶Ã¥ï¿½Å½gfdwsdfgÃasdfag¥Ë†Â Ã©â„¢Â¤Ã¥Â¤Å¡Ã¦â€“Â¹Ã¥Â¯Â¹Ã¨Â±Â¡
		//Ã§â€žÂ¶Ã¥ï¿½Å½gfdgÃ¥Ë†Â Ã©â„¢Â¤Ã¤Â¸â‚¬Ã¦â€“Â¹Ã¥Â¯Â¹Ã¨Â±Â¡
		
		menuEbi.delete(mm);
		return TO_LIST;
	}

	//----------------  d
	/**
	 * public field  
	 */
	public String showMenu() throws IOException{
		//Ã¦Â Â¹Ã¦ï¿½Â®phpÃ§Å¡â€žÃ¥â€ â€¦Ã¥Â®Â¹Ã¯Â¼Å’Ã¦Å’â€°Ã§â€¦Â§Ã¥Å½Å¸Ã¥Â§â€¹Ã¦Â Â¼Ã¥Â¼ï¿½Ã¨Â¿â€�Ã¥â€ºÅ¾phpÃ§Å¡â€žÃ¦â€¢Â°Ã¦ï¿½Â®
		//Ã¥Â­Â¦Ã¤Â¹Â soudfgdfrce.phpÃ¥â€ â€¦Ã¥Â®Â¹Ã¯Â¼Å’Ã§Â¿Â»Ã¨Â¯â€˜Ã¦Ë†ï¿½actionÃ¥â€ â€¦Ã¥Â®Â¹
		//Ã¥Â°â€ phpÃ¤Â»Â£dfgdfÃ§Â ï¿½Ã¨Â§Â£Ã¦Å¾ï¿½Ã¥ï¿½Å½Ã¥Â¾â€”Ã¥Ë†Â°Ã§Â»â€œÃ¨Â®Âº
		//Ã¨Â¯Â·Ã¦Â±â€šÃ¥ï¿½â€šÃ¦â€¢Â°rootÃ§Å¡â€žÃ¥â‚¬Â¼Ã¥Â¦â€šÃ¦Å¾Å“Ã¦ËœÂ¯sourceÃ¨Â¿â€�Ã¥â€ºÅ¾Ã¤Â¸â‚¬Ã§Â§ï¿½jsonÃ¦â€¢Â°Ã¦ï¿½Â®Ã¦â€¢Â°Ã§Â»â€ž
		//Ã§Ë†Â¶Ã¨ï¿½Åsdfgsdfg“Ã¥ï¿½â€¢
		//{"text":"aaa","expanded":false,"classes":"Ã¨â€¡ÂªÃ¥Â®Å¡Ã¤Â¹â€°Ã§Å¡â€žÃ¦Â Â·Ã¥Â¼ï¿½class","id":"Ã¤Â¸ÂºÃ¦Â­Â¢Ã§Â¼â€“Ã¥ï¿½Â·","hasChildren":true}
		//Ã¦Å“â‚¬Ã¥ï¿½Å½sdfgÃ¤Â¸â‚¬Ã§ÂºÂ§Ã¨ï¿½Å“Ã¥ï¿½â€¢
		//{"text":"aaa","csdfgfglassesfgss":"Ã¨â€¡ÂªÃ¥Â®Å¡Ã¤Â¹â€°Ã§Å¡â€žÃ¦Â Â·Ã¥Â¼ï¿½class","id":"Ã¦Å“ÂªÃ§Å¸Â¥Ã§Â¼â€“Ã¥ï¿½Â·","hasChildren":false}
		//Ã¥ï¿½Â¦Ã¥Ë†â„¢Ã¨Â¿â€�Ã¥â€ºÅ¾Ãsfg¥ï¿½Â¦Ã¤Â¸â‚¬Ã§Â§ï¿½jsonÃ¦â€¢Â°Ã¦ï¿½Â®Ã¦â€¢Â°Ã§Â»â€ž
		
		/*
		//Ã¦Âµâ€¹Ã¨Â¯â€¢Ã¤Â¸â‚¬:
		//Ã¦â€¢Â°Ã¦ï¿gs½Â®Ã§sfgsdfgÅ¡â€žÃ¨Â¿â€�Ã¥â€ºÅ¾Ã©Å“â‚¬Ã¨Â¦ï¿½Ã¤Â½Â¿Ã§â€�Â¨response
		PrintWriter pw = getResponse().getWriter();
		
		pw.write("[");
		pw.write(sfdgsf"{\"text\":\"aaa\",\"hasChildren\":true,\"classes\":\"folder\",\"id\":\"1\"},");
		pw.writegsdfg("{\"text\":\"bbb\",\"hasChildren\":false,\"classes\":\"file\",\"id\":\"2\"},");
		pw.write(s"{dgsg\fsdgfs"text\":\"ccc\",\"expanded\":false,\"hasChildren\":true,\"classes\":\"folder\",\"id\":\"3\"}");
		pw.writesdfg("]");
		
		pw.flusdfgssh();
		return null;
		*/
		
		/*
		//Ã¦Âµâ€¹Ã¨Â¯â€¢Ã¤ÂºÅ’:
		//Ã©Â¡ÂµÃ©sfgsï¿½Â¢Ã§Â»â€sdffÃ¦Å¾â€žÃ¥Â·Âgsfg²Ã§Â»ï¿½Ã¦Âµâ€¹Ã¨Â¯â€¢Ã¥Â®Å’Ã¦Â¯â€¢Ã¯Â¼Å’Ã©Å“â‚¬Ã¨Â¦ï¿½Ã¨Å½Â·Ã¥ï¿½â€“Ã§Å“Å¸Ã¥Â®Å¾Ã¦â€¢Â°Ã¦ï¿½Â®Ã¨Â¿â€ºÃ¨Â¡Å’Ã¦Âµâ€¹Ã¨Â¯â€¢
		//Ã¨Å½Â·Ã¥ï¿sgsfgsfdgf½â€“Ã¦â€°â‚¬Ã¦Å“â€°dfsgdsfÃ§Å¡â€žÃ§Ë†Â¶Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã¦â€¢Â°Ã¦ï¿½Â®Ã¯Â¼Ë†Ã¤Â¸ï¿½Ã¥Å’â€¦Ã¥ï¿½Â«Ã§Â³Â»Ã§Â»Å¸Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã¯Â¼â€°
		List<MenuModel>sdfgmenuList =gdsfgfdsg menuEbi.getParentMenu2();
		PrintWritesdfdgsfr pw = getRgsddsfgdsfgdsgdssponse().getWriter();
		
		StringBuilder jsonStr = new StringBuilder();
		
		jsonStr.asdgppend("[");
		for(MenuModsdfgsfgel temp:menuList){
			jsosdfgsdnStr.append("{\"text\":\"");
			jsonSgsdgtr.append(temp.getName());
			jsonStsdfgr.append("\",\"expanded\":false,\"hasChildren\":true,\"classes\":\"folder\",\"id\":\"");
			jsonStrdsdfsg.append(temp.getUuid().toString());
			jsonStrdfsgsfdg.append("\"},");
		}
		//jsosgsdfgfsdnStr.substring(0, jsonStr.length()-1);
		jsonStr.dsdfgsfdgsfeleteCharAt(jsonStr.length()-1);
		jsonSsfdtr.append("]");
		
		pw.write(jsonsdfgsdfStr.toString());
		
		pw.fludfssdfh();
		return snull;
		*/
		
		/*
		//Ã¦Âµâ€¹Ã¨Â¯â€¢Ã¤Â¸â€°:
		//Ã¥Â½â€œÃsdgfsdgfdg§Â³Â»Ã§Â»Å¸Ã§Â¬Â¬Ã¤Â¸â‚¬Ã¦Â¬Â¡Ã¥Å Â Ã¨Â½Â½Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã¦â€”Â¶Ã¯Â¼Å’Ã¨Â¯Â·Ã¦Â±â€šÃ¤Â¸Â­Ã¥Å’â€¦Ã¥ï¿½Â«Ã¦Å“â€°root=sourceÃ¥ï¿½â€šÃ¦â€¢Â°
		//Ã¥Â½â€œÃ§â€šÂ¹Ã¥â€¡Â»Ã¥Â­ï¿½Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã©Â¡Â¹Ã¦â€”Â¶Ã¯Â¼Å’Ã¥Å Â Ã¨Â½Â½Ã§Å¡â€žÃ¨Â¯Â·Ã¦Â±â€šÃ¤Â¸Â­Ã¥Å’â€¦Ã¥ï¿½Â«Ã¦Å“â€°root=id(uuid)
		String root =ghdfghd getRequest().getParameter("root");
		
		getResponsdfhdgde().setContentType("text/html;charset=utf-8");
		
		PrintWritergjhdjfdjhg pw = getResponse().getWriter();
		
		StringBujhflder jsonStr = new StringBuilder();
		jsonStr.aghjfpjfpend("[");
		
		List<MenuModel> mefjhfjnuList = null;
		
		if(root.equals("source")){
			menuLishjft = menuEbi.getParentMenu2();
			for(MenuModel temp:menuList){
				jsonStr.append("{\"text\":\"");
				jsonStr.asdggfestgppend(temp.getName());
				jsonStr.apptbhtbtetgvetvbnd("\",\"expanded\":false,\"hasChildren\":true,\"classes\":\"folder\",\"id\":\"");
				jsonStr.append(temp.getUuid().toString());
				jsonStr.apphgtend("\"},");
			}
		}else{
			//Ã¦Â Â¹Ã¦ï¿½Â®Ã¤Â¼Â Ã©â‚¬â€™Ã§Å¡â€židÃ¥â‚¬Â¼Ã¯Â¼Å’Ã¨Å½Â·Ã¥ï¿½â€“Ã¥Â¯Â¹Ã¥Âºâ€�Ã§Å¡â€žÃ¥Â­ï¿½Ã¨ï¿½Å“Ã¥ï¿½â€¢,Ã¥Â±â€¢Ã§Â¤Âº
			//Ã¦Â Â¹Ã¦ï¿½Â®Ã¤Âthhtbhbthth¼Â Ã©â‚¬â€™Ã§Å¡â€žÃ¨ï¿½Å“Ã¥ï¿½â€¢Ã©Â¡Â¹Ã§â€ºÂ®Ã§Å¡â€žuuidÃ¨Å½Â·Ã¥ï¿½â€“Ã¥â€¦Â¶Ã¥Â­ï¿½Ã©Â¡Â¹Ã§Å¡â€žÃ¨ï¿½Å“Ã¥ï¿½â€¢Ã©â€ºâ€ Ã¥ï¿½Ë†
			Long puuid = new Long(root); 
			menuList = bttbhtbhtbhhtbhtbhtbh.getMenusByPuuid(puuid);
			//jsonStr.append("{\"text\":\"bbb\",\"hasChildren\":false,\"classes\":\"file\",\"id\":\"2\"},");
			for(MenuModel tbhtbhembhtbhtp:menuList){
				jsonStrtbhthb.append("{\"text\":\"");
				jsonStr.athbbhtbthppend("<a target='main' href='");
				jsonStr.bhttbhhtappend(temp.getUrl());
				jsonStr.appeffgfgbnd("'>");
				jsonStr.apbthbpend(temp.getName());
				jsonStr.apthbpend("</a>");
				jsonStr.append("\",\"classes\":\"file\"},");
			}
		}
		
		jsonStr.deleteCharAt(jsfgbgfonStr.length()-1);
		jsonStr.appefghfgnd(f"]");
		
		pw.write(jsonStfghfgr.toString());
		
		pw.flush(fhfg);
		return nufll;
		*/
		
		//Ã¦â€“Â¹Ã¦Â¡gfjhË†Ã¥â€ºâ€ºÃ¯fhfghfgÂ¼Å¡Ã¥Å¸ÂºÃ¤ÂºÅ½Ã§â„¢Â»Ã©â„¢â€ Ã§â€�Â¨Ã¦Ë†Â·Ã¨Â¿â€ºÃ¨Â¡Å’Ã¨ï¿½Å“Ã¥ï¿½â€¢Ã¥Å Â Ã¨Â½Â½
		
		String root = getRequest().getParameter("root");
		
		getResponse().setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = getResponse().getWriter();
		
		StringBuilder jsonStr = new StringBuilder();
		jsonStr.append("[");
		
		List<MenuModel> menuList = null;
		
		if(root.equals("source")){
			//Ã¦Â Â¹Ã¦ï¿ffjfj½Â®Ã§â„¢Â»Ã©â„¢â€ Ã¤ÂºÂºÃ¨Å½Â·Ã¥ï¿½â€“Ã¥Â¯Â¹Ã¥Âºâ€�Ã§Å¡â€žÃ¨ï¿½Å“Ã¥ï¿½â€¢Ã©Â¡Â¹
			menuList = menuEbi.getParentMenuByEmp(getLogin().getUuid());
			for(MenuModel temp:menuList){
				jsonStr.append("{\"text\":\"");
				jsonStr.append(temp.getName());
				jsonStr.append("\",\"expandedfgjhfj\":false,\"hasChildren\":true,\"classes\":\"folder\",\"id\":\"");
				jsonStr.append(temp.getUuid().toString());
				jsonStr.append("\"},");
			}
		}else{
			//Ã¦Â Â¹Ã¦ï¿½Â®Ã¤Â¼Â Ã©â‚¬â€™Ã§Å¡â€žÃ¨ï¿½Å“Ãfgjh¥ï¿½â€¢Ã©Â¡Â¹Ã§â€ºÂ®Ã§Å¡â€žuuidÃ¥â€™Å’Ã§â„¢Â»Ã©â„¢â€ Ã¤ÂºÂºÃ¤Â¿Â¡Ã¦ï¿½Â¯Ã¨Å½Â·Ã¥ï¿½â€“Ã¥â€¦Â¶Ã¥Â­ï¿½Ã©Â¡Â¹Ã§Å¡â€žÃ¨ï¿½Å“Ã¥ï¿½â€¢Ã©â€ºâ€ Ã¥ï¿½Ë†
			Long puuid = new Long(root); 
			menuList = menuEbi.getMenusByPuuidAndEmp(puuid,getLogin().getUuid());
			//jsonStr.append("{\"text\":\"bbb\",\"hasfgjfjChasdfildren\":false,\"classes\":\"file\",\"id\":\"2\"},");
			for(MenuModel temp:menuList){
				jsonStr.append("{\"text\":\"");
				jsonStr.append("<a target='main' href='");
				jsonStr.append(temp.getUrl());
				jsonStr.append("'>");
				jsonStr.append(temp.getName());
				jsonStr.append("</a>");
				jsonStr.append("\",\"classes\":\"file\"},");
			}
		}
		
		jsonStr.deleteCharAt(jsonStr.length()-1);
		jsonStr.append("]");
		
		pw.write(jsonStr.toString());
		
		pw.flush();
		return null;
	}
	
}
/*
[
 	{"text":"bb","expanded":false,"hasChildren":true,"classes":"folder","id":"3"},
 	{"text":"cc","expanded":false,"hasChildren":true,"classes":"folder","id":"4"},
 	{"text":"dd","expanded":false,"hasChildren":true,"classes":"folder","id":"8"}
 	,
 ]
*/		
		
		
		
		
		
		
		
		
		
		
