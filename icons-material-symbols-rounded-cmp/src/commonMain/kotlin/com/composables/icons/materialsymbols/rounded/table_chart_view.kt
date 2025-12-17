package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Table_chart_view: ImageVector
    get() {
        if (_Table_chart_view != null) return _Table_chart_view!!
        
        _Table_chart_view = ImageVector.Builder(
            name = "table_chart_view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 852f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(191f, -192f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(83f, 83f)
                lineToRelative(179f, -179f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(891f, 565f)
                lineTo(713f, 744f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(600f, 744f)
                lineToRelative(-84f, -84f)
                lineToRelative(-192f, 192f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 852f)
                close()
                moveToRelative(-108f, -12f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 400f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, -520f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Table_chart_view!!
    }

private var _Table_chart_view: ImageVector? = null

