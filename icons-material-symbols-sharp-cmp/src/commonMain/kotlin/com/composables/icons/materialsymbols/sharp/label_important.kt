package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Label_important: ImageVector
    get() {
        if (_Label_important != null) return _Label_important!!
        
        _Label_important = ImageVector.Builder(
            name = "label_important",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                lineToRelative(180f, -280f)
                lineToRelative(-180f, -280f)
                horizontalLineToRelative(522f)
                lineToRelative(198f, 280f)
                lineToRelative(-198f, 280f)
                horizontalLineTo(120f)
                close()
                moveToRelative(146f, -80f)
                horizontalLineToRelative(334f)
                lineToRelative(142f, -200f)
                lineToRelative(-142f, -200f)
                horizontalLineTo(266f)
                lineToRelative(130f, 200f)
                lineToRelative(-130f, 200f)
                close()
                moveToRelative(130f, -200f)
                lineTo(266f, 280f)
                lineToRelative(130f, 200f)
                lineToRelative(-130f, 200f)
                lineToRelative(130f, -200f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null

