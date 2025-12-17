package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Table_chart: ImageVector
    get() {
        if (_Table_chart != null) return _Table_chart!!
        
        _Table_chart = ImageVector.Builder(
            name = "table_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveTo(200f, 320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(100f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-360f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-360f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineTo(380f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Table_chart!!
    }

private var _Table_chart: ImageVector? = null

