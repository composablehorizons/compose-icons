package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.DeviceSsd: ImageVector
    get() {
        if (_DeviceSsd != null) return _DeviceSsd!!
        
        _DeviceSsd = ImageVector.Builder(
            name = "device-ssd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8f)
                verticalLineTo(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                close()
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
                moveToRelative(0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(9f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveTo(3.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(9.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveTo(4.75f, 3f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4f, 8.25f)
                verticalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4.75f, 3f)
                moveTo(5f, 12f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _DeviceSsd!!
    }

private var _DeviceSsd: ImageVector? = null

