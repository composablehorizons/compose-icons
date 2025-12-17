package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Turn_sharp_left: ImageVector
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
                    lineToRelative(4f, -4f)
                    lineToRelative(4f, 4f)
                    lineTo(9.59f, 8.41f)
                    lineTo(8f, 6.83f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-6f)
                    horizontalLineTo(8f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6.83f)
                    close()
                }
            }
        }.build()
        
        return _Turn_sharp_left!!
    }

private var _Turn_sharp_left: ImageVector? = null

