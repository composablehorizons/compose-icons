package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Car_rental: ImageVector
    get() {
        if (_Car_rental != null) return _Car_rental!!
        
        _Car_rental = ImageVector.Builder(
            name = "car_rental",
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
                    moveTo(10.83f, 3f)
                    curveTo(10.41f, 1.83f, 9.3f, 1f, 8f, 1f)
                    curveTo(6.34f, 1f, 5f, 2.34f, 5f, 4f)
                    curveToRelative(0f, 1.65f, 1.34f, 3f, 3f, 3f)
                    curveToRelative(1.3f, 0f, 2.41f, -0.84f, 2.83f, -2f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(3f)
                    horizontalLineTo(10.83f)
                    close()
                    moveTo(8f, 5f)
                    curveTo(7.45f, 5f, 7f, 4.55f, 7f, 4f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(8.55f, 5f, 8f, 5f)
                    close()
                    moveTo(17.11f, 9f)
                    horizontalLineTo(6.89f)
                    lineTo(5f, 14.69f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-7.31f)
                    lineTo(17.11f, 9f)
                    close()
                    moveTo(9f, 17.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(9.55f, 17.5f, 9f, 17.5f)
                    close()
                    moveTo(15f, 17.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(15.55f, 17.5f, 15f, 17.5f)
                    close()
                    moveTo(7.67f, 13f)
                    lineToRelative(0.66f, -2f)
                    horizontalLineToRelative(7.34f)
                    lineToRelative(0.66f, 2f)
                    horizontalLineTo(7.67f)
                    close()
                }
            }
        }.build()
        
        return _Car_rental!!
    }

private var _Car_rental: ImageVector? = null

