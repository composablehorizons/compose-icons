package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wallpaper_slideshow: ImageVector
    get() {
        if (_Wallpaper_slideshow != null) return _Wallpaper_slideshow!!
        
        _Wallpaper_slideshow = ImageVector.Builder(
            name = "wallpaper_slideshow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveTo(360f, 560f)
                lineToRelative(108f, -140f)
                lineToRelative(62f, 80f)
                lineToRelative(92f, -120f)
                lineToRelative(138f, 180f)
                horizontalLineTo(360f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -505f)
                verticalLineToRelative(-295f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(215f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 345f)
                verticalLineToRelative(-265f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(185f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-185f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(265f)
                horizontalLineTo(600f)
                close()
                moveToRelative(200f, -345f)
                verticalLineToRelative(-215f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(295f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Wallpaper_slideshow!!
    }

private var _Wallpaper_slideshow: ImageVector? = null

