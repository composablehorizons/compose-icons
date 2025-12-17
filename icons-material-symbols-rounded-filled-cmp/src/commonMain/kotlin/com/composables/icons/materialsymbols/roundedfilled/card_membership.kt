package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Card_membership: ImageVector
    get() {
        if (_Card_membership != null) return _Card_membership!!
        
        _Card_membership = ImageVector.Builder(
            name = "card_membership",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(640f)
                verticalLineToRelative(135f)
                quadToRelative(0f, 23f, -19f, 34.5f)
                reflectiveQuadToRelative(-39f, 1.5f)
                lineToRelative(-84f, -42f)
                quadToRelative(-8f, -5f, -18f, -5f)
                reflectiveQuadToRelative(-18f, 5f)
                lineToRelative(-84f, 42f)
                quadToRelative(-20f, 10f, -39f, -1.5f)
                reflectiveQuadTo(320f, 815f)
                verticalLineToRelative(-135f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                close()
                moveToRelative(0f, 440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Card_membership!!
    }

private var _Card_membership: ImageVector? = null

