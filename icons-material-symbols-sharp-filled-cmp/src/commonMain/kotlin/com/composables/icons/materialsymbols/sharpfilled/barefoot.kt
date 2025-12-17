package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Barefoot: ImageVector
    get() {
        if (_Barefoot != null) return _Barefoot!!
        
        _Barefoot = ImageVector.Builder(
            name = "barefoot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(180f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(220f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(260f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(220f, 320f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(73f)
                quadToRelative(69f, 0f, 118f, 46.5f)
                reflectiveQuadTo(720f, 401f)
                quadToRelative(0f, 46f, -24.5f, 84.5f)
                reflectiveQuadTo(629f, 544f)
                quadToRelative(-32f, 15f, -50.5f, 44.5f)
                reflectiveQuadTo(560f, 653f)
                verticalLineToRelative(67f)
                quadToRelative(0f, 67f, -46.5f, 113.5f)
                reflectiveQuadTo(400f, 880f)
                close()
                moveToRelative(-80f, -640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 180f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 240f)
                close()
                moveToRelative(80f, 560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 720f)
                verticalLineToRelative(-67f)
                quadToRelative(0f, -58f, 30.5f, -107f)
                reflectiveQuadToRelative(83.5f, -74f)
                quadToRelative(21f, -10f, 33.5f, -29.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(0f, -35f, -26f, -57.5f)
                reflectiveQuadTo(553f, 320f)
                horizontalLineToRelative(-73f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                close()
                moveToRelative(40f, -600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 160f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 140f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 200f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 120f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 200f)
                close()
                moveToRelative(140f, 40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 180f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 140f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 240f)
                close()
            }
        }.build()
        
        return _Barefoot!!
    }

private var _Barefoot: ImageVector? = null

