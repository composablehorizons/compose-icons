package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrows_outward: ImageVector
    get() {
        if (_Arrows_outward != null) return _Arrows_outward!!
        
        _Arrows_outward = ImageVector.Builder(
            name = "arrows_outward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 680f)
                lineToRelative(-56f, -56f)
                lineToRelative(103f, -104f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(207f)
                lineTo(624f, 336f)
                lineToRelative(56f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
                moveToRelative(-400f, 0f)
                lineTo(80f, 480f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 56f)
                lineToRelative(-103f, 104f)
                horizontalLineToRelative(207f)
                verticalLineToRelative(80f)
                horizontalLineTo(233f)
                lineToRelative(103f, 104f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Arrows_outward!!
    }

private var _Arrows_outward: ImageVector? = null

