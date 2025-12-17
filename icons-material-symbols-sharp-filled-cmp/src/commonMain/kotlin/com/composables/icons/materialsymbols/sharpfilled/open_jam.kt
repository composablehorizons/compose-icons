package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Open_jam: ImageVector
    get() {
        if (_Open_jam != null) return _Open_jam!!
        
        _Open_jam = ImageVector.Builder(
            name = "open_jam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-288f)
                lineToRelative(64f, 64f)
                lineToRelative(56f, -56f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(56f, 56f)
                lineToRelative(64f, -64f)
                verticalLineToRelative(168f)
                horizontalLineTo(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(520f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Open_jam!!
    }

private var _Open_jam: ImageVector? = null

