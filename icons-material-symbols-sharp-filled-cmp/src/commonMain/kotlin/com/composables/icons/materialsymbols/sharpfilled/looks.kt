package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Looks: ImageVector
    get() {
        if (_Looks != null) return _Looks!!
        
        _Looks = ImageVector.Builder(
            name = "looks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 680f)
                quadToRelative(0f, -91f, 34.5f, -171f)
                reflectiveQuadTo(169f, 369f)
                quadToRelative(60f, -60f, 140f, -94.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(91f, 0f, 171f, 34.5f)
                reflectiveQuadTo(791f, 369f)
                quadToRelative(60f, 60f, 94.5f, 140f)
                reflectiveQuadTo(920f, 680f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -149f, -105.5f, -254.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-149f, 0f, -254.5f, 105.5f)
                reflectiveQuadTo(120f, 680f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 680f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Looks!!
    }

private var _Looks: ImageVector? = null

