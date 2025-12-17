package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_transit_filled: ImageVector
    get() {
        if (_Directions_transit_filled != null) return _Directions_transit_filled!!
        
        _Directions_transit_filled = ImageVector.Builder(
            name = "directions_transit_filled",
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
                    moveTo(12f, 2f)
                    curveTo(8f, 2f, 4f, 2.5f, 4f, 6f)
                    verticalLineToRelative(9.5f)
                    curveTo(4f, 17.43f, 5.57f, 19f, 7.5f, 19f)
                    lineToRelative(-1.21f, 0.81f)
                    curveTo(6.11f, 19.93f, 6f, 20.13f, 6f, 20.35f)
                    verticalLineToRelative(0f)
                    curveTo(6f, 20.71f, 6.29f, 21f, 6.65f, 21f)
                    horizontalLineToRelative(10.7f)
                    curveToRelative(0.36f, 0f, 0.65f, -0.29f, 0.65f, -0.65f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f)
                    lineTo(16.5f, 19f)
                    curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                    verticalLineTo(6f)
                    curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                    close()
                    moveTo(8.5f, 16f)
                    curveTo(7.67f, 16f, 7f, 15.33f, 7f, 14.5f)
                    reflectiveCurveTo(7.67f, 13f, 8.5f, 13f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(9.33f, 16f, 8.5f, 16f)
                    close()
                    moveTo(11f, 10f)
                    horizontalLineTo(6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(10f)
                    close()
                    moveTo(15.5f, 16f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(16.33f, 16f, 15.5f, 16f)
                    close()
                    moveTo(18f, 10f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Directions_transit_filled!!
    }

private var _Directions_transit_filled: ImageVector? = null

