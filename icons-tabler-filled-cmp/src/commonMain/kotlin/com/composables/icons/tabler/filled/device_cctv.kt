package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceCctv: ImageVector
    get() {
        if (_DeviceCctv != null) return _DeviceCctv!!
        
        _DeviceCctv = ImageVector.Builder(
            name = "device-cctv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8f)
                verticalLineToRelative(6f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(-8f, 2f)
                arcToRelative(4f, 4f, 0f, false, false, -3.996f, 3.826f)
                lineToRelative(-0.004f, 0.174f)
                arcToRelative(4f, 4f, 0f, true, false, 4f, -4f)
                moveToRelative(0.01f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(-10.01f, -8f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
        }.build()
        
        return _DeviceCctv!!
    }

private var _DeviceCctv: ImageVector? = null

