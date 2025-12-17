package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tornado: ImageVector
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
                moveTo(110f, 240f)
                lineToRelative(46f, 80f)
                horizontalLineToRelative(648f)
                lineToRelative(46f, -80f)
                quadToRelative(23f, -40f, 0.5f, -80f)
                reflectiveQuadTo(781f, 120f)
                horizontalLineTo(179f)
                quadToRelative(-47f, 0f, -69.5f, 40f)
                reflectiveQuadToRelative(0.5f, 80f)
                close()
                moveToRelative(92f, 160f)
                lineToRelative(70f, 120f)
                horizontalLineToRelative(416f)
                lineToRelative(70f, -120f)
                horizontalLineTo(202f)
                close()
                moveToRelative(116f, 200f)
                lineToRelative(93f, 160f)
                quadToRelative(23f, 40f, 69f, 40f)
                reflectiveQuadToRelative(69f, -40f)
                lineToRelative(93f, -160f)
                horizontalLineTo(318f)
                close()
            }
        }.build()
        
        return _Tornado!!
    }

private var _Tornado: ImageVector? = null

