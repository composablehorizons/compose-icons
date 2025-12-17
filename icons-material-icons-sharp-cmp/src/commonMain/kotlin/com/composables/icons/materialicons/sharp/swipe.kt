package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Swipe: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 12.5f)
                        verticalLineToRelative(-6f)
                        curveTo(13f, 5.67f, 12.33f, 5f, 11.5f, 5f)
                        reflectiveCurveTo(10f, 5.67f, 10f, 6.5f)
                        verticalLineToRelative(10.74f)
                        lineToRelative(-4.04f, -0.85f)
                        lineToRelative(-1.21f, 1.23f)
                        lineTo(10.13f, 23f)
                        horizontalLineToRelative(8.97f)
                        lineToRelative(1.09f, -7.64f)
                        lineToRelative(-6.11f, -2.86f)
                        horizontalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Swipe!!
    }

private var _Swipe: ImageVector? = null

