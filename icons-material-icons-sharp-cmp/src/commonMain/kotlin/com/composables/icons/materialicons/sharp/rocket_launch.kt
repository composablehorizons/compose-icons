package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rocket_launch: ImageVector
    get() {
        if (_Rocket_launch != null) return _Rocket_launch!!
        
        _Rocket_launch = ImageVector.Builder(
            name = "rocket_launch",
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
                        moveTo(9.19f, 6.35f)
                        curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f)
                        lineTo(2f, 10.69f)
                        lineToRelative(4.81f, -4.81f)
                        lineTo(9.19f, 6.35f)
                        lineTo(9.19f, 6.35f)
                        close()
                        moveTo(11.17f, 17f)
                        curveToRelative(0f, 0f, 3.74f, -1.55f, 5.89f, -3.7f)
                        curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f)
                        curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f)
                        curveTo(8.55f, 9.09f, 7f, 12.83f, 7f, 12.83f)
                        lineTo(11.17f, 17f)
                        close()
                        moveTo(17.65f, 14.81f)
                        curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f)
                        lineTo(13.31f, 22f)
                        lineToRelative(4.81f, -4.81f)
                        lineTo(17.65f, 14.81f)
                        lineTo(17.65f, 14.81f)
                        close()
                        moveTo(9f, 18f)
                        curveToRelative(0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f)
                        curveTo(6.94f, 21.3f, 2f, 22f, 2f, 22f)
                        reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f)
                        curveTo(4.42f, 15.34f, 5.17f, 15f, 6f, 15f)
                        curveTo(7.66f, 15f, 9f, 16.34f, 9f, 18f)
                        close()
                        moveTo(13f, 9f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                        reflectiveCurveTo(13f, 10.1f, 13f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rocket_launch!!
    }

private var _Rocket_launch: ImageVector? = null

