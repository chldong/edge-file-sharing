/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌边缘云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dms.model.dto;

import com.honvay.hdms.dms.activity.model.AuthorizeActivityDto;
import com.honvay.hdms.dms.activity.model.DescActivityDto;
import com.honvay.hdms.dms.activity.model.TagsActivityDto;
import lombok.Data;

import java.util.Date;

/**
 * @author LIQIU
 * created on 2019/3/9
 **/
@Data
public class DocumentActivityDto {

	private Integer id;

	private String operation;

	private Date operateDate;

	private String content;

	private DocumentOperatorDto operator;

	/**
	 * 入方
	 */
	private DirectoryMountDto income;

	/**
	 * 出方
	 */
	private DirectoryMountDto outcome;

	/**
	 * 变更
	 */
	private DocumentChangeDto change;

	/**
	 * 文件快照
	 */
	private DocumentSnapshotDto document;

	/**
	 * 当前文档
	 */
	private DocumentSnapshotDto directory;

	private AuthorizeActivityDto authorize;

	private DescActivityDto description;

	private TagsActivityDto tags;

}
