package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fork_left: ImageVector
    get() {
        if (_Fork_left != null) return _Fork_left!!
        
        _Fork_left = ImageVector.Builder(
            name = "fork_left",
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
                    moveTo(9.41f, 15.59f)
                    lineTo(8f, 17f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(7.83f, 12f)
                    curveToRelative(1.51f, -0.33f, 3.73f, 0.08f, 5.17f, 1.36f)
                    lineToRelative(0f, -6.53f)
                    lineToRelative(-1.59f, 1.59f)
                    lineTo(10f, 7f)
                    lineToRelative(4f, -4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(15f, 6.83f)
                    verticalLineTo(21f)
                    lineToRelative(-2f, 0f)
                    verticalLineToRelative(-4f)
                    curveToRelative(-0.73f, -2.58f, -3.07f, -3.47f, -5.17f, -3f)
                    lineTo(9.41f, 15.59f)
                    close()
                }
            }
        }.build()
        
        return _Fork_left!!
    }

private var _Fork_left: ImageVector? = null

