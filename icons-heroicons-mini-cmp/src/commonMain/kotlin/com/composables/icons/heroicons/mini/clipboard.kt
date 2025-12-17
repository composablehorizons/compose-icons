package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.887f, 3.182f)
                curveToRelative(0.396f, 0.037f, 0.79f, 0.08f, 1.183f, 0.128f)
                curveTo(16.194f, 3.45f, 17f, 4.414f, 17f, 5.517f)
                verticalLineTo(16.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 14.75f, 19f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 16.75f)
                verticalLineTo(5.517f)
                curveToRelative(0f, -1.103f, 0.806f, -2.068f, 1.93f, -2.207f)
                curveToRelative(0.393f, -0.048f, 0.787f, -0.09f, 1.183f, -0.128f)
                arcTo(3.001f, 3.001f, 0f, false, true, 9f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.373f, 0f, 2.531f, 0.923f, 2.887f, 2.182f)
                close()
                moveTo(7.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 2.5f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 4f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

