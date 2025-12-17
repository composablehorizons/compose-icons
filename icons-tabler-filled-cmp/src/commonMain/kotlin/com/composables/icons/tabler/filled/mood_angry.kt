package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodAngry: ImageVector
    get() {
        if (_MoodAngry != null) return _MoodAngry!!
        
        _MoodAngry = ImageVector.Builder(
            name = "mood-angry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                arcToRelative(10f, 10f, 0f, true, true, 0f, -20f)
                moveToRelative(0f, 12f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.214f, 1.35f)
                arcToRelative(1f, 1f, 0f, true, false, 1.428f, 1.4f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.572f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 1.428f, -1.4f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.214f, -1.35f)
                moveToRelative(-3.553f, -5.895f)
                arcToRelative(1f, 1f, 0f, false, false, -0.894f, 1.788f)
                lineToRelative(2f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, -1.788f)
                close()
                moveToRelative(8.447f, 0.447f)
                arcToRelative(1f, 1f, 0f, false, false, -1.341f, -0.447f)
                lineToRelative(-2f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 1.788f)
                lineToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.447f, -1.341f)
            }
        }.build()
        
        return _MoodAngry!!
    }

private var _MoodAngry: ImageVector? = null

