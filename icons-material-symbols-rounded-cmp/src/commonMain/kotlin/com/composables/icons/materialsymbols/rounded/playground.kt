package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Playground: ImageVector
    get() {
        if (_Playground != null) return _Playground!!
        
        _Playground = ImageVector.Builder(
            name = "playground",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(79f, 840f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(2f)
                lineToRelative(35f, -525f)
                quadToRelative(2f, -32f, 25f, -53.5f)
                reflectiveQuadToRelative(55f, -21.5f)
                horizontalLineToRelative(245f)
                quadToRelative(32f, 0f, 55f, 21.5f)
                reflectiveQuadToRelative(25f, 53.5f)
                lineToRelative(36f, 525f)
                horizontalLineToRelative(162f)
                verticalLineToRelative(-246f)
                quadToRelative(-52f, -14f, -86f, -56f)
                reflectiveQuadToRelative(-34f, -98f)
                quadToRelative(0f, -34f, 13f, -63.5f)
                reflectiveQuadToRelative(36f, -51.5f)
                quadToRelative(-5f, -11f, -7f, -22f)
                reflectiveQuadToRelative(-2f, -23f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 12f, -2f, 23f)
                reflectiveQuadToRelative(-7f, 22f)
                quadToRelative(23f, 22f, 36f, 51.5f)
                reflectiveQuadToRelative(13f, 63.5f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 56f)
                verticalLineToRelative(246f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(79f)
                close()
                moveToRelative(84f, -80f)
                horizontalLineToRelative(314f)
                lineToRelative(-35f, -520f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(361f)
                quadToRelative(13f, 3f, 21.5f, 14f)
                reflectiveQuadToRelative(8.5f, 25f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 640f)
                quadToRelative(0f, -14f, 8.5f, -25f)
                reflectiveQuadToRelative(21.5f, -14f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(-32f)
                lineToRelative(-35f, 520f)
                close()
                moveToRelative(127f, -160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(470f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(0f, -28f, -13f, -43f)
                reflectiveQuadToRelative(-27f, -29f)
                verticalLineToRelative(-88f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(88f)
                quadToRelative(-14f, 14f, -27f, 29f)
                reflectiveQuadToRelative(-13f, 43f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 440f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Playground!!
    }

private var _Playground: ImageVector? = null

