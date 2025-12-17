package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2f)
                lineToRelative(0.018f, 0.001f)
                lineToRelative(0.016f, 0.001f)
                lineToRelative(0.083f, 0.005f)
                lineToRelative(0.011f, 0.002f)
                horizontalLineToRelative(0.011f)
                lineToRelative(0.038f, 0.009f)
                lineToRelative(0.052f, 0.008f)
                lineToRelative(0.016f, 0.006f)
                lineToRelative(0.011f, 0.001f)
                lineToRelative(0.029f, 0.011f)
                lineToRelative(0.052f, 0.014f)
                lineToRelative(0.019f, 0.009f)
                lineToRelative(0.015f, 0.004f)
                lineToRelative(0.028f, 0.014f)
                lineToRelative(0.04f, 0.017f)
                lineToRelative(0.021f, 0.012f)
                lineToRelative(0.022f, 0.01f)
                lineToRelative(0.023f, 0.015f)
                lineToRelative(0.031f, 0.017f)
                lineToRelative(0.034f, 0.024f)
                lineToRelative(0.018f, 0.011f)
                lineToRelative(0.013f, 0.012f)
                lineToRelative(0.024f, 0.017f)
                lineToRelative(0.038f, 0.034f)
                lineToRelative(0.022f, 0.017f)
                lineToRelative(0.008f, 0.01f)
                lineToRelative(0.014f, 0.012f)
                lineToRelative(0.036f, 0.041f)
                lineToRelative(0.026f, 0.027f)
                lineToRelative(0.006f, 0.009f)
                curveToRelative(0.12f, 0.147f, 0.196f, 0.322f, 0.218f, 0.513f)
                lineToRelative(0.001f, 0.012f)
                lineToRelative(0.002f, 0.041f)
                lineToRelative(0.004f, 0.064f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.868f, 1.497f)
                lineToRelative(-0.06f, 0.091f)
                lineToRelative(-8f, 11f)
                curveToRelative(-0.568f, 0.783f, -1.808f, 0.38f, -1.808f, -0.588f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.868f, -1.497f)
                lineToRelative(0.06f, -0.091f)
                lineToRelative(8f, -11f)
                lineToRelative(0.01f, -0.013f)
                lineToRelative(0.018f, -0.024f)
                lineToRelative(0.033f, -0.038f)
                lineToRelative(0.018f, -0.022f)
                lineToRelative(0.009f, -0.008f)
                lineToRelative(0.013f, -0.014f)
                lineToRelative(0.04f, -0.036f)
                lineToRelative(0.028f, -0.026f)
                lineToRelative(0.008f, -0.006f)
                arcToRelative(1f, 1f, 0f, false, true, 0.402f, -0.199f)
                lineToRelative(0.011f, -0.001f)
                lineToRelative(0.027f, -0.005f)
                lineToRelative(0.074f, -0.013f)
                lineToRelative(0.011f, -0.001f)
                lineToRelative(0.041f, -0.002f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

