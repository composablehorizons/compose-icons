package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Videogame_asset_off: ImageVector
    get() {
        if (_Videogame_asset_off != null) return _Videogame_asset_off!!
        
        _Videogame_asset_off = ImageVector.Builder(
            name = "videogame_asset_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 480f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 420f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 480f)
                close()
                moveToRelative(-334f, 0f)
                close()
                moveTo(80f, 720f)
                verticalLineToRelative(-481f)
                horizontalLineToRelative(159f)
                lineToRelative(81f, 81f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(366f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-185f, -185f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -120f)
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
                moveToRelative(600f, 115f)
                horizontalLineToRelative(-51f)
                lineToRelative(-29f, -29f)
                verticalLineToRelative(-366f)
                horizontalLineTo(434f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(526f)
                verticalLineToRelative(475f)
                close()
                moveTo(617f, 503f)
                close()
            }
        }.build()
        
        return _Videogame_asset_off!!
    }

private var _Videogame_asset_off: ImageVector? = null

