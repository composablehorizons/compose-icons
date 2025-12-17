package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stacked_bar_chart: ImageVector
    get() {
        if (_Stacked_bar_chart != null) return _Stacked_bar_chart!!
        
        _Stacked_bar_chart = ImageVector.Builder(
            name = "stacked_bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 10f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(8.5f)
                    curveTo(9f, 19.33f, 8.33f, 20f, 7.5f, 20f)
                    horizontalLineToRelative(0f)
                    curveTo(6.67f, 20f, 6f, 19.33f, 6f, 18.5f)
                    verticalLineTo(10f)
                    close()
                    moveTo(7.5f, 5f)
                    lineTo(7.5f, 5f)
                    curveTo(8.33f, 5f, 9f, 5.67f, 9f, 6.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(6f)
                    verticalLineTo(6.5f)
                    curveTo(6f, 5.67f, 6.67f, 5f, 7.5f, 5f)
                    close()
                    moveTo(16f, 16f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    verticalLineTo(16f)
                    close()
                    moveTo(11f, 13f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(5.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    verticalLineTo(13f)
                    close()
                    moveTo(12.5f, 9f)
                    lineTo(12.5f, 9f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineTo(12f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-1.5f)
                    curveTo(11f, 9.67f, 11.67f, 9f, 12.5f, 9f)
                    close()
                    moveTo(19f, 15f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-0.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Stacked_bar_chart!!
    }

private var _Stacked_bar_chart: ImageVector? = null

