package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour8: ImageVector
    get() {
        if (_ClockHour8 != null) return _ClockHour8!!
        
        _ClockHour8 = ImageVector.Builder(
            name = "clock-hour-8",
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
                moveToRelative(-5f, 2.66f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4.464f)
                lineToRelative(-2.555f, 1.704f)
                arcToRelative(1f, 1f, 0f, false, false, -0.336f, 1.286f)
                lineToRelative(0.059f, 0.1f)
                arcToRelative(1f, 1f, 0f, false, false, 1.387f, 0.278f)
                lineToRelative(3.027f, -2.018f)
                lineToRelative(0.087f, -0.07f)
                lineToRelative(0.074f, -0.075f)
                lineToRelative(0.075f, -0.094f)
                lineToRelative(0.052f, -0.08f)
                lineToRelative(0.035f, -0.07f)
                lineToRelative(0.051f, -0.132f)
                lineToRelative(0.031f, -0.135f)
                lineToRelative(0.01f, -0.082f)
                lineToRelative(0.003f, -0.076f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _ClockHour8!!
    }

private var _ClockHour8: ImageVector? = null

