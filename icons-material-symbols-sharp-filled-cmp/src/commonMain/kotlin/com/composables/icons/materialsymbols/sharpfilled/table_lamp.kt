package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_lamp: ImageVector
    get() {
        if (_Table_lamp != null) return _Table_lamp!!
        
        _Table_lamp = ImageVector.Builder(
            name = "table_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-440f)
                horizontalLineTo(440f)
                verticalLineToRelative(160f)
                horizontalLineTo(99f)
                lineToRelative(140f, -320f)
                horizontalLineToRelative(201f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Table_lamp!!
    }

private var _Table_lamp: ImageVector? = null

