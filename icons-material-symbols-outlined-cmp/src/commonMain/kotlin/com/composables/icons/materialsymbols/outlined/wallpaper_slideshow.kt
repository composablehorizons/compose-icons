package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wallpaper_slideshow: ImageVector
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
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -505f)
                verticalLineToRelative(-215f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(215f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 345f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-185f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(185f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-185f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(185f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(600f)
                close()
                moveToRelative(200f, -345f)
                verticalLineToRelative(-215f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(215f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Wallpaper_slideshow!!
    }

private var _Wallpaper_slideshow: ImageVector? = null

