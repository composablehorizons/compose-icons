package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 8f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.362f, -4.476f)
                curveToRelative(-0.094f, -0.325f, -0.497f, -0.39f, -0.736f, -0.15f)
                lineTo(12.099f, 5.4f)
                arcToRelative(0.48f, 0.48f, 0f, false, true, -0.653f, 0.033f)
                arcToRelative(8.554f, 8.554f, 0f, false, true, -0.879f, -0.879f)
                arcToRelative(0.48f, 0.48f, 0f, false, true, 0.033f, -0.653f)
                lineToRelative(2.027f, -2.028f)
                curveToRelative(0.24f, -0.239f, 0.175f, -0.642f, -0.15f, -0.736f)
                arcToRelative(3.502f, 3.502f, 0f, false, false, -4.476f, 3.427f)
                curveToRelative(0.018f, 0.99f, -0.133f, 2.093f, -0.914f, 2.7f)
                lineToRelative(-5.31f, 4.13f)
                arcToRelative(2.015f, 2.015f, 0f, true, false, 2.828f, 2.827f)
                lineToRelative(4.13f, -5.309f)
                curveToRelative(0.607f, -0.78f, 1.71f, -0.932f, 2.7f, -0.914f)
                lineTo(11.5f, 8f)
                close()
                moveTo(3f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

