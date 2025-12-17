package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Text_increase: ImageVector
    get() {
        if (_Text_increase != null) return _Text_increase!!
        
        _Text_increase = ImageVector.Builder(
            name = "text_increase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                lineToRelative(210f, -560f)
                horizontalLineToRelative(100f)
                lineToRelative(210f, 560f)
                horizontalLineToRelative(-96f)
                lineToRelative(-51f, -143f)
                horizontalLineTo(187f)
                lineToRelative(-51f, 143f)
                horizontalLineTo(40f)
                close()
                moveToRelative(176f, -224f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
                moveToRelative(504f, 104f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Text_increase!!
    }

private var _Text_increase: ImageVector? = null

