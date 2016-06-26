package us.illyohs.flardule.annotation;

/**
 * Created by illyohs on 6/26/16.
 */
public @interface Flardule {

    String      name();

    String      author() default "";

    String      url() default "";

    String      description() default "";

    String[]    pluginDeps() default "";

    String[]    flarduleDeps() default "";

    boolean     defualtEnable() default true;

    boolean     hardFail() default true;

}
