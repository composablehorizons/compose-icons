package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_bus_filled: ImageVector
    get() {
        if (_Directions_bus_filled != null) return _Directions_bus_filled!!
        
        _Directions_bus_filled = ImageVector.Builder(
            name = "directions_bus_filled",
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
                    curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.44f)
                    verticalLineToRelative(1.56f)
                    curveTo(5f, 20.33f, 5.67f, 21f, 6.5f, 21f)
                    horizontalLineToRelative(0f)
                    curveTo(7.33f, 21f, 8f, 20.33f, 8f, 19.5f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(0.5f)
                    curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineToRelative(-1.56f)
                    curveToRelative(0.62f, -0.63f, 1f, -1.49f, 1f, -2.44f)
                    verticalLineTo(6f)
                    curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                    close()
                    moveTo(8.5f, 16f)
                    curveTo(7.67f, 16f, 7f, 15.33f, 7f, 14.5f)
                    reflectiveCurveTo(7.67f, 13f, 8.5f, 13f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(9.33f, 16f, 8.5f, 16f)
                    close()
                    moveTo(15.5f, 16f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(16.33f, 16f, 15.5f, 16f)
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
        
        return _Directions_bus_filled!!
    }

private var _Directions_bus_filled: ImageVector? = null

