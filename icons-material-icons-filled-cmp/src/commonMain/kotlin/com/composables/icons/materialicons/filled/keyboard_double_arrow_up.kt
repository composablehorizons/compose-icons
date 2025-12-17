package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Keyboard_double_arrow_up: ImageVector
    get() {
        if (_Keyboard_double_arrow_up != null) return _Keyboard_double_arrow_up!!
        
        _Keyboard_double_arrow_up = ImageVector.Builder(
            name = "keyboard_double_arrow_up",
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
                        moveTo(6f, 17.59f)
                        lineTo(7.41f, 19f)
                        lineTo(12f, 14.42f)
                        lineTo(16.59f, 19f)
                        lineTo(18f, 17.59f)
                        lineTo(12f, 11.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 11f)
                        lineTo(7.41f, 12.41f)
                        lineTo(12f, 7.83f)
                        lineTo(16.59f, 12.41f)
                        lineTo(18f, 11f)
                        lineTo(12f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_double_arrow_up!!
    }

private var _Keyboard_double_arrow_up: ImageVector? = null

