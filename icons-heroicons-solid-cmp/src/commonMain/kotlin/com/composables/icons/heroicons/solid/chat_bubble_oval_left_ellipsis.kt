package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleOvalLeftEllipsis != null) return _ChatBubbleOvalLeftEllipsis!!
        
        _ChatBubbleOvalLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-oval-left-ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.804f, 21.644f)
                arcTo(6.707f, 6.707f, 0f, false, false, 6f, 21.75f)
                arcToRelative(6.721f, 6.721f, 0f, false, false, 3.583f, -1.029f)
                curveToRelative(0.774f, 0.182f, 1.584f, 0.279f, 2.417f, 0.279f)
                curveToRelative(5.322f, 0f, 9.75f, -3.97f, 9.75f, -9f)
                curveToRelative(0f, -5.03f, -4.428f, -9f, -9.75f, -9f)
                reflectiveCurveToRelative(-9.75f, 3.97f, -9.75f, 9f)
                curveToRelative(0f, 2.409f, 1.025f, 4.587f, 2.674f, 6.192f)
                curveToRelative(0.232f, 0.226f, 0.277f, 0.428f, 0.254f, 0.543f)
                arcToRelative(3.73f, 3.73f, 0f, false, true, -0.814f, 1.686f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.44f, 1.223f)
                close()
                moveTo(8.25f, 10.875f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
                moveTo(10.875f, 12f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveToRelative(4.875f, -1.125f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeftEllipsis!!
    }

private var _ChatBubbleOvalLeftEllipsis: ImageVector? = null

