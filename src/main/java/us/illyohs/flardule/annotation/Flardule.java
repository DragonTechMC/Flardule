package us.illyohs.flardule.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by illyohs on 6/26/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Flardule
{

    String name();

    String[] authors() default "";

    String url() default "";

    String description() default "";

    String[] pluginDeps() default {""};

    boolean defualtEnable() default true;

    boolean hardFail() default true;

}
