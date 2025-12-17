package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CalendarMonth: ImageVector
    get() {
        if (_CalendarMonth != null) return _CalendarMonth!!
        
        _CalendarMonth = ImageVector.Builder(
            name = "calendar-month",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.56f, 11.332f)
                lineTo(3.1f, 9.73f)
                horizontalLineToRelative(1.984f)
                lineToRelative(0.54f, 1.602f)
                horizontalLineToRelative(0.718f)
                lineTo(4.444f, 6f)
                horizontalLineToRelative(-0.696f)
                lineTo(1.85f, 11.332f)
                close()
                moveToRelative(1.544f, -4.527f)
                lineTo(4.9f, 9.18f)
                horizontalLineTo(3.284f)
                lineToRelative(0.8f, -2.375f)
                close()
                moveToRelative(5.746f, 0.422f)
                horizontalLineToRelative(-0.676f)
                verticalLineTo(9.77f)
                curveToRelative(0f, 0.652f, -0.414f, 1.023f, -1.004f, 1.023f)
                curveToRelative(-0.539f, 0f, -0.98f, -0.246f, -0.98f, -1.012f)
                verticalLineTo(7.227f)
                horizontalLineToRelative(-0.676f)
                verticalLineToRelative(2.746f)
                curveToRelative(0f, 0.941f, 0.606f, 1.425f, 1.453f, 1.425f)
                curveToRelative(0.656f, 0f, 1.043f, -0.28f, 1.188f, -0.605f)
                horizontalLineToRelative(0.027f)
                verticalLineToRelative(0.539f)
                horizontalLineToRelative(0.668f)
                close()
                moveToRelative(2.258f, 5.046f)
                curveToRelative(-0.563f, 0f, -0.91f, -0.304f, -0.985f, -0.636f)
                horizontalLineToRelative(-0.687f)
                curveToRelative(0.094f, 0.683f, 0.625f, 1.199f, 1.668f, 1.199f)
                curveToRelative(0.93f, 0f, 1.746f, -0.527f, 1.746f, -1.578f)
                verticalLineTo(7.227f)
                horizontalLineToRelative(-0.649f)
                verticalLineToRelative(0.578f)
                horizontalLineToRelative(-0.019f)
                curveToRelative(-0.191f, -0.348f, -0.637f, -0.64f, -1.195f, -0.64f)
                curveToRelative(-0.965f, 0f, -1.64f, 0.679f, -1.64f, 1.886f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.23f, 0.683f, 1.902f, 1.64f, 1.902f)
                curveToRelative(0.558f, 0f, 1.008f, -0.293f, 1.172f, -0.648f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(0.605f)
                curveToRelative(0f, 0.645f, -0.423f, 1.023f, -1.071f, 1.023f)
                moveToRelative(0.008f, -4.53f)
                curveToRelative(0.648f, 0f, 1.062f, 0.527f, 1.062f, 1.359f)
                verticalLineToRelative(0.253f)
                curveToRelative(0f, 0.848f, -0.39f, 1.364f, -1.062f, 1.364f)
                curveToRelative(-0.692f, 0f, -1.098f, -0.512f, -1.098f, -1.364f)
                verticalLineToRelative(-0.253f)
                curveToRelative(0f, -0.868f, 0.406f, -1.36f, 1.098f, -1.36f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(8f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(1f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _CalendarMonth!!
    }

private var _CalendarMonth: ImageVector? = null

