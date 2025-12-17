package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.P2p: ImageVector
    get() {
        if (_P2p != null) return _P2p!!
        
        _P2p = ImageVector.Builder(
            name = "p2p",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, 80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(720f)
                horizontalLineTo(520f)
                close()
                moveTo(280f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _P2p!!
    }

private var _P2p: ImageVector? = null

