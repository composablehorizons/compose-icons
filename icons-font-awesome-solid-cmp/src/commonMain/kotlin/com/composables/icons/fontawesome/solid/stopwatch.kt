package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Stopwatch: ImageVector
    get() {
        if (_Stopwatch != null) return _Stopwatch!!
        
        _Stopwatch = ImageVector.Builder(
            name = "stopwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 304f)
                curveToRelative(0f, 114.9f, -93.1f, 208f, -208f, 208f)
                reflectiveCurveTo(16f, 418.9f, 16f, 304f)
                curveToRelative(0f, -104f, 76.3f, -190.2f, 176f, -205.5f)
                verticalLineTo(64f)
                horizontalLineToRelative(-28f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(120f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-28f)
                verticalLineToRelative(34.5f)
                curveToRelative(37.5f, 5.8f, 71.7f, 21.6f, 99.7f, 44.6f)
                lineToRelative(27.5f, -27.5f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0f, 17f)
                lineToRelative(-29.4f, 29.4f)
                lineToRelative(-0.6f, 0.6f)
                curveTo(419.7f, 223.3f, 432f, 262.2f, 432f, 304f)
                close()
                moveToRelative(-176f, 36f)
                verticalLineTo(188.5f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineTo(340f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                close()
            }
        }.build()
        
        return _Stopwatch!!
    }

private var _Stopwatch: ImageVector? = null

