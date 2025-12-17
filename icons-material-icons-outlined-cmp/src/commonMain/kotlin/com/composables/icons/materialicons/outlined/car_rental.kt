package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Car_rental: ImageVector
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(10f, 16.5f)
                            arcTo(1f, 1f, 0f, false, true, 9f, 17.5f)
                            arcTo(1f, 1f, 0f, false, true, 8f, 16.5f)
                            arcTo(1f, 1f, 0f, false, true, 10f, 16.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16f, 16.5f)
                            arcTo(1f, 1f, 0f, false, true, 15f, 17.5f)
                            arcTo(1f, 1f, 0f, false, true, 14f, 16.5f)
                            arcTo(1f, 1f, 0f, false, true, 16f, 16.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.25f, 9.6f)
                            curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f)
                            curveTo(16.82f, 9.01f, 16.28f, 9f, 16.28f, 9f)
                            horizontalLineTo(7.72f)
                            curveToRelative(0f, 0f, -0.54f, 0.01f, -0.92f, 0.54f)
                            curveTo(6.78f, 9.56f, 6.77f, 9.58f, 6.75f, 9.6f)
                            curveTo(6.68f, 9.71f, 6.61f, 9.84f, 6.56f, 10f)
                            curveTo(6.34f, 10.66f, 5.82f, 12.22f, 5f, 14.69f)
                            verticalLineToRelative(6.5f)
                            curveTo(5f, 21.64f, 5.35f, 22f, 5.78f, 22f)
                            horizontalLineToRelative(0.44f)
                            curveTo(6.65f, 22f, 7f, 21.64f, 7f, 21.19f)
                            verticalLineTo(20f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1.19f)
                            curveToRelative(0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f)
                            horizontalLineToRelative(0.44f)
                            curveToRelative(0.43f, 0f, 0.78f, -0.36f, 0.78f, -0.81f)
                            verticalLineToRelative(-6.5f)
                            curveToRelative(-0.82f, -2.46f, -1.34f, -4.03f, -1.56f, -4.69f)
                            curveTo(17.39f, 9.84f, 17.32f, 9.71f, 17.25f, 9.6f)
                            close()
                            moveTo(8.33f, 11f)
                            horizontalLineToRelative(7.34f)
                            lineToRelative(0.23f, 0.69f)
                            lineTo(16.33f, 13f)
                            horizontalLineTo(7.67f)
                            lineTo(8.33f, 11f)
                            close()
                            moveTo(17f, 18f)
                            horizontalLineTo(7f)
                            verticalLineToRelative(-2.99f)
                            verticalLineTo(15f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(0.01f)
                            verticalLineTo(18f)
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
            }
        }.build()
        
        return _Car_rental!!
    }

private var _Car_rental: ImageVector? = null

