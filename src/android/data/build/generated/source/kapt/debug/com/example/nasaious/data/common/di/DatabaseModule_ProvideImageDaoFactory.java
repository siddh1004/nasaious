// Generated by Dagger (https://dagger.dev).
package com.example.nasaious.data.common.di;

import com.example.nasaious.data.local.dao.ImageDao;
import com.example.nasaious.data.local.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideImageDaoFactory implements Factory<ImageDao> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> dbProvider;

  public DatabaseModule_ProvideImageDaoFactory(DatabaseModule module,
      Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public ImageDao get() {
    return provideImageDao(module, dbProvider.get());
  }

  public static DatabaseModule_ProvideImageDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> dbProvider) {
    return new DatabaseModule_ProvideImageDaoFactory(module, dbProvider);
  }

  public static ImageDao provideImageDao(DatabaseModule instance, AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideImageDao(db));
  }
}
