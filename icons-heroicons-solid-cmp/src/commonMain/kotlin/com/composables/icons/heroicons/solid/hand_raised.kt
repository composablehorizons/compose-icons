package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.HandRaised: ImageVector
    get() {
        if (_HandRaised != null) return _HandRaised!!
        
        _HandRaised = ImageVector.Builder(
            name = "hand-raised",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1.875f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 2.25f, 0f)
                verticalLineToRelative(8.219f)
                curveToRelative(0.517f, 0.162f, 1.02f, 0.382f, 1.5f, 0.659f)
                verticalLineTo(3.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 2.25f, 0f)
                verticalLineToRelative(10.937f)
                arcToRelative(4.505f, 4.505f, 0f, false, false, -3.25f, 2.373f)
                arcToRelative(8.963f, 8.963f, 0f, false, true, 4f, -0.935f)
                arcTo(0.75f, 0.75f, 0f, false, false, 18f, 15f)
                verticalLineToRelative(-2.266f)
                arcToRelative(3.368f, 3.368f, 0f, false, true, 0.988f, -2.37f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.591f, 1.59f)
                arcToRelative(1.118f, 1.118f, 0f, false, false, -0.329f, 0.79f)
                verticalLineToRelative(3.006f)
                horizontalLineToRelative(-0.005f)
                arcToRelative(6f, 6f, 0f, false, true, -1.752f, 4.007f)
                lineToRelative(-1.736f, 1.736f)
                arcToRelative(6f, 6f, 0f, false, true, -4.242f, 1.757f)
                horizontalLineTo(10.5f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, -7.5f, -7.5f)
                verticalLineTo(6.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 2.25f, 0f)
                verticalLineToRelative(5.519f)
                curveToRelative(0.46f, -0.452f, 0.965f, -0.832f, 1.5f, -1.141f)
                verticalLineTo(3.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 2.25f, 0f)
                verticalLineToRelative(6.526f)
                curveToRelative(0.495f, -0.1f, 0.997f, -0.151f, 1.5f, -0.151f)
                verticalLineTo(1.875f)
                close()
            }
        }.build()
        
        return _HandRaised!!
    }

private var _HandRaised: ImageVector? = null

