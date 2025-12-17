package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Handshake: ImageVector
    get() {
        if (_Handshake != null) return _Handshake!!
        
        _Handshake = ImageVector.Builder(
            name = "handshake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(474f, 920f)
                lineTo(79f, 525f)
                lineToRelative(302f, -302f)
                lineToRelative(146f, 146f)
                lineToRelative(28f, -28f)
                lineToRelative(-214f, -214f)
                lineTo(68f, 400f)
                lineToRelative(39f, 39f)
                lineToRelative(-57f, 57f)
                lineToRelative(-94f, -94f)
                lineToRelative(387f, -387f)
                lineToRelative(124f, 124f)
                lineToRelative(124f, -124f)
                lineToRelative(394f, 394f)
                lineTo(474f, 920f)
                close()
                moveToRelative(1f, -112f)
                lineToRelative(397f, -399f)
                lineToRelative(-282f, -282f)
                lineToRelative(-67f, 67f)
                lineToRelative(146f, 146f)
                lineToRelative(-142f, 142f)
                lineToRelative(-146f, -146f)
                lineToRelative(-189f, 189f)
                lineToRelative(29f, 29f)
                lineToRelative(149f, -149f)
                lineToRelative(56f, 56f)
                lineToRelative(-149f, 149f)
                lineToRelative(28f, 28f)
                lineToRelative(149f, -149f)
                lineToRelative(57f, 57f)
                lineToRelative(-149f, 149f)
                lineToRelative(28f, 28f)
                lineToRelative(149f, -149f)
                lineToRelative(56f, 56f)
                lineToRelative(-149f, 149f)
                lineToRelative(29f, 29f)
                close()
                moveTo(359f, 295f)
                close()
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

