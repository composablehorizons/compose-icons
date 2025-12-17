package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sticky_note: ImageVector
    get() {
        if (_Sticky_note != null) return _Sticky_note!!
        
        _Sticky_note = ImageVector.Builder(
            name = "sticky_note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(520f)
                lineTo(640f, 840f)
                close()
                moveToRelative(-40f, -80f)
                lineToRelative(160f, -160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveTo(440f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Sticky_note!!
    }

private var _Sticky_note: ImageVector? = null

