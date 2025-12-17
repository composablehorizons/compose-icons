package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turn_left: ImageVector
    get() {
        if (_Turn_left != null) return _Turn_left!!
        
        _Turn_left = ImageVector.Builder(
            name = "turn_left",
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
                    moveTo(6.83f, 11f)
                    lineTo(8.41f, 12.59f)
                    lineTo(7f, 14f)
                    lineTo(3f, 10f)
                    lineTo(7f, 6f)
                    lineTo(8.41f, 7.41f)
                    lineTo(6.83f, 9f)
                    lineTo(17f, 9f)
                    lineTo(17f, 20f)
                    lineTo(15f, 20f)
                    lineTo(15f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Turn_left!!
    }

private var _Turn_left: ImageVector? = null

