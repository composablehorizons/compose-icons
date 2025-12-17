package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Percent_discount: ImageVector
    get() {
        if (_Percent_discount != null) return _Percent_discount!!
        
        _Percent_discount = ImageVector.Builder(
            name = "percent_discount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                quadToRelative(-29f, -29f, -50f, -38f)
                reflectiveQuadToRelative(-63f, -9f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -42f, -9f, -63f)
                reflectiveQuadToRelative(-38f, -50f)
                quadToRelative(-17f, -17f, -26f, -39f)
                reflectiveQuadToRelative(-9f, -46f)
                quadToRelative(0f, -24f, 9f, -46f)
                reflectiveQuadToRelative(26f, -39f)
                quadToRelative(29f, -29f, 38f, -50f)
                reflectiveQuadToRelative(9f, -63f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(42f, 0f, 63f, -9f)
                reflectiveQuadToRelative(50f, -38f)
                quadToRelative(17f, -17f, 39f, -26f)
                reflectiveQuadToRelative(46f, -9f)
                quadToRelative(24f, 0f, 46f, 9f)
                reflectiveQuadToRelative(39f, 26f)
                quadToRelative(29f, 29f, 50f, 38f)
                reflectiveQuadToRelative(63f, 9f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 42f, 9f, 63f)
                reflectiveQuadToRelative(38f, 50f)
                quadToRelative(17f, 17f, 26f, 39f)
                reflectiveQuadToRelative(9f, 46f)
                quadToRelative(0f, 24f, -9f, 46f)
                reflectiveQuadToRelative(-26f, 39f)
                quadToRelative(-29f, 29f, -38f, 50f)
                reflectiveQuadToRelative(-9f, 63f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-42f, 0f, -63f, 9f)
                reflectiveQuadToRelative(-50f, 38f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                close()
                moveToRelative(100f, -240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 640f)
                close()
                moveToRelative(-230f, -30f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(204f, -203f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(610f, 350f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(553f, 350f)
                lineTo(350f, 554f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                close()
                moveToRelative(30f, -170f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 380f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 320f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 380f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 440f)
                close()
            }
        }.build()
        
        return _Percent_discount!!
    }

private var _Percent_discount: ImageVector? = null

