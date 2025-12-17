package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Send_and_archive: ImageVector
    get() {
        if (_Send_and_archive != null) return _Send_and_archive!!
        
        _Send_and_archive = ImageVector.Builder(
            name = "send_and_archive",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 10f)
                            curveToRelative(0.1f, 0f, 0.19f, 0.01f, 0.28f, 0.01f)
                            lineTo(3f, 4f)
                            verticalLineToRelative(6f)
                            lineToRelative(8f, 2f)
                            lineToRelative(-8f, 2f)
                            verticalLineToRelative(6f)
                            lineToRelative(7f, -2.95f)
                            curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, -0.05f)
                            curveTo(10f, 13.13f, 13.13f, 10f, 17f, 10f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 12f)
                            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                            reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                            close()
                            moveTo(17f, 20f)
                            lineToRelative(-3f, -3f)
                            horizontalLineToRelative(2.5f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(3f)
                            horizontalLineTo(20f)
                            lineTo(17f, 20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Send_and_archive!!
    }

private var _Send_and_archive: ImageVector? = null

