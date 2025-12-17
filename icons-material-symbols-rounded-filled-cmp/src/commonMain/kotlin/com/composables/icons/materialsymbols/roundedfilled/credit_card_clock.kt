package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Credit_card_clock: ImageVector
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
                moveTo(740f, 672f)
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
                moveToRelative(-561f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(153f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 433f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 393f)
                verticalLineToRelative(-73f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(300f)
                quadToRelative(17f, 0f, 25f, 16f)
                reflectiveQuadToRelative(-3f, 31f)
                quadToRelative(-22f, 33f, -34f, 72f)
                reflectiveQuadToRelative(-12f, 81f)
                quadToRelative(0f, 19f, 2.5f, 37.5f)
                reflectiveQuadTo(446f, 753f)
                quadToRelative(5f, 17f, -5.5f, 32f)
                reflectiveQuadTo(413f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Credit_card_clock!!
    }

private var _Credit_card_clock: ImageVector? = null

