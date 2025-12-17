package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Schedule_send: ImageVector
    get() {
        if (_Schedule_send != null) return _Schedule_send!!
        
        _Schedule_send = ImageVector.Builder(
            name = "schedule_send",
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
                        moveTo(17f, 10f)
                        curveToRelative(0.1f, 0f, 0.19f, 0.01f, 0.28f, 0.01f)
                        lineTo(3f, 4f)
                        verticalLineToRelative(6f)
                        lineToRelative(8f, 2f)
                        lineToRelative(-8f, 2f)
                        verticalLineToRelative(6f)
                        lineToRelative(7f, -2.95f)
                        curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, -0.05f)
                        curveTo(10f, 13.14f, 13.14f, 10f, 17f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 12f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                        close()
                        moveTo(18.65f, 19.35f)
                        lineToRelative(-2.15f, -2.15f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(2.79f)
                        lineToRelative(1.85f, 1.85f)
                        lineTo(18.65f, 19.35f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Schedule_send!!
    }

private var _Schedule_send: ImageVector? = null

