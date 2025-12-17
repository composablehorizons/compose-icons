package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Lab_research: ImageVector
    get() {
        if (_Lab_research != null) return _Lab_research!!
        
        _Lab_research = ImageVector.Builder(
            name = "lab_research",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(87f)
                quadToRelative(-5f, 20f, -6.5f, 40f)
                reflectiveQuadToRelative(0.5f, 40f)
                horizontalLineToRelative(-81f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(121f)
                quadToRelative(-24f, 15f, -44f, 35f)
                reflectiveQuadToRelative(-35f, 44f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(30f, 0f, 54.5f, -13f)
                reflectiveQuadToRelative(41.5f, -36f)
                quadToRelative(8f, 20f, 18f, 38f)
                reflectiveQuadToRelative(24f, 35f)
                quadToRelative(-27f, 26f, -62f, 41f)
                reflectiveQuadToRelative(-76f, 15f)
                close()
                moveToRelative(340f, -120f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(864f, 920f)
                lineTo(756f, 812f)
                quadToRelative(-22f, 14f, -46f, 21f)
                reflectiveQuadToRelative(-50f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 26f, -7f, 50f)
                reflectiveQuadToRelative(-21f, 46f)
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Lab_research!!
    }

private var _Lab_research: ImageVector? = null

