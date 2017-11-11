package net.devh.springboot.autoconfigure.grpc.client;


import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface GrpcCall {

    // 对应的grpc channel beanName
    String  channelName() default "channel" ;


}
