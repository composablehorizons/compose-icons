package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nights_stay: ImageVector
    get() {
        if (_Nights_stay != null) return _Nights_stay!!
        
        _Nights_stay = ImageVector.Builder(
            name = "nights_stay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 535f)
                close()
                moveToRelative(20f, 385f)
                horizontalLineTo(420f)
                lineToRelative(20f, -12.5f)
                quadToRelative(20f, -12.5f, 43.5f, -28f)
                reflectiveQuadToRelative(43.5f, -28f)
                lineToRelative(20f, -12.5f)
                quadToRelative(81f, -6f, 149.5f, -49f)
                reflectiveQuadTo(805f, 675f)
                quadToRelative(-86f, -8f, -163f, -43.5f)
                reflectiveQuadTo(504f, 535f)
                quadToRelative(-61f, -61f, -97f, -138f)
                reflectiveQuadToRelative(-43f, -163f)
                quadToRelative(-77f, 43f, -120.5f, 118.5f)
                reflectiveQuadTo(200f, 516f)
                verticalLineToRelative(12f)
                lineToRelative(-12f, 5.5f)
                quadToRelative(-12f, 5.5f, -26.5f, 11.5f)
                reflectiveQuadTo(135f, 556.5f)
                lineToRelative(-12f, 5.5f)
                quadToRelative(-2f, -11f, -2.5f, -23f)
                reflectiveQuadToRelative(-0.5f, -23f)
                quadToRelative(0f, -146f, 93f, -257.5f)
                reflectiveQuadTo(450f, 120f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(561f, 479f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(920f, 590f)
                quadToRelative(-26f, 144f, -138f, 237f)
                reflectiveQuadTo(524f, 920f)
                close()
                moveToRelative(-284f, -80f)
                horizontalLineToRelative(180f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(480f, 780f)
                quadToRelative(0f, -25f, -17f, -42.5f)
                reflectiveQuadTo(422f, 720f)
                horizontalLineToRelative(-52f)
                lineToRelative(-20f, -48f)
                quadToRelative(-14f, -33f, -44f, -52.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(-50f, 0f, -85f, 34.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(60f, 0f, 109.5f, 32.5f)
                reflectiveQuadTo(423f, 640f)
                quadToRelative(57f, 2f, 97f, 42.5f)
                reflectiveQuadToRelative(40f, 97.5f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Nights_stay!!
    }

private var _Nights_stay: ImageVector? = null

