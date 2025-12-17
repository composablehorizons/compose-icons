package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Monorail: ImageVector
    get() {
        if (_Monorail != null) return _Monorail!!
        
        _Monorail = ImageVector.Builder(
            name = "monorail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(40f, -800f)
                horizontalLineToRelative(320f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(-60f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                close()
                moveToRelative(-80f, 400f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 680f)
                horizontalLineToRelative(25f)
                quadToRelative(16f, -53f, 58.5f, -86.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(54f, 0f, 96.5f, 33.5f)
                reflectiveQuadTo(635f, 680f)
                horizontalLineToRelative(25f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 620f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-22f, 0f, -40f, 10.5f)
                reflectiveQuadTo(251f, 200f)
                horizontalLineToRelative(458f)
                quadToRelative(-11f, -19f, -29f, -29.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, 40f)
                horizontalLineToRelative(389f)
                horizontalLineToRelative(-458f)
                horizontalLineToRelative(69f)
                close()
                moveToRelative(-80f, 280f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Monorail!!
    }

private var _Monorail: ImageVector? = null

