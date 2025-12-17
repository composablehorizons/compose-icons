package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Credit_card_heart: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(213f)
                quadToRelative(-18f, -13f, -38f, -23f)
                reflectiveQuadToRelative(-42f, -17f)
                verticalLineToRelative(-93f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(360f)
                quadToRelative(-39f, 38f, -61.5f, 89.5f)
                reflectiveQuadTo(436f, 680f)
                quadToRelative(0f, 32f, 7f, 62.5f)
                reflectiveQuadToRelative(20f, 57.5f)
                horizontalLineTo(160f)
                close()
                moveToRelative(556f, 20f)
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
            }
        }.build()
        
        return _Credit_card_heart!!
    }

private var _Credit_card_heart: ImageVector? = null

