package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vacuum: ImageVector
    get() {
        if (_Vacuum != null) return _Vacuum!!
        
        _Vacuum = ImageVector.Builder(
            name = "vacuum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 800f)
                close()
                moveToRelative(215f, 80f)
                quadToRelative(-18f, 0f, -27f, -16f)
                reflectiveQuadToRelative(-1f, -33f)
                quadToRelative(7f, -17f, 10f, -35f)
                reflectiveQuadToRelative(3f, -36f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(-8f, 0f, -16.5f, 0.5f)
                reflectiveQuadTo(127f, 563f)
                quadToRelative(-18f, 3f, -32.5f, -8f)
                reflectiveQuadTo(80f, 527f)
                verticalLineToRelative(-87f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -77f, 53.5f, -130.5f)
                reflectiveQuadTo(384f, 40f)
                quadToRelative(56f, 0f, 102f, 30.5f)
                reflectiveQuadToRelative(68f, 81.5f)
                lineToRelative(273f, 648f)
                horizontalLineToRelative(53f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(60f)
                lineTo(481f, 184f)
                quadToRelative(-12f, -29f, -38.5f, -46.5f)
                reflectiveQuadTo(384f, 120f)
                quadToRelative(-43f, 0f, -73.5f, 30.5f)
                reflectiveQuadTo(280f, 224f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(80f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(440f, 880f)
                horizontalLineToRelative(-65f)
                close()
            }
        }.build()
        
        return _Vacuum!!
    }

private var _Vacuum: ImageVector? = null

