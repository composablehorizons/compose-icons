package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wallpaper: ImageVector
    get() {
        if (_Wallpaper != null) return _Wallpaper!!
        
        _Wallpaper = ImageVector.Builder(
            name = "wallpaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveTo(240f, 680f)
                lineToRelative(120f, -160f)
                lineToRelative(90f, 120f)
                lineToRelative(120f, -160f)
                lineToRelative(150f, 200f)
                horizontalLineTo(240f)
                close()
                moveTo(120f, 440f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-140f, -40f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
            }
        }.build()
        
        return _Wallpaper!!
    }

private var _Wallpaper: ImageVector? = null

