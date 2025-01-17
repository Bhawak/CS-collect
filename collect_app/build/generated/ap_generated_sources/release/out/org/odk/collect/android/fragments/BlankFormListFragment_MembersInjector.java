// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.itemsets.FastExternalItemsetsRepository;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BlankFormListFragment_MembersInjector implements MembersInjector<BlankFormListFragment> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public BlankFormListFragment_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.settingsProvider = settingsProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.fastExternalItemsetsRepositoryProvider = fastExternalItemsetsRepositoryProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  public static MembersInjector<BlankFormListFragment> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new BlankFormListFragment_MembersInjector(settingsProvider, formsRepositoryProvider, instancesRepositoryProvider, fastExternalItemsetsRepositoryProvider, currentProjectProvider);
  }

  @Override
  public void injectMembers(BlankFormListFragment instance) {
    AppListFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFastExternalItemsetsRepository(instance, fastExternalItemsetsRepositoryProvider.get());
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BlankFormListFragment.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(BlankFormListFragment instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BlankFormListFragment.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(BlankFormListFragment instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BlankFormListFragment.fastExternalItemsetsRepository")
  public static void injectFastExternalItemsetsRepository(BlankFormListFragment instance,
      FastExternalItemsetsRepository fastExternalItemsetsRepository) {
    instance.fastExternalItemsetsRepository = fastExternalItemsetsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BlankFormListFragment.currentProjectProvider")
  public static void injectCurrentProjectProvider(BlankFormListFragment instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }
}
