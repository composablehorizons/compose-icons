package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CalendarMonth: ImageVector
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
                moveToRelative(0.104f, 7.305f)
                lineTo(4.9f, 10.18f)
                horizontalLineTo(3.284f)
                lineToRelative(0.8f, -2.375f)
                close()
                moveToRelative(9.074f, 2.297f)
                curveToRelative(0f, -0.832f, -0.414f, -1.36f, -1.062f, -1.36f)
                curveToRelative(-0.692f, 0f, -1.098f, 0.492f, -1.098f, 1.36f)
                verticalLineToRelative(0.253f)
                curveToRelative(0f, 0.852f, 0.406f, 1.364f, 1.098f, 1.364f)
                curveToRelative(0.671f, 0f, 1.062f, -0.516f, 1.062f, -1.364f)
                close()
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
                moveTo(2.56f, 12.332f)
                horizontalLineToRelative(-0.71f)
                lineTo(3.748f, 7f)
                horizontalLineToRelative(0.696f)
                lineToRelative(1.898f, 5.332f)
                horizontalLineToRelative(-0.719f)
                lineToRelative(-0.539f, -1.602f)
                horizontalLineTo(3.1f)
                close()
                moveToRelative(7.29f, -4.105f)
                verticalLineToRelative(4.105f)
                horizontalLineToRelative(-0.668f)
                verticalLineToRelative(-0.539f)
                horizontalLineToRelative(-0.027f)
                curveToRelative(-0.145f, 0.324f, -0.532f, 0.605f, -1.188f, 0.605f)
                curveToRelative(-0.847f, 0f, -1.453f, -0.484f, -1.453f, -1.425f)
                verticalLineTo(8.227f)
                horizontalLineToRelative(0.676f)
                verticalLineToRelative(2.554f)
                curveToRelative(0f, 0.766f, 0.441f, 1.012f, 0.98f, 1.012f)
                curveToRelative(0.59f, 0f, 1.004f, -0.371f, 1.004f, -1.023f)
                verticalLineTo(8.227f)
                close()
                moveToRelative(1.273f, 4.41f)
                curveToRelative(0.075f, 0.332f, 0.422f, 0.636f, 0.985f, 0.636f)
                curveToRelative(0.648f, 0f, 1.07f, -0.378f, 1.07f, -1.023f)
                verticalLineToRelative(-0.605f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.163f, 0.355f, -0.613f, 0.648f, -1.171f, 0.648f)
                curveToRelative(-0.957f, 0f, -1.64f, -0.672f, -1.64f, -1.902f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -1.207f, 0.675f, -1.887f, 1.64f, -1.887f)
                curveToRelative(0.558f, 0f, 1.004f, 0.293f, 1.195f, 0.64f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(-0.577f)
                horizontalLineToRelative(0.648f)
                verticalLineToRelative(4.03f)
                curveToRelative(0f, 1.052f, -0.816f, 1.579f, -1.746f, 1.579f)
                curveToRelative(-1.043f, 0f, -1.574f, -0.516f, -1.668f, -1.2f)
                close()
            }
        }.build()
        
        return _CalendarMonth!!
    }

private var _CalendarMonth: ImageVector? = null

