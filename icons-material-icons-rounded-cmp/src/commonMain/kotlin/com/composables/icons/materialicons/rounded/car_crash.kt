package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Car_crash: ImageVector
    get() {
        if (_Car_crash != null) return _Car_crash!!
        
        _Car_crash = ImageVector.Builder(
            name = "car_crash",
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
                        moveTo(18f, 1f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(20.76f, 1f, 18f, 1f)
                        close()
                        moveTo(18f, 7f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-3f)
                        curveTo(17.5f, 3.22f, 17.72f, 3f, 18f, 3f)
                        reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(18.5f, 6.78f, 18.28f, 7f, 18f, 7f)
                        close()
                        moveTo(18.5f, 8.5f)
                        curveTo(18.5f, 8.78f, 18.28f, 9f, 18f, 9f)
                        reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                        reflectiveCurveTo(17.72f, 8f, 18f, 8f)
                        reflectiveCurveTo(18.5f, 8.22f, 18.5f, 8.5f)
                        close()
                        moveTo(19.5f, 20f)
                        curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineToRelative(-6.18f)
                        curveToRelative(-1.05f, 0.51f, -2.16f, 0.69f, -3.09f, 0.68f)
                        curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        reflectiveCurveTo(15f, 14.33f, 15f, 13.5f)
                        curveToRelative(0f, -0.39f, 0.15f, -0.74f, 0.39f, -1.01f)
                        curveToRelative(-1.63f, -0.66f, -2.96f, -1.91f, -3.71f, -3.49f)
                        horizontalLineTo(5.81f)
                        lineToRelative(1.04f, -3f)
                        horizontalLineTo(11f)
                        curveToRelative(0f, -0.69f, 0.1f, -1.37f, 0.29f, -2f)
                        horizontalLineTo(6.5f)
                        curveTo(5.84f, 4f, 5.29f, 4.42f, 5.08f, 5.01f)
                        lineToRelative(-1.97f, 5.67f)
                        curveTo(3.04f, 10.89f, 3f, 11.11f, 3f, 11.34f)
                        verticalLineToRelative(7.16f)
                        curveTo(3f, 19.33f, 3.67f, 20f, 4.5f, 20f)
                        reflectiveCurveTo(6f, 19.33f, 6f, 18.5f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(0.5f)
                        curveTo(18f, 19.33f, 18.68f, 20f, 19.5f, 20f)
                        close()
                        moveTo(7.5f, 15f)
                        curveTo(6.67f, 15f, 6f, 14.33f, 6f, 13.5f)
                        reflectiveCurveTo(6.67f, 12f, 7.5f, 12f)
                        reflectiveCurveTo(9f, 12.67f, 9f, 13.5f)
                        reflectiveCurveTo(8.33f, 15f, 7.5f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Car_crash!!
    }

private var _Car_crash: ImageVector? = null

