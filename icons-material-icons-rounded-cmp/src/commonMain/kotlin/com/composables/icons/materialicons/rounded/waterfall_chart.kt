package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Waterfall_chart: ImageVector
    get() {
        if (_Waterfall_chart != null) return _Waterfall_chart!!
        
        _Waterfall_chart = ImageVector.Builder(
            name = "waterfall_chart",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 4f)
                        lineTo(19.5f, 4f)
                        curveTo(20.33f, 4f, 21f, 4.67f, 21f, 5.5f)
                        verticalLineToRelative(13f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        verticalLineToRelative(-13f)
                        curveTo(18f, 4.67f, 18.67f, 4f, 19.5f, 4f)
                        close()
                        moveTo(4.5f, 13f)
                        lineTo(4.5f, 13f)
                        curveTo(5.33f, 13f, 6f, 13.67f, 6f, 14.5f)
                        verticalLineToRelative(4f)
                        curveTo(6f, 19.33f, 5.33f, 20f, 4.5f, 20f)
                        horizontalLineToRelative(0f)
                        curveTo(3.67f, 20f, 3f, 19.33f, 3f, 18.5f)
                        verticalLineToRelative(-4f)
                        curveTo(3f, 13.67f, 3.67f, 13f, 4.5f, 13f)
                        close()
                        moveTo(15.5f, 4f)
                        lineTo(15.5f, 4f)
                        curveTo(16.33f, 4f, 17f, 4.67f, 17f, 5.5f)
                        verticalLineToRelative(0f)
                        curveTo(17f, 6.33f, 16.33f, 7f, 15.5f, 7f)
                        horizontalLineToRelative(0f)
                        curveTo(14.67f, 7f, 14f, 6.33f, 14f, 5.5f)
                        verticalLineToRelative(0f)
                        curveTo(14f, 4.67f, 14.67f, 4f, 15.5f, 4f)
                        close()
                        moveTo(11.5f, 5f)
                        lineTo(11.5f, 5f)
                        curveTo(12.33f, 5f, 13f, 5.67f, 13f, 6.5f)
                        verticalLineToRelative(1f)
                        curveTo(13f, 8.33f, 12.33f, 9f, 11.5f, 9f)
                        horizontalLineToRelative(0f)
                        curveTo(10.67f, 9f, 10f, 8.33f, 10f, 7.5f)
                        verticalLineToRelative(-1f)
                        curveTo(10f, 5.67f, 10.67f, 5f, 11.5f, 5f)
                        close()
                        moveTo(8.5f, 10f)
                        lineTo(8.5f, 10f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(0f)
                        curveTo(7.67f, 14f, 7f, 13.33f, 7f, 12.5f)
                        verticalLineToRelative(-1f)
                        curveTo(7f, 10.67f, 7.67f, 10f, 8.5f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Waterfall_chart!!
    }

private var _Waterfall_chart: ImageVector? = null

