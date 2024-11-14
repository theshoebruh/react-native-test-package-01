package com.testpackage01

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.TestPackage01ViewManagerInterface
import com.facebook.react.viewmanagers.TestPackage01ViewManagerDelegate

@ReactModule(name = TestPackage01ViewManager.NAME)
class TestPackage01ViewManager : SimpleViewManager<TestPackage01View>(),
  TestPackage01ViewManagerInterface<TestPackage01View> {
  private val mDelegate: ViewManagerDelegate<TestPackage01View>

  init {
    mDelegate = TestPackage01ViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<TestPackage01View>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): TestPackage01View {
    return TestPackage01View(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: TestPackage01View?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "TestPackage01View"
  }
}
