package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BatteryVertical: ImageVector
    get() {
        if (_BatteryVertical != null) return _BatteryVertical!!
        
        _BatteryVertical = ImageVector.Builder(
            name = "battery-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.395f, 0.948f)
                lineToRelative(0.018f, 0.052f)
                horizontalLineToRelative(0.087f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(11f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-11f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(0.086f)
                lineToRelative(0.019f, -0.052f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.25f, -0.941f)
                lineToRelative(0.145f, -0.007f)
                close()
            }
        }.build()
        
        return _BatteryVertical!!
    }

private var _BatteryVertical: ImageVector? = null

