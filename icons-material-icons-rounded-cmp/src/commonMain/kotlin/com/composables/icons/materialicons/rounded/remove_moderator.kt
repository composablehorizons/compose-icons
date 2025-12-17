package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Remove_moderator: ImageVector
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
                    verticalLineToRelative(-4.7f)
                    curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                    lineToRelative(-6f, -2.25f)
                    curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0f)
                    lineTo(6.78f, 3.96f)
                    lineToRelative(12.09f, 12.09f)
                    curveTo(19.59f, 14.52f, 20f, 12.83f, 20f, 11.09f)
                    close()
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineTo(4f, 6.83f)
                    verticalLineToRelative(4.26f)
                    curveToRelative(0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f)
                    curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0f)
                    curveToRelative(1.49f, -0.48f, 2.84f, -1.35f, 3.97f, -2.47f)
                    lineToRelative(2.53f, 2.53f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                }
            }
        }.build()
        
        return _Remove_moderator!!
    }

private var _Remove_moderator: ImageVector? = null

