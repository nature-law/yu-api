package com.xia.yuapi.service;

/**
 * description 获取一个Id
 *
 * @author Andy
 * @version 1.0
 * @date 11/13/2021 17:34
 */
public interface IdService {
	/**
	 * 获取一个id
	 *
	 * @return long id
	 */
	long getId();

	/**
	 * 获取固定个数的 id
	 *
	 * @param num id的个数
	 * @return long[] 多个id
	 */
	long[] getIds(int num);
}
