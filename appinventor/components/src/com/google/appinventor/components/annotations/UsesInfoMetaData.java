package com.google.appinventor.components.annotations;

import com.google.appinventor.components.annotations.androidmanifest.MetaDataElement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate any additional service required by
 * a component so that corresponding <service> elements can be added
 * to AndroidManifest.xml.
 *
 * @author jarlissonlira2@gmail.com (Jarlisson de Lira)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UsesInfoMetaData {

  /**
   * An array containing each {@link ServiceElement}
   * that is required by the component.
   *
   * @return  the array containing the relevant services
   */
  MetaDataElement[] metaDataElements();
}