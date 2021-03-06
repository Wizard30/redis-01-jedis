package com.kuang;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestKey {
    public static void main(String[] args) {
        //1. new Jedis 对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //所有指令就是方法
        System.out.println(jedis.ping());
        System.out.println("清空教据:"+jedis.flushDB());
        System.out .println("判断某个键是否存在: "+jedis.exists(  "username" ));
        System.out.println("新增< 'username' , ' wizard'>的键值对:"+jedis.set("username","wizard"));
        System.out.println("新增< 'password' , ' password'>的键值对:"+jedis.set("password","password"));
        System.out.print("系统中所有的键如下: ");
        Set<String> keys = jedis.keys(  "*");
        System.out.println(keys);
        System.out.println("删除键password: "+jedis.del(  "password"));
        System.out.println("判断健password是否存在:"+jedis.exists(  "password"));
        System.out.println("查看键username所存储的值的类型:"+jedis.type( "username"));
        System.out.println("随机返回key空间的一个:"+jedis.randomKey());
        System.out.println("重命名key: "+jedis.rename(  "username" , "name"));
        System.out.println("取出改后的name: "+jedis.get("name") );
        System.out.println("切换数据库:"+jedis.select(0));
        System.out.println("删除当前选择数据库中的所有key: "+jedis.flushDB());
        System.out.println("返回当前数据库中key的数日: "+jedis.dbSize());
        System.out.println("删除所有数据库中的所有key123456: "+jedis.flushAll());
    }
}
