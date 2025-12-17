package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Turn_slight_left: ImageVector
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
                    verticalLineTo(4f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(5.66f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7.41f)
                    lineToRelative(5f, 5f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-7.58f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-5f, -5f)
                    horizontalLineTo(11.66f)
                    close()
                }
            }
        }.build()
        
        return _Turn_slight_left!!
    }

private var _Turn_slight_left: ImageVector? = null

