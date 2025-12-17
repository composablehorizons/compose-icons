package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour1: ImageVector
    get() {
        if (_ClockHour1 != null) return _ClockHour1!!
        
        _ClockHour1 = ImageVector.Builder(
            name = "clock-hour-1",
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
                moveToRelative(-5.401f, 9.576f)
                lineToRelative(0.052f, 0.021f)
                lineToRelative(0.08f, 0.026f)
                lineToRelative(0.08f, 0.019f)
                lineToRelative(0.072f, 0.011f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.076f, -0.003f)
                lineToRelative(0.135f, -0.02f)
                lineToRelative(0.082f, -0.02f)
                lineToRelative(0.103f, -0.039f)
                lineToRelative(0.073f, -0.035f)
                lineToRelative(0.078f, -0.046f)
                lineToRelative(0.06f, -0.042f)
                lineToRelative(0.08f, -0.069f)
                lineToRelative(0.083f, -0.088f)
                lineToRelative(0.062f, -0.083f)
                lineToRelative(2f, -3f)
                arcToRelative(1f, 1f, 0f, true, false, -1.664f, -1.11f)
                lineToRelative(-0.168f, 0.251f)
                verticalLineToRelative(-1.696f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5.026f)
                lineToRelative(0.009f, 0.105f)
                lineToRelative(0.02f, 0.107f)
                lineToRelative(0.04f, 0.129f)
                lineToRelative(0.048f, 0.102f)
                lineToRelative(0.046f, 0.078f)
                lineToRelative(0.042f, 0.06f)
                lineToRelative(0.069f, 0.08f)
                lineToRelative(0.088f, 0.083f)
                lineToRelative(0.083f, 0.062f)
                lineToRelative(0.09f, 0.053f)
                close()
            }
        }.build()
        
        return _ClockHour1!!
    }

private var _ClockHour1: ImageVector? = null

