package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Gallery_thumbnail: ImageVector
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
                moveTo(160f, 600f)
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
            }
        }.build()
        
        return _Gallery_thumbnail!!
    }

private var _Gallery_thumbnail: ImageVector? = null

