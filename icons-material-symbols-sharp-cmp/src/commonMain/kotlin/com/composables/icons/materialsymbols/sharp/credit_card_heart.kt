package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Credit_card_heart: ImageVector
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
                moveToRelative(556f, 100f)
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
                lineTo(716f, 820f)
                close()
                moveTo(160f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(303f, 480f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(293f)
                quadToRelative(-35f, -25f, -76.5f, -39f)
                reflectiveQuadTo(716f, 400f)
                quadToRelative(-57f, 0f, -107.5f, 21.5f)
                reflectiveQuadTo(520f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(279f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                close()
            }
        }.build()
        
        return _Credit_card_heart!!
    }

private var _Credit_card_heart: ImageVector? = null

