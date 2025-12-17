package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Linked_camera: ImageVector
    get() {
        if (_Linked_camera != null) return _Linked_camera!!
        
        _Linked_camera = ImageVector.Builder(
            name = "linked_camera",
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
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(14.5f, 13f)
                                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 15.5f)
                                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 13f)
                                arcTo(2.5f, 2.5f, 0f, false, true, 14.5f, 13f)
                                close()
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFF000000))
                                ) {
                                    moveTo(16.6f, 2.37f)
                                    curveToRelative(2.1f, 0.27f, 3.77f, 1.93f, 4.03f, 4.03f)
                                    curveTo(20.67f, 6.74f, 20.95f, 7f, 21.29f, 7f)
                                    lineToRelative(0f, 0f)
                                    curveToRelative(0.39f, 0f, 0.71f, -0.34f, 0.66f, -0.73f)
                                    curveToRelative(-0.33f, -2.72f, -2.5f, -4.89f, -5.22f, -5.22f)
                                    curveTo(16.34f, 1f, 16f, 1.32f, 16f, 1.71f)
                                    lineToRelative(0f, 0f)
                                    curveTo(16f, 2.05f, 16.26f, 2.33f, 16.6f, 2.37f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF000000))
                                ) {
                                    moveTo(19.23f, 6.19f)
                                    curveTo(18.93f, 5f, 18f, 4.07f, 16.81f, 3.77f)
                                    curveTo(16.4f, 3.67f, 16f, 3.99f, 16f, 4.42f)
                                    lineToRelative(0f, 0f)
                                    curveToRelative(0f, 0.29f, 0.19f, 0.57f, 0.48f, 0.64f)
                                    curveToRelative(0.72f, 0.18f, 1.29f, 0.74f, 1.46f, 1.46f)
                                    curveTo(18.01f, 6.81f, 18.28f, 7f, 18.58f, 7f)
                                    lineToRelative(0f, 0f)
                                    curveTo(19.01f, 7f, 19.33f, 6.6f, 19.23f, 6.19f)
                                    close()
                                }
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(17f, 8f)
                                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                                verticalLineTo(4f)
                                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                                horizontalLineTo(9.88f)
                                curveTo(9.32f, 3f, 8.78f, 3.24f, 8.4f, 3.65f)
                                lineTo(7.17f, 5f)
                                horizontalLineTo(4f)
                                curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                                verticalLineToRelative(12f)
                                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                                horizontalLineToRelative(16f)
                                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                                verticalLineToRelative(-9f)
                                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                                horizontalLineTo(17f)
                                close()
                                moveTo(12f, 17.5f)
                                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                                reflectiveCurveTo(9.52f, 8.5f, 12f, 8.5f)
                                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                                reflectiveCurveTo(14.48f, 17.5f, 12f, 17.5f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Linked_camera!!
    }

private var _Linked_camera: ImageVector? = null

