package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChartBar: ImageVector
    get() {
        if (_ChartBar != null) return _ChartBar!!
        
        _ChartBar = ImageVector.Builder(
            name = "chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(332.8f, 320f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineTo(172.8f)
                curveToRelative(0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(134.4f)
                curveToRelative(0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveToRelative(96f, 0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineTo(76.8f)
                curveToRelative(0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(230.4f)
                curveToRelative(0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveToRelative(-288f, 0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineToRelative(-70.4f)
                curveToRelative(0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(70.4f)
                curveToRelative(0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveToRelative(96f, 0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineTo(108.8f)
                curveToRelative(0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(198.4f)
                curveToRelative(0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
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
            }
        }.build()
        
        return _ChartBar!!
    }

private var _ChartBar: ImageVector? = null

