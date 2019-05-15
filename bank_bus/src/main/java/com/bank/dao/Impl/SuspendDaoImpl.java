/**
 * 
 */
package com.bank.dao.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.bank.common.PageReturn;
import com.bank.common.Pagehelper;
import com.bank.config.AppConfig;
import com.bank.config.CidAuth;
import com.bank.dao.SuspendDao;
import com.bank.pojo.Suspend;

import vig.core.exception.VIGException;
import vig.library.AbstractObject.AbstractDAO;

/**
 * @author admin
 * 2019年4月26日
 */
public class SuspendDaoImpl extends AbstractDAO implements SuspendDao{

	//挂失表
	public static String tablename = "suspend";

	public SuspendDaoImpl() {
	};

	public SuspendDaoImpl(String cid) {
		try {
			super.setEnv(AppConfig.getApp(), cid, tablename, new Suspend());
			// super.setAbstractConstructorInstance(arg0, arg1);
		} catch (VIGException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Suspend> getList(Suspend pojo) {
		String where = "";
		if (pojo != null ) {
			if (!StringUtils.isBlank(pojo.id)) {
				where = vig.core.util.SQLUtil.andCondition(where, vig.core.util.SQLUtil.composeSQL("id",pojo.id));
			}
		}
		
		try {
			return getObject(CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Boolean insertOne(Suspend pojo) {
		pojo.setCid(CidAuth.cid());
		try {
			return insertObject(pojo);
		} catch (VIGException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Integer updateOne(Suspend pojo) {
		String where = "id = " + pojo.getId();
		try {
			return updateObject(pojo, CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer deleteOne(Suspend pojo) {
		try {
			return deleteObject(CidAuth.whereCid("id = " + pojo.id));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Pagehelper<Suspend> getPagehelper(Suspend pojo, Integer page, Integer size) {
		Pagehelper<Suspend> pagehelper = new Pagehelper<Suspend>();
		String where = "";
		if(pojo != null) {
			if(pojo.id != null) {
				where = vig.core.util.SQLUtil.andCondition(where, vig.core.util.SQLUtil.composeSQL("id", pojo.id));
			}
		}
		
		if(page == null) {
			page = 1;
		}
		if(size == null) {
			size = -1;
		}
		try {
			pagehelper.setList(getObject(null,CidAuth.whereCid(where),null, page , size));
			pagehelper.setTotal(getTotal());
			pagehelper.setPageNum(page);
			pagehelper.setSize(size);
			return (Pagehelper<Suspend>) PageReturn.pageReturn(pagehelper);
		} catch (VIGException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
