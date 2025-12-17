package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                curveToRelative(0f, -0.26f, 0.017f, -0.517f, 0.049f, -0.77f)
                lineToRelative(7.722f, 7.723f)
                arcToRelative(33.56f, 33.56f, 0f, false, true, -3.722f, -0.01f)
                arcToRelative(2f, 2f, 0f, false, false, 3.862f, 0.15f)
                lineToRelative(1.134f, 1.134f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.53f, -1.409f)
                arcToRelative(32.91f, 32.91f, 0f, false, true, -3.257f, -0.508f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.515f, -1.076f)
                arcTo(11.448f, 11.448f, 0f, false, false, 4f, 8f)
                close()
                moveTo(17.266f, 13.9f)
                arcToRelative(0.756f, 0.756f, 0f, false, true, -0.068f, 0.116f)
                lineTo(6.389f, 3.207f)
                arcTo(6f, 6f, 0f, false, true, 16f, 8f)
                curveToRelative(0.001f, 1.887f, 0.455f, 3.665f, 1.258f, 5.234f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.01f, 0.666f)
                close()
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(14.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

