package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_question: ImageVector
    get() {
        if (_Mobile_question != null) return _Mobile_question!!
        
        _Mobile_question = ImageVector.Builder(
            name = "mobile_question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -240f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-91f, -307f)
                quadToRelative(11f, 6f, 22.5f, 3.5f)
                reflectiveQuadTo(431f, 363f)
                quadToRelative(8f, -12f, 21.5f, -18.5f)
                reflectiveQuadTo(480f, 338f)
                quadToRelative(21f, 0f, 37.5f, 13f)
                reflectiveQuadToRelative(16.5f, 33f)
                quadToRelative(0f, 17f, -10.5f, 31f)
                reflectiveQuadTo(500f, 442f)
                quadToRelative(-19f, 17f, -34f, 37f)
                reflectiveQuadToRelative(-15f, 45f)
                quadToRelative(0f, 12f, 8.5f, 20f)
                reflectiveQuadToRelative(20.5f, 8f)
                quadToRelative(12f, 0f, 20.5f, -8.5f)
                reflectiveQuadTo(511f, 523f)
                quadToRelative(3f, -18f, 15.5f, -31f)
                reflectiveQuadToRelative(25.5f, -26f)
                quadToRelative(17f, -17f, 29.5f, -38f)
                reflectiveQuadToRelative(12.5f, -46f)
                quadToRelative(0f, -47f, -33f, -74.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-30f, 0f, -56.5f, 14.5f)
                reflectiveQuadTo(380f, 335f)
                quadToRelative(-7f, 10f, -4f, 21.5f)
                reflectiveQuadToRelative(13f, 16.5f)
                close()
            }
        }.build()
        
        return _Mobile_question!!
    }

private var _Mobile_question: ImageVector? = null

