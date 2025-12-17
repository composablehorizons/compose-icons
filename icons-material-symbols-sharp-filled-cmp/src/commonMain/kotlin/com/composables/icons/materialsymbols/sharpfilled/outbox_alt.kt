package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Outbox_alt: ImageVector
    get() {
        if (_Outbox_alt != null) return _Outbox_alt!!
        
        _Outbox_alt = ImageVector.Builder(
            name = "outbox_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                lineToRelative(480f, -240f)
                lineToRelative(-480f, -240f)
                verticalLineToRelative(174f)
                lineToRelative(200f, 66f)
                lineToRelative(-200f, 66f)
                verticalLineToRelative(174f)
                close()
                moveToRelative(480f, -240f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Outbox_alt!!
    }

private var _Outbox_alt: ImageVector? = null

