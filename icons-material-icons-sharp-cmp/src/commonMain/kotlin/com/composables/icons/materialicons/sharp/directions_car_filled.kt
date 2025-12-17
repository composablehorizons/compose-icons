package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions_car_filled: ImageVector
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
                    moveTo(18.57f, 5f)
                    horizontalLineTo(5.43f)
                    lineTo(3f, 12f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-9f)
                    lineTo(18.57f, 5f)
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

