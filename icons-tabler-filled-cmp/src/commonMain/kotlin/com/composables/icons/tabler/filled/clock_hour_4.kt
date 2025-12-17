package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour4: ImageVector
    get() {
        if (_ClockHour4 != null) return _ClockHour4!!
        
        _ClockHour4 = ImageVector.Builder(
            name = "clock-hour-4",
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
                lineToRelative(3f, 2f)
                arcToRelative(1f, 1f, 0f, true, false, 1.11f, -1.664f)
                lineToRelative(-2.555f, -1.704f)
                verticalLineToRelative(-4.464f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                close()
            }
        }.build()
        
        return _ClockHour4!!
    }

private var _ClockHour4: ImageVector? = null

