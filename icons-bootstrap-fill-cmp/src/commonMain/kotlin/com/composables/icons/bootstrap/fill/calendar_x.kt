package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CalendarX: ImageVector
    get() {
        if (_CalendarX != null) return _CalendarX!!
        
        _CalendarX = ImageVector.Builder(
            name = "calendar-x",
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
                moveTo(16f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(6.854f, 8.146f)
                lineTo(8f, 9.293f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(8.707f, 10f)
                lineToRelative(1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 10.707f)
                lineToRelative(-1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(7.293f, 10f)
                lineTo(6.146f, 8.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
            }
        }.build()
        
        return _CalendarX!!
    }

private var _CalendarX: ImageVector? = null

