package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BatteryFull: ImageVector
    get() {
        if (_BatteryFull != null) return _BatteryFull!!
        
        _BatteryFull = ImageVector.Builder(
            name = "battery-full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(10f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(4f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 8f)
            }
        }.build()
        
        return _BatteryFull!!
    }

private var _BatteryFull: ImageVector? = null

