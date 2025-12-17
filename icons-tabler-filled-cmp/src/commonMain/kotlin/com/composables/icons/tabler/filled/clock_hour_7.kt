package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClockHour7: ImageVector
    get() {
        if (_ClockHour7 != null) return _ClockHour7!!
        
        _ClockHour7 = ImageVector.Builder(
            name = "clock-hour-7",
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
                moveToRelative(-4.007f, 8.777f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                verticalLineToRelative(4.696f)
                lineToRelative(-1.832f, 2.75f)
                arcToRelative(1f, 1f, 0f, false, false, 0.184f, 1.316f)
                lineToRelative(0.093f, 0.07f)
                arcToRelative(1f, 1f, 0f, false, false, 1.387f, -0.277f)
                lineToRelative(2.024f, -3.038f)
                lineToRelative(0.06f, -0.116f)
                lineToRelative(0.032f, -0.081f)
                lineToRelative(0.03f, -0.109f)
                close()
            }
        }.build()
        
        return _ClockHour7!!
    }

private var _ClockHour7: ImageVector? = null

