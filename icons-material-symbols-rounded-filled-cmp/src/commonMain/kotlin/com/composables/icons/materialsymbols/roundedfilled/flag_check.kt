package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flag_check: ImageVector
    get() {
        if (_Flag_check != null) return _Flag_check!!
        
        _Flag_check = ImageVector.Builder(
            name = "flag_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(165f)
                quadToRelative(17f, 0f, 28f, 14f)
                reflectiveQuadToRelative(9f, 31f)
                quadToRelative(-1f, 9f, -1.5f, 17.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(2f, 115f, 83.5f, 194.5f)
                reflectiveQuadTo(720f, 514f)
                quadToRelative(9f, 0f, 18f, -0.5f)
                reflectiveQuadToRelative(17f, -1.5f)
                quadToRelative(18f, -2f, 31.5f, 9f)
                reflectiveQuadToRelative(13.5f, 28f)
                verticalLineToRelative(51f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(553f)
                quadToRelative(-14f, 0f, -25f, -9f)
                reflectiveQuadToRelative(-14f, -23f)
                lineToRelative(-10f, -48f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(480f, -806f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 234f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 434f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 234f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 34f)
                close()
                moveToRelative(-29f, 205f)
                lineToRelative(-18f, -18f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 9.5f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(32f, 32f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(90f, -89f)
                quadToRelative(9f, -9f, 9f, -21.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                lineToRelative(-76f, 75f)
                close()
            }
        }.build()
        
        return _Flag_check!!
    }

private var _Flag_check: ImageVector? = null

