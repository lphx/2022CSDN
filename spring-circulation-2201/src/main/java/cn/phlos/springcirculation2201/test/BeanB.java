package cn.phlos.springcirculation2201.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BeanB
 * @Author: lph
 * @Description:
 * @Date: 2022/1/18 21:30
 */
@Component
public class BeanB {

    private  BeanA beanA;

    @Autowired
    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }
}
