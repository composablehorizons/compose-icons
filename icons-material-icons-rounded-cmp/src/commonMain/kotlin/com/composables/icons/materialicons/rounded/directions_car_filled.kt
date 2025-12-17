package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_car_filled: ImageVector
    get() {
        if (_Directions_car_filled != null) return _Directions_car_filled!!
        
        _Directions_car_filled = ImageVector.Builder(
            name = "directions_car_filled",
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
                    moveTo(18.92f, 6.01f)
                    curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                    horizontalLineToRelative(-11f)
                    curveTo(5.84f, 5f, 5.29f, 5.42f, 5.08f, 6.01f)
                    lineTo(3f, 12f)
                    verticalLineToRelative(7.5f)
                    curveTo(3f, 20.33f, 3.67f, 21f, 4.5f, 21f)
                    horizontalLineToRelative(0f)
                    curveTo(5.33f, 21f, 6f, 20.33f, 6f, 19.5f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(0.5f)
                    curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineTo(12f)
                    lineTo(18.92f, 6.01f)
                    close()
                    moveTo(7.5f, 16f)
                    curveTo(6.67f, 16f, 6f, 15.33f, 6f, 14.5f)
                    reflectiveCurveTo(6.67f, 13f, 7.5f, 13f)
                    reflectiveCurveTo(9f, 13.67f, 9f, 14.5f)
                    reflectiveCurveTo(8.33f, 16f, 7.5f, 16f)
                    close()
                    moveTo(16.5f, 16f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(17.33f, 16f, 16.5f, 16f)
                    close()
                    moveTo(5.81f, 10f)
                    lineToRelative(1.04f, -3f)
                    horizontalLineToRelative(10.29f)
                    lineToRelative(1.04f, 3f)
                    horizontalLineTo(5.81f)
                    close()
                }
            }
        }.build()
        
        return _Directions_car_filled!!
    }

private var _Directions_car_filled: ImageVector? = null

