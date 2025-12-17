package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Keyboard_double_arrow_left: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.59f, 18f)
                        lineTo(19f, 16.59f)
                        lineTo(14.42f, 12f)
                        lineTo(19f, 7.41f)
                        lineTo(17.59f, 6f)
                        lineTo(11.59f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 18f)
                        lineTo(12.41f, 16.59f)
                        lineTo(7.83f, 12f)
                        lineTo(12.41f, 7.41f)
                        lineTo(11f, 6f)
                        lineTo(5f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_double_arrow_left!!
    }

private var _Keyboard_double_arrow_left: ImageVector? = null

