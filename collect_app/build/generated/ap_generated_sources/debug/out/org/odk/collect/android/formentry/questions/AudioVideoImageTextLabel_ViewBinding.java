// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.formentry.questions;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.button.MaterialButton;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;
import org.odk.collect.android.audio.AudioButton;

public class AudioVideoImageTextLabel_ViewBinding implements Unbinder {
  private AudioVideoImageTextLabel target;

  @UiThread
  public AudioVideoImageTextLabel_ViewBinding(AudioVideoImageTextLabel target) {
    this(target, target);
  }

  @UiThread
  public AudioVideoImageTextLabel_ViewBinding(AudioVideoImageTextLabel target, View source) {
    this.target = target;

    target.audioButton = Utils.findRequiredViewAsType(source, R.id.audioButton, "field 'audioButton'", AudioButton.class);
    target.videoButton = Utils.findRequiredViewAsType(source, R.id.videoButton, "field 'videoButton'", MaterialButton.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.missingImage = Utils.findRequiredViewAsType(source, R.id.missingImage, "field 'missingImage'", TextView.class);
    target.textContainer = Utils.findRequiredViewAsType(source, R.id.text_container, "field 'textContainer'", FrameLayout.class);
    target.labelTextView = Utils.findRequiredViewAsType(source, R.id.text_label, "field 'labelTextView'", TextView.class);
    target.mediaButtonsContainer = Utils.findRequiredViewAsType(source, R.id.media_buttons, "field 'mediaButtonsContainer'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioVideoImageTextLabel target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.audioButton = null;
    target.videoButton = null;
    target.imageView = null;
    target.missingImage = null;
    target.textContainer = null;
    target.labelTextView = null;
    target.mediaButtonsContainer = null;
  }
}
