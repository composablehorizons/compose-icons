package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Table_chart_view: ImageVector
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
                moveTo(296f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(276f, -277f)
                lineToRelative(140f, 140f)
                lineToRelative(207f, -207f)
                lineToRelative(57f, 57f)
                lineToRelative(-264f, 263f)
                lineToRelative(-140f, -140f)
                lineTo(296f, 880f)
                close()
                moveToRelative(-136f, -40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(168f)
                horizontalLineTo(160f)
                verticalLineToRelative(472f)
                close()
                moveToRelative(0f, -552f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-88f)
                horizontalLineTo(160f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-88f)
                verticalLineToRelative(88f)
                close()
            }
        }.build()
        
        return _Table_chart_view!!
    }

private var _Table_chart_view: ImageVector? = null

