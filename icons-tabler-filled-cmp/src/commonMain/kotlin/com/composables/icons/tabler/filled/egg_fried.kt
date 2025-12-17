package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EggFried: ImageVector
    get() {
        if (_EggFried != null) return _EggFried!!
        
        _EggFried = ImageVector.Builder(
            name = "egg-fried",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.001f, 1.996f)
                quadToRelative(0.06f, 0f, 0.117f, 0.007f)
                lineToRelative(0.155f, 0.003f)
                arcToRelative(6f, 6f, 0f, false, true, 4.25f, 2.05f)
                lineToRelative(0.176f, 0.21f)
                arcToRelative(6f, 6f, 0f, false, true, 1.296f, 4.014f)
                lineToRelative(-0.018f, 0.244f)
                lineToRelative(0.106f, 0.06f)
                arcToRelative(4f, 4f, 0f, false, true, 1.904f, 3.087f)
                lineToRelative(0.011f, 0.204f)
                arcToRelative(4f, 4f, 0f, false, true, -1.392f, 3.161f)
                lineToRelative(-0.085f, 0.069f)
                lineToRelative(0.083f, 0.16f)
                arcToRelative(4f, 4f, 0f, false, true, 0.239f, 2.848f)
                lineToRelative(-0.065f, 0.204f)
                arcToRelative(4f, 4f, 0f, false, true, -6.257f, 1.824f)
                lineToRelative(-0.115f, -0.096f)
                lineToRelative(-0.092f, 0.1f)
                arcToRelative(6f, 6f, 0f, false, true, -4.022f, 1.787f)
                lineToRelative(-0.257f, 0.006f)
                arcToRelative(6f, 6f, 0f, false, true, -5.644f, -8.04f)
                lineToRelative(0.034f, -0.089f)
                lineToRelative(-0.155f, -0.12f)
                arcToRelative(6f, 6f, 0f, false, true, -1.662f, -7.256f)
                lineToRelative(0.105f, -0.211f)
                arcToRelative(6f, 6f, 0f, false, true, 7.246f, -2.894f)
                lineToRelative(0.188f, 0.068f)
                lineToRelative(0.073f, -0.06f)
                arcToRelative(6f, 6f, 0f, false, true, 3.505f, -1.334f)
                close()
                moveToRelative(-2.001f, 7.004f)
                arcToRelative(3f, 3f, 0f, false, false, -2.996f, 2.85f)
                lineToRelative(-0.004f, 0.15f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, -3f)
            }
        }.build()
        
        return _EggFried!!
    }

private var _EggFried: ImageVector? = null

