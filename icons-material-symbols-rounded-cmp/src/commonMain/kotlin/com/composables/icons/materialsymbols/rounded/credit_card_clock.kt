package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Credit_card_clock: ImageVector
    get() {
        if (_Credit_card_clock != null) return _Credit_card_clock!!
        
        _Credit_card_clock = ImageVector.Builder(
            name = "credit_card_clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(721f, 880f)
                quadToRelative(-84f, 0f, -142.5f, -58f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -84f, 58.5f, -142f)
                reflectiveQuadTo(721f, 480f)
                quadToRelative(83f, 0f, 141f, 58.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 83f, -58f, 141.5f)
                reflectiveQuadTo(721f, 880f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(13f)
                verticalLineToRelative(-173f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, -400f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(158f)
                quadToRelative(0f, 18f, -15.5f, 26.5f)
                reflectiveQuadToRelative(-32.5f, 0.5f)
                quadToRelative(-26f, -12f, -55.5f, -18.5f)
                reflectiveQuadTo(716f, 400f)
                quadToRelative(-57f, 0f, -107.5f, 21.5f)
                reflectiveQuadTo(520f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(263f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(463f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(423f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(580f, -128f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(91f)
                quadToRelative(0f, 8f, 3f, 15.5f)
                reflectiveQuadToRelative(9f, 13.5f)
                lineToRelative(61f, 61f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-61f, -61f)
                close()
            }
        }.build()
        
        return _Credit_card_clock!!
    }

private var _Credit_card_clock: ImageVector? = null

