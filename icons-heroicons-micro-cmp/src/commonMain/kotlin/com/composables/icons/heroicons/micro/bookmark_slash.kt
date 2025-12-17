package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BookmarkSlash: ImageVector
    get() {
        if (_BookmarkSlash != null) return _BookmarkSlash!!
        
        _BookmarkSlash = ImageVector.Builder(
            name = "bookmark-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2.75f)
                verticalLineToRelative(7.775f)
                lineTo(4.475f, 2f)
                horizontalLineToRelative(7.775f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                close()
                moveTo(3f, 13.25f)
                verticalLineTo(5.475f)
                lineToRelative(4.793f, 4.793f)
                lineTo(4.28f, 13.78f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 13.25f)
                close()
                moveTo(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _BookmarkSlash!!
    }

private var _BookmarkSlash: ImageVector? = null

