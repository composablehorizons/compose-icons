package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_delete: ImageVector
    get() {
        if (_Auto_delete != null) return _Auto_delete!!
        
        _Auto_delete = ImageVector.Builder(
            name = "auto_delete",
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
                        moveTo(15f, 2f)
                        lineTo(11.5f, 2f)
                        lineTo(10.5f, 1f)
                        lineTo(5.5f, 1f)
                        lineTo(4.5f, 2f)
                        lineTo(1f, 2f)
                        lineTo(1f, 4f)
                        lineTo(15f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 9f)
                        curveToRelative(-0.7f, 0f, -1.37f, 0.1f, -2f, 0.29f)
                        verticalLineTo(5f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(7.68f)
                        curveToRelative(1.12f, 2.36f, 3.53f, 4f, 6.32f, 4f)
                        curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                        curveTo(23f, 12.13f, 19.87f, 9f, 16f, 9f)
                        close()
                        moveTo(16f, 21f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                        reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                        reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 12f)
                        lineTo(15f, 12f)
                        lineTo(15f, 17f)
                        lineTo(18.6f, 19.1f)
                        lineTo(19.4f, 17.9f)
                        lineTo(16.5f, 16.2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_delete!!
    }

private var _Auto_delete: ImageVector? = null

