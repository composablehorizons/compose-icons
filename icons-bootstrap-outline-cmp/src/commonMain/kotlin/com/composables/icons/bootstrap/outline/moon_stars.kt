package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MoonStars: ImageVector
    get() {
        if (_MoonStars != null) return _MoonStars!!
        
        _MoonStars = ImageVector.Builder(
            name = "moon-stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0.278f)
                arcToRelative(0.77f, 0.77f, 0f, false, true, 0.08f, 0.858f)
                arcToRelative(7.2f, 7.2f, 0f, false, false, -0.878f, 3.46f)
                curveToRelative(0f, 4.021f, 3.278f, 7.277f, 7.318f, 7.277f)
                quadToRelative(0.792f, -0.001f, 1.533f, -0.16f)
                arcToRelative(0.79f, 0.79f, 0f, false, true, 0.81f, 0.316f)
                arcToRelative(0.73f, 0.73f, 0f, false, true, -0.031f, 0.893f)
                arcTo(8.35f, 8.35f, 0f, false, true, 8.344f, 16f)
                curveTo(3.734f, 16f, 0f, 12.286f, 0f, 7.71f)
                curveTo(0f, 4.266f, 2.114f, 1.312f, 5.124f, 0.06f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 0.278f)
                moveTo(4.858f, 1.311f)
                arcTo(7.27f, 7.27f, 0f, false, false, 1.025f, 7.71f)
                curveToRelative(0f, 4.02f, 3.279f, 7.276f, 7.319f, 7.276f)
                arcToRelative(7.32f, 7.32f, 0f, false, false, 5.205f, -2.162f)
                quadToRelative(-0.506f, 0.063f, -1.029f, 0.063f)
                curveToRelative(-4.61f, 0f, -8.343f, -3.714f, -8.343f, -8.29f)
                curveToRelative(0f, -1.167f, 0.242f, -2.278f, 0.681f, -3.286f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.794f, 3.148f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0.412f, 0f)
                lineToRelative(0.387f, 1.162f)
                curveToRelative(0.173f, 0.518f, 0.579f, 0.924f, 1.097f, 1.097f)
                lineToRelative(1.162f, 0.387f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0f, 0.412f)
                lineToRelative(-1.162f, 0.387f)
                arcToRelative(1.73f, 1.73f, 0f, false, false, -1.097f, 1.097f)
                lineToRelative(-0.387f, 1.162f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, -0.412f, 0f)
                lineToRelative(-0.387f, -1.162f)
                arcTo(1.73f, 1.73f, 0f, false, false, 9.31f, 6.593f)
                lineToRelative(-1.162f, -0.387f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0f, -0.412f)
                lineToRelative(1.162f, -0.387f)
                arcToRelative(1.73f, 1.73f, 0f, false, false, 1.097f, -1.097f)
                close()
                moveTo(13.863f, 0.099f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0.274f, 0f)
                lineToRelative(0.258f, 0.774f)
                curveToRelative(0.115f, 0.346f, 0.386f, 0.617f, 0.732f, 0.732f)
                lineToRelative(0.774f, 0.258f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0f, 0.274f)
                lineToRelative(-0.774f, 0.258f)
                arcToRelative(1.16f, 1.16f, 0f, false, false, -0.732f, 0.732f)
                lineToRelative(-0.258f, 0.774f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, -0.274f, 0f)
                lineToRelative(-0.258f, -0.774f)
                arcToRelative(1.16f, 1.16f, 0f, false, false, -0.732f, -0.732f)
                lineToRelative(-0.774f, -0.258f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0f, -0.274f)
                lineToRelative(0.774f, -0.258f)
                curveToRelative(0.346f, -0.115f, 0.617f, -0.386f, 0.732f, -0.732f)
                close()
            }
        }.build()
        
        return _MoonStars!!
    }

private var _MoonStars: ImageVector? = null

