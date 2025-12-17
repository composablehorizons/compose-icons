package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour2: ImageVector
    get() {
        if (_ClockHour2 != null) return _ClockHour2!!
        
        _ClockHour2 = ImageVector.Builder(
            name = "clock-hour-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-6f, 3.66f)
                verticalLineToRelative(5.022f)
                lineToRelative(0.003f, 0.054f)
                lineToRelative(0.02f, 0.135f)
                lineToRelative(0.005f, 0.025f)
                arcToRelative(1f, 1f, 0f, false, false, 0.056f, 0.165f)
                lineToRelative(0.04f, 0.082f)
                lineToRelative(0.062f, 0.099f)
                lineToRelative(0.07f, 0.087f)
                lineToRelative(0.075f, 0.074f)
                lineToRelative(0.094f, 0.075f)
                lineToRelative(0.08f, 0.052f)
                lineToRelative(0.07f, 0.035f)
                lineToRelative(0.132f, 0.051f)
                lineToRelative(0.135f, 0.031f)
                lineToRelative(0.082f, 0.01f)
                lineToRelative(0.124f, 0.002f)
                lineToRelative(0.113f, -0.012f)
                lineToRelative(0.108f, -0.024f)
                lineToRelative(0.106f, -0.036f)
                lineToRelative(0.108f, -0.051f)
                lineToRelative(0.065f, -0.04f)
                lineToRelative(3.007f, -2.004f)
                arcToRelative(1f, 1f, 0f, true, false, -1.11f, -1.664f)
                lineToRelative(-1.445f, 0.962f)
                verticalLineToRelative(-3.13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _ClockHour2!!
    }

private var _ClockHour2: ImageVector? = null

