package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Add_to_home_screen: ImageVector
    get() {
        if (_Add_to_home_screen != null) return _Add_to_home_screen!!
        
        _Add_to_home_screen = ImageVector.Builder(
            name = "add_to_home_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-64f, -240f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(176f, 680f)
                close()
            }
        }.build()
        
        return _Add_to_home_screen!!
    }

private var _Add_to_home_screen: ImageVector? = null

