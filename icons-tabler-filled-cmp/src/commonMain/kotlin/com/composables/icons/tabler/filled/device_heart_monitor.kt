package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceHeartMonitor: ImageVector
    get() {
        if (_DeviceHeartMonitor != null) return _DeviceHeartMonitor!!
        
        _DeviceHeartMonitor = ImageVector.Builder(
            name = "device-heart-monitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-4f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(-6f, -6.764f)
                lineToRelative(-0.106f, 0.211f)
                arcToRelative(1f, 1f, 0f, false, true, -0.77f, 0.545f)
                lineToRelative(-0.124f, 0.008f)
                lineToRelative(-5f, -0.001f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3.001f)
                lineToRelative(-4.382f, 0.001f)
                lineToRelative(-0.724f, 1.447f)
                arcToRelative(1f, 1f, 0f, false, true, -1.725f, 0.11f)
                lineToRelative(-0.063f, -0.11f)
                lineToRelative(-1.106f, -2.211f)
                close()
                moveToRelative(7f, -4.236f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(1.999f)
                lineToRelative(4.381f, 0.001f)
                lineToRelative(0.725f, -1.447f)
                arcToRelative(1f, 1f, 0f, false, true, 1.725f, -0.11f)
                lineToRelative(0.063f, 0.11f)
                lineToRelative(1.106f, 2.21f)
                lineToRelative(0.106f, -0.21f)
                arcToRelative(1f, 1f, 0f, false, true, 0.77f, -0.545f)
                lineToRelative(0.124f, -0.008f)
                lineToRelative(5f, -0.001f)
                verticalLineToRelative(-1.999f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()
        
        return _DeviceHeartMonitor!!
    }

private var _DeviceHeartMonitor: ImageVector? = null

