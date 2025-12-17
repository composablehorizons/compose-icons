package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChatBubbleBottomCenter: ImageVector
    get() {
        if (_ChatBubbleBottomCenter != null) return _ChatBubbleBottomCenter!!
        
        _ChatBubbleBottomCenter = ImageVector.Builder(
            name = "chat-bubble-bottom-center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.74f)
                curveToRelative(0f, 0.983f, 0.713f, 1.825f, 1.69f, 1.943f)
                curveToRelative(0.904f, 0.108f, 1.817f, 0.19f, 2.737f, 0.243f)
                curveToRelative(0.363f, 0.02f, 0.688f, 0.231f, 0.85f, 0.556f)
                lineToRelative(1.052f, 2.103f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.342f, 0f)
                lineToRelative(1.052f, -2.103f)
                curveToRelative(0.162f, -0.325f, 0.487f, -0.535f, 0.85f, -0.556f)
                curveToRelative(0.92f, -0.053f, 1.833f, -0.134f, 2.738f, -0.243f)
                curveToRelative(0.976f, -0.118f, 1.689f, -0.96f, 1.689f, -1.942f)
                verticalLineTo(4.259f)
                curveToRelative(0f, -0.982f, -0.713f, -1.824f, -1.69f, -1.942f)
                arcToRelative(44.45f, 44.45f, 0f, false, false, -10.62f, 0f)
                curveTo(1.712f, 2.435f, 1f, 3.277f, 1f, 4.26f)
                verticalLineToRelative(4.482f)
                close()
            }
        }.build()
        
        return _ChatBubbleBottomCenter!!
    }

private var _ChatBubbleBottomCenter: ImageVector? = null

