package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AlarmSnooze: ImageVector
    get() {
        if (_AlarmSnooze != null) return _AlarmSnooze!!
        
        _AlarmSnooze = ImageVector.Builder(
            name = "alarm-snooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 6.072f)
                arcToRelative(8f, 8f, 0f, true, true, -11.995f, 7.213f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, false, true, 11.995f, -6.643f)
                close()
                moveToRelative(-2f, 3.928f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, 0.883f)
                horizontalLineToRelative(1.584f)
                lineToRelative(-2.291f, 2.293f)
                lineToRelative(-0.076f, 0.084f)
                curveToRelative(-0.514f, 0.637f, -0.07f, 1.623f, 0.783f, 1.623f)
                horizontalLineToRelative(4f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(0.076f, -0.084f)
                curveToRelative(0.514f, -0.637f, 0.07f, -1.623f, -0.783f, -1.623f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.412f, 3.191f)
                arcToRelative(1f, 1f, 0f, false, true, 1.273f, 1.539f)
                lineToRelative(-0.097f, 0.08f)
                lineToRelative(-2.75f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -1.273f, -1.54f)
                lineToRelative(0.097f, -0.08f)
                lineToRelative(2.75f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.191f, 3.412f)
                arcToRelative(1f, 1f, 0f, false, true, 1.291f, -0.288f)
                lineToRelative(0.106f, 0.067f)
                lineToRelative(2.75f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -1.07f, 1.685f)
                lineToRelative(-0.106f, -0.067f)
                lineToRelative(-2.75f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.22f, -1.397f)
                close()
            }
        }.build()
        
        return _AlarmSnooze!!
    }

private var _AlarmSnooze: ImageVector? = null

