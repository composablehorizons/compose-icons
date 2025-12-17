package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Voice_chat: ImageVector
    get() {
        if (_Voice_chat != null) return _Voice_chat!!
        
        _Voice_chat = ImageVector.Builder(
            name = "voice_chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 2f)
                horizontalLineTo(2.01f)
                lineTo(2f, 22f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-4f, 12f)
                lineToRelative(-4f, -3.2f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.2f)
                lineTo(18f, 6f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Voice_chat!!
    }

private var _Voice_chat: ImageVector? = null

