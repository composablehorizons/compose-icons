package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                curveToRelative(-1.716f, 0f, -3.408f, 0.106f, -5.07f, 0.31f)
                curveTo(3.806f, 2.45f, 3f, 3.414f, 3f, 4.517f)
                verticalLineTo(17.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.075f, 0.676f)
                lineTo(10f, 15.082f)
                lineToRelative(5.925f, 2.844f)
                arcTo(0.75f, 0.75f, 0f, false, false, 17f, 17.25f)
                verticalLineTo(4.517f)
                curveToRelative(0f, -1.103f, -0.806f, -2.068f, -1.93f, -2.207f)
                arcTo(41.403f, 41.403f, 0f, false, false, 10f, 2f)
                close()
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

