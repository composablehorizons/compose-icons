package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BookmarkSlash: ImageVector
    get() {
        if (_BookmarkSlash != null) return _BookmarkSlash!!
        
        _BookmarkSlash = ImageVector.Builder(
            name = "bookmark-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 4.517f)
                verticalLineToRelative(9.301f)
                lineTo(5.433f, 2.252f)
                arcToRelative(41.44f, 41.44f, 0f, false, true, 9.637f, 0.058f)
                curveTo(16.194f, 2.45f, 17f, 3.414f, 17f, 4.517f)
                close()
                moveTo(3f, 17.25f)
                verticalLineTo(6.182f)
                lineToRelative(10.654f, 10.654f)
                lineTo(10f, 15.082f)
                lineToRelative(-5.925f, 2.844f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 17.25f)
                close()
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(14.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
            }
        }.build()
        
        return _BookmarkSlash!!
    }

private var _BookmarkSlash: ImageVector? = null

