package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Keyboard_double_arrow_left: ImageVector
    get() {
        if (_Keyboard_double_arrow_left != null) return _Keyboard_double_arrow_left!!
        
        _Keyboard_double_arrow_left = ImageVector.Builder(
            name = "keyboard_double_arrow_left",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.29f, 17.29f)
                        lineTo(18.29f, 17.29f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(14.42f, 12f)
                        lineToRelative(3.88f, -3.88f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-4.59f, 4.59f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(4.59f, 4.59f)
                        curveTo(17.27f, 17.68f, 17.9f, 17.68f, 18.29f, 17.29f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.7f, 17.29f)
                        lineTo(11.7f, 17.29f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(7.83f, 12f)
                        lineToRelative(3.88f, -3.88f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-4.59f, 4.59f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(4.59f, 4.59f)
                        curveTo(10.68f, 17.68f, 11.31f, 17.68f, 11.7f, 17.29f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_double_arrow_left!!
    }

private var _Keyboard_double_arrow_left: ImageVector? = null

