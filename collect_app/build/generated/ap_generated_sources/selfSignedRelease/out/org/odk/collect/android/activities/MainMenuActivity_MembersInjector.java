// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.activities.viewmodels.CurrentProjectViewModel;
import org.odk.collect.android.activities.viewmodels.MainMenuViewModel;
import org.odk.collect.android.permissions.PermissionsProvider;
import org.odk.collect.android.preferences.source.SettingsProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainMenuActivity_MembersInjector implements MembersInjector<MainMenuActivity> {
  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<MainMenuViewModel.Factory> viewModelFactoryProvider;

  private final Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider;

  private final Provider<SettingsProvider> settingsProvider2;

  public MainMenuActivity_MembersInjector(Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<MainMenuViewModel.Factory> viewModelFactoryProvider,
      Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider2) {
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.currentProjectViewModelFactoryProvider = currentProjectViewModelFactoryProvider;
    this.settingsProvider2 = settingsProvider2;
  }

  public static MembersInjector<MainMenuActivity> create(
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<MainMenuViewModel.Factory> viewModelFactoryProvider,
      Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider2) {
    return new MainMenuActivity_MembersInjector(permissionsProvider, settingsProvider, viewModelFactoryProvider, currentProjectViewModelFactoryProvider, settingsProvider2);
  }

  @Override
  public void injectMembers(MainMenuActivity instance) {
    CollectAbstractActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider.get());
    CollectAbstractActivity_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectCurrentProjectViewModelFactory(instance, currentProjectViewModelFactoryProvider.get());
    injectSettingsProvider(instance, settingsProvider2.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.MainMenuActivity.viewModelFactory")
  public static void injectViewModelFactory(MainMenuActivity instance,
      MainMenuViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.MainMenuActivity.currentProjectViewModelFactory")
  public static void injectCurrentProjectViewModelFactory(MainMenuActivity instance,
      CurrentProjectViewModel.Factory currentProjectViewModelFactory) {
    instance.currentProjectViewModelFactory = currentProjectViewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.MainMenuActivity.settingsProvider")
  public static void injectSettingsProvider(MainMenuActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}