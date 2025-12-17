package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Elderly_woman: ImageVector
    get() {
        if (_Elderly_woman != null) return _Elderly_woman!!
        
        _Elderly_woman = ImageVector.Builder(
            name = "elderly_woman",
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
                        moveTo(18.5f, 11f)
                        curveToRelative(-1.56f, 0f, -2.92f, -0.9f, -3.58f, -2.21f)
                        lineToRelative(-0.79f, -1.67f)
                        lineToRelative(0f, 0f)
                        curveTo(14.12f, 7.1f, 13.63f, 6f, 12.34f, 6f)
                        lineToRelative(0f, 0f)
                        curveTo(8.72f, 6f, 6f, 16.69f, 6f, 19f)
                        horizontalLineToRelative(2.5f)
                        lineToRelative(-2.1f, 2.8f)
                        lineTo(8f, 23f)
                        lineToRelative(3f, -4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-4.03f)
                        lineTo(13f, 13f)
                        lineToRelative(0.49f, -2.71f)
                        curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f)
                        verticalLineToRelative(0.69f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineTo(23f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(12.5f)
                        curveTo(20f, 11.67f, 19.33f, 11f, 18.5f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.6f, 2.91f)
                        curveToRelative(-0.06f, 0.19f, -0.1f, 0.38f, -0.1f, 0.59f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        curveToRelative(-0.21f, 0f, -0.4f, 0.04f, -0.59f, 0.1f)
                        curveTo(12.76f, 1.25f, 12.41f, 1f, 12f, 1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveTo(11f, 2.41f, 11.25f, 2.76f, 11.6f, 2.91f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Elderly_woman!!
    }

private var _Elderly_woman: ImageVector? = null

