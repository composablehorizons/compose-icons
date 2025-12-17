package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Assistant_direction: ImageVector
    get() {
        if (_Assistant_direction != null) return _Assistant_direction!!
        
        _Assistant_direction = ImageVector.Builder(
            name = "assistant_direction",
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
                        moveTo(13.5f, 10f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3.5f)
                        verticalLineToRelative(2.5f)
                        lineTo(17f, 11f)
                        lineToRelative(-3.5f, -3.5f)
                        verticalLineTo(10f)
                        close()
                        moveTo(12f, 1f)
                        curveTo(5.9f, 1f, 1f, 5.9f, 1f, 12f)
                        reflectiveCurveToRelative(4.9f, 11f, 11f, 11f)
                        reflectiveCurveToRelative(11f, -4.9f, 11f, -11f)
                        reflectiveCurveTo(18.1f, 1f, 12f, 1f)
                        close()
                        moveTo(20.31f, 12f)
                        lineToRelative(-8.34f, 8.37f)
                        lineTo(3.62f, 12f)
                        lineToRelative(8.34f, -8.37f)
                        lineTo(20.31f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

