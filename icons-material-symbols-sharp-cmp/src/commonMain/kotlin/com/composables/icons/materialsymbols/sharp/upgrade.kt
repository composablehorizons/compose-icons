package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Upgrade: ImageVector
    get() {
        if (_Upgrade != null) return _Upgrade!!
        
        _Upgrade = ImageVector.Builder(
            name = "upgrade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-327f)
                lineTo(336f, 416f)
                lineToRelative(-56f, -56f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -103f)
                verticalLineToRelative(327f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Upgrade!!
    }

private var _Upgrade: ImageVector? = null

