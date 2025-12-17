package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Keyboard_control_key: ImageVector
    get() {
        if (_Keyboard_control_key != null) return _Keyboard_control_key!!
        
        _Keyboard_control_key = ImageVector.Builder(
            name = "keyboard_control_key",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 12f)
                    lineTo(6.41f, 13.41f)
                    lineTo(12f, 7.83f)
                    lineTo(17.59f, 13.41f)
                    lineTo(19f, 12f)
                    lineTo(12f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Keyboard_control_key!!
    }

private var _Keyboard_control_key: ImageVector? = null

