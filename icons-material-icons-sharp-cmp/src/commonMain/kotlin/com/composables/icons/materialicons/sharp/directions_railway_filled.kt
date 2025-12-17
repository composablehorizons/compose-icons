package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions_railway_filled: ImageVector
    get() {
        if (_Directions_railway_filled != null) return _Directions_railway_filled!!
        
        _Directions_railway_filled = ImageVector.Builder(
            name = "directions_railway_filled",
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
                    lineTo(6f, 20f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-1f)
                    lineToRelative(-1.5f, -1f)
                    curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                    verticalLineTo(6f)
                    curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(11.17f, 13f, 12f, 13f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(12.83f, 16f, 12f, 16f)
                    close()
                    moveTo(18f, 10f)
                    horizontalLineTo(6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Directions_railway_filled!!
    }

private var _Directions_railway_filled: ImageVector? = null

