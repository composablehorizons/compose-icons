package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceRemote: ImageVector
    get() {
        if (_DeviceRemote != null) return _DeviceRemote!!
        
        _DeviceRemote = ImageVector.Builder(
            name = "device-remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-5f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                moveToRelative(-4f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                moveToRelative(-2f, -7f)
                arcToRelative(3f, 3f, 0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, -3f)
            }
        }.build()
        
        return _DeviceRemote!!
    }

private var _DeviceRemote: ImageVector? = null

