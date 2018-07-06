/*
 * Copyright (c) 2014, 2015 Eike Stepper (Loehne, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.oomph.projectconfig.provider;

import org.eclipse.oomph.base.Annotation;
import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.base.util.BaseSwitch;
import org.eclipse.oomph.predicates.AndPredicate;
import org.eclipse.oomph.predicates.NotPredicate;
import org.eclipse.oomph.predicates.OrPredicate;
import org.eclipse.oomph.predicates.PredicatesPackage;
import org.eclipse.oomph.predicates.util.PredicatesSwitch;
import org.eclipse.oomph.projectconfig.ProjectConfigFactory;
import org.eclipse.oomph.projectconfig.util.ProjectConfigAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectConfigItemProviderAdapterFactory extends ProjectConfigAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Disposable disposable = new Disposable();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectConfigItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.oomph.projectconfig.WorkspaceConfiguration} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceConfigurationItemProvider workspaceConfigurationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.WorkspaceConfiguration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createWorkspaceConfigurationAdapter()
  {
    if (workspaceConfigurationItemProvider == null)
    {
      workspaceConfigurationItemProvider = new WorkspaceConfigurationItemProvider(this);
    }

    return workspaceConfigurationItemProvider;
  }

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.Project}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createProjectAdapter()
  {
    return new ProjectItemProvider(this);
  }

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.PreferenceProfile}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPreferenceProfileAdapter()
  {
    return new PreferenceProfileItemProvider(this);
  }

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.PreferenceFilter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPreferenceFilterAdapter()
  {
    return new PreferenceFilterItemProvider(this);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.oomph.projectconfig.InclusionPredicate} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InclusionPredicateItemProvider inclusionPredicateItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.InclusionPredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createInclusionPredicateAdapter()
  {
    if (inclusionPredicateItemProvider == null)
    {
      inclusionPredicateItemProvider = new InclusionPredicateItemProvider(this);
    }

    return inclusionPredicateItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.oomph.projectconfig.ExclusionPredicate} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExclusionPredicateItemProvider exclusionPredicateItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.oomph.projectconfig.ExclusionPredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createExclusionPredicateAdapter()
  {
    if (exclusionPredicateItemProvider == null)
    {
      exclusionPredicateItemProvider = new ExclusionPredicateItemProvider(this);
    }

    return exclusionPredicateItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || ((Class<?>)type).isInstance(adapter))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void associate(Adapter adapter, Notifier target)
  {
    super.associate(adapter, target);
    if (adapter != null)
    {
      disposable.add(adapter);
    }
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    disposable.dispose();
  }

  /**
   * A child creation extender for the {@link PredicatesPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class PredicatesChildCreationExtender implements IChildCreationExtender
  {
    /**
     * The switch for creating child descriptors specific to each extended class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static class CreationSwitch extends PredicatesSwitch<Object>
    {
      /**
       * The child descriptors being populated.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected List<Object> newChildDescriptors;

      /**
       * The domain in which to create the children.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected EditingDomain editingDomain;

      /**
       * Creates the a switch for populating child descriptors in the given domain.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain)
      {
        this.newChildDescriptors = newChildDescriptors;
        this.editingDomain = editingDomain;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseAndPredicate(AndPredicate object)
      {
        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.AND_PREDICATE__OPERANDS, ProjectConfigFactory.eINSTANCE.createInclusionPredicate()));

        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.AND_PREDICATE__OPERANDS, ProjectConfigFactory.eINSTANCE.createExclusionPredicate()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseOrPredicate(OrPredicate object)
      {
        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.OR_PREDICATE__OPERANDS, ProjectConfigFactory.eINSTANCE.createInclusionPredicate()));

        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.OR_PREDICATE__OPERANDS, ProjectConfigFactory.eINSTANCE.createExclusionPredicate()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseNotPredicate(NotPredicate object)
      {
        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.NOT_PREDICATE__OPERAND, ProjectConfigFactory.eINSTANCE.createInclusionPredicate()));

        newChildDescriptors
            .add(createChildParameter(PredicatesPackage.Literals.NOT_PREDICATE__OPERAND, ProjectConfigFactory.eINSTANCE.createExclusionPredicate()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
        return new CommandParameter(null, feature, child);
      }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
      ArrayList<Object> result = new ArrayList<Object>();
      new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
      return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator()
    {
      return ProjectConfigEditPlugin.INSTANCE;
    }
  }

  /**
   * A child creation extender for the {@link BasePackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class BaseChildCreationExtender implements IChildCreationExtender
  {
    /**
     * The switch for creating child descriptors specific to each extended class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static class CreationSwitch extends BaseSwitch<Object>
    {
      /**
       * The child descriptors being populated.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected List<Object> newChildDescriptors;

      /**
       * The domain in which to create the children.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected EditingDomain editingDomain;

      /**
       * Creates the a switch for populating child descriptors in the given domain.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain)
      {
        this.newChildDescriptors = newChildDescriptors;
        this.editingDomain = editingDomain;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseAnnotation(Annotation object)
      {
        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createWorkspaceConfiguration()));

        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createProject()));

        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createPreferenceProfile()));

        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createPreferenceFilter()));

        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createInclusionPredicate()));

        newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, ProjectConfigFactory.eINSTANCE.createExclusionPredicate()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
        return new CommandParameter(null, feature, child);
      }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
      ArrayList<Object> result = new ArrayList<Object>();
      new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
      return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator()
    {
      return ProjectConfigEditPlugin.INSTANCE;
    }
  }

}
