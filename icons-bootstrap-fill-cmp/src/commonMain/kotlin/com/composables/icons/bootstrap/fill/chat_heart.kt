package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatHeart: ImageVector
    get() {
        if (_ChatHeart != null) return _ChatHeart!!
        
        _ChatHeart = ImageVector.Builder(
            name = "chat-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                curveToRelative(4.418f, 0f, 8f, -3.134f, 8f, -7f)
                reflectiveCurveToRelative(-3.582f, -7f, -8f, -7f)
                reflectiveCurveToRelative(-8f, 3.134f, -8f, 7f)
                curveToRelative(0f, 1.76f, 0.743f, 3.37f, 1.97f, 4.6f)
                curveToRelative(-0.097f, 1.016f, -0.417f, 2.13f, -0.771f, 2.966f)
                curveToRelative(-0.079f, 0.186f, 0.074f, 0.394f, 0.273f, 0.362f)
                curveToRelative(2.256f, -0.37f, 3.597f, -0.938f, 4.18f, -1.234f)
                arcTo(9f, 9f, 0f, false, false, 8f, 15f)
                moveToRelative(0f, -9.007f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _ChatHeart!!
    }

private var _ChatHeart: ImageVector? = null

