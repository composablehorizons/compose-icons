package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BellAlert: ImageVector
    get() {
        if (_BellAlert != null) return _BellAlert!!
        
        _BellAlert = ImageVector.Builder(
            name = "bell-alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.214f, 3.227f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.156f, -0.955f)
                arcToRelative(8.97f, 8.97f, 0f, false, false, -1.856f, 3.825f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.466f, 0.316f)
                arcToRelative(7.47f, 7.47f, 0f, false, true, 1.546f, -3.186f)
                close()
                moveTo(16.942f, 2.272f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.157f, 0.955f)
                arcToRelative(7.47f, 7.47f, 0f, false, true, 1.547f, 3.186f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.466f, -0.316f)
                arcToRelative(8.971f, 8.971f, 0f, false, false, -1.856f, -3.825f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                curveToRelative(0f, 1.887f, -0.454f, 3.665f, -1.257f, 5.234f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.515f, 1.076f)
                arcToRelative(32.91f, 32.91f, 0f, false, false, 3.256f, 0.508f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 6.972f, 0f)
                arcToRelative(32.903f, 32.903f, 0f, false, false, 3.256f, -0.508f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.515f, -1.076f)
                arcTo(11.448f, 11.448f, 0f, false, true, 16f, 8f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                close()
                moveToRelative(0f, 14.5f)
                arcToRelative(2f, 2f, 0f, false, true, -1.95f, -1.557f)
                arcToRelative(33.54f, 33.54f, 0f, false, false, 3.9f, 0f)
                arcTo(2f, 2f, 0f, false, true, 10f, 16.5f)
                close()
            }
        }.build()
        
        return _BellAlert!!
    }

private var _BellAlert: ImageVector? = null

