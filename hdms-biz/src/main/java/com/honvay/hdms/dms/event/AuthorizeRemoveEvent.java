/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌边缘云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dms.event;

import com.honvay.hdms.dms.document.entity.Document;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.ApplicationEvent;

/**
 * @author LIQIU
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AuthorizeRemoveEvent extends ApplicationEvent {

	private final Integer owner;
	private final Integer ownerType;
	private final String ownerName;
	private String permissionName;
	private Integer userId;
	private final Document document;

	public AuthorizeRemoveEvent(Document document, Integer owner, Integer ownerType, String ownerName, String permissionName, Integer userId) {
		super(document);
		this.document = document;
		this.owner = owner;
		this.ownerType = ownerType;
		this.ownerName = ownerName;
		this.permissionName = permissionName;
		this.userId = userId;
	}

}
