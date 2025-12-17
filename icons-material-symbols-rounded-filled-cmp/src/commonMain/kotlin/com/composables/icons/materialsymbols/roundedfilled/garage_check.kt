package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Garage_check: ImageVector
    get() {
        if (_Garage_check != null) return _Garage_check!!
        
        _Garage_check = ImageVector.Builder(
            name = "garage_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(692f, 750f)
                lineToRelative(-41f, -41f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                quadToRelative(-6f, 6f, -6f, 15f)
                reflectiveQuadToRelative(6f, 15f)
                lineToRelative(43f, 43f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(99f, -99f)
                quadToRelative(6f, -6f, 6f, -15f)
                reflectiveQuadToRelative(-6f, -15f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                lineToRelative(-97f, 97f)
                close()
                moveTo(306f, 380f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveToRelative(54f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(360f, -40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(272f)
                quadToRelative(0f, 20f, -17f, 29.5f)
                reflectiveQuadToRelative(-35f, 0.5f)
                quadToRelative(-17f, -7f, -33.5f, -12f)
                reflectiveQuadToRelative(-34.5f, -7f)
                lineToRelative(-66f, -191f)
                quadToRelative(-5f, -14f, -16.5f, -23f)
                reflectiveQuadToRelative(-25.5f, -9f)
                horizontalLineTo(308f)
                quadToRelative(-14f, 0f, -25.5f, 9f)
                reflectiveQuadTo(266f, 252f)
                lineToRelative(-62f, 179f)
                quadToRelative(-2f, 6f, -3f, 12.5f)
                reflectiveQuadToRelative(-1f, 13.5f)
                verticalLineToRelative(251f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(23f, 9f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 23f, -9f)
                reflectiveQuadToRelative(9f, -23f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(167f)
                quadToRelative(-3f, 14f, -5f, 29f)
                reflectiveQuadToRelative(-2f, 31f)
                quadToRelative(0f, 30f, 6.5f, 58f)
                reflectiveQuadToRelative(17.5f, 54f)
                quadToRelative(8f, 17f, -1.5f, 32.5f)
                reflectiveQuadTo(436f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Garage_check!!
    }

private var _Garage_check: ImageVector? = null

