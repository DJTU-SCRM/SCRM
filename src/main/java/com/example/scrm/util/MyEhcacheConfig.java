package com.example.scrm.util;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;

/**
 * @Auther: Steven
 * @Date: 2020/9/7 13:13
 * @Description:
 */
@Configuration
@EnableCaching
public class MyEhcacheConfig {
    @Primary
    @Bean
    public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean bean) {
        return new EhCacheCacheManager(bean.getObject());
    }

    /**
     * 据shared与否的设置,
     * Spring分别通过CacheManager.create()
     * 或new CacheManager()方式来创建一个ehcache基地.
     * 也说是说通过这个来设置cache的基地是这里的Spring独用,还是跟别的(如hibernate的Ehcache共享)
     *
     * @return
     */
    @Bean
    @Primary
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        cacheManagerFactoryBean.setShared(true);
        return cacheManagerFactoryBean;
    }
}