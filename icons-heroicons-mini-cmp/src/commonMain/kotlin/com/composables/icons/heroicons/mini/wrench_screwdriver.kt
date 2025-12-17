package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.WrenchScrewdriver: ImageVector
    get() {
        if (_WrenchScrewdriver != null) return _WrenchScrewdriver!!
        
        _WrenchScrewdriver = ImageVector.Builder(
            name = "wrench-screwdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 10f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 4.284f, -5.882f)
                curveToRelative(-0.105f, -0.324f, -0.51f, -0.391f, -0.752f, -0.15f)
                lineTo(15.34f, 6.66f)
                arcToRelative(0.454f, 0.454f, 0f, false, true, -0.493f, 0.11f)
                arcToRelative(3.01f, 3.01f, 0f, false, true, -1.618f, -1.616f)
                arcToRelative(0.455f, 0.455f, 0f, false, true, 0.11f, -0.494f)
                lineToRelative(2.694f, -2.692f)
                curveToRelative(0.24f, -0.241f, 0.174f, -0.647f, -0.15f, -0.752f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -5.873f, 4.575f)
                curveToRelative(0.055f, 0.873f, -0.128f, 1.808f, -0.8f, 2.368f)
                lineToRelative(-7.23f, 6.024f)
                arcToRelative(2.724f, 2.724f, 0f, true, false, 3.837f, 3.837f)
                lineToRelative(6.024f, -7.23f)
                curveToRelative(0.56f, -0.672f, 1.495f, -0.855f, 2.368f, -0.8f)
                curveToRelative(0.096f, 0.007f, 0.193f, 0.01f, 0.291f, 0.01f)
                close()
                moveTo(5f, 16f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 11.5f)
                curveToRelative(0.173f, 0f, 0.345f, -0.007f, 0.514f, -0.022f)
                lineToRelative(3.754f, 3.754f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.536f, 3.536f)
                lineToRelative(-4.41f, -4.41f)
                lineToRelative(2.172f, -2.607f)
                curveToRelative(0.052f, -0.063f, 0.147f, -0.138f, 0.342f, -0.196f)
                curveToRelative(0.202f, -0.06f, 0.469f, -0.087f, 0.777f, -0.067f)
                curveToRelative(0.128f, 0.008f, 0.257f, 0.012f, 0.387f, 0.012f)
                close()
                moveTo(6f, 4.586f)
                lineToRelative(2.33f, 2.33f)
                arcToRelative(0.452f, 0.452f, 0f, false, true, -0.08f, 0.09f)
                lineTo(6.8f, 8.214f)
                lineTo(4.586f, 6f)
                horizontalLineTo(3.309f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.447f, -0.276f)
                lineToRelative(-1.7f, -3.402f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.093f, -0.577f)
                lineToRelative(0.49f, -0.49f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.577f, -0.094f)
                lineToRelative(3.402f, 1.7f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 3.31f)
                verticalLineToRelative(1.277f)
                close()
            }
        }.build()
        
        return _WrenchScrewdriver!!
    }

private var _WrenchScrewdriver: ImageVector? = null

