package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Synagogue: ImageVector
    get() {
        if (_Synagogue != null) return _Synagogue!!
        
        _Synagogue = ImageVector.Builder(
            name = "synagogue",
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
                        moveTo(6f, 8.94f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(4f)
                        lineToRelative(0f, -4.89f)
                        curveToRelative(0f, -1f, 0.68f, -1.92f, 1.66f, -2.08f)
                        curveTo(12.92f, 13.82f, 14f, 14.79f, 14f, 16f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(8.94f)
                        curveToRelative(0f, -0.59f, -0.26f, -1.16f, -0.72f, -1.54f)
                        lineToRelative(-4f, -3.33f)
                        curveToRelative(-0.74f, -0.62f, -1.82f, -0.62f, -2.56f, 0f)
                        lineToRelative(-4f, 3.33f)
                        curveTo(6.26f, 7.78f, 6f, 8.34f, 6f, 8.94f)
                        close()
                        moveTo(13.5f, 10f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveTo(13.5f, 9.17f, 13.5f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 5f)
                        curveTo(1.9f, 5f, 1f, 5.9f, 1f, 7f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(7f)
                        curveTo(5f, 5.9f, 4.1f, 5f, 3f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 21f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(10f)
                        curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 5f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(7f)
                        curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 21f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Synagogue!!
    }

private var _Synagogue: ImageVector? = null

