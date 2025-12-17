package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Car_repair: ImageVector
    get() {
        if (_Car_repair != null) return _Car_repair!!
        
        _Car_repair = ImageVector.Builder(
            name = "car_repair",
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
                    moveTo(4f, 17.01f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-1.99f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(7f, 14f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(8.69f)
                    lineTo(17.11f, 3f)
                    horizontalLineTo(6.89f)
                    lineTo(5f, 8.69f)
                    verticalLineTo(16f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(9f, 11.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(9.55f, 11.5f, 9f, 11.5f)
                    close()
                    moveTo(15f, 11.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(15.55f, 11.5f, 15f, 11.5f)
                    close()
                    moveTo(8.33f, 5f)
                    horizontalLineToRelative(7.34f)
                    lineToRelative(0.66f, 2f)
                    horizontalLineTo(7.67f)
                    lineTo(8.33f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Car_repair!!
    }

private var _Car_repair: ImageVector? = null

