/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌边缘云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dashboard.report.model;

import lombok.Data;

/**
 * @author LIQIU
 * created on 2019/3/15
 **/
@Data
public class Space {

	private String name;

	private Long total;

	private Long used;

}
