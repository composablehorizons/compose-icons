package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turn_sharp_left: ImageVector
    get() {
        if (_Turn_sharp_left != null) return _Turn_sharp_left!!
        
        _Turn_sharp_left = ImageVector.Builder(
            name = "turn_sharp_left",
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
                    moveTo(6f, 6.83f)
                    lineTo(4.41f, 8.41f)
                    lineTo(3f, 7f)
                    lineTo(7f, 3f)
                    lineTo(11f, 7f)
                    lineTo(9.59f, 8.41f)
                    lineTo(8f, 6.83f)
                    lineTo(8f, 13f)
                    lineTo(18f, 13f)
                    lineTo(18f, 21f)
                    lineTo(16f, 21f)
                    lineTo(16f, 15f)
                    lineTo(6f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Turn_sharp_left!!
    }

private var _Turn_sharp_left: ImageVector? = null

