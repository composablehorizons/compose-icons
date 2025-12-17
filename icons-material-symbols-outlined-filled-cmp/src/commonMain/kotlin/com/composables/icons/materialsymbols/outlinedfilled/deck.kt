package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Deck: ImageVector
    get() {
        if (_Deck != null) return _Deck!!
        
        _Deck = ImageVector.Builder(
            name = "deck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineTo(80f)
                lineToRelative(400f, -280f)
                lineToRelative(400f, 280f)
                horizontalLineTo(520f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-210f)
                lineTo(88f, 494f)
                lineToRelative(78f, -14f)
                lineToRelative(30f, 160f)
                horizontalLineToRelative(164f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(164f)
                lineToRelative(30f, -160f)
                lineToRelative(78f, 14f)
                lineToRelative(-32f, 176f)
                verticalLineToRelative(210f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Deck!!
    }

private var _Deck: ImageVector? = null

