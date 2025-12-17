package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CalendarDay: ImageVector
    get() {
        if (_CalendarDay != null) return _CalendarDay!!
        
        _CalendarDay = ImageVector.Builder(
            name = "calendar-day",
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
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(-4.785f, -6.145f)
                arcToRelative(0.428f, 0.428f, 0f, true, false, 0f, -0.855f)
                arcToRelative(0.426f, 0.426f, 0f, false, false, -0.43f, 0.43f)
                curveToRelative(0f, 0.238f, 0.192f, 0.425f, 0.43f, 0.425f)
                moveToRelative(0.336f, 0.563f)
                horizontalLineToRelative(-0.672f)
                verticalLineToRelative(4.105f)
                horizontalLineToRelative(0.672f)
                close()
                moveToRelative(-6.867f, 4.105f)
                verticalLineToRelative(-2.3f)
                horizontalLineToRelative(2.261f)
                verticalLineToRelative(-0.61f)
                horizontalLineTo(4.684f)
                verticalLineTo(7.801f)
                horizontalLineToRelative(2.464f)
                verticalLineToRelative(-0.61f)
                horizontalLineTo(4f)
                verticalLineToRelative(5.332f)
                close()
                moveToRelative(3.296f, 0f)
                horizontalLineToRelative(0.676f)
                verticalLineTo(9.98f)
                curveToRelative(0f, -0.554f, 0.227f, -1.007f, 0.953f, -1.007f)
                curveToRelative(0.125f, 0f, 0.258f, 0.004f, 0.329f, 0.015f)
                verticalLineToRelative(-0.613f)
                arcToRelative(2f, 2f, 0f, false, false, -0.254f, -0.02f)
                curveToRelative(-0.582f, 0f, -0.891f, 0.32f, -1.012f, 0.567f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(-0.504f)
                horizontalLineTo(7.98f)
                close()
            }
        }.build()
        
        return _CalendarDay!!
    }

private var _CalendarDay: ImageVector? = null

