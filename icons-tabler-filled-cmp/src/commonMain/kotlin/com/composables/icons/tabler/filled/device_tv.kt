package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceTv: ImageVector
    get() {
        if (_DeviceTv != null) return _DeviceTv!!
        
        _DeviceTv = ImageVector.Builder(
            name = "device-tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.707f, 2.293f)
                lineToRelative(3.293f, 3.292f)
                lineToRelative(3.293f, -3.292f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-2.293f, 2.293f)
                horizontalLineToRelative(4.586f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(4.585f)
                lineToRelative(-2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
            }
        }.build()
        
        return _DeviceTv!!
    }

private var _DeviceTv: ImageVector? = null

