package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.LinkSlash: ImageVector
    get() {
        if (_LinkSlash != null) return _LinkSlash!!
        
        _LinkSlash = ImageVector.Builder(
            name = "link-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.999f, -3f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.806f, -3.695f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.061f)
                curveToRelative(0.374f, 0.374f, 0.569f, 0.861f, 0.584f, 1.352f)
                lineTo(7.116f, 6.055f)
                lineToRelative(1.97f, -1.97f)
                arcToRelative(2f, 2f, 0f, false, true, 3.208f, 2.3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.346f, 0.662f)
                arcToRelative(3.501f, 3.501f, 0f, false, false, -5.615f, -4.022f)
                lineToRelative(-1.97f, 1.97f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(3.705f, 9.616f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.345f, -0.663f)
                arcToRelative(3.501f, 3.501f, 0f, false, false, 5.615f, 4.022f)
                lineToRelative(0.379f, -0.379f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, -1.06f)
                lineToRelative(-0.379f, 0.378f)
                arcToRelative(2f, 2f, 0f, false, true, -3.209f, -2.298f)
                close()
            }
        }.build()
        
        return _LinkSlash!!
    }

private var _LinkSlash: ImageVector? = null

