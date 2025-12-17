package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Speaker_phone: ImageVector
    get() {
        if (_Speaker_phone != null) return _Speaker_phone!!
        
        _Speaker_phone = ImageVector.Builder(
            name = "speaker_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 280f)
                quadToRelative(-30f, 0f, -58f, 9f)
                reflectiveQuadToRelative(-53f, 26f)
                quadToRelative(-14f, 10f, -31f, 9f)
                reflectiveQuadToRelative(-29f, -13f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(14f, -26.5f)
                quadToRelative(37f, -27f, 80f, -41.5f)
                reflectiveQuadToRelative(89f, -14.5f)
                quadToRelative(46f, 0f, 89f, 14.5f)
                reflectiveQuadToRelative(80f, 41.5f)
                quadToRelative(14f, 10f, 14f, 26.5f)
                reflectiveQuadTo(651f, 311f)
                quadToRelative(-12f, 12f, -29f, 13f)
                reflectiveQuadToRelative(-31f, -9f)
                quadToRelative(-25f, -17f, -52.5f, -26f)
                reflectiveQuadToRelative(-58.5f, -9f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-61f, 0f, -118.5f, 20f)
                reflectiveQuadTo(256f, 198f)
                quadToRelative(-14f, 11f, -30f, 10.5f)
                reflectiveQuadTo(198f, 196f)
                quadToRelative(-12f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(14f, -27.5f)
                quadToRelative(60f, -48f, 131f, -74f)
                reflectiveQuadToRelative(148f, -26f)
                quadToRelative(77f, 0f, 148f, 26f)
                reflectiveQuadToRelative(131f, 74f)
                quadToRelative(13f, 11f, 14f, 27.5f)
                reflectiveQuadTo(762f, 196f)
                quadToRelative(-12f, 12f, -28f, 12.5f)
                reflectiveQuadTo(704f, 198f)
                quadToRelative(-48f, -38f, -105.5f, -58f)
                reflectiveQuadTo(480f, 120f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(160f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(400f)
                horizontalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Speaker_phone!!
    }

private var _Speaker_phone: ImageVector? = null

