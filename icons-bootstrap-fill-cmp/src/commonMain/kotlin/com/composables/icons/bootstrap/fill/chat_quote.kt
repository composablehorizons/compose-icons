package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatQuote: ImageVector
    get() {
        if (_ChatQuote != null) return _ChatQuote!!
        
        _ChatQuote = ImageVector.Builder(
            name = "chat-quote",
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
                moveTo(7.194f, 6.766f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.227f, -0.272f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0f, false, false, 5.734f, 6f)
                curveTo(4.776f, 6f, 4f, 6.746f, 4f, 7.667f)
                curveToRelative(0f, 0.92f, 0.776f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0f, 0.662f, -0.095f, 0.931f, -0.26f)
                curveToRelative(-0.137f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0f, false, false, 0.011f, 0.59f)
                curveToRelative(0.173f, 0.16f, 0.447f, 0.155f, 0.614f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.941f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.227f, -0.4f)
                close()
                moveTo(11f, 9.073f)
                curveToRelative(-0.136f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0f, false, false, 0.012f, 0.59f)
                curveToRelative(0.172f, 0.16f, 0.446f, 0.155f, 0.613f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.942f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.228f, -0.4f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.227f, -0.273f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0f, false, false, 10.07f, 6f)
                curveToRelative(-0.957f, 0f, -1.734f, 0.746f, -1.734f, 1.667f)
                curveToRelative(0f, 0.92f, 0.777f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0f, 0.662f, -0.095f, 0.931f, -0.26f)
                close()
            }
        }.build()
        
        return _ChatQuote!!
    }

private var _ChatQuote: ImageVector? = null

