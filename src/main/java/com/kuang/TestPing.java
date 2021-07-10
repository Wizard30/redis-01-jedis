package com.kuang;

import redis.clients.jedis.Jedis;


public class TestPing {
    public static void main(String[] args) {
        //1. new Jedis 对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //所有指令就是方法
        System.out.println(jedis.ping());
    }
}
