package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Synagogue: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 8f)
                        verticalLineToRelative(13f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(8f)
                        lineToRelative(-6f, -5f)
                        lineTo(6f, 8f)
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
                        moveTo(1f, 9f)
                        horizontalLineTo(5f)
                        verticalLineTo(21f)
                        horizontalLineTo(1f)
                        verticalLineTo(9f)
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
                        moveTo(19f, 9f)
                        horizontalLineTo(23f)
                        verticalLineTo(21f)
                        horizontalLineTo(19f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Synagogue!!
    }

private var _Synagogue: ImageVector? = null

