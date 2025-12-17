package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Siren_question: ImageVector
    get() {
        if (_Siren_question != null) return _Siren_question!!
        
        _Siren_question = ImageVector.Builder(
            name = "siren_question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(11f, 0f, 18f, -7f)
                reflectiveQuadToRelative(7f, -18f)
                quadToRelative(0f, -11f, -7f, -18f)
                reflectiveQuadToRelative(-18f, -7f)
                quadToRelative(-11f, 0f, -18f, 7f)
                reflectiveQuadToRelative(-7f, 18f)
                quadToRelative(0f, 11f, 7f, 18f)
                reflectiveQuadToRelative(18f, 7f)
                close()
                moveToRelative(-18f, -76f)
                horizontalLineToRelative(37f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -11f, 5.5f, -19.5f)
                reflectiveQuadTo(758f, 718f)
                quadToRelative(14f, -12f, 22f, -23f)
                reflectiveQuadToRelative(8f, -31f)
                quadToRelative(0f, -29f, -19f, -46.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-23f, 0f, -41.5f, 13.5f)
                reflectiveQuadTo(652f, 650f)
                lineToRelative(32f, 14f)
                quadToRelative(3f, -12f, 12.5f, -21f)
                reflectiveQuadToRelative(23.5f, -9f)
                quadToRelative(15f, 0f, 23.5f, 7.5f)
                reflectiveQuadTo(752f, 664f)
                quadToRelative(0f, 11f, -6f, 18.5f)
                reflectiveQuadTo(732f, 698f)
                quadToRelative(-6f, 6f, -12.5f, 12f)
                reflectiveQuadTo(708f, 724f)
                quadToRelative(-3f, 6f, -4.5f, 12f)
                reflectiveQuadToRelative(-1.5f, 14f)
                verticalLineToRelative(14f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(43f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-116f, 0f, -198f, 81.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 31f, 6.5f, 61.5f)
                reflectiveQuadTo(467f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Siren_question!!
    }

private var _Siren_question: ImageVector? = null

