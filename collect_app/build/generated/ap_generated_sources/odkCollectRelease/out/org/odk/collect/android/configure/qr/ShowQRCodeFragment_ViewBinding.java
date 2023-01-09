// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.configure.qr;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class ShowQRCodeFragment_ViewBinding implements Unbinder {
  private ShowQRCodeFragment target;

  private View view7f0902dd;

  @UiThread
  public ShowQRCodeFragment_ViewBinding(final ShowQRCodeFragment target, View source) {
    this.target = target;

    View view;
    target.ivQRCode = Utils.findRequiredViewAsType(source, R.id.ivQRcode, "field 'ivQRCode'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.circularProgressBar, "field 'progressBar'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.tvPasswordWarning, "field 'tvPasswordWarning' and method 'passwordWarningClicked'");
    target.tvPasswordWarning = Utils.castView(view, R.id.tvPasswordWarning, "field 'tvPasswordWarning'", TextView.class);
    view7f0902dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.passwordWarningClicked();
      }
    });
    target.passwordStatus = Utils.findRequiredViewAsType(source, R.id.status, "field 'passwordStatus'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowQRCodeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivQRCode = null;
    target.progressBar = null;
    target.tvPasswordWarning = null;
    target.passwordStatus = null;

    view7f0902dd.setOnClickListener(null);
    view7f0902dd = null;
  }
}
