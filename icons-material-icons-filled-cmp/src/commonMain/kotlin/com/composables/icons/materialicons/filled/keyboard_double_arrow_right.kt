package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Keyboard_double_arrow_right: ImageVector
    get() {
        if (_Keyboard_double_arrow_right != null) return _Keyboard_double_arrow_right!!
        
        _Keyboard_double_arrow_right = ImageVector.Builder(
            name = "keyboard_double_arrow_right",
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
                        moveTo(6.41f, 6f)
                        lineTo(5f, 7.41f)
                        lineTo(9.58f, 12f)
                        lineTo(5f, 16.59f)
                        lineTo(6.41f, 18f)
                        lineTo(12.41f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 6f)
                        lineTo(11.59f, 7.41f)
                        lineTo(16.17f, 12f)
                        lineTo(11.59f, 16.59f)
                        lineTo(13f, 18f)
                        lineTo(19f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_double_arrow_right!!
    }

private var _Keyboard_double_arrow_right: ImageVector? = null

