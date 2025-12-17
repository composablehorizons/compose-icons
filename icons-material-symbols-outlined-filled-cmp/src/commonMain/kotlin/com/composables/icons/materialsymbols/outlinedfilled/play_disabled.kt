package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Play_disabled: ImageVector
    get() {
        if (_Play_disabled != null) return _Play_disabled!!
        
        _Play_disabled = ImageVector.Builder(
            name = "play_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(658f, 544f)
                lineTo(320f, 206f)
                verticalLineToRelative(-6f)
                lineToRelative(440f, 280f)
                lineToRelative(-102f, 64f)
                close()
                moveTo(790f, 904f)
                lineTo(520f, 632f)
                lineTo(320f, 760f)
                verticalLineToRelative(-328f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-58f, 56f)
                close()
            }
        }.build()
        
        return _Play_disabled!!
    }

private var _Play_disabled: ImageVector? = null

