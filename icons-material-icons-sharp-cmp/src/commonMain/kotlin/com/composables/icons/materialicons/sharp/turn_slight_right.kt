package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turn_slight_right: ImageVector
    get() {
        if (_Turn_slight_right != null) return _Turn_slight_right!!
        
        _Turn_slight_right = ImageVector.Builder(
            name = "turn_slight_right",
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
                    moveTo(12.34f, 6f)
                    lineTo(12.34f, 4f)
                    lineTo(18f, 4f)
                    lineTo(18f, 9.66f)
                    lineTo(16f, 9.66f)
                    lineTo(16f, 7.41f)
                    lineTo(11f, 12.41f)
                    lineTo(11f, 20f)
                    lineTo(9f, 20f)
                    lineTo(9f, 11.59f)
                    lineTo(14.59f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Turn_slight_right!!
    }

private var _Turn_slight_right: ImageVector? = null

