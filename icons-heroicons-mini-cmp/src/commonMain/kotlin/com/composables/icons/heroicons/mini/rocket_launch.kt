package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.RocketLaunch: ImageVector
    get() {
        if (_RocketLaunch != null) return _RocketLaunch!!
        
        _RocketLaunch = ImageVector.Builder(
            name = "rocket-launch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.606f, 12.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.134f, 1.051f)
                arcToRelative(2.494f, 2.494f, 0f, false, false, -0.93f, 2.437f)
                arcToRelative(2.494f, 2.494f, 0f, false, false, 2.437f, -0.93f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.186f, 0.918f)
                arcToRelative(3.995f, 3.995f, 0f, false, true, -4.482f, 1.332f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.461f, -0.461f)
                arcToRelative(3.994f, 3.994f, 0f, false, true, 1.332f, -4.482f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.052f, 0.134f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.752f, 12f)
                arcTo(13.07f, 13.07f, 0f, false, false, 8f, 14.248f)
                verticalLineToRelative(4.002f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                arcToRelative(5f, 5f, 0f, false, false, 4.797f, -6.414f)
                arcToRelative(12.984f, 12.984f, 0f, false, false, 5.45f, -10.848f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.735f, -0.735f)
                arcToRelative(12.984f, 12.984f, 0f, false, false, -10.849f, 5.45f)
                arcTo(5f, 5f, 0f, false, false, 1f, 11.25f)
                curveToRelative(0.001f, 0.414f, 0.337f, 0.75f, 0.751f, 0.75f)
                horizontalLineToRelative(4.002f)
                close()
                moveTo(13f, 9f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                close()
            }
        }.build()
        
        return _RocketLaunch!!
    }

private var _RocketLaunch: ImageVector? = null

