package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Send_and_archive: ImageVector
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
                            moveTo(11f, 12f)
                            lineToRelative(-6f, -1.5f)
                            verticalLineTo(7.01f)
                            lineToRelative(8.87f, 3.73f)
                            curveToRelative(0.94f, -0.47f, 2f, -0.75f, 3.13f, -0.75f)
                            curveToRelative(0.1f, 0f, 0.19f, 0.01f, 0.28f, 0.01f)
                            lineTo(3f, 4f)
                            verticalLineToRelative(16f)
                            lineToRelative(7f, -2.95f)
                            curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, -0.05f)
                            curveToRelative(0f, -0.8f, 0.14f, -1.56f, 0.39f, -2.28f)
                            lineTo(5f, 16.99f)
                            verticalLineTo(13.5f)
                            lineTo(11f, 12f)
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
                            lineToRelative(0.71f, -0.71f)
                            lineToRelative(1.79f, 1.79f)
                            verticalLineTo(14f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(4.09f)
                            lineToRelative(1.79f, -1.79f)
                            lineTo(20f, 17f)
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

