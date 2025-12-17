package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChatBubbleBottomCenter: ImageVector
    get() {
        if (_ChatBubbleBottomCenter != null) return _ChatBubbleBottomCenter!!
        
        _ChatBubbleBottomCenter = ImageVector.Builder(
            name = "chat-bubble-bottom-center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.848f, 2.771f)
                arcTo(49.144f, 49.144f, 0f, false, true, 12f, 2.25f)
                curveToRelative(2.43f, 0f, 4.817f, 0.178f, 7.152f, 0.52f)
                curveToRelative(1.978f, 0.292f, 3.348f, 2.024f, 3.348f, 3.97f)
                verticalLineToRelative(6.02f)
                curveToRelative(0f, 1.946f, -1.37f, 3.678f, -3.348f, 3.97f)
                arcToRelative(48.901f, 48.901f, 0f, false, true, -3.476f, 0.383f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.297f, 0.17f)
                lineToRelative(-2.755f, 4.133f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.248f, 0f)
                lineToRelative(-2.755f, -4.133f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.297f, -0.17f)
                arcToRelative(48.9f, 48.9f, 0f, false, true, -3.476f, -0.384f)
                curveToRelative(-1.978f, -0.29f, -3.348f, -2.024f, -3.348f, -3.97f)
                verticalLineTo(6.741f)
                curveToRelative(0f, -1.946f, 1.37f, -3.68f, 3.348f, -3.97f)
                close()
            }
        }.build()
        
        return _ChatBubbleBottomCenter!!
    }

private var _ChatBubbleBottomCenter: ImageVector? = null

