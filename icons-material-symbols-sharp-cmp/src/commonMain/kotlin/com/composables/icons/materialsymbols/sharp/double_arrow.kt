package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Double_arrow: ImageVector
    get() {
        if (_Double_arrow != null) return _Double_arrow!!
        
        _Double_arrow = ImageVector.Builder(
            name = "double_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(242f, 760f)
                lineToRelative(200f, -280f)
                lineToRelative(-200f, -280f)
                horizontalLineToRelative(98f)
                lineToRelative(200f, 280f)
                lineToRelative(-200f, 280f)
                horizontalLineToRelative(-98f)
                close()
                moveToRelative(238f, 0f)
                lineToRelative(200f, -280f)
                lineToRelative(-200f, -280f)
                horizontalLineToRelative(98f)
                lineToRelative(200f, 280f)
                lineToRelative(-200f, 280f)
                horizontalLineToRelative(-98f)
                close()
            }
        }.build()
        
        return _Double_arrow!!
    }

private var _Double_arrow: ImageVector? = null

