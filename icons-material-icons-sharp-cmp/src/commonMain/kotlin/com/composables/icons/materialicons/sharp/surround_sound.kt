package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Surround_sound: ImageVector
    get() {
        if (_Surround_sound != null) return _Surround_sound!!
        
        _Surround_sound = ImageVector.Builder(
            name = "surround_sound",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 4f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(7.76f, 16.24f)
                    lineToRelative(-1.41f, 1.41f)
                    curveTo(4.78f, 16.1f, 4f, 14.05f, 4f, 12f)
                    reflectiveCurveToRelative(0.78f, -4.1f, 2.34f, -5.66f)
                    lineToRelative(1.41f, 1.41f)
                    curveTo(6.59f, 8.93f, 6f, 10.46f, 6f, 12f)
                    reflectiveCurveTo(6.59f, 15.07f, 7.76f, 16.24f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                    reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                    reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                    reflectiveCurveTo(14.21f, 16f, 12f, 16f)
                    close()
                    moveTo(17.66f, 17.66f)
                    lineToRelative(-1.41f, -1.41f)
                    curveTo(17.41f, 15.07f, 18f, 13.54f, 18f, 12f)
                    reflectiveCurveToRelative(-0.59f, -3.07f, -1.76f, -4.24f)
                    lineToRelative(1.41f, -1.41f)
                    curveTo(19.22f, 7.9f, 20f, 9.95f, 20f, 12f)
                    reflectiveCurveTo(19.22f, 16.1f, 17.66f, 17.66f)
                    close()
                    moveTo(12f, 10f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Surround_sound!!
    }

private var _Surround_sound: ImageVector? = null

