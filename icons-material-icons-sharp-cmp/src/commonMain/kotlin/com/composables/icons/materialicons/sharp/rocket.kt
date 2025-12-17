package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2.5f)
                    curveToRelative(0f, 0f, 4.5f, 2.04f, 4.5f, 10.5f)
                    curveToRelative(0f, 2.49f, -1.04f, 5.57f, -1.6f, 7f)
                    horizontalLineTo(9.1f)
                    curveToRelative(-0.56f, -1.43f, -1.6f, -4.51f, -1.6f, -7f)
                    curveTo(7.5f, 4.54f, 12f, 2.5f, 12f, 2.5f)
                    close()
                    moveTo(14f, 11f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveTo(14f, 12.1f, 14f, 11f)
                    close()
                    moveTo(7.69f, 20.52f)
                    curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f)
                    lineTo(4f, 15f)
                    verticalLineToRelative(7f)
                    lineTo(7.69f, 20.52f)
                    close()
                    moveTo(20f, 22f)
                    verticalLineToRelative(-7f)
                    lineToRelative(-2.02f, -1.35f)
                    curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f)
                    lineTo(20f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

