/*
 * Copyright (c) 2014 Eike Stepper (Loehne, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.oomph.setup.provider;

import org.eclipse.oomph.base.provider.ModelElementItemProvider;
import org.eclipse.oomph.setup.CatalogSelection;
import org.eclipse.oomph.setup.Index;
import org.eclipse.oomph.setup.SetupFactory;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link org.eclipse.oomph.setup.CatalogSelection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogSelectionItemProvider extends ModelElementItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogSelectionItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addProductCatalogsPropertyDescriptor(object);
      addProjectCatalogsPropertyDescriptor(object);
      addSelectedStreamsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Product Catalogs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProductCatalogsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_productCatalogs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_productCatalogs_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__PRODUCT_CATALOGS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Project Catalogs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProjectCatalogsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_projectCatalogs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_projectCatalogs_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__PROJECT_CATALOGS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Selected Streams feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSelectedStreamsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_selectedStreams_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_selectedStreams_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__SELECTED_STREAMS, true, false, true, null, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__PRODUCT_CATALOGS);
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__PROJECT_CATALOGS);
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS);
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_STREAMS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns CatalogSelection.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CatalogSelection"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    return getString("_UI_CatalogSelection_type");
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(CatalogSelection.class))
    {
      case SetupPackage.CATALOG_SELECTION__PRODUCT_CATALOGS:
      case SetupPackage.CATALOG_SELECTION__PROJECT_CATALOGS:
      case SetupPackage.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS:
      case SetupPackage.CATALOG_SELECTION__DEFAULT_STREAMS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PRODUCT_TO_PRODUCT_VERSION_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_STREAMS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PROJECT_TO_STREAM_MAP_ENTRY)));
  }

  @Override
  protected Object filterParent(AdapterFactoryItemDelegator itemDelegator, EStructuralFeature feature, Object object)
  {
    Object result = super.filterParent(itemDelegator, feature, object);
    if (result instanceof Index)
    {
      return null;
    }

    return result;
  }

  @Override
  protected boolean isValidValue(Object object, Object value, EStructuralFeature feature)
  {
    if (feature instanceof EReference)
    {
      EReference eReference = (EReference)feature;
      EClass eReferenceType = eReference.getEReferenceType();
      if (!(value instanceof EObject))
      {
        return false;
      }

      return eReferenceType.isSuperTypeOf(((EObject)value).eClass());
    }

    return super.isValidValue(object, value, feature);
  }
}
