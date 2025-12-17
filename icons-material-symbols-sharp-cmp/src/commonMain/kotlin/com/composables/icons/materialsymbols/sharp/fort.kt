package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fort: ImageVector
    get() {
        if (_Fort != null) return _Fort!!
        
        _Fort = ImageVector.Builder(
            name = "fort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-160f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-240f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(240f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(400f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-47f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-306f)
                lineToRelative(47f, -47f)
                horizontalLineTo(633f)
                lineToRelative(47f, 47f)
                verticalLineToRelative(153f)
                horizontalLineTo(280f)
                verticalLineToRelative(-153f)
                lineToRelative(47f, -47f)
                horizontalLineTo(153f)
                lineToRelative(47f, 47f)
                verticalLineToRelative(306f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(360f, -240f)
                close()
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

