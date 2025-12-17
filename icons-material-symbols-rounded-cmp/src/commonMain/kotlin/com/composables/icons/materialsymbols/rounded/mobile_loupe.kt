package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_loupe: ImageVector
    get() {
        if (_Mobile_loupe != null) return _Mobile_loupe!!
        
        _Mobile_loupe = ImageVector.Builder(
            name = "mobile_loupe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(201f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(520f)
                close()
                moveToRelative(200f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(159f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 319f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 279f)
                verticalLineToRelative(-159f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(81f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(401f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(361f, 920f)
                horizontalLineToRelative(-81f)
                close()
                moveToRelative(380f, 0f)
                quadToRelative(-109f, 0f, -185.5f, -77.5f)
                reflectiveQuadTo(400f, 656f)
                quadToRelative(2f, -104f, 77f, -179f)
                reflectiveQuadToRelative(179f, -77f)
                quadToRelative(109f, -2f, 186.5f, 74.5f)
                reflectiveQuadTo(920f, 660f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(660f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(660f, 840f)
                close()
                moveToRelative(-30f, -150f)
                horizontalLineToRelative(-55f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(545f, 660f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(575f, 630f)
                horizontalLineToRelative(55f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(660f, 540f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(690f, 570f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(55f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(775f, 660f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(745f, 690f)
                horizontalLineToRelative(-55f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(660f, 780f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(630f, 750f)
                verticalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Mobile_loupe!!
    }

private var _Mobile_loupe: ImageVector? = null

