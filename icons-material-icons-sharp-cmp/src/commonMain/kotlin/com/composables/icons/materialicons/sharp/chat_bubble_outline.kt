package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Chat_bubble_outline: ImageVector
    get() {
        if (_Chat_bubble_outline != null) return _Chat_bubble_outline!!
        
        _Chat_bubble_outline = ImageVector.Builder(
            name = "chat_bubble_outline",
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
                horizontalLineTo(2f)
                verticalLineToRelative(20f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(6f)
                lineToRelative(-2f, 2f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Chat_bubble_outline!!
    }

private var _Chat_bubble_outline: ImageVector? = null

