package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.LinkSlash: ImageVector
    get() {
        if (_LinkSlash != null) return _LinkSlash!!
        
        _LinkSlash = ImageVector.Builder(
            name = "link-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(4.46f, 4.46f)
                curveToRelative(0.128f, -0.178f, 0.272f, -0.349f, 0.432f, -0.508f)
                lineToRelative(3f, -3f)
                arcToRelative(4f, 4f, 0f, false, true, 5.657f, 5.656f)
                lineToRelative(-1.225f, 1.225f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.224f, -1.225f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -3.536f, -3.536f)
                lineToRelative(-3f, 3f)
                arcToRelative(2.504f, 2.504f, 0f, false, false, -0.406f, 0.533f)
                lineToRelative(2.59f, 2.59f)
                arcToRelative(2.49f, 2.49f, 0f, false, false, -0.79f, -1.254f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.977f, -1.138f)
                arcToRelative(3.997f, 3.997f, 0f, false, true, 1.306f, 3.886f)
                lineToRelative(4.871f, 4.87f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.061f)
                lineToRelative(-5.177f, -5.177f)
                lineToRelative(-0.006f, -0.005f)
                lineToRelative(-4.134f, -4.134f)
                arcToRelative(0.65f, 0.65f, 0f, false, true, -0.005f, -0.006f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(3.237f, 7.727f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-1.225f, 1.225f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 3.536f, 3.536f)
                lineToRelative(1.879f, -1.879f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineTo(8.83f, 16.83f)
                arcToRelative(4f, 4f, 0f, false, true, -5.657f, -5.657f)
                lineToRelative(1.224f, -1.225f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _LinkSlash!!
    }

private var _LinkSlash: ImageVector? = null

