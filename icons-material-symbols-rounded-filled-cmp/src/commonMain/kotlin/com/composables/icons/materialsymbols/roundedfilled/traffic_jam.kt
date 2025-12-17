package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Traffic_jam: ImageVector
    get() {
        if (_Traffic_jam != null) return _Traffic_jam!!
        
        _Traffic_jam = ImageVector.Builder(
            name = "traffic_jam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(100f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(40f, 820f)
                verticalLineToRelative(-276f)
                quadToRelative(0f, -12f, 2f, -23.5f)
                reflectiveQuadToRelative(7f, -22.5f)
                lineToRelative(76f, -181f)
                quadToRelative(7f, -17f, 22f, -27f)
                reflectiveQuadToRelative(33f, -10f)
                horizontalLineToRelative(360f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(76f, 181f)
                quadToRelative(5f, 11f, 7f, 22.5f)
                reflectiveQuadToRelative(2f, 23.5f)
                verticalLineToRelative(276f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 820f)
                verticalLineToRelative(-20f)
                horizontalLineTo(160f)
                close()
                moveToRelative(-8f, -360f)
                horizontalLineToRelative(415f)
                lineToRelative(-33f, -80f)
                horizontalLineTo(186f)
                lineToRelative(-34f, 80f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 680f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(500f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(440f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(500f, 680f)
                close()
                moveToRelative(147f, -440f)
                horizontalLineTo(287f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(247f, 200f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(373f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(76f, 181f)
                quadToRelative(5f, 11f, 7f, 22.5f)
                reflectiveQuadToRelative(2f, 23.5f)
                verticalLineToRelative(296f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-304f)
                lineToRelative(-73f, -176f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineTo(407f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(367f, 80f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(373f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(76f, 181f)
                quadToRelative(5f, 11f, 7f, 22.5f)
                reflectiveQuadToRelative(2f, 23.5f)
                verticalLineToRelative(296f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(-304f)
                lineToRelative(-73f, -176f)
                close()
            }
        }.build()
        
        return _Traffic_jam!!
    }

private var _Traffic_jam: ImageVector? = null

