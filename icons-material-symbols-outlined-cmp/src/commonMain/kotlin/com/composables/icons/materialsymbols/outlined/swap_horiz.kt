package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swap_horiz: ImageVector
    get() {
        if (_Swap_horiz != null) return _Swap_horiz!!
        
        _Swap_horiz = ImageVector.Builder(
            name = "swap_horiz",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                lineTo(80f, 600f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 57f)
                lineToRelative(-103f, 103f)
                horizontalLineToRelative(287f)
                verticalLineToRelative(80f)
                horizontalLineTo(233f)
                lineToRelative(103f, 103f)
                lineToRelative(-56f, 57f)
                close()
                moveToRelative(400f, -240f)
                lineToRelative(-56f, -57f)
                lineToRelative(103f, -103f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(287f)
                lineTo(624f, 217f)
                lineToRelative(56f, -57f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Swap_horiz!!
    }

private var _Swap_horiz: ImageVector? = null

