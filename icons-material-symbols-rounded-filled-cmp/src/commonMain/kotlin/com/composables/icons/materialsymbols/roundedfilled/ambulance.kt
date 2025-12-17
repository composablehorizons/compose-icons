package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ambulance: ImageVector
    get() {
        if (_Ambulance != null) return _Ambulance!!
        
        _Ambulance = ImageVector.Builder(
            name = "ambulance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 40f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(-245f, 28f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(64f, 64f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(235f, 188f)
                close()
                moveToRelative(45f, 532f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 640f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                close()
                moveToRelative(63f, -298f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(90f, -89f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                lineToRelative(-76f, 74f)
                lineToRelative(-18f, -18f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 9.5f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(32f, 32f)
                close()
                moveToRelative(57f, 138f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 360f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 560f)
                close()
                moveTo(180f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 860f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(80f, -227f)
                quadToRelative(6f, -18f, 21.5f, -29f)
                reflectiveQuadToRelative(34.5f, -11f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 200f)
                horizontalLineToRelative(50f)
                quadToRelative(14f, 0f, 20.5f, 11.5f)
                reflectiveQuadTo(470f, 235f)
                quadToRelative(-12f, 23f, -19.5f, 48.5f)
                reflectiveQuadTo(441f, 336f)
                quadToRelative(-1f, 10f, -8f, 17f)
                reflectiveQuadToRelative(-17f, 7f)
                horizontalLineTo(274f)
                lineToRelative(-59f, 160f)
                horizontalLineToRelative(244f)
                quadToRelative(15f, 0f, 28.5f, 7f)
                reflectiveQuadToRelative(23.5f, 18f)
                quadToRelative(40f, 45f, 94f, 70f)
                reflectiveQuadToRelative(115f, 25f)
                quadToRelative(17f, 0f, 34.5f, -2f)
                reflectiveQuadToRelative(34.5f, -7f)
                quadToRelative(19f, -5f, 35f, 6f)
                reflectiveQuadToRelative(16f, 30f)
                verticalLineToRelative(193f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 860f)
                verticalLineToRelative(-20f)
                horizontalLineTo(240f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 920f)
                close()
            }
        }.build()
        
        return _Ambulance!!
    }

private var _Ambulance: ImageVector? = null

