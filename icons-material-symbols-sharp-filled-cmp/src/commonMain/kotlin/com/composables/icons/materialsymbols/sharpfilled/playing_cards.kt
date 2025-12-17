package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Playing_cards: ImageVector
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
                lineTo(54f, 703f)
                lineToRelative(106f, -229f)
                verticalLineToRelative(279f)
                close()
                moveToRelative(80f, 87f)
                verticalLineToRelative(-320f)
                lineToRelative(116f, 320f)
                horizontalLineTo(240f)
                close()
                moveToRelative(210f, 23f)
                lineTo(217f, 222f)
                lineToRelative(453f, -165f)
                lineToRelative(233f, 641f)
                lineTo(450f, 863f)
                close()
            }
        }.build()
        
        return _Playing_cards!!
    }

private var _Playing_cards: ImageVector? = null

