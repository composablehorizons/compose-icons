package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MessageChatbot: ImageVector
    get() {
        if (_MessageChatbot != null) return _MessageChatbot!!
        
        _MessageChatbot = ImageVector.Builder(
            name = "message-chatbot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-4.724f)
                lineToRelative(-4.762f, 2.857f)
                arcToRelative(1f, 1f, 0f, false, true, -1.508f, -0.743f)
                lineToRelative(-0.006f, -0.114f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
                moveToRelative(-2.8f, 9.286f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.572f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 6.428f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.014f, -1.414f)
                moveToRelative(-5.69f, -4.286f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _MessageChatbot!!
    }

private var _MessageChatbot: ImageVector? = null

