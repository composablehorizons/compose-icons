package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.32f, 2.577f)
                arcToRelative(49.255f, 49.255f, 0f, false, true, 11.36f, 0f)
                curveToRelative(1.497f, 0.174f, 2.57f, 1.46f, 2.57f, 2.93f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.085f, 0.67f)
                lineTo(12f, 18.089f)
                lineToRelative(-7.165f, 3.583f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3.75f, 21f)
                verticalLineTo(5.507f)
                curveToRelative(0f, -1.47f, 1.073f, -2.756f, 2.57f, -2.93f)
                close()
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

