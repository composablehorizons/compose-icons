package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Photo_album: ImageVector
    get() {
        if (_Photo_album != null) return _Photo_album!!
        
        _Photo_album = ImageVector.Builder(
            name = "photo_album",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -160f)
                horizontalLineToRelative(400f)
                lineTo(545f, 540f)
                lineTo(440f, 680f)
                lineToRelative(-65f, -87f)
                lineToRelative(-95f, 127f)
                close()
                moveToRelative(160f, -280f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(440f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

