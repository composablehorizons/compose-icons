package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatSquareQuote: ImageVector
    get() {
        if (_ChatSquareQuote != null) return _ChatSquareQuote!!
        
        _ChatSquareQuote = ImageVector.Builder(
            name = "chat-square-quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, 0.4f)
                lineToRelative(-1.9f, 2.533f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, 0f)
                lineTo(5.3f, 12.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, -0.4f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(7.194f, 2.766f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.227f, -0.272f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0f, false, false, 5.734f, 4f)
                curveTo(4.776f, 4f, 4f, 4.746f, 4f, 5.667f)
                curveToRelative(0f, 0.92f, 0.776f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0f, 0.662f, -0.095f, 0.931f, -0.26f)
                curveToRelative(-0.137f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0f, false, false, 0.011f, 0.59f)
                curveToRelative(0.173f, 0.16f, 0.447f, 0.155f, 0.614f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.941f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.227f, -0.4f)
                close()
                moveTo(11f, 7.073f)
                curveToRelative(-0.136f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0f, false, false, 0.012f, 0.59f)
                curveToRelative(0.172f, 0.16f, 0.446f, 0.155f, 0.613f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.942f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.228f, -0.4f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.227f, -0.273f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0f, false, false, 10.07f, 4f)
                curveToRelative(-0.957f, 0f, -1.734f, 0.746f, -1.734f, 1.667f)
                curveToRelative(0f, 0.92f, 0.777f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0f, 0.662f, -0.095f, 0.931f, -0.26f)
                close()
            }
        }.build()
        
        return _ChatSquareQuote!!
    }

private var _ChatSquareQuote: ImageVector? = null

