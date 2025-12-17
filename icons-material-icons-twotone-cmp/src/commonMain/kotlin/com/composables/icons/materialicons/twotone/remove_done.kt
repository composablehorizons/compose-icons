package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Remove_done: ImageVector
    get() {
        if (_Remove_done != null) return _Remove_done!!
        
        _Remove_done = ImageVector.Builder(
            name = "remove_done",
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
                    moveTo(4.84f, 1.98f)
                    lineTo(3.43f, 3.39f)
                    lineToRelative(10.38f, 10.38f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(-4.24f, -4.24f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(5.66f, 5.66f)
                    lineToRelative(2.83f, -2.83f)
                    lineToRelative(6.6f, 6.6f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(4.84f, 1.98f)
                    close()
                    moveTo(18.05f, 12.36f)
                    lineTo(23f, 7.4f)
                    lineTo(21.57f, 6f)
                    lineToRelative(-4.94f, 4.94f)
                    lineTo(18.05f, 12.36f)
                    close()
                    moveTo(17.34f, 7.4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-2.12f, 2.12f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(17.34f, 7.4f)
                    close()
                    moveTo(1.08f, 12.35f)
                    lineToRelative(5.66f, 5.66f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(-5.66f, -5.66f)
                    lineTo(1.08f, 12.35f)
                    close()
                }
            }
        }.build()
        
        return _Remove_done!!
    }

private var _Remove_done: ImageVector? = null

