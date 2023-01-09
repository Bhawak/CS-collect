// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class GeopolyLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageButton backspace;

  @NonNull
  public final AppCompatImageButton clear;

  @NonNull
  public final TextView collectionStatus;

  @NonNull
  public final AppCompatImageButton layers;

  @NonNull
  public final TextView locationStatus;

  @NonNull
  public final FrameLayout mapContainer;

  @NonNull
  public final AppCompatImageButton pause;

  @NonNull
  public final AppCompatImageButton play;

  @NonNull
  public final AppCompatButton recordButton;

  @NonNull
  public final AppCompatImageButton save;

  @NonNull
  public final ScrollView scroller;

  @NonNull
  public final AppCompatImageButton zoom;

  private GeopolyLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatImageButton backspace, @NonNull AppCompatImageButton clear,
      @NonNull TextView collectionStatus, @NonNull AppCompatImageButton layers,
      @NonNull TextView locationStatus, @NonNull FrameLayout mapContainer,
      @NonNull AppCompatImageButton pause, @NonNull AppCompatImageButton play,
      @NonNull AppCompatButton recordButton, @NonNull AppCompatImageButton save,
      @NonNull ScrollView scroller, @NonNull AppCompatImageButton zoom) {
    this.rootView = rootView;
    this.backspace = backspace;
    this.clear = clear;
    this.collectionStatus = collectionStatus;
    this.layers = layers;
    this.locationStatus = locationStatus;
    this.mapContainer = mapContainer;
    this.pause = pause;
    this.play = play;
    this.recordButton = recordButton;
    this.save = save;
    this.scroller = scroller;
    this.zoom = zoom;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GeopolyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GeopolyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.geopoly_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GeopolyLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backspace;
      AppCompatImageButton backspace = rootView.findViewById(id);
      if (backspace == null) {
        break missingId;
      }

      id = R.id.clear;
      AppCompatImageButton clear = rootView.findViewById(id);
      if (clear == null) {
        break missingId;
      }

      id = R.id.collection_status;
      TextView collectionStatus = rootView.findViewById(id);
      if (collectionStatus == null) {
        break missingId;
      }

      id = R.id.layers;
      AppCompatImageButton layers = rootView.findViewById(id);
      if (layers == null) {
        break missingId;
      }

      id = R.id.location_status;
      TextView locationStatus = rootView.findViewById(id);
      if (locationStatus == null) {
        break missingId;
      }

      id = R.id.map_container;
      FrameLayout mapContainer = rootView.findViewById(id);
      if (mapContainer == null) {
        break missingId;
      }

      id = R.id.pause;
      AppCompatImageButton pause = rootView.findViewById(id);
      if (pause == null) {
        break missingId;
      }

      id = R.id.play;
      AppCompatImageButton play = rootView.findViewById(id);
      if (play == null) {
        break missingId;
      }

      id = R.id.record_button;
      AppCompatButton recordButton = rootView.findViewById(id);
      if (recordButton == null) {
        break missingId;
      }

      id = R.id.save;
      AppCompatImageButton save = rootView.findViewById(id);
      if (save == null) {
        break missingId;
      }

      id = R.id.scroller;
      ScrollView scroller = rootView.findViewById(id);
      if (scroller == null) {
        break missingId;
      }

      id = R.id.zoom;
      AppCompatImageButton zoom = rootView.findViewById(id);
      if (zoom == null) {
        break missingId;
      }

      return new GeopolyLayoutBinding((LinearLayout) rootView, backspace, clear, collectionStatus,
          layers, locationStatus, mapContainer, pause, play, recordButton, save, scroller, zoom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}