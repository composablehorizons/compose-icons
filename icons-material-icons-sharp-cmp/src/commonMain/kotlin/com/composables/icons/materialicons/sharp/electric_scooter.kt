package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Electric_scooter: ImageVector
    get() {
        if (_Electric_scooter != null) return _Electric_scooter!!
        
        _Electric_scooter = ImageVector.Builder(
            name = "electric_scooter",
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
                        moveTo(7.82f, 16f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                        horizontalLineToRelative(0.74f)
                        lineTo(17.49f, 1f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3.89f)
                        lineToRelative(1.4f, 6.25f)
                        curveToRelative(0f, 0f, -0.01f, 0f, -0.01f, 0f)
                        curveToRelative(-2.16f, 0.65f, -3.81f, 2.48f, -4.19f, 4.75f)
                        horizontalLineTo(7.82f)
                        curveToRelative(-0.48f, -1.34f, -1.86f, -2.24f, -3.42f, -1.94f)
                        curveToRelative(-1.18f, 0.23f, -2.13f, 1.2f, -2.35f, 2.38f)
                        curveTo(1.7f, 16.34f, 3.16f, 18f, 5f, 18f)
                        curveTo(6.3f, 18f, 7.4f, 17.16f, 7.82f, 16f)
                        close()
                        moveTo(5f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(5.55f, 16f, 5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 12f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        reflectiveCurveTo(20.66f, 12f, 19f, 12f)
                        close()
                        moveTo(19f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(19.55f, 16f, 19f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 20f)
                        lineTo(7f, 20f)
                        lineTo(13f, 23f)
                        lineTo(13f, 21f)
                        lineTo(17f, 21f)
                        lineTo(11f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electric_scooter!!
    }

private var _Electric_scooter: ImageVector? = null

