package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Roller_skating: ImageVector
    get() {
        if (_Roller_skating != null) return _Roller_skating!!
        
        _Roller_skating = ImageVector.Builder(
            name = "roller_skating",
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
                        moveTo(20f, 16f)
                        lineToRelative(-0.01f, -6f)
                        lineToRelative(-5.71f, -1.43f)
                        curveTo(13.4f, 8.35f, 12.7f, 7.76f, 12.32f, 7f)
                        horizontalLineTo(9f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(3.02f)
                        lineTo(12f, 5f)
                        horizontalLineTo(9f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(1f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(15f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(5f, 23f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        reflectiveCurveTo(6.66f, 23f, 5f, 23f)
                        close()
                        moveTo(19f, 23f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        reflectiveCurveTo(20.66f, 23f, 19f, 23f)
                        close()
                        moveTo(12f, 23f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        reflectiveCurveTo(13.66f, 23f, 12f, 23f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Roller_skating!!
    }

private var _Roller_skating: ImageVector? = null

