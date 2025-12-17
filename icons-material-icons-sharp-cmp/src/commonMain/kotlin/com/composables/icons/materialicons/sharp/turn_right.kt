package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turn_right: ImageVector
    get() {
        if (_Turn_right != null) return _Turn_right!!
        
        _Turn_right = ImageVector.Builder(
            name = "turn_right",
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
                    moveTo(17.17f, 11f)
                    lineTo(15.59f, 12.59f)
                    lineTo(17f, 14f)
                    lineTo(21f, 10f)
                    lineTo(17f, 6f)
                    lineTo(15.59f, 7.41f)
                    lineTo(17.17f, 9f)
                    lineTo(7f, 9f)
                    lineTo(7f, 20f)
                    lineTo(9f, 20f)
                    lineTo(9f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Turn_right!!
    }

private var _Turn_right: ImageVector? = null

