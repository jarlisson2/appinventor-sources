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
public @interface ServiceElement {

    /**
     * An array containing any intent filters used by this <activity> element.
     *
     * @return an array containing the <intent-filter> subelements for this
     *         <activity> element
     */
    IntentFilterElement[] intentFilters() default {};

    /**
     * An array containing any meta data used by this <activity> element.
     *
     * @return an array containing the <meta-data> subelements for this <activity>
     *         element
     */
    MetaDataElement[] metaDataElements() default {};

    /**
     * Specifies the fully qualified class name for the activity launched by the App
     * Inventor component. The name attribute is required in any @ServiceElement
     * annotation and hence has no default value.
     *
     * @return the service class name
     */
    String name();

    /*
     * A string that describes the service to users. The label should be set as a
     * reference to a string resource, so that it can be localized like other
     * strings in the user interface.
     * 
     * @return the service descriptor attribute
     */
    String description() default "";

    /*
     * Whether or not the service is direct-boot aware; that is, whether or not it
     * can run before the user unlocks the device.
     * 
     * @return the service directBootAware attribute
     */
    String directBootAware() default "";

    /*
     * Whether or not the service can be instantiated by the system — "true" if it
     * can be, and "false" if not. The default value is "true".
     * 
     * @return the service enabled attribute
     */
    String enabled() default "";

    /*
     * Whether or not components of other applications can invoke the service or
     * interact with it — "true" if they can, and "false" if not. When the value is
     * "false", only components of the same application or applications with the
     * same user ID can start the service or bind to it.
     * 
     * @return the service exported attribute
     */
    String exported() default "";

    /*
     * Specify that the service is a foreground service that satisfies a particular
     * use case. For example, a foreground service type of "location" indicates that
     * an app is getting the device's current location, usually to continue a
     * user-initiated action related to device location.
     * 
     * @return the service foregroundServiceType attribute
     */
    String foregroundServiceType() default "";

    /*
     * An icon representing the service. This attribute must be set as a reference
     * to a drawable resource containing the image definition. If it is not set, the
     * icon specified for the application as a whole is used instead (see the
     * <application> element's icon attribute).
     * 
     * @return the service icon attribute
     */
    String icon() default "";

    /*
     * If set to true, this service will run under a special process that is
     * isolated from the rest of the system and has no permissions of its own. The
     * only communication with it is through the Service API (binding and starting).
     * 
     * @return the service isolatedProcess attribute
     */
    String isolatedProcess() default "";

    /*
     * A name for the service that can be displayed to users. If this attribute is
     * not set, the label set for the application as a whole is used instead (see
     * the <application> element's label attribute).
     * 
     * @return the service label attribute
     */
    String label() default "";

    /*
     * The name of a permission that an entity must have in order to launch the
     * service or bind to it. If a caller of startService(), bindService(), or
     * stopService(), has not been granted this permission, the method will not work
     * and the Intent object will not be delivered to the service.
     * 
     * @return the service permission attribute
     */
    String permission() default "";

    /*
     * The name of the process where the service is to run. Normally, all components
     * of an application run in the default process created for the application. It
     * has the same name as the application package. The <application> element's
     * process attribute can set a different default for all components. But
     * component can override the default with its own process attribute, allowing
     * you to spread your application across multiple processes.
     * 
     * @return the service process attribute
     */
    String process() default "";

    String stopWithTask() default "";

}