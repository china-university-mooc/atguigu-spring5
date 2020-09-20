package com.itutry.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyTest {

    public static void main(String[] args) {
        Class<?>[] interfaces = {UserDao.class};
        UserDaoImpl target = new UserDaoImpl();
        UserDao proxy = (UserDao) Proxy.newProxyInstance(MyTest.class.getClassLoader(), interfaces, new MyInvocationHandler(target));

        proxy.save(new User());
        System.out.println(proxy.queryById("1"));
    }

    private static class MyInvocationHandler implements InvocationHandler {

        private final Object target;

        private MyInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before invoke");
            Object result = method.invoke(target, args);
            System.out.println("after invoke");

            return result;
        }
    }
}
