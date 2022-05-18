/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌边缘云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dms.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * @author LIQIU
 * created on 2019/3/1
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class MkdirRequest extends MountBaseRequest {

	@NotEmpty(message = "文件夹名称不能为空")
	private String name;

	private Integer parent;

}
