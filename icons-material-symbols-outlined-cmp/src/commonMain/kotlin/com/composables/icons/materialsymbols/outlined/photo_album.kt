package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Photo_album: ImageVector
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
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                lineToRelative(-100f, -60f)
                lineToRelative(-100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(400f)
                lineTo(545f, 540f)
                lineTo(440f, 680f)
                lineToRelative(-65f, -87f)
                lineToRelative(-95f, 127f)
                close()
                moveToRelative(-40f, 80f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(200f, -360f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                lineToRelative(-100f, -60f)
                lineToRelative(-100f, 60f)
                close()
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

