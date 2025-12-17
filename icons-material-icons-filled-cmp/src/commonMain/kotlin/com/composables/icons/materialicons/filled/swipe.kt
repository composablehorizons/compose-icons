package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swipe: ImageVector
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
                        moveTo(18.89f, 14.75f)
                        lineToRelative(-4.09f, -2.04f)
                        curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(-6f)
                        curveTo(13f, 5.67f, 12.33f, 5f, 11.5f, 5f)
                        reflectiveCurveTo(10f, 5.67f, 10f, 6.5f)
                        verticalLineToRelative(10.74f)
                        lineTo(6.75f, 16.5f)
                        curveToRelative(-0.33f, -0.07f, -0.68f, 0.03f, -0.92f, 0.28f)
                        lineTo(5f, 17.62f)
                        lineToRelative(4.54f, 4.79f)
                        curveTo(9.92f, 22.79f, 10.68f, 23f, 11.21f, 23f)
                        horizontalLineToRelative(6.16f)
                        curveToRelative(1f, 0f, 1.84f, -0.73f, 1.98f, -1.72f)
                        lineToRelative(0.63f, -4.46f)
                        curveTo(20.1f, 15.97f, 19.66f, 15.14f, 18.89f, 14.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.13f, 3.87f)
                        curveTo(18.69f, 2.17f, 15.6f, 1f, 12f, 1f)
                        reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f)
                        lineTo(2f, 2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(5f)
                        lineTo(4.93f, 4.93f)
                        curveToRelative(1f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f)
                        reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f)
                        lineTo(17f, 7f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(2f)
                        lineTo(20.13f, 3.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Swipe!!
    }

private var _Swipe: ImageVector? = null

