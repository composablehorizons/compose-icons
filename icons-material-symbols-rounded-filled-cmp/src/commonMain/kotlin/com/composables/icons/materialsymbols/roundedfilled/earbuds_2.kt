package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Earbuds_2: ImageVector
    get() {
        if (_Earbuds_2 != null) return _Earbuds_2!!
        
        _Earbuds_2 = ImageVector.Builder(
            name = "earbuds_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17f)
                reflectiveQuadTo(640f, 860f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 480f)
                horizontalLineToRelative(180f)
                quadToRelative(26f, 0f, 43f, 17.5f)
                reflectiveQuadToRelative(17f, 42.5f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(500f, 760f)
                quadToRelative(-67f, 0f, -115.5f, -46f)
                reflectiveQuadTo(336f, 600f)
                quadToRelative(0f, -67f, 48.5f, -113.5f)
                reflectiveQuadTo(500f, 440f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 480f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 760f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(180f, 520f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-20f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 120f)
                verticalLineToRelative(340f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(260f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(380f, 320f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(420f, 40f)
                horizontalLineToRelative(40f)
                quadToRelative(67f, 0f, 115.5f, 46.5f)
                reflectiveQuadTo(624f, 200f)
                quadToRelative(0f, 68f, -48.5f, 114f)
                reflectiveQuadTo(460f, 360f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Earbuds_2!!
    }

private var _Earbuds_2: ImageVector? = null

