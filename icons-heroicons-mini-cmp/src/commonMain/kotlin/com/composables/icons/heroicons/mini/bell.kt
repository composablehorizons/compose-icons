package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
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
                moveTo(8.05f, 14.943f)
                arcToRelative(33.54f, 33.54f, 0f, false, false, 3.9f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -3.9f, 0f)
                close()
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

