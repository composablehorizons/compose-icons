package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Concierge: ImageVector
    get() {
        if (_Concierge != null) return _Concierge!!
        
        _Concierge = ImageVector.Builder(
            name = "concierge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(440f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(0f, -81f, 51f, -141.5f)
                reflectiveQuadTo(620f, 544f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 479f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 519f)
                verticalLineToRelative(25f)
                quadToRelative(77f, 14f, 128.5f, 74.5f)
                reflectiveQuadTo(880f, 760f)
                horizontalLineTo(440f)
                close()
                moveTo(40f, 300f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(40f, 160f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(240f, 39f)
                verticalLineToRelative(117f)
                quadToRelative(0f, 27f, 18.5f, 45.5f)
                reflectiveQuadTo(344f, 520f)
                horizontalLineToRelative(1f)
                quadToRelative(8f, 0f, 14.5f, -1.5f)
                reflectiveQuadTo(373f, 515f)
                lineToRelative(268f, -100f)
                quadToRelative(17f, -7f, 28f, -22.5f)
                reflectiveQuadToRelative(11f, -34.5f)
                quadToRelative(0f, -16f, -11f, -27f)
                reflectiveQuadToRelative(-27f, -11f)
                horizontalLineTo(520f)
                lineToRelative(-52f, 20f)
                quadToRelative(-8f, 3f, -15f, 0f)
                reflectiveQuadToRelative(-10f, -11f)
                quadToRelative(-3f, -8f, 0.5f, -15.5f)
                reflectiveQuadTo(455f, 303f)
                lineToRelative(65f, -23f)
                horizontalLineToRelative(280f)
                quadToRelative(32f, 0f, 56f, -23f)
                reflectiveQuadToRelative(24f, -57f)
                lineTo(584f, 89f)
                quadToRelative(-12f, -5f, -24.5f, -5.5f)
                reflectiveQuadTo(535f, 87f)
                lineToRelative(-196f, 55f)
                quadToRelative(-26f, 8f, -42.5f, 29f)
                reflectiveQuadTo(280f, 219f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

