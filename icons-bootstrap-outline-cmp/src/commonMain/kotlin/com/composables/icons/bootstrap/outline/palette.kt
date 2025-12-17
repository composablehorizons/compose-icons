package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(4f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveTo(5.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(0.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                curveToRelative(0f, 3.15f, -1.866f, 2.585f, -3.567f, 2.07f)
                curveTo(11.42f, 9.763f, 10.465f, 9.473f, 10f, 10f)
                curveToRelative(-0.603f, 0.683f, -0.475f, 1.819f, -0.351f, 2.92f)
                curveTo(9.826f, 14.495f, 9.996f, 16f, 8f, 16f)
                arcToRelative(8f, 8f, 0f, true, true, 8f, -8f)
                moveToRelative(-8f, 7f)
                curveToRelative(0.611f, 0f, 0.654f, -0.171f, 0.655f, -0.176f)
                curveToRelative(0.078f, -0.146f, 0.124f, -0.464f, 0.07f, -1.119f)
                curveToRelative(-0.014f, -0.168f, -0.037f, -0.37f, -0.061f, -0.591f)
                curveToRelative(-0.052f, -0.464f, -0.112f, -1.005f, -0.118f, -1.462f)
                curveToRelative(-0.01f, -0.707f, 0.083f, -1.61f, 0.704f, -2.314f)
                curveToRelative(0.369f, -0.417f, 0.845f, -0.578f, 1.272f, -0.618f)
                curveToRelative(0.404f, -0.038f, 0.812f, 0.026f, 1.16f, 0.104f)
                curveToRelative(0.343f, 0.077f, 0.702f, 0.186f, 1.025f, 0.284f)
                lineToRelative(0.028f, 0.008f)
                curveToRelative(0.346f, 0.105f, 0.658f, 0.199f, 0.953f, 0.266f)
                curveToRelative(0.653f, 0.148f, 0.904f, 0.083f, 0.991f, 0.024f)
                curveTo(14.717f, 9.38f, 15f, 9.161f, 15f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, -7f, 7f)
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null

