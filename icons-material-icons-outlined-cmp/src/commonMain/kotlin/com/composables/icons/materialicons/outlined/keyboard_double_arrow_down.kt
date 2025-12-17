package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Keyboard_double_arrow_down: ImageVector
    get() {
        if (_Keyboard_double_arrow_down != null) return _Keyboard_double_arrow_down!!
        
        _Keyboard_double_arrow_down = ImageVector.Builder(
            name = "keyboard_double_arrow_down",
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
                        moveTo(18f, 6.41f)
                        lineTo(16.59f, 5f)
                        lineTo(12f, 9.58f)
                        lineTo(7.41f, 5f)
                        lineTo(6f, 6.41f)
                        lineTo(12f, 12.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        lineTo(16.59f, 11.59f)
                        lineTo(12f, 16.17f)
                        lineTo(7.41f, 11.59f)
                        lineTo(6f, 13f)
                        lineTo(12f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_double_arrow_down!!
    }

private var _Keyboard_double_arrow_down: ImageVector? = null

