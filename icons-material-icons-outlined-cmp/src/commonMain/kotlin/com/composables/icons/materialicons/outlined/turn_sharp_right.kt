package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Turn_sharp_right: ImageVector
    get() {
        if (_Turn_sharp_right != null) return _Turn_sharp_right!!
        
        _Turn_sharp_right = ImageVector.Builder(
            name = "turn_sharp_right",
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
                    moveTo(18f, 6.83f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(21f, 7f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(16f, 6.83f)
                    verticalLineTo(13f)
                    horizontalLineTo(8f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6.83f)
                    close()
                }
            }
        }.build()
        
        return _Turn_sharp_right!!
    }

private var _Turn_sharp_right: ImageVector? = null

