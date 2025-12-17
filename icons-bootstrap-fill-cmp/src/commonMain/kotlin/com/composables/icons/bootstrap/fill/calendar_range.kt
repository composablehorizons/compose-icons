package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CalendarRange: ImageVector
    get() {
        if (_CalendarRange != null) return _CalendarRange!!
        
        _CalendarRange = ImageVector.Builder(
            name = "calendar-range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(16f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                close()
                moveTo(16f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
            }
        }.build()
        
        return _CalendarRange!!
    }

private var _CalendarRange: ImageVector? = null

