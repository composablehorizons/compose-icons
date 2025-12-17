package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airplay: ImageVector
    get() {
        if (_Airplay != null) return _Airplay!!
        
        _Airplay = ImageVector.Builder(
            name = "airplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 760f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                close()
                moveToRelative(232f, 160f)
                quadToRelative(-14f, 0f, -22f, -9.5f)
                reflectiveQuadToRelative(-8f, -20.5f)
                quadToRelative(0f, -5f, 2f, -10.5f)
                reflectiveQuadToRelative(7f, -10.5f)
                lineToRelative(161f, -161f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(161f, 161f)
                quadToRelative(5f, 5f, 7f, 10.5f)
                reflectiveQuadToRelative(2f, 10.5f)
                quadToRelative(0f, 11f, -8f, 20.5f)
                reflectiveQuadToRelative(-22f, 9.5f)
                horizontalLineTo(312f)
                close()
                moveToRelative(168f, -360f)
                close()
            }
        }.build()
        
        return _Airplay!!
    }

private var _Airplay: ImageVector? = null

