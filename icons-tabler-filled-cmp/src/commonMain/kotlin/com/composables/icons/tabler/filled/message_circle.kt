package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MessageCircle: ImageVector
    get() {
        if (_MessageCircle != null) return _MessageCircle!!
        
        _MessageCircle = ImageVector.Builder(
            name = "message-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.821f, 4.91f)
                curveToRelative(3.899f, -2.765f, 9.468f, -2.539f, 13.073f, 0.535f)
                curveToRelative(3.667f, 3.129f, 4.168f, 8.238f, 1.152f, 11.898f)
                curveToRelative(-2.841f, 3.447f, -7.965f, 4.583f, -12.231f, 2.805f)
                lineToRelative(-0.233f, -0.101f)
                lineToRelative(-4.374f, 0.931f)
                lineToRelative(-0.04f, 0.006f)
                lineToRelative(-0.035f, 0.007f)
                horizontalLineToRelative(-0.018f)
                lineToRelative(-0.022f, 0.005f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.033f, 0.004f)
                lineToRelative(-0.021f, -0.001f)
                lineToRelative(-0.023f, 0.001f)
                lineToRelative(-0.033f, -0.003f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.022f, -0.004f)
                lineToRelative(-0.022f, -0.002f)
                lineToRelative(-0.035f, -0.007f)
                lineToRelative(-0.034f, -0.005f)
                lineToRelative(-0.016f, -0.004f)
                lineToRelative(-0.024f, -0.005f)
                lineToRelative(-0.049f, -0.016f)
                lineToRelative(-0.024f, -0.005f)
                lineToRelative(-0.011f, -0.005f)
                lineToRelative(-0.022f, -0.007f)
                lineToRelative(-0.045f, -0.02f)
                lineToRelative(-0.03f, -0.012f)
                lineToRelative(-0.011f, -0.006f)
                lineToRelative(-0.014f, -0.006f)
                lineToRelative(-0.031f, -0.018f)
                lineToRelative(-0.045f, -0.024f)
                lineToRelative(-0.016f, -0.011f)
                lineToRelative(-0.037f, -0.026f)
                lineToRelative(-0.04f, -0.027f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.013f, -0.009f)
                lineToRelative(-0.043f, -0.04f)
                lineToRelative(-0.025f, -0.02f)
                lineToRelative(-0.006f, -0.007f)
                lineToRelative(-0.056f, -0.062f)
                lineToRelative(-0.013f, -0.014f)
                lineToRelative(-0.011f, -0.014f)
                lineToRelative(-0.039f, -0.056f)
                lineToRelative(-0.014f, -0.019f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.042f, -0.073f)
                lineToRelative(-0.007f, -0.012f)
                lineToRelative(-0.004f, -0.008f)
                lineToRelative(-0.007f, -0.012f)
                lineToRelative(-0.014f, -0.038f)
                lineToRelative(-0.02f, -0.042f)
                lineToRelative(-0.004f, -0.016f)
                lineToRelative(-0.004f, -0.01f)
                lineToRelative(-0.017f, -0.061f)
                lineToRelative(-0.007f, -0.018f)
                lineToRelative(-0.002f, -0.015f)
                lineToRelative(-0.005f, -0.019f)
                lineToRelative(-0.005f, -0.033f)
                lineToRelative(-0.008f, -0.042f)
                lineToRelative(-0.002f, -0.031f)
                lineToRelative(-0.003f, -0.01f)
                verticalLineToRelative(-0.016f)
                lineToRelative(-0.004f, -0.054f)
                lineToRelative(0.001f, -0.036f)
                lineToRelative(0.001f, -0.023f)
                lineToRelative(0.002f, -0.053f)
                lineToRelative(0.004f, -0.025f)
                verticalLineToRelative(-0.019f)
                lineToRelative(0.008f, -0.035f)
                lineToRelative(0.005f, -0.034f)
                lineToRelative(0.005f, -0.02f)
                lineToRelative(0.004f, -0.02f)
                lineToRelative(0.018f, -0.06f)
                lineToRelative(0.003f, -0.013f)
                lineToRelative(1.15f, -3.45f)
                lineToRelative(-0.022f, -0.037f)
                curveToRelative(-2.21f, -3.747f, -1.209f, -8.391f, 2.413f, -11.119f)
                close()
            }
        }.build()
        
        return _MessageCircle!!
    }

private var _MessageCircle: ImageVector? = null

