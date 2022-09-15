// Generated by Dagger (https://dagger.dev).
package com.example.nasaious.data.remote.api;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImageApiImpl_Factory implements Factory<ImageApiImpl> {
  private final Provider<Context> contextProvider;

  public ImageApiImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ImageApiImpl get() {
    return newInstance(contextProvider.get());
  }

  public static ImageApiImpl_Factory create(Provider<Context> contextProvider) {
    return new ImageApiImpl_Factory(contextProvider);
  }

  public static ImageApiImpl newInstance(Context context) {
    return new ImageApiImpl(context);
  }
}