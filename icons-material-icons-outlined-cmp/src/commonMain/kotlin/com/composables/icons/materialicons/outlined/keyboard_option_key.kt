package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Keyboard_option_key: ImageVector
    get() {
        if (_Keyboard_option_key != null) return _Keyboard_option_key!!
        
        _Keyboard_option_key = ImageVector.Builder(
            name = "keyboard_option_key",
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
                        moveTo(15f, 5f)
                        horizontalLineTo(21f)
                        verticalLineTo(7f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 5f)
                        lineTo(3f, 5f)
                        lineTo(3f, 7f)
                        lineTo(7.85f, 7f)
                        lineTo(14.77f, 19f)
                        lineTo(21f, 19f)
                        lineTo(21f, 17f)
                        lineTo(15.93f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_option_key!!
    }

private var _Keyboard_option_key: ImageVector? = null

