package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DeviceHdd: ImageVector
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
                moveTo(12f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-7.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveTo(5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveTo(8f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                arcToRelative(4f, 4f, 0f, false, true, -3.937f, 4f)
                curveToRelative(-0.537f, 0.813f, -1.02f, 1.515f, -1.181f, 1.677f)
                arcToRelative(1.102f, 1.102f, 0f, false, true, -1.56f, -1.559f)
                curveToRelative(0.1f, -0.098f, 0.396f, -0.314f, 0.795f, -0.588f)
                arcTo(4f, 4f, 0f, false, true, 8f, 3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                moveToRelative(-1f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -3.891f, 2.865f)
                curveToRelative(0.667f, -0.44f, 1.396f, -0.91f, 1.955f, -1.268f)
                curveToRelative(0.224f, -0.144f, 0.483f, 0.115f, 0.34f, 0.34f)
                lineToRelative(-0.62f, 0.96f)
                arcTo(3f, 3f, 0f, false, false, 11f, 7f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _DeviceHdd!!
    }

private var _DeviceHdd: ImageVector? = null

