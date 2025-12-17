package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Border_color: ImageVector
    get() {
        if (_Border_color != null) return _Border_color!!
        
        _Border_color = ImageVector.Builder(
            name = "border_color",
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
                        moveTo(16.81f, 8.94f)
                        lineToRelative(-3.75f, -3.75f)
                        lineTo(4f, 14.25f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(3.75f)
                        lineTo(16.81f, 8.94f)
                        close()
                        moveTo(6f, 16f)
                        verticalLineToRelative(-0.92f)
                        lineToRelative(7.06f, -7.06f)
                        lineToRelative(0.92f, 0.92f)
                        lineTo(6.92f, 16f)
                        horizontalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.71f, 6.04f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-2.34f, -2.34f)
                        curveTo(17.17f, 2.09f, 16.92f, 2f, 16.66f, 2f)
                        curveToRelative(-0.25f, 0f, -0.51f, 0.1f, -0.7f, 0.29f)
                        lineToRelative(-1.83f, 1.83f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(19.71f, 6.04f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 20f)
                        horizontalLineTo(22f)
                        verticalLineTo(24f)
                        horizontalLineTo(2f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Border_color!!
    }

private var _Border_color: ImageVector? = null

