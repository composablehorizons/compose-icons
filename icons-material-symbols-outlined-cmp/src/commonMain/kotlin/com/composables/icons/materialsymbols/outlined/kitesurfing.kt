package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Kitesurfing: ImageVector
    get() {
        if (_Kitesurfing != null) return _Kitesurfing!!
        
        _Kitesurfing = ImageVector.Builder(
            name = "kitesurfing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(32f, 0f, 62.5f, -10f)
                reflectiveQuadToRelative(57.5f, -30f)
                quadToRelative(26f, 18f, 55f, 28f)
                reflectiveQuadToRelative(60f, 11f)
                quadToRelative(33f, 1f, 65f, -9f)
                reflectiveQuadToRelative(60f, -30f)
                quadToRelative(26f, 19f, 57f, 29f)
                reflectiveQuadToRelative(63f, 10f)
                quadToRelative(32f, 0f, 62f, -9.5f)
                reflectiveQuadToRelative(58f, -29.5f)
                quadToRelative(28f, 20f, 58.5f, 30f)
                reflectiveQuadToRelative(61.5f, 10f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(720f, 890f)
                quadToRelative(-29f, 15f, -58.5f, 22.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(480f, 890f)
                quadToRelative(-29f, 16f, -61f, 23.5f)
                reflectiveQuadTo(355f, 920f)
                quadToRelative(-30f, -1f, -59f, -8.5f)
                reflectiveQuadTo(240f, 890f)
                quadToRelative(-29f, 15f, -58.5f, 22.5f)
                reflectiveQuadTo(120f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(-26f, 0f, -51.5f, -10f)
                reflectiveQuadTo(260f, 720f)
                quadToRelative(14f, -11f, 29f, -23f)
                reflectiveQuadToRelative(31f, -23f)
                lineToRelative(-62f, -119f)
                quadToRelative(-9f, -17f, -13.5f, -36f)
                reflectiveQuadToRelative(-4.5f, -39f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 240f)
                horizontalLineToRelative(120f)
                quadToRelative(40f, 0f, 76.5f, -15f)
                reflectiveQuadToRelative(65.5f, -43f)
                lineToRelative(56f, 56f)
                quadToRelative(-41f, 40f, -92f, 61f)
                reflectiveQuadToRelative(-106f, 21f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(112f)
                lineToRelative(68f, 75f)
                quadToRelative(65f, -27f, 115.5f, -41f)
                reflectiveQuadToRelative(86.5f, -14f)
                quadToRelative(35f, 0f, 54.5f, 13.5f)
                reflectiveQuadTo(840f, 531f)
                quadToRelative(0f, 39f, -54f, 98.5f)
                reflectiveQuadTo(638f, 754f)
                quadToRelative(-8f, 2f, -18.5f, 4f)
                reflectiveQuadToRelative(-19.5f, 2f)
                quadToRelative(-32f, 0f, -64f, -15.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(-24f, 29f, -55.5f, 44.5f)
                reflectiveQuadTo(360f, 760f)
                close()
                moveToRelative(33f, -136f)
                quadToRelative(16f, -10f, 46f, -27f)
                reflectiveQuadToRelative(49f, -26f)
                lineToRelative(-28f, -31f)
                lineToRelative(-100f, 4f)
                lineToRelative(33f, 80f)
                close()
                moveToRelative(-73f, -424f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 200f)
                close()
                moveToRelative(342f, -20f)
                lineToRelative(-42f, -42f)
                lineToRelative(98f, -98f)
                horizontalLineToRelative(84f)
                lineTo(662f, 180f)
                close()
            }
        }.build()
        
        return _Kitesurfing!!
    }

private var _Kitesurfing: ImageVector? = null

