package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(716f, 680f)
                lineToRelative(44f, -103f)
                verticalLineToRelative(-217f)
                horizontalLineTo(532f)
                lineToRelative(13f, -88f)
                lineToRelative(-49f, -48f)
                lineToRelative(144f, -144f)
                lineToRelative(60f, 60f)
                lineToRelative(-20f, 140f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineTo(800f, 680f)
                horizontalLineToRelative(-84f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-400f)
                lineToRelative(200f, -200f)
                lineToRelative(60f, 60f)
                lineToRelative(-20f, 140f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineTo(560f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

