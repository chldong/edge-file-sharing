/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌边缘云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.framework.support.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author LIQIU
 * created on 2019/2/23
 **/
public interface BaseService<T, PK extends Serializable> {

	List<T> list();

	/**
	 * 保存实体对象，并触发事件
	 *
	 * @param entity
	 * @return
	 */
	T save(T entity);

	/**
	 * 更新实体对象，并触发事件
	 *
	 * @param entity
	 * @return
	 */
	T update(T entity);

	/**
	 * 通过主键获取对象
	 *
	 * @param id
	 * @return
	 */
	T get(PK id);

	/**
	 * 根据主键删除对象
	 *
	 * @param pk
	 */
	void delete(PK pk);

}
