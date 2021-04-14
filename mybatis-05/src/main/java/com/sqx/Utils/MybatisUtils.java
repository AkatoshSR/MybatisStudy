package com.sqx.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

       static{
           // 从Mybatis中获得第一个SqlSessionFactory对象
           try {
               String resource = "mybatis-config.xml";
               InputStream inputStream = Resources.getResourceAsStream(resource);
               sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
               inputStream.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       public static SqlSession getSqlSession(){
           return sqlSessionFactory.openSession();
       }
}
