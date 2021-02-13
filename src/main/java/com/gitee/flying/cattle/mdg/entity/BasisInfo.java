/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * @Package: com.gitee.mybatis.fl.entity
 * @author: flying-cattle  
 * @date: 2019年4月9日 下午8:15:25 
 */
package com.gitee.flying.cattle.mdg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 自动生成需要的基本信息</P>
 * @version: v3.0.0
 * @author: flying-cattle
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2019年4月9日      		flying-cattle   v3.0.0           initialize
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasisInfo implements Serializable{
	private static final long serialVersionUID = 123123L;
	//修改1---添加类存放路劲
	private String project;
	
	private String author;
	
	private String version;
	
	private String dbUrl;
	
	private String dbName;
	
	private String dbPassword;
	
	private String database;
	
	private String table;
	
	private String entityName;
	
	private String objectName;
	
	private String entityComment;
	
	private String createTime;
	
	private String agile;
	
	private String entityUrl;
	
	private String daoUrl;
	
	private String mapperUrl;
	
	private String serviceUrl;
	
	private String serviceImplUrl;
	
	private String abstractControllerUrl;
	
	private String controllerUrl;
	
	private String swaggerConfigUrl;

	private String repositoryUrl;

	private String idType;
	
	private String idJdbcType;
	
	private List<PropertyInfo> cis;
	
	private String isSwagger="true";

	private String methodDesc;

	private String methodName;

	private String responseBody;
	
	private Set<String> pkgs = new HashSet<String>();
	//修改2---初始化的时候初始化路径
	public BasisInfo(String project, String author, String version, String dbUrl, String dbName, String dbPassword,
			String database, String createTime, String agile, String entityUrl, String daoUrl, String mapperUrl,
			String serviceUrl, String serviceImplUrl, String controllerUrl,String repositoryUrl,String isSwagger,
					 String methodDesc,String methodName,String responseBody) {
		super();
		this.project = project;
		this.author = author;
		this.version = version;
		this.dbUrl = dbUrl;
		this.dbName = dbName;
		this.dbPassword = dbPassword;
		this.database = database;
		this.createTime = createTime;
		this.agile = agile;
		this.entityUrl = entityUrl;
		this.daoUrl = daoUrl;
		this.mapperUrl = mapperUrl;
		this.serviceUrl = serviceUrl;
		this.serviceImplUrl = serviceImplUrl;
		this.controllerUrl = controllerUrl;
		//修改3---路径赋值
		this.repositoryUrl = repositoryUrl;
		this.abstractControllerUrl = controllerUrl.substring(0, controllerUrl.lastIndexOf("."))+".aid";
		this.swaggerConfigUrl=controllerUrl.substring(0, controllerUrl.lastIndexOf("."))+".config";
		this.isSwagger=isSwagger;
		this.methodDesc = methodDesc;
		this.methodName = methodName;
		this.responseBody = responseBody;
	}

}
