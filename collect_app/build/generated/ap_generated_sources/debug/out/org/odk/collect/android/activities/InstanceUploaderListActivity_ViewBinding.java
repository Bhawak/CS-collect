// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.activities;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class InstanceUploaderListActivity_ViewBinding implements Unbinder {
  private InstanceUploaderListActivity target;

  private View view7f09030b;

  @UiThread
  public InstanceUploaderListActivity_ViewBinding(InstanceUploaderListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public InstanceUploaderListActivity_ViewBinding(final InstanceUploaderListActivity target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.upload_button, "field 'uploadButton' and method 'onUploadButtonsClicked'");
    target.uploadButton = Utils.castView(view, R.id.upload_button, "field 'uploadButton'", Button.class);
    view7f09030b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUploadButtonsClicked(Utils.castParam(p0, "doClick", 0, "onUploadButtonsClicked", 0, Button.class));
      }
    });
    target.toggleSelsButton = Utils.findRequiredViewAsType(source, R.id.toggle_button, "field 'toggleSelsButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InstanceUploaderListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.uploadButton = null;
    target.toggleSelsButton = null;

    view7f09030b.setOnClickListener(null);
    view7f09030b = null;
  }
}
