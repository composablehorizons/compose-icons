package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CalendarDate: ImageVector
    get() {
        if (_CalendarDate != null) return _CalendarDate!!
        
        _CalendarDate = ImageVector.Builder(
            name = "calendar-date",
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
                moveToRelative(5.402f, 9.746f)
                curveToRelative(0.625f, 0f, 1.184f, -0.484f, 1.184f, -1.18f)
                curveToRelative(0f, -0.832f, -0.527f, -1.23f, -1.16f, -1.23f)
                curveToRelative(-0.586f, 0f, -1.168f, 0.387f, -1.168f, 1.21f)
                curveToRelative(0f, 0.817f, 0.543f, 1.2f, 1.144f, 1.2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveToRelative(-6.664f, -1.21f)
                curveToRelative(-1.11f, 0f, -1.656f, -0.767f, -1.703f, -1.407f)
                horizontalLineToRelative(0.683f)
                curveToRelative(0.043f, 0.37f, 0.387f, 0.82f, 1.051f, 0.82f)
                curveToRelative(0.844f, 0f, 1.301f, -0.848f, 1.305f, -2.164f)
                horizontalLineToRelative(-0.027f)
                curveToRelative(-0.153f, 0.414f, -0.637f, 0.79f, -1.383f, 0.79f)
                curveToRelative(-0.852f, 0f, -1.676f, -0.61f, -1.676f, -1.77f)
                curveToRelative(0f, -1.137f, 0.871f, -1.809f, 1.797f, -1.809f)
                curveToRelative(1.172f, 0f, 1.953f, 0.734f, 1.953f, 2.668f)
                curveToRelative(0f, 1.805f, -0.742f, 2.871f, -2f, 2.871f)
                close()
                moveToRelative(-2.89f, -5.435f)
                verticalLineToRelative(5.332f)
                horizontalLineTo(5.77f)
                verticalLineTo(8.079f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.29f, 0.156f, -0.883f, 0.52f, -1.258f, 0.777f)
                verticalLineTo(8.16f)
                arcToRelative(13f, 13f, 0f, false, true, 1.313f, -0.805f)
                horizontalLineToRelative(0.632f)
                close()
            }
        }.build()
        
        return _CalendarDate!!
    }

private var _CalendarDate: ImageVector? = null

