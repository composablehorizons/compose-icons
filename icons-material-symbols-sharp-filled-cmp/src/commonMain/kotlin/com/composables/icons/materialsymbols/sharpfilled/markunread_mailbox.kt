package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Markunread_mailbox: ImageVector
    get() {
        if (_Markunread_mailbox != null) return _Markunread_mailbox!!
        
        _Markunread_mailbox = ImageVector.Builder(
            name = "markunread_mailbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Markunread_mailbox!!
    }

private var _Markunread_mailbox: ImageVector? = null

