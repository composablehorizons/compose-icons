package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pivot_table_chart: ImageVector
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
                horizontalLineToRelative(440f)
                verticalLineToRelative(200f)
                horizontalLineTo(400f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveTo(520f, 880f)
                lineTo(360f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-62f, 64f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-168f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(248f)
                horizontalLineTo(514f)
                lineToRelative(62f, 64f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

