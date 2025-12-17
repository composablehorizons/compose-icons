package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Open_in_phone: ImageVector
    get() {
        if (_Open_in_phone != null) return _Open_in_phone!!
        
        _Open_in_phone = ImageVector.Builder(
            name = "open_in_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -280f)
                lineToRelative(-56f, -56f)
                lineToRelative(62f, -64f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(326f)
                lineToRelative(-62f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Open_in_phone!!
    }

private var _Open_in_phone: ImageVector? = null

