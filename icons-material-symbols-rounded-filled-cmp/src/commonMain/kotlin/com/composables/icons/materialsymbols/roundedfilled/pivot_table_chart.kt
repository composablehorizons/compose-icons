package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pivot_table_chart: ImageVector
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
                moveToRelative(394f, 440f)
                lineToRelative(35f, 36f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(548f, 852f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(388f, 748f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(548f, 588f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(549f, 644f)
                lineToRelative(-35f, 36f)
                horizontalLineToRelative(86f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(-88f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(88f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-86f)
                close()
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

