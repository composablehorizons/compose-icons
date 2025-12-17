package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatDots: ImageVector
    get() {
        if (_ChatDots != null) return _ChatDots!!
        
        _ChatDots = ImageVector.Builder(
            name = "chat-dots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                curveToRelative(0f, 3.866f, -3.582f, 7f, -8f, 7f)
                arcToRelative(9f, 9f, 0f, false, true, -2.347f, -0.306f)
                curveToRelative(-0.584f, 0.296f, -1.925f, 0.864f, -4.181f, 1.234f)
                curveToRelative(-0.2f, 0.032f, -0.352f, -0.176f, -0.273f, -0.362f)
                curveToRelative(0.354f, -0.836f, 0.674f, -1.95f, 0.77f, -2.966f)
                curveTo(0.744f, 11.37f, 0f, 9.76f, 0f, 8f)
                curveToRelative(0f, -3.866f, 3.582f, -7f, 8f, -7f)
                reflectiveCurveToRelative(8f, 3.134f, 8f, 7f)
                moveTo(5f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveToRelative(3f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _ChatDots!!
    }

private var _ChatDots: ImageVector? = null

