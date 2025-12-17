package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flyover: ImageVector
    get() {
        if (_Flyover != null) return _Flyover!!
        
        _Flyover = ImageVector.Builder(
            name = "flyover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 429f)
                lineToRelative(-20f, 4f)
                lineToRelative(-20f, 4f)
                quadToRelative(-15f, 4f, -27.5f, -5.5f)
                reflectiveQuadTo(80f, 406f)
                quadToRelative(0f, -18f, 11.5f, -32.5f)
                reflectiveQuadTo(121f, 355f)
                quadToRelative(89f, -19f, 178.5f, -27f)
                reflectiveQuadToRelative(180.5f, -8f)
                quadToRelative(91f, 0f, 181f, 8f)
                reflectiveQuadToRelative(179f, 27f)
                quadToRelative(18f, 4f, 29f, 18.5f)
                reflectiveQuadToRelative(11f, 32.5f)
                quadToRelative(0f, 16f, -12f, 25.5f)
                reflectiveQuadToRelative(-27f, 6.5f)
                lineToRelative(-20f, -4f)
                quadToRelative(-10f, -2f, -21f, -4f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-104f)
                quadToRelative(-60f, -8f, -120f, -12f)
                reflectiveQuadToRelative(-120f, -4f)
                quadToRelative(-60f, 0f, -120f, 3.5f)
                reflectiveQuadTo(240f, 415f)
                verticalLineToRelative(105f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(-91f)
                close()
                moveToRelative(320f, -190f)
                quadToRelative(-23f, 0f, -45.5f, 0.5f)
                reflectiveQuadTo(389f, 242f)
                quadToRelative(-19f, 1f, -32f, -13f)
                reflectiveQuadToRelative(-10f, -33f)
                lineToRelative(7f, -43f)
                quadToRelative(2f, -14f, 13.5f, -23.5f)
                reflectiveQuadTo(394f, 120f)
                horizontalLineToRelative(172f)
                quadToRelative(15f, 0f, 26.5f, 9.5f)
                reflectiveQuadTo(606f, 153f)
                lineToRelative(7f, 43f)
                quadToRelative(3f, 19f, -10f, 33f)
                reflectiveQuadToRelative(-32f, 13f)
                quadToRelative(-23f, -2f, -45.5f, -2.5f)
                reflectiveQuadTo(480f, 239f)
                close()
                moveToRelative(0f, 441f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                verticalLineToRelative(120f)
                horizontalLineTo(287f)
                quadToRelative(-19f, 0f, -30.5f, -14.5f)
                reflectiveQuadTo(248f, 793f)
                lineToRelative(45f, -273f)
                quadToRelative(2f, -14f, 12.5f, -23f)
                reflectiveQuadToRelative(24.5f, -11f)
                quadToRelative(28f, -3f, 55f, -5f)
                reflectiveQuadToRelative(55f, -3f)
                verticalLineToRelative(82f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                verticalLineToRelative(-82f)
                quadToRelative(28f, 2f, 55f, 3.5f)
                reflectiveQuadToRelative(55f, 4.5f)
                quadToRelative(14f, 2f, 24.5f, 11f)
                reflectiveQuadToRelative(12.5f, 23f)
                lineToRelative(45f, 273f)
                quadToRelative(3f, 18f, -8.5f, 32.5f)
                reflectiveQuadTo(673f, 840f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Flyover!!
    }

private var _Flyover: ImageVector? = null

