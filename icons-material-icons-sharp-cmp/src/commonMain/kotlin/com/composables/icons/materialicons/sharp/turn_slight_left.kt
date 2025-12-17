package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turn_slight_left: ImageVector
    get() {
        if (_Turn_slight_left != null) return _Turn_slight_left!!
        
        _Turn_slight_left = ImageVector.Builder(
            name = "turn_slight_left",
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
                    moveTo(11.66f, 6f)
                    lineTo(11.66f, 4f)
                    lineTo(6f, 4f)
                    lineTo(6f, 9.66f)
                    lineTo(8f, 9.66f)
                    lineTo(8f, 7.41f)
                    lineTo(13f, 12.41f)
                    lineTo(13f, 20f)
                    lineTo(15f, 20f)
                    lineTo(15f, 11.59f)
                    lineTo(9.41f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Turn_slight_left!!
    }

private var _Turn_slight_left: ImageVector? = null

