package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Remove_moderator: ImageVector
    get() {
        if (_Remove_moderator != null) return _Remove_moderator!!
        
        _Remove_moderator = ImageVector.Builder(
            name = "remove_moderator",
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
                    moveTo(20f, 11.09f)
                    verticalLineTo(5f)
                    lineToRelative(-8f, -3f)
                    lineTo(6.78f, 3.96f)
                    lineToRelative(12.09f, 12.09f)
                    curveTo(19.59f, 14.52f, 20f, 12.83f, 20f, 11.09f)
                    close()
                    moveTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(4f, 6.83f)
                    verticalLineToRelative(4.26f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(1.72f, -0.43f, 3.28f, -1.36f, 4.55f, -2.62f)
                    lineToRelative(3.23f, 3.23f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    close()
                }
            }
        }.build()
        
        return _Remove_moderator!!
    }

private var _Remove_moderator: ImageVector? = null

