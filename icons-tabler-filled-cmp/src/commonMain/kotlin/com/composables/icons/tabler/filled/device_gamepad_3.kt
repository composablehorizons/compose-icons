package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceGamepad3: ImageVector
    get() {
        if (_DeviceGamepad3 != null) return _DeviceGamepad3!!
        
        _DeviceGamepad3 = ImageVector.Builder(
            name = "device-gamepad-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.707f, 14.293f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(-6.707f, -6.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveToRelative(14f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -0.293f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, -0.293f)
                close()
                moveToRelative(-6f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, 0.707f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _DeviceGamepad3!!
    }

private var _DeviceGamepad3: ImageVector? = null

