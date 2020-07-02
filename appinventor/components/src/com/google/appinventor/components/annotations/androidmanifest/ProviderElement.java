package com.google.appinventor.components.annotations.androidmanifest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to describe an <service> element required by a component so that
 * it can be added to AndroidManifest.xml. <service> element attributes that are
 * not set explicitly default to "" or {} and are ignored when the element is
 * created in the manifest.
 *
 * Note: Some of this documentation is adapted from the Android framework
 * specification linked below. That documentation is licensed under the
 * {@link <a href="https://creativecommons.org/licenses/by/2.5/"> Creative
 * Commons Attribution license v2.5 </a>}.
 *
 * See {@link <a href=
 * "https://developer.android.com/guide/topics/manifest/service-element">
 * https://developer.android.com/guide/topics/manifest/service-element </a>}.
 *
 * @author jarlissonlira2@gmail.com (Jarlisson de Lira)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProviderElement {
    String name();
    String authorities() default "";
    String directBootAware() default "";
    String enabled() default "";
    String exported() default "";
    String grantUriPermissions() default "";
    String icon() default "";
    String initOrder() default "";
    String label() default "";
    String multiprocess() default "";
    String permission() default "";
    String process() default "";
    String readPermission() default "";
    String syncable() default "";
    String writePermission() default "";

}