package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Gallery_thumbnail: ImageVector
    get() {
        if (_Gallery_thumbnail != null) return _Gallery_thumbnail!!
        
        _Gallery_thumbnail = ImageVector.Builder(
            name = "gallery_thumbnail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(640f, -320f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 680f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(120f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(320f)
                lineTo(375f, 460f)
                lineToRelative(-75f, 100f)
                lineToRelative(-55f, -73f)
                lineToRelative(-85f, 113f)
                close()
                moveToRelative(520f, 160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(640f, -320f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 320f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Gallery_thumbnail!!
    }

private var _Gallery_thumbnail: ImageVector? = null

