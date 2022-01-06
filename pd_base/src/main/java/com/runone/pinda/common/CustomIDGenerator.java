package com.runone.pinda.common;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.runone.pinda.common.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * 自定义ID生成器
 */
public class CustomIDGenerator implements IdentifierGenerator {
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

    @Autowired
    private IdWorker idWorker;

    @Override
    public Long nextId(Object entity) {
        return idWorker.nextId();
    }
}
