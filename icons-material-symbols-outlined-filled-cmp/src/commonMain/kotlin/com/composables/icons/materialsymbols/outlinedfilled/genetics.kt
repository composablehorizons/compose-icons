package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Genetics: ImageVector
    get() {
        if (_Genetics != null) return _Genetics!!
        
        _Genetics = ImageVector.Builder(
            name = "genetics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -139f, 58f, -225.5f)
                reflectiveQuadTo(418f, 480f)
                quadToRelative(-102f, -88f, -160f, -174.5f)
                reflectiveQuadTo(200f, 80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 11f, 0.5f, 20.5f)
                reflectiveQuadTo(282f, 120f)
                horizontalLineToRelative(396f)
                quadToRelative(1f, -10f, 1.5f, -19.5f)
                reflectiveQuadToRelative(0.5f, -20.5f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 139f, -58f, 225.5f)
                reflectiveQuadTo(542f, 480f)
                quadToRelative(102f, 88f, 160f, 174.5f)
                reflectiveQuadTo(760f, 880f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -11f, -0.5f, -20.5f)
                reflectiveQuadTo(678f, 840f)
                horizontalLineTo(282f)
                quadToRelative(-1f, 10f, -1.5f, 19.5f)
                reflectiveQuadTo(280f, 880f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(138f, -640f)
                horizontalLineToRelative(284f)
                quadToRelative(13f, -19f, 22.5f, -38f)
                reflectiveQuadToRelative(17.5f, -42f)
                horizontalLineTo(298f)
                quadToRelative(8f, 22f, 17.5f, 41.5f)
                reflectiveQuadTo(338f, 280f)
                close()
                moveToRelative(142f, 148f)
                quadToRelative(20f, -17f, 39f, -34f)
                reflectiveQuadToRelative(36f, -34f)
                horizontalLineTo(405f)
                quadToRelative(17f, 17f, 36f, 34f)
                reflectiveQuadToRelative(39f, 34f)
                close()
                moveToRelative(-75f, 172f)
                horizontalLineToRelative(150f)
                quadToRelative(-17f, -17f, -36f, -34f)
                reflectiveQuadToRelative(-39f, -34f)
                quadToRelative(-20f, 17f, -39f, 34f)
                reflectiveQuadToRelative(-36f, 34f)
                close()
                moveTo(298f, 760f)
                horizontalLineToRelative(364f)
                quadToRelative(-8f, -22f, -17.5f, -41.5f)
                reflectiveQuadTo(622f, 680f)
                horizontalLineTo(338f)
                quadToRelative(-13f, 19f, -22.5f, 38f)
                reflectiveQuadTo(298f, 760f)
                close()
            }
        }.build()
        
        return _Genetics!!
    }

private var _Genetics: ImageVector? = null

