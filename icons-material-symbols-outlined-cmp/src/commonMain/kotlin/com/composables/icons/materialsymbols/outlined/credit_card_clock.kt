package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Credit_card_clock: ImageVector
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
                moveToRelative(307f, 480f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(210f)
                quadToRelative(-36f, -25f, -78f, -37.5f)
                reflectiveQuadTo(716f, 400f)
                quadToRelative(-54f, 0f, -104f, 21f)
                reflectiveQuadToRelative(-88f, 59f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(283f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                close()
                moveToRelative(320f, -25f)
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
            }
        }.build()
        
        return _Credit_card_clock!!
    }

private var _Credit_card_clock: ImageVector? = null

