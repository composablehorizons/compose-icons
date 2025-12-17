package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unpaved_road: ImageVector
    get() {
        if (_Unpaved_road != null) return _Unpaved_road!!
        
        _Unpaved_road = ImageVector.Builder(
            name = "unpaved_road",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 760f)
                quadToRelative(-25f, 0f, -42.5f, -2.5f)
                reflectiveQuadTo(360f, 740f)
                quadToRelative(0f, -17f, 17.5f, -28.5f)
                reflectiveQuadTo(420f, 700f)
                quadToRelative(25f, 0f, 42.5f, 11.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(0f, 15f, -17.5f, 17.5f)
                reflectiveQuadTo(420f, 760f)
                close()
                moveToRelative(320f, 80f)
                quadToRelative(-25f, 0f, -42.5f, -2.5f)
                reflectiveQuadTo(680f, 820f)
                quadToRelative(0f, -17f, 17.5f, -28.5f)
                reflectiveQuadTo(740f, 780f)
                quadToRelative(25f, 0f, 42.5f, 11.5f)
                reflectiveQuadTo(800f, 820f)
                quadToRelative(0f, 15f, -17.5f, 17.5f)
                reflectiveQuadTo(740f, 840f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -2.5f)
                reflectiveQuadTo(480f, 820f)
                quadToRelative(0f, -17f, 17.5f, -28.5f)
                reflectiveQuadTo(540f, 780f)
                quadToRelative(25f, 0f, 42.5f, 11.5f)
                reflectiveQuadTo(600f, 820f)
                quadToRelative(0f, 15f, -17.5f, 17.5f)
                reflectiveQuadTo(540f, 840f)
                close()
                moveToRelative(-320f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -2.5f)
                reflectiveQuadTo(160f, 820f)
                quadToRelative(0f, -17f, 17.5f, -28.5f)
                reflectiveQuadTo(220f, 780f)
                quadToRelative(25f, 0f, 42.5f, 11.5f)
                reflectiveQuadTo(280f, 820f)
                quadToRelative(0f, 15f, -17.5f, 17.5f)
                reflectiveQuadTo(220f, 840f)
                close()
                moveToRelative(160f, 40f)
                quadToRelative(-25f, 0f, -42.5f, -2.5f)
                reflectiveQuadTo(320f, 860f)
                quadToRelative(0f, -17f, 17.5f, -28.5f)
                reflectiveQuadTo(380f, 820f)
                quadToRelative(25f, 0f, 42.5f, 11.5f)
                reflectiveQuadTo(440f, 860f)
                quadToRelative(0f, 15f, -17.5f, 17.5f)
                reflectiveQuadTo(380f, 880f)
                close()
                moveTo(240f, 640f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(524f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-8f, -360f)
                horizontalLineToRelative(496f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 520f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 520f)
                close()
            }
        }.build()
        
        return _Unpaved_road!!
    }

private var _Unpaved_road: ImageVector? = null

