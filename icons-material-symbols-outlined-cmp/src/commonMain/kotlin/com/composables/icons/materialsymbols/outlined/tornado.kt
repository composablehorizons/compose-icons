package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tornado: ImageVector
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
                lineTo(480f, 880f)
                lineTo(40f, 120f)
                close()
                moveToRelative(139f, 80f)
                lineToRelative(69f, 120f)
                horizontalLineToRelative(464f)
                lineToRelative(69f, -120f)
                horizontalLineTo(179f)
                close()
                moveToRelative(116f, 200f)
                lineToRelative(69f, 120f)
                horizontalLineToRelative(232f)
                lineToRelative(69f, -120f)
                horizontalLineTo(295f)
                close()
                moveToRelative(116f, 200f)
                lineToRelative(69f, 120f)
                lineToRelative(69f, -120f)
                horizontalLineTo(411f)
                close()
            }
        }.build()
        
        return _Tornado!!
    }

private var _Tornado: ImageVector? = null

