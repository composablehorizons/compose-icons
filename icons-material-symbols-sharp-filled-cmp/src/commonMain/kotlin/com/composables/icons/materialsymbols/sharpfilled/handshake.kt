package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Handshake: ImageVector
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
                moveTo(484f, 856f)
                lineToRelative(446f, -446f)
                lineToRelative(-340f, -340f)
                lineToRelative(-82f, 82f)
                lineToRelative(236f, 236f)
                lineToRelative(-113f, 113f)
                lineToRelative(-207f, -207f)
                lineToRelative(-251f, 252f)
                lineToRelative(56f, 56f)
                lineToRelative(213f, -213f)
                lineToRelative(29f, 28f)
                lineToRelative(-212f, 214f)
                lineToRelative(56f, 56f)
                lineToRelative(213f, -213f)
                lineToRelative(28f, 28f)
                lineToRelative(-213f, 213f)
                lineToRelative(56f, 56f)
                lineToRelative(213f, -213f)
                lineToRelative(29f, 29f)
                lineToRelative(-213f, 213f)
                lineToRelative(56f, 56f)
                close()
                moveTo(141f, 520f)
                lineToRelative(282f, -282f)
                lineToRelative(207f, 207f)
                lineToRelative(57f, -57f)
                lineToRelative(-318f, -318f)
                lineTo(30f, 409f)
                lineToRelative(111f, 111f)
                close()
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

