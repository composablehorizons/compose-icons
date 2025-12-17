package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChatHeart: ImageVector
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
                moveTo(2.965f, 12.695f)
                arcToRelative(1f, 1f, 0f, false, false, -0.287f, -0.801f)
                curveTo(1.618f, 10.83f, 1f, 9.468f, 1f, 8f)
                curveToRelative(0f, -3.192f, 3.004f, -6f, 7f, -6f)
                reflectiveCurveToRelative(7f, 2.808f, 7f, 6f)
                reflectiveCurveToRelative(-3.004f, 6f, -7f, 6f)
                arcToRelative(8f, 8f, 0f, false, true, -2.088f, -0.272f)
                arcToRelative(1f, 1f, 0f, false, false, -0.711f, 0.074f)
                curveToRelative(-0.387f, 0.196f, -1.24f, 0.57f, -2.634f, 0.893f)
                arcToRelative(11f, 11f, 0f, false, false, 0.398f, -2f)
                moveToRelative(-0.8f, 3.108f)
                lineToRelative(0.02f, -0.004f)
                curveToRelative(1.83f, -0.363f, 2.948f, -0.842f, 3.468f, -1.105f)
                arcTo(9f, 9f, 0f, false, false, 8f, 15f)
                curveToRelative(4.418f, 0f, 8f, -3.134f, 8f, -7f)
                reflectiveCurveToRelative(-3.582f, -7f, -8f, -7f)
                reflectiveCurveToRelative(-8f, 3.134f, -8f, 7f)
                curveToRelative(0f, 1.76f, 0.743f, 3.37f, 1.97f, 4.6f)
                arcToRelative(10.4f, 10.4f, 0f, false, true, -0.524f, 2.318f)
                lineToRelative(-0.003f, 0.011f)
                arcToRelative(11f, 11f, 0f, false, true, -0.244f, 0.637f)
                curveToRelative(-0.079f, 0.186f, 0.074f, 0.394f, 0.273f, 0.362f)
                arcToRelative(22f, 22f, 0f, false, false, 0.693f, -0.125f)
                moveTo(8f, 5.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _ChatHeart!!
    }

private var _ChatHeart: ImageVector? = null

