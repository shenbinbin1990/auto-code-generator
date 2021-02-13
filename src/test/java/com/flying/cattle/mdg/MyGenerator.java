/**
 * @filename: MyGenerator.java 2019-10-16
 * @project v0.0.1  V1.0
 * Copyright(c) 2018 BianPeng Co. Ltd.
 * All right reserved.
 */
package com.flying.cattle.mdg;

import com.gitee.flying.cattle.mdg.entity.BasisInfo;
import com.gitee.flying.cattle.mdg.util.EntityInfoUtil;
import com.gitee.flying.cattle.mdg.util.Generator;
import com.gitee.flying.cattle.mdg.util.MySqlToJavaUtil;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright: Copyright (c) 2019 
 *
 * <p>说明： 自动生成工具</P>
 * <p>源码地址：https://gitee.com/flying-cattle/mybatis-dsc-generator</P>
 * shenbinbin   增加新的类的时候只需要查询  修改 1-8 进行相应的调整即可
 * 所有的变量都存储在 basisInfo里面 要加变量就要改basisInfo  需要进行的修改---//修改1/2/3/8/9
 */
public class MyGenerator {
    // 基础信息：项目名、作者、版本
    public static final String PROJECT = "social-supervision";
    public static final String AUTHOR = "shenbinbin";

    //----------------生成代码以下需要调整-------------------------------------------------
    public static final String VERSION = "V1.2.3";


    // 数据库连接信息：连接URL、用户名、秘密、数据库名
		public static final String URL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&allowMultiQueries=true";
		public static final String NAME = "root";
		public static final String PASS = "root";
		public static final String DATABASE = "test";


    // 类信息：类名、对象名（一般是【类名】的首字母小写）、类说明、时间
    public static final String CLASSNAME = "Category";
    public static final String TABLE = "category";
    public static final String CLASSCOMMENT = "商品类别";



    //如果controller需要生成新代码需要对以下进行修改
    //方法说明
    public static final String METHOD_DESC = "商品类型";
    //方法英文名
    public static final String METHOD_NAME = "Category";
    //返回数据体
    public static final String RESPONSE_BODY = "Category";
    //----------------生成代码以上需要调整------------------------------------------------


    public static String TIME;
    public static final String AGILE = new Date().getTime() + "";
    // 路径信息，分开路径方便聚合工程项目，微服务项目
    public static final String ENTITY_URL = "com.example.entity";
    public static final String DAO_URL = "com.example.mapper";
    public static final String XML_URL = "com.example.mapper.xml";
    public static final String SERVICE_URL = "com.example.service";
    public static final String SERVICE_IMPL_URL = "com.example.service.impl";
    public static final String CONTROLLER_URL = "com.example.controller";
    //修改8---定义变量 定义类的包路径
    public static final String REPOSITORY_URL = "com.example.repository";
    //是否是Swagger配置
    public static final String IS_SWAGGER = "true";

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm");
        TIME = dateFormat.format(new Date());
        //创建基础数据的数据对象
        //修改9----把包路径初始化
        BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, TIME, AGILE, ENTITY_URL,
                DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL, REPOSITORY_URL, IS_SWAGGER, METHOD_DESC, METHOD_NAME, RESPONSE_BODY);
        bi.setTable(TABLE);
        bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
        bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
        bi.setEntityComment(CLASSCOMMENT);
        try {
            bi = EntityInfoUtil.getInfo(bi);
            String fileUrl = "E:\\";// 生成文件存放位置
            //开始生成文件---可配置
            String aa1 = Generator.createEntity(fileUrl, bi).toString();
            System.out.println(aa1);

            String aa2 = Generator.createMapper(fileUrl, bi).toString();
            System.out.println(aa2);

            String aa3 = Generator.createMapperXml(fileUrl, bi).toString();
            System.out.println(aa3);

            String aa4 = Generator.createService(fileUrl, bi).toString();
            System.out.println(aa4);

            String aa5 = Generator.createServiceImpl(fileUrl, bi).toString();
            System.out.println(aa5);

            String aa6 = Generator.createController(fileUrl, bi).toString();
            System.out.println(aa6);

            String aa8 = Generator.createRepository(fileUrl, bi).toString();
            System.out.println(aa8);

            // 是否创建swagger配置文件
            String aa7 = Generator.createSwaggerConfig(fileUrl, bi).toString();
            System.out.println(aa7);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
