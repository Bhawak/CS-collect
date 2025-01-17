// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.formentry;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.formentry.saving.FormSaveViewModel;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.async.Scheduler;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuitFormDialogFragment_MembersInjector implements MembersInjector<QuitFormDialogFragment> {
  private final Provider<Analytics> analyticsProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<FormSaveViewModel.FactoryFactory> formSaveViewModelFactoryFactoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public QuitFormDialogFragment_MembersInjector(Provider<Analytics> analyticsProvider,
      Provider<Scheduler> schedulerProvider,
      Provider<FormSaveViewModel.FactoryFactory> formSaveViewModelFactoryFactoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.analyticsProvider = analyticsProvider;
    this.schedulerProvider = schedulerProvider;
    this.formSaveViewModelFactoryFactoryProvider = formSaveViewModelFactoryFactoryProvider;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  public static MembersInjector<QuitFormDialogFragment> create(
      Provider<Analytics> analyticsProvider, Provider<Scheduler> schedulerProvider,
      Provider<FormSaveViewModel.FactoryFactory> formSaveViewModelFactoryFactoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new QuitFormDialogFragment_MembersInjector(analyticsProvider, schedulerProvider, formSaveViewModelFactoryFactoryProvider, settingsProvider, currentProjectProvider);
  }

  @Override
  public void injectMembers(QuitFormDialogFragment instance) {
    injectAnalytics(instance, analyticsProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectFormSaveViewModelFactoryFactory(instance, formSaveViewModelFactoryFactoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.QuitFormDialogFragment.analytics")
  public static void injectAnalytics(QuitFormDialogFragment instance, Analytics analytics) {
    instance.analytics = analytics;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.QuitFormDialogFragment.scheduler")
  public static void injectScheduler(QuitFormDialogFragment instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.QuitFormDialogFragment.formSaveViewModelFactoryFactory")
  public static void injectFormSaveViewModelFactoryFactory(QuitFormDialogFragment instance,
      FormSaveViewModel.FactoryFactory formSaveViewModelFactoryFactory) {
    instance.formSaveViewModelFactoryFactory = formSaveViewModelFactoryFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.QuitFormDialogFragment.settingsProvider")
  public static void injectSettingsProvider(QuitFormDialogFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.QuitFormDialogFragment.currentProjectProvider")
  public static void injectCurrentProjectProvider(QuitFormDialogFragment instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }
}
