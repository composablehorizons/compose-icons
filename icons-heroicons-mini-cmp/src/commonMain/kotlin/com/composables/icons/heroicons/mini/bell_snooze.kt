package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BellSnooze: ImageVector
    get() {
        if (_BellSnooze != null) return _BellSnooze!!
        
        _BellSnooze = ImageVector.Builder(
            name = "bell-snooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                curveToRelative(0f, 1.887f, 0.454f, 3.665f, 1.257f, 5.234f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.515f, 1.076f)
                arcToRelative(32.903f, 32.903f, 0f, false, true, -3.256f, 0.508f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.972f, 0f)
                arcToRelative(32.91f, 32.91f, 0f, false, true, -3.256f, -0.508f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.515f, -1.076f)
                arcTo(11.448f, 11.448f, 0f, false, false, 4f, 8f)
                close()
                moveToRelative(6f, 7f)
                curveToRelative(-0.655f, 0f, -1.305f, -0.02f, -1.95f, -0.057f)
                arcToRelative(2f, 2f, 0f, false, false, 3.9f, 0f)
                curveToRelative(-0.645f, 0.038f, -1.295f, 0.057f, -1.95f, 0.057f)
                close()
                moveTo(8.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.043f)
                lineTo(8.14f, 9.814f)
                arcTo(0.75f, 0.75f, 0f, false, false, 8.75f, 11f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.043f)
                lineToRelative(1.653f, -2.314f)
                arcTo(0.75f, 0.75f, 0f, false, false, 11.25f, 6f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _BellSnooze!!
    }

private var _BellSnooze: ImageVector? = null

