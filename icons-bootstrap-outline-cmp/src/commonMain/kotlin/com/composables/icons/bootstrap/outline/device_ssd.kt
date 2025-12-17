package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DeviceSsd: ImageVector
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
                moveTo(4.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(5f, 8f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(0f, -5.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveTo(4.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(7f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
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
                moveToRelative(11f, 12f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveToRelative(-7.25f, 1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(1.75f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(1.75f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _DeviceSsd!!
    }

private var _DeviceSsd: ImageVector? = null

