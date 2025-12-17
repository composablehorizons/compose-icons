package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_chart: ImageVector
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
                verticalLineToRelative(-200f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(540f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
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

