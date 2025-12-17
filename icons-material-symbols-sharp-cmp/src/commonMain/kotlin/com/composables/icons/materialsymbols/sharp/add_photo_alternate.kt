package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_photo_alternate: ImageVector
    get() {
        if (_Add_photo_alternate != null) return _Add_photo_alternate!!
        
        _Add_photo_alternate = ImageVector.Builder(
            name = "add_photo_alternate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, -480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 680f)
                horizontalLineToRelative(480f)
                lineTo(570f, 480f)
                lineTo(450f, 640f)
                lineToRelative(-90f, -120f)
                lineToRelative(-120f, 160f)
                close()
                moveToRelative(-40f, -240f)
                verticalLineToRelative(320f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Add_photo_alternate!!
    }

private var _Add_photo_alternate: ImageVector? = null

