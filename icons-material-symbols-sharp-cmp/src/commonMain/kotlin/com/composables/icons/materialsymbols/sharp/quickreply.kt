package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quickreply: ImageVector
    get() {
        if (_Quickreply != null) return _Quickreply!!
        
        _Quickreply = ImageVector.Builder(
            name = "quickreply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(525f)
                lineToRelative(46f, -45f)
                horizontalLineToRelative(394f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
                moveToRelative(80f, -240f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveTo(760f, 920f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                lineToRelative(-68f, 160f)
                horizontalLineToRelative(88f)
                lineTo(760f, 920f)
                close()
            }
        }.build()
        
        return _Quickreply!!
    }

private var _Quickreply: ImageVector? = null

