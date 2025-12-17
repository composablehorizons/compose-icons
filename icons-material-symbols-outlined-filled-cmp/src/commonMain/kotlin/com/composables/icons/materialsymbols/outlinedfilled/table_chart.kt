package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Table_chart: ImageVector
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
                moveTo(120f, 320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(120f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, 520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(200f)
                close()
                moveToRelative(460f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(380f)
                close()
            }
        }.build()
        
        return _Table_chart!!
    }

private var _Table_chart: ImageVector? = null

