package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Car_repair: ImageVector
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(10f, 10.5f)
                            arcTo(1f, 1f, 0f, false, true, 9f, 11.5f)
                            arcTo(1f, 1f, 0f, false, true, 8f, 10.5f)
                            arcTo(1f, 1f, 0f, false, true, 10f, 10.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16f, 10.5f)
                            arcTo(1f, 1f, 0f, false, true, 15f, 11.5f)
                            arcTo(1f, 1f, 0f, false, true, 14f, 10.5f)
                            arcTo(1f, 1f, 0f, false, true, 16f, 10.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(5.78f, 16f)
                            horizontalLineToRelative(0.44f)
                            curveTo(6.65f, 16f, 7f, 15.64f, 7f, 15.19f)
                            verticalLineTo(14f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1.19f)
                            curveToRelative(0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f)
                            horizontalLineToRelative(0.44f)
                            curveToRelative(0.43f, 0f, 0.78f, -0.36f, 0.78f, -0.81f)
                            verticalLineToRelative(-6.5f)
                            curveToRelative(0f, 0f, -1.34f, -4.03f, -1.56f, -4.69f)
                            curveToRelative(-0.05f, -0.16f, -0.12f, -0.29f, -0.19f, -0.4f)
                            curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f)
                            curveTo(16.82f, 3.01f, 16.28f, 3f, 16.28f, 3f)
                            horizontalLineTo(7.72f)
                            curveToRelative(0f, 0f, -0.54f, 0.01f, -0.92f, 0.54f)
                            curveTo(6.78f, 3.56f, 6.77f, 3.58f, 6.75f, 3.6f)
                            curveTo(6.68f, 3.71f, 6.61f, 3.84f, 6.56f, 4f)
                            curveTo(6.34f, 4.66f, 5f, 8.69f, 5f, 8.69f)
                            verticalLineToRelative(6.5f)
                            curveTo(5f, 15.64f, 5.35f, 16f, 5.78f, 16f)
                            close()
                            moveTo(8.33f, 5f)
                            horizontalLineToRelative(7.34f)
                            lineToRelative(0.23f, 0.69f)
                            lineTo(16.33f, 7f)
                            horizontalLineTo(7.67f)
                            lineTo(8.33f, 5f)
                            close()
                            moveTo(7f, 9.01f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(0.01f)
                            verticalLineTo(12f)
                            horizontalLineTo(7f)
                            verticalLineTo(9.01f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4f, 17.01f)
                            lineTo(4f, 19f)
                            lineTo(11f, 19f)
                            lineTo(11f, 22f)
                            lineTo(13f, 22f)
                            lineTo(13f, 19f)
                            lineTo(20f, 19f)
                            lineTo(20f, 17.01f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Car_repair!!
    }

private var _Car_repair: ImageVector? = null

