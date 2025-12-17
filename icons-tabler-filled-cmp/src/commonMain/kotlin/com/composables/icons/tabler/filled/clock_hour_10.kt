package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour10: ImageVector
    get() {
        if (_ClockHour10 != null) return _ClockHour10!!
        
        _ClockHour10 = ImageVector.Builder(
            name = "clock-hour-10",
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
                lineToRelative(0.053f, -0.09f)
                lineToRelative(0.031f, -0.064f)
                lineToRelative(0.032f, -0.081f)
                lineToRelative(0.03f, -0.109f)
                lineToRelative(0.015f, -0.094f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                verticalLineToRelative(3.131f)
                lineToRelative(-1.445f, -0.963f)
                arcToRelative(1f, 1f, 0f, false, false, -1.317f, 0.184f)
                lineToRelative(-0.07f, 0.093f)
                arcToRelative(1f, 1f, 0f, false, false, 0.277f, 1.387f)
                lineToRelative(3.038f, 2.024f)
                close()
            }
        }.build()
        
        return _ClockHour10!!
    }

private var _ClockHour10: ImageVector? = null

