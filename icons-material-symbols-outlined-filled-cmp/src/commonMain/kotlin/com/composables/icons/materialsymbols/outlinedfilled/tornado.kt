package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tornado: ImageVector
    get() {
        if (_Tornado != null) return _Tornado!!
        
        _Tornado = ImageVector.Builder(
            name = "tornado",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 120f)
                horizontalLineToRelative(880f)
                lineTo(804f, 320f)
                horizontalLineTo(156f)
                lineTo(40f, 120f)
                close()
                moveToRelative(162f, 280f)
                horizontalLineToRelative(556f)
                lineToRelative(-70f, 120f)
                horizontalLineTo(272f)
                lineToRelative(-70f, -120f)
                close()
                moveToRelative(116f, 200f)
                horizontalLineToRelative(324f)
                lineTo(480f, 880f)
                lineTo(318f, 600f)
                close()
            }
        }.build()
        
        return _Tornado!!
    }

private var _Tornado: ImageVector? = null

