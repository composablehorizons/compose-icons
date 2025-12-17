package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Credit_card_clock: ImageVector
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
                moveTo(787f, 775f)
                lineToRelative(28f, -28f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(87f, 87f)
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(293f)
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
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Credit_card_clock!!
    }

private var _Credit_card_clock: ImageVector? = null

