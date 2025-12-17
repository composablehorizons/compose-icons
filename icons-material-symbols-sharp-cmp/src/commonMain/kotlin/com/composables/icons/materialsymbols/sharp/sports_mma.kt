package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_mma: ImageVector
    get() {
        if (_Sports_mma != null) return _Sports_mma!!
        
        _Sports_mma = ImageVector.Builder(
            name = "sports_mma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-40f, -200f)
                lineToRelative(-40f, -202f)
                verticalLineToRelative(-318f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(158f)
                lineToRelative(-40f, 202f)
                horizontalLineTo(240f)
                close()
                moveToRelative(66f, -80f)
                horizontalLineToRelative(348f)
                lineToRelative(26f, -136f)
                verticalLineToRelative(-24f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(224f)
                lineToRelative(26f, 136f)
                close()
                moveToRelative(14f, -160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(160f, -20f)
                close()
            }
        }.build()
        
        return _Sports_mma!!
    }

private var _Sports_mma: ImageVector? = null

