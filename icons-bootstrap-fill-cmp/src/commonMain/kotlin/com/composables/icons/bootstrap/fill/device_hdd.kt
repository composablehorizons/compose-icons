package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.DeviceHdd: ImageVector
    get() {
        if (_DeviceHdd != null) return _DeviceHdd!!
        
        _DeviceHdd = ImageVector.Builder(
            name = "device-hdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.785f, 9.896f)
                arcTo(3.001f, 3.001f, 0f, false, false, 8f, 4f)
                arcToRelative(3f, 3f, 0f, false, false, -0.891f, 5.865f)
                curveToRelative(0.667f, -0.44f, 1.396f, -0.91f, 1.955f, -1.268f)
                curveToRelative(0.224f, -0.144f, 0.483f, 0.115f, 0.34f, 0.34f)
                close()
                moveTo(9f, 7f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(9f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-9.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveTo(4f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(2.882f, 11.177f)
                arcToRelative(1.102f, 1.102f, 0f, false, true, -1.56f, -1.559f)
                curveToRelative(0.1f, -0.098f, 0.396f, -0.314f, 0.795f, -0.588f)
                arcToRelative(4f, 4f, 0f, true, true, 1.946f, 0.47f)
                curveToRelative(-0.537f, 0.813f, -1.02f, 1.515f, -1.181f, 1.677f)
            }
        }.build()
        
        return _DeviceHdd!!
    }

private var _DeviceHdd: ImageVector? = null

