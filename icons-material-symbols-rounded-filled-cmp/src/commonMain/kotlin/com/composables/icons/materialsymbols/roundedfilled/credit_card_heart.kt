package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Credit_card_heart: ImageVector
    get() {
        if (_Credit_card_heart != null) return _Credit_card_heart!!
        
        _Credit_card_heart = ImageVector.Builder(
            name = "credit_card_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(716f, 803f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(576f, 680f)
                quadToRelative(-13f, -13f, -18.5f, -28f)
                reflectiveQuadToRelative(-5.5f, -30f)
                quadToRelative(0f, -32f, 23f, -57f)
                reflectiveQuadToRelative(59f, -25f)
                quadToRelative(28f, 0f, 44f, 13f)
                reflectiveQuadToRelative(38f, 35f)
                quadToRelative(20f, -20f, 36.5f, -34f)
                reflectiveQuadToRelative(45.5f, -14f)
                quadToRelative(37f, 0f, 59.5f, 25.5f)
                reflectiveQuadTo(880f, 623f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(744f, 792f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                close()
                moveToRelative(-556f, -3f)
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
        
        return _Credit_card_heart!!
    }

private var _Credit_card_heart: ImageVector? = null

