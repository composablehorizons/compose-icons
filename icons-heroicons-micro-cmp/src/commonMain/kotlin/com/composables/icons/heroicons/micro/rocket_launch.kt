package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.RocketLaunch: ImageVector
    get() {
        if (_RocketLaunch != null) return _RocketLaunch!!
        
        _RocketLaunch = ImageVector.Builder(
            name = "rocket-launch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.333f, 4.478f)
                arcTo(4f, 4f, 0f, false, false, 1f, 8.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.322f)
                curveToRelative(0.572f, 0.71f, 1.219f, 1.356f, 1.928f, 1.928f)
                verticalLineToRelative(3.322f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                arcToRelative(4f, 4f, 0f, false, false, 3.772f, -5.333f)
                arcTo(10.721f, 10.721f, 0f, false, false, 15f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                curveToRelative(-3.133f, 0f, -5.953f, 1.34f, -7.917f, 3.478f)
                close()
                moveTo(12f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.902f, 10.682f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.313f, -0.725f)
                arcToRelative(4.764f, 4.764f, 0f, false, false, -0.469f, 3.36f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.564f, 0.563f)
                arcToRelative(4.76f, 4.76f, 0f, false, false, 3.359f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.725f, -1.312f)
                arcToRelative(3.231f, 3.231f, 0f, false, true, -1.81f, 0.393f)
                arcToRelative(3.232f, 3.232f, 0f, false, true, 0.394f, -1.81f)
                close()
            }
        }.build()
        
        return _RocketLaunch!!
    }

private var _RocketLaunch: ImageVector? = null

