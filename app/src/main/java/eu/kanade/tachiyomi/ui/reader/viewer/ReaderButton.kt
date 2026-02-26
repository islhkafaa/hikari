package eu.kanade.tachiyomi.ui.reader.viewer

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import com.google.android.material.button.MaterialButton
import eu.kanade.tachiyomi.R

/**
 * A button class to be used by child views of the reader viewer.
 */
class ReaderButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.materialButtonStyle,
) : MaterialButton(context, attrs, defStyleAttr)
