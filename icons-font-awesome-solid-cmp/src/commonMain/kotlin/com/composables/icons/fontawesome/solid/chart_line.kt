package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChartLine: ImageVector
    get() {
        if (_ChartLine != null) return _ChartLine!!
        
        _ChartLine = ImageVector.Builder(
            name = "chart-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 384f)
                horizontalLineTo(64f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.16f, 64f, 0f, 71.16f, 0f, 80f)
                verticalLineToRelative(336f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(464f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(464f, 96f)
                horizontalLineTo(345.94f)
                curveToRelative(-21.38f, 0f, -32.09f, 25.85f, -16.97f, 40.97f)
                lineToRelative(32.4f, 32.4f)
                lineTo(288f, 242.75f)
                lineToRelative(-73.37f, -73.37f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0f)
                lineToRelative(-68.69f, 68.69f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineTo(192f, 237.25f)
                lineToRelative(73.37f, 73.37f)
                curveToRelative(12.5f, 12.5f, 32.76f, 12.5f, 45.25f, 0f)
                lineToRelative(96f, -96f)
                lineToRelative(32.4f, 32.4f)
                curveToRelative(15.12f, 15.12f, 40.97f, 4.41f, 40.97f, -16.97f)
                verticalLineTo(112f)
                curveToRelative(0.01f, -8.84f, -7.15f, -16f, -15.99f, -16f)
                close()
            }
        }.build()
        
        return _ChartLine!!
    }

private var _ChartLine: ImageVector? = null

