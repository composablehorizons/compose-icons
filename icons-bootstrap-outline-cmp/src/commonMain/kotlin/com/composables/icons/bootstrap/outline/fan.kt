package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Fan: ImageVector
    get() {
        if (_Fan != null) return _Fan!!
        
        _Fan = ImageVector.Builder(
            name = "fan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                curveToRelative(0f, 1.313f, -0.304f, 2.508f, -0.8f, 3.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.484f, -0.38f)
                curveToRelative(-0.28f, -0.982f, -0.91f, -2.04f, -1.838f, -2.969f)
                arcToRelative(8f, 8f, 0f, false, false, -0.491f, -0.454f)
                arcTo(6f, 6f, 0f, false, true, 8f, 2f)
                curveToRelative(0.691f, 0f, 1.355f, 0.117f, 1.973f, 0.332f)
                quadTo(10f, 2.661f, 10f, 3f)
                moveToRelative(0f, 5f)
                quadToRelative(0f, 0.11f, -0.012f, 0.217f)
                curveToRelative(1.018f, -0.019f, 2.2f, -0.353f, 3.331f, -1.006f)
                arcToRelative(8f, 8f, 0f, false, false, 0.57f, -0.361f)
                arcToRelative(6f, 6f, 0f, false, false, -2.53f, -3.823f)
                arcToRelative(9f, 9f, 0f, false, true, -0.145f, 0.64f)
                curveToRelative(-0.34f, 1.269f, -0.944f, 2.346f, -1.656f, 3.079f)
                curveToRelative(0.277f, 0.343f, 0.442f, 0.78f, 0.442f, 1.254f)
                moveToRelative(-0.137f, 0.728f)
                arcToRelative(2f, 2f, 0f, false, true, -1.07f, 1.109f)
                curveToRelative(0.525f, 0.87f, 1.405f, 1.725f, 2.535f, 2.377f)
                quadToRelative(0.3f, 0.174f, 0.605f, 0.317f)
                arcToRelative(6f, 6f, 0f, false, false, 2.053f, -4.111f)
                quadToRelative(-0.311f, 0.11f, -0.641f, 0.199f)
                curveToRelative(-1.264f, 0.339f, -2.493f, 0.356f, -3.482f, 0.11f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-0.45f, 0f, -0.866f, -0.149f, -1.2f, -0.4f)
                curveToRelative(-0.494f, 0.89f, -0.796f, 2.082f, -0.796f, 3.391f)
                quadToRelative(0f, 0.346f, 0.027f, 0.678f)
                arcTo(6f, 6f, 0f, false, false, 8f, 14f)
                curveToRelative(0.94f, 0f, 1.83f, -0.216f, 2.623f, -0.602f)
                arcToRelative(8f, 8f, 0f, false, true, -0.497f, -0.458f)
                curveToRelative(-0.925f, -0.926f, -1.555f, -1.981f, -1.836f, -2.96f)
                quadTo(8.149f, 10f, 8f, 10f)
                moveTo(6f, 8f)
                quadToRelative(0f, -0.12f, 0.014f, -0.239f)
                curveToRelative(-1.02f, 0.017f, -2.205f, 0.351f, -3.34f, 1.007f)
                arcToRelative(8f, 8f, 0f, false, false, -0.568f, 0.359f)
                arcToRelative(6f, 6f, 0f, false, false, 2.525f, 3.839f)
                arcToRelative(8f, 8f, 0f, false, true, 0.148f, -0.653f)
                curveToRelative(0.34f, -1.267f, 0.94f, -2.342f, 1.65f, -3.075f)
                arcTo(2f, 2f, 0f, false, true, 6f, 8f)
                moveToRelative(-3.347f, -0.632f)
                curveToRelative(1.267f, -0.34f, 2.498f, -0.355f, 3.488f, -0.107f)
                curveToRelative(0.196f, -0.494f, 0.583f, -0.89f, 1.07f, -1.1f)
                curveToRelative(-0.524f, -0.874f, -1.406f, -1.733f, -2.541f, -2.388f)
                arcToRelative(8f, 8f, 0f, false, false, -0.594f, -0.312f)
                arcToRelative(6f, 6f, 0f, false, false, -2.06f, 4.106f)
                quadToRelative(0.309f, -0.11f, 0.637f, -0.199f)
                moveTo(8f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
        }.build()
        
        return _Fan!!
    }

private var _Fan: ImageVector? = null

