package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Credit_card_heart: ImageVector
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
                moveTo(160f, 720f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(13f)
                verticalLineToRelative(-173f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(556f, 83f)
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
                moveTo(160f, 320f)
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
            }
        }.build()
        
        return _Credit_card_heart!!
    }

private var _Credit_card_heart: ImageVector? = null

