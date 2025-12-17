package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Videogame_asset: ImageVector
    get() {
        if (_Videogame_asset != null) return _Videogame_asset!!
        
        _Videogame_asset = ImageVector.Builder(
            name = "videogame_asset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(300f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 600f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 480f)
                close()
            }
        }.build()
        
        return _Videogame_asset!!
    }

private var _Videogame_asset: ImageVector? = null

