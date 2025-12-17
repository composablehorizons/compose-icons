package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Car_rental: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.39f, 9f)
                        horizontalLineTo(7.61f)
                        curveTo(7.18f, 9f, 6.8f, 9.28f, 6.66f, 9.68f)
                        lineToRelative(-1.66f, 5f)
                        verticalLineToRelative(6.81f)
                        curveTo(5f, 21.78f, 5.23f, 22f, 5.5f, 22f)
                        horizontalLineToRelative(1f)
                        curveTo(6.78f, 22f, 7f, 21.78f, 7f, 21.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(1.5f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-6.81f)
                        lineToRelative(-1.66f, -5f)
                        curveTo(17.2f, 9.28f, 16.82f, 9f, 16.39f, 9f)
                        close()
                        moveTo(7.78f, 18f)
                        curveToRelative(-0.68f, 0f, -1.22f, -0.54f, -1.22f, -1.22f)
                        reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f)
                        reflectiveCurveTo(9f, 16.11f, 9f, 16.78f)
                        reflectiveCurveTo(8.46f, 18f, 7.78f, 18f)
                        close()
                        moveTo(16.22f, 18f)
                        curveTo(15.55f, 18f, 15f, 17.46f, 15f, 16.78f)
                        reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f)
                        reflectiveCurveToRelative(1.22f, 0.54f, 1.22f, 1.22f)
                        reflectiveCurveTo(16.9f, 18f, 16.22f, 18f)
                        close()
                        moveTo(6.29f, 14f)
                        lineToRelative(1.33f, -4f)
                        horizontalLineToRelative(8.78f)
                        lineToRelative(1.33f, 4f)
                        horizontalLineTo(6.29f)
                        close()
                    }
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
                    }
                }
            }
        }.build()
        
        return _Car_rental!!
    }

private var _Car_rental: ImageVector? = null

