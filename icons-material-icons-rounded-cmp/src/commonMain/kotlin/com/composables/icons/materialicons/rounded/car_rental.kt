package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Car_rental: ImageVector
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
                    moveTo(8f, 7f)
                    curveToRelative(1.3f, 0f, 2.41f, -0.84f, 2.83f, -2f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-7.17f)
                    curveTo(10.35f, 1.65f, 8.95f, 0.76f, 7.4f, 1.06f)
                    curveTo(6.23f, 1.29f, 5.28f, 2.25f, 5.05f, 3.42f)
                    curveTo(4.7f, 5.32f, 6.15f, 7f, 8f, 7f)
                    close()
                    moveTo(8f, 3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(8.55f, 5f, 8f, 5f)
                    reflectiveCurveTo(7f, 4.55f, 7f, 4f)
                    reflectiveCurveTo(7.45f, 3f, 8f, 3f)
                    close()
                    moveTo(16.39f, 9f)
                    horizontalLineTo(7.61f)
                    curveTo(7.18f, 9f, 6.8f, 9.28f, 6.66f, 9.68f)
                    lineTo(5f, 14.69f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-6.31f)
                    lineToRelative(-1.66f, -5.01f)
                    curveTo(17.2f, 9.28f, 16.82f, 9f, 16.39f, 9f)
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

