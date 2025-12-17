package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowPathRoundedSquare: ImageVector
    get() {
        if (_ArrowPathRoundedSquare != null) return _ArrowPathRoundedSquare!!
        
        _ArrowPathRoundedSquare = ImageVector.Builder(
            name = "arrow-path-rounded-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 4.5f)
                curveToRelative(1.215f, 0f, 2.417f, 0.055f, 3.604f, 0.162f)
                arcToRelative(0.68f, 0.68f, 0f, false, true, 0.615f, 0.597f)
                curveToRelative(0.124f, 1.038f, 0.208f, 2.088f, 0.25f, 3.15f)
                lineToRelative(-1.689f, -1.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.061f)
                lineToRelative(2.999f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3.001f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.748f, 1.747f)
                arcToRelative(41.31f, 41.31f, 0f, false, false, -0.264f, -3.386f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, -1.97f, -1.913f)
                arcToRelative(41.512f, 41.512f, 0f, false, false, -7.477f, 0f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, -1.969f, 1.913f)
                arcToRelative(41.16f, 41.16f, 0f, false, false, -0.16f, 1.61f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.495f, 0.12f)
                curveToRelative(0.041f, -0.52f, 0.093f, -1.038f, 0.154f, -1.552f)
                arcToRelative(0.68f, 0.68f, 0f, false, true, 0.615f, -0.597f)
                arcTo(40.012f, 40.012f, 0f, false, true, 10f, 4.5f)
                close()
                moveTo(5.281f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-3.001f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.748f, -1.747f)
                curveToRelative(0.042f, 1.141f, 0.13f, 2.27f, 0.264f, 3.386f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, 1.97f, 1.913f)
                arcToRelative(41.533f, 41.533f, 0f, false, false, 7.477f, 0f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, 1.969f, -1.913f)
                curveToRelative(0.064f, -0.534f, 0.117f, -1.071f, 0.16f, -1.61f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.495f, -0.12f)
                curveToRelative(-0.041f, 0.52f, -0.093f, 1.037f, -0.154f, 1.552f)
                arcToRelative(0.68f, 0.68f, 0f, false, true, -0.615f, 0.597f)
                arcToRelative(40.013f, 40.013f, 0f, false, true, -7.208f, 0f)
                arcToRelative(0.68f, 0.68f, 0f, false, true, -0.615f, -0.597f)
                arcToRelative(39.785f, 39.785f, 0f, false, true, -0.25f, -3.15f)
                lineToRelative(1.689f, 1.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.061f)
                lineToRelative(-2.999f, -3f)
                close()
            }
        }.build()
        
        return _ArrowPathRoundedSquare!!
    }

private var _ArrowPathRoundedSquare: ImageVector? = null

