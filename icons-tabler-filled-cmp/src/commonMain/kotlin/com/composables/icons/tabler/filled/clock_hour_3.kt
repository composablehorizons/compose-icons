package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour3: ImageVector
    get() {
        if (_ClockHour3 != null) return _ClockHour3!!
        
        _ClockHour3 = ImageVector.Builder(
            name = "clock-hour-3",
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
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                close()
            }
        }.build()
        
        return _ClockHour3!!
    }

private var _ClockHour3: ImageVector? = null

