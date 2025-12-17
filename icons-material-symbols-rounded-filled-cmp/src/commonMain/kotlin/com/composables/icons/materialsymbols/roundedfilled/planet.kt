package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Planet: ImageVector
    get() {
        if (_Planet != null) return _Planet!!
        
        _Planet = ImageVector.Builder(
            name = "planet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(449f, 421f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(499f, 371f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(449f, 321f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(399f, 371f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(449f, 421f)
                close()
                moveTo(822f, 880f)
                quadToRelative(-42f, 0f, -113f, -35f)
                reflectiveQuadToRelative(-152f, -95f)
                quadToRelative(-19f, 5f, -38.5f, 7.5f)
                reflectiveQuadTo(479f, 760f)
                quadToRelative(-117f, 0f, -198f, -81f)
                reflectiveQuadToRelative(-81f, -198f)
                quadToRelative(0f, -20f, 3f, -40f)
                reflectiveQuadToRelative(8f, -39f)
                quadToRelative(-59f, -81f, -94.5f, -151.5f)
                reflectiveQuadTo(81f, 138f)
                quadToRelative(0f, -27f, 15f, -42.5f)
                reflectiveQuadToRelative(41f, -15.5f)
                quadToRelative(23f, 0f, 56.5f, 13f)
                reflectiveQuadToRelative(90.5f, 45f)
                quadToRelative(14f, 8f, 18.5f, 24.5f)
                reflectiveQuadTo(299f, 193f)
                quadToRelative(-8f, 14f, -24f, 18.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-19f, -11f, -37f, -19f)
                reflectiveQuadToRelative(-38f, -17f)
                quadToRelative(18f, 38f, 38.5f, 74f)
                reflectiveQuadToRelative(43.5f, 71f)
                quadToRelative(38f, -54f, 97f, -85f)
                reflectiveQuadToRelative(130f, -31f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(759f, 481f)
                quadToRelative(0f, 71f, -31.5f, 130f)
                reflectiveQuadTo(642f, 708f)
                quadToRelative(35f, 23f, 71.5f, 44f)
                reflectiveQuadToRelative(74.5f, 38f)
                quadToRelative(-8f, -19f, -16.5f, -37f)
                reflectiveQuadTo(752f, 716f)
                quadToRelative(-8f, -14f, -3.5f, -30.5f)
                reflectiveQuadTo(767f, 661f)
                quadToRelative(14f, -8f, 30.5f, -3.5f)
                reflectiveQuadTo(822f, 676f)
                quadToRelative(34f, 60f, 46f, 91.5f)
                reflectiveQuadToRelative(12f, 54.5f)
                quadToRelative(0f, 29f, -16f, 43.5f)
                reflectiveQuadTo(822f, 880f)
                close()
                moveTo(549f, 601f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(589f, 561f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(549f, 521f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(509f, 561f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(549f, 601f)
                close()
                moveToRelative(50f, -140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(629f, 431f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(599f, 401f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(569f, 431f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(599f, 461f)
                close()
            }
        }.build()
        
        return _Planet!!
    }

private var _Planet: ImageVector? = null

