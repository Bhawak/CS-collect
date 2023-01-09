// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.views;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class InstanceUploaderProgressBar_ViewBinding implements Unbinder {
  private InstanceUploaderProgressBar target;

  @UiThread
  public InstanceUploaderProgressBar_ViewBinding(InstanceUploaderProgressBar target) {
    this(target, target);
  }

  @UiThread
  public InstanceUploaderProgressBar_ViewBinding(InstanceUploaderProgressBar target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredView(source, R.id.progress_view, "field 'progressBar'");
    target.divider = Utils.findRequiredView(source, R.id.divider, "field 'divider'");
    target.mainLayout = Utils.findRequiredViewAsType(source, R.id.main_layout, "field 'mainLayout'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InstanceUploaderProgressBar target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.divider = null;
    target.mainLayout = null;
  }
}
