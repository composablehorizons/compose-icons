package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Swipe: ImageVector
    get() {
        if (_Swipe != null) return _Swipe!!
        
        _Swipe = ImageVector.Builder(
            name = "swipe",
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
                        moveTo(20.5f, 2f)
                        verticalLineToRelative(2.02f)
                        curveTo(18.18f, 2.13f, 15.22f, 1f, 12f, 1f)
                        reflectiveCurveTo(5.82f, 2.13f, 3.5f, 4.02f)
                        verticalLineTo(2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(3.5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(1.5f)
                        horizontalLineTo(7f)
                        verticalLineTo(5.5f)
                        horizontalLineTo(4.09f)
                        curveToRelative(2.11f, -1.86f, 4.88f, -3f, 7.91f, -3f)
                        reflectiveCurveToRelative(5.79f, 1.14f, 7.91f, 3f)
                        horizontalLineTo(17f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(3.5f)
                        horizontalLineTo(22f)
                        verticalLineTo(5.5f)
                        verticalLineTo(2f)
                        horizontalLineTo(20.5f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18.89f, 13.77f)
                            lineToRelative(-3.8f, -1.67f)
                            curveTo(14.96f, 12.04f, 14.81f, 12f, 14.65f, 12f)
                            horizontalLineTo(14f)
                            lineToRelative(0f, -4.37f)
                            curveToRelative(0f, -1.32f, -0.96f, -2.5f, -2.27f, -2.62f)
                            curveTo(10.25f, 4.88f, 9f, 6.05f, 9f, 7.5f)
                            verticalLineToRelative(8.15f)
                            lineToRelative(-1.87f, -0.4f)
                            curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                            lineTo(4f, 17.22f)
                            lineToRelative(5.12f, 5.19f)
                            curveTo(9.49f, 22.79f, 10f, 23f, 10.53f, 23f)
                            horizontalLineToRelative(6.55f)
                            curveToRelative(0.98f, 0f, 1.81f, -0.7f, 1.97f, -1.67f)
                            lineToRelative(0.92f, -5.44f)
                            curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f)
                            close()
                            moveTo(18f, 15.56f)
                            lineTo(17.08f, 21f)
                            horizontalLineToRelative(-6.55f)
                            lineToRelative(-3.7f, -3.78f)
                            lineTo(11f, 18.11f)
                            verticalLineTo(7.5f)
                            curveTo(11f, 7.22f, 11.22f, 7f, 11.5f, 7f)
                            reflectiveCurveTo(12f, 7.22f, 12f, 7.5f)
                            verticalLineToRelative(6.18f)
                            horizontalLineToRelative(1.76f)
                            lineTo(18f, 15.56f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Swipe!!
    }

private var _Swipe: ImageVector? = null

