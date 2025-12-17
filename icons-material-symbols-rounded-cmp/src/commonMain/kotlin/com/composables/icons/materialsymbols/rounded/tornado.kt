package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tornado: ImageVector
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
                moveTo(179f, 120f)
                horizontalLineToRelative(602f)
                quadToRelative(47f, 0f, 69.5f, 40f)
                reflectiveQuadToRelative(-0.5f, 80f)
                lineTo(549f, 760f)
                quadToRelative(-23f, 40f, -69f, 40f)
                reflectiveQuadToRelative(-69f, -40f)
                lineTo(110f, 240f)
                quadToRelative(-23f, -40f, -0.5f, -80f)
                reflectiveQuadToRelative(69.5f, -40f)
                close()
                moveToRelative(0f, 80f)
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

