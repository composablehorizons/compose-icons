package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bedroom_baby: ImageVector
    get() {
        if (_Bedroom_baby != null) return _Bedroom_baby!!
        
        _Bedroom_baby = ImageVector.Builder(
            name = "bedroom_baby",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(22f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-2.64f, 0f, -5.13f, -1.03f, -7f, -2.9f)
                        lineToRelative(1.06f, -1.06f)
                        curveToRelative(0.34f, 0.34f, 0.71f, 0.65f, 1.1f, 0.92f)
                        lineTo(8f, 13.5f)
                        verticalLineTo(9.51f)
                        lineTo(6.45f, 10.5f)
                        lineToRelative(-0.95f, -1f)
                        lineTo(7f, 7.76f)
                        lineTo(6f, 7f)
                        horizontalLineToRelative(3.65f)
                        lineToRelative(1.73f, 3f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(2.5f)
                        lineToRelative(0.84f, 1.46f)
                        curveToRelative(0.39f, -0.28f, 0.76f, -0.58f, 1.1f, -0.92f)
                        lineTo(19f, 15.1f)
                        curveTo(17.13f, 16.97f, 14.64f, 18f, 12f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.69f, 14.24f)
                        curveToRelative(-1.74f, 0.65f, -3.66f, 0.65f, -5.4f, 0f)
                        lineToRelative(-0.81f, 1.41f)
                        lineToRelative(-0.03f, 0.06f)
                        curveToRelative(1.1f, 0.52f, 2.28f, 0.79f, 3.53f, 0.79f)
                        reflectiveCurveToRelative(2.45f, -0.28f, 3.55f, -0.79f)
                        lineToRelative(-0.03f, -0.06f)
                        lineTo(14.69f, 14.24f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedroom_baby!!
    }

private var _Bedroom_baby: ImageVector? = null

