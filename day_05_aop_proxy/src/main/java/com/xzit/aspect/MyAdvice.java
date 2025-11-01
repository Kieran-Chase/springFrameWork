package com.xzit.aspect;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/30
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  通知(增强)
 */
//让当前的通知类作为spring容器中的组件
@Component
//使用AspectJ来实现AOP
@Aspect
public class MyAdvice {
    //前置通知
    @Before(value="execution(public * com.xzit.aspect.*.showMenu(..))")
    public void doBefore(){
        System.out.println("欢迎光临本餐厅");
        System.out.println("很高兴为您服务");
        System.out.println("____________");
    }
    //最终通知 try finally
    @After(value = "execution(* pay(..))")
    public void doAfter(){
        System.out.println("请慢走，下次再来");
    }

    //后置通知
    @AfterReturning(value="execution(* login(..))",returning = "result")
    public void log(JoinPoint point,Object result){
        Object[] args=point.getArgs();
        String name="";
        if(args!=null){
            name=(String)args[0];
        }
        User user =(User) result;
        user.setName("root");
        System.out.println(result);
        /*boolean b= (boolean) result;
        if(b){
            System.out.println("正在生成日志...");
            try {
                //打印日志
                BufferedWriter bw=new BufferedWriter(new FileWriter("d:/文档/log.log",true));
                bw.write("访问用户："+name);
                bw.newLine();
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime dateTime=LocalDateTime.now();
                String time=formatter.format(dateTime);
                bw.write("访问时间："+time);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("日志生成成功！");
        }else{
            System.out.println("用户登录失败");
        }*/

        /*System.out.println("用户方法执行后的值"+result);*/
        /*for (Object arg : args) {
            System.out.println(arg);
        }*/
        /*System.out.println(point.getSignature());
        System.out.println(point.getClass().getName());*/
    }

    @Around(value="execution(* pay(..))")
    public void transaction(ProceedingJoinPoint point){
        System.out.println("开启事务");
        try {
            point.proceed();//调用目标方法
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("提交事务");
    }
}
