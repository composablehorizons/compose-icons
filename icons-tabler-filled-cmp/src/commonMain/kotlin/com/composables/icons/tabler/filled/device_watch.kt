package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceWatch: ImageVector
    get() {
        if (_DeviceWatch != null) return _DeviceWatch!!
        
        _DeviceWatch = ImageVector.Builder(
            name = "device-watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2.126f)
                curveToRelative(1.726f, 0.445f, 3f, 2.01f, 3f, 3.874f)
                verticalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, true, -3f, 3.874f)
                verticalLineToRelative(2.126f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2.126f)
                arcToRelative(4f, 4f, 0f, false, true, -3f, -3.874f)
                verticalLineToRelative(-6f)
                arcToRelative(4f, 4f, 0f, false, true, 3f, -3.874f)
                verticalLineToRelative(-2.126f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-1f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(0f, -15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _DeviceWatch!!
    }

private var _DeviceWatch: ImageVector? = null

