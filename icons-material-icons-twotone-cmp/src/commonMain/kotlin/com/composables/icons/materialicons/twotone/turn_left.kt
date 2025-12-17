package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Turn_left: ImageVector
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
                    lineToRelative(1.59f, 1.59f)
                    lineTo(7f, 14f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(6.83f, 9f)
                    lineTo(15f, 9f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-9f)
                    lineTo(6.83f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Turn_left!!
    }

private var _Turn_left: ImageVector? = null

