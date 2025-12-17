package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_celebrate: ImageVector
    get() {
        if (_Person_celebrate != null) return _Person_celebrate!!
        
        _Person_celebrate = ImageVector.Builder(
            name = "person_celebrate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                verticalLineToRelative(-200f)
                quadToRelative(-62f, -5f, -121.5f, -14f)
                reflectiveQuadTo(120f, 600f)
                lineToRelative(20f, -80f)
                quadToRelative(83f, 23f, 168f, 31.5f)
                reflectiveQuadToRelative(172f, 8.5f)
                quadToRelative(86f, 0f, 171f, -8.5f)
                reflectiveQuadTo(820f, 520f)
                lineToRelative(20f, 80f)
                quadToRelative(-60f, 17f, -119.5f, 26f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(200f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -320f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, 34f, -23.5f, 57f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(180f, 400f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 340f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(180f, 400f)
                close()
                moveToRelative(600f, 0f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 340f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(780f, 400f)
                close()
                moveTo(290f, 250f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(350f, 190f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(290f, 250f)
                close()
                moveToRelative(380f, 0f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(730f, 190f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(670f, 250f)
                close()
                moveToRelative(-190f, -50f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Person_celebrate!!
    }

private var _Person_celebrate: ImageVector? = null

