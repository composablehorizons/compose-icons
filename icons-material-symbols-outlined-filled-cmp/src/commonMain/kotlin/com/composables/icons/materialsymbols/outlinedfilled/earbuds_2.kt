package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Earbuds_2: ImageVector
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
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                verticalLineToRelative(-380f)
                horizontalLineToRelative(220f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 540f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(860f, 720f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(780f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(500f, 760f)
                quadToRelative(-68f, 0f, -116f, -46f)
                reflectiveQuadToRelative(-48f, -114f)
                quadToRelative(0f, -67f, 48f, -113.5f)
                reflectiveQuadTo(500f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
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
                horizontalLineToRelative(220f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(260f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, -160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                quadToRelative(67f, 0f, 115.5f, 46.5f)
                reflectiveQuadTo(624f, 200f)
                quadToRelative(0f, 68f, -48.5f, 114f)
                reflectiveQuadTo(460f, 360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Earbuds_2!!
    }

private var _Earbuds_2: ImageVector? = null

