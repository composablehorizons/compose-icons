package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Playing_cards: ImageVector
    get() {
        if (_Playing_cards != null) return _Playing_cards!!
        
        _Playing_cards = ImageVector.Builder(
            name = "playing_cards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 592f)
                lineToRelative(46f, -166f)
                lineToRelative(-142f, -98f)
                lineToRelative(-46f, 166f)
                lineToRelative(142f, 98f)
                close()
                moveTo(160f, 753f)
                lineToRelative(-33f, -16f)
                quadToRelative(-31f, -13f, -42f, -44.5f)
                reflectiveQuadToRelative(3f, -62.5f)
                lineToRelative(72f, -156f)
                verticalLineToRelative(279f)
                close()
                moveToRelative(160f, 87f)
                quadToRelative(-33f, 0f, -56.5f, -24f)
                reflectiveQuadTo(240f, 759f)
                verticalLineToRelative(-239f)
                lineToRelative(107f, 294f)
                quadToRelative(3f, 7f, 5f, 13.5f)
                reflectiveQuadToRelative(7f, 12.5f)
                horizontalLineToRelative(-39f)
                close()
                moveToRelative(206f, -5f)
                quadToRelative(-31f, 11f, -62f, -3f)
                reflectiveQuadToRelative(-42f, -45f)
                lineTo(245f, 298f)
                quadToRelative(-11f, -31f, 3f, -61.5f)
                reflectiveQuadToRelative(45f, -41.5f)
                lineToRelative(301f, -110f)
                quadToRelative(31f, -11f, 61.5f, 3f)
                reflectiveQuadToRelative(41.5f, 45f)
                lineToRelative(178f, 489f)
                quadToRelative(11f, 31f, -3f, 61.5f)
                reflectiveQuadTo(827f, 725f)
                lineTo(526f, 835f)
                close()
            }
        }.build()
        
        return _Playing_cards!!
    }

private var _Playing_cards: ImageVector? = null

