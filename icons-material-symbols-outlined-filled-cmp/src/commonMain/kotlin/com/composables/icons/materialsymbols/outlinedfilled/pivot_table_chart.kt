package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pivot_table_chart: ImageVector
    get() {
        if (_Pivot_table_chart != null) return _Pivot_table_chart!!
        
        _Pivot_table_chart = ImageVector.Builder(
            name = "pivot_table_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(120f)
                horizontalLineTo(400f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-80f, -520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveTo(520f, 880f)
                lineTo(360f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-62f, 64f)
                horizontalLineToRelative(86f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(-88f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(88f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-86f)
                lineToRelative(62f, 64f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

