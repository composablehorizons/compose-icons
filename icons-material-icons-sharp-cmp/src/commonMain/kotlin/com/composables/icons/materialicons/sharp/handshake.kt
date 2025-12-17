package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Handshake: ImageVector
    get() {
        if (_Handshake != null) return _Handshake!!
        
        _Handshake = ImageVector.Builder(
            name = "handshake",
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
                    moveTo(10.59f, 5.95f)
                    lineToRelative(-7.05f, 7.04f)
                    lineTo(0.7f, 10.3f)
                    lineToRelative(8.55f, -8.55f)
                    lineToRelative(7.95f, 7.95f)
                    lineToRelative(-1.42f, 1.42f)
                    lineTo(10.59f, 5.95f)
                    close()
                    moveTo(23.24f, 10.24f)
                    lineToRelative(-8.49f, -8.49f)
                    lineToRelative(-2.06f, 2.06f)
                    lineToRelative(5.9f, 5.88f)
                    lineToRelative(-2.83f, 2.83f)
                    lineToRelative(-5.17f, -5.17f)
                    lineToRelative(-6.27f, 6.27f)
                    lineToRelative(1.42f, 1.41f)
                    lineToRelative(5.32f, -5.32f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(-5.32f, 5.32f)
                    lineToRelative(1.42f, 1.41f)
                    lineToRelative(5.32f, -5.32f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(-5.32f, 5.32f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(5.32f, -5.32f)
                    lineToRelative(0.71f, 0.71f)
                    lineTo(10.68f, 20f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(23.24f, 10.24f)
                    close()
                }
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

