package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Roller_skating: ImageVector
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
                        moveTo(18f, 16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        lineToRelative(0f, -0.88f)
                        curveToRelative(0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f)
                        lineToRelative(-2.7f, -0.67f)
                        curveTo(13.4f, 8.35f, 12.7f, 7.76f, 12.32f, 7f)
                        horizontalLineTo(9.5f)
                        curveTo(9.22f, 7f, 9f, 6.78f, 9f, 6.5f)
                        reflectiveCurveTo(9.22f, 6f, 9.5f, 6f)
                        horizontalLineToRelative(2.52f)
                        lineTo(12f, 5f)
                        horizontalLineTo(9.5f)
                        curveTo(9.22f, 5f, 9f, 4.78f, 9f, 4.5f)
                        curveTo(9f, 4.22f, 9.22f, 4f, 9.5f, 4f)
                        horizontalLineTo(12f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 1f, 4f, 1.9f, 4f, 3f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineTo(18f)
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

