package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Diamond_shine: ImageVector
    get() {
        if (_Diamond_shine != null) return _Diamond_shine!!
        
        _Diamond_shine = ImageVector.Builder(
            name = "diamond_shine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(183f, 280f)
                lineToRelative(-85f, -85f)
                lineToRelative(57f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(257f, -80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(335f, 80f)
                lineToRelative(-57f, -57f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 57f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(480f, 880f)
                lineTo(157f, 560f)
                horizontalLineToRelative(646f)
                lineTo(480f, 880f)
                close()
                moveTo(320f, 280f)
                horizontalLineToRelative(320f)
                lineToRelative(164f, 200f)
                horizontalLineTo(156f)
                lineToRelative(164f, -200f)
                close()
            }
        }.build()
        
        return _Diamond_shine!!
    }

private var _Diamond_shine: ImageVector? = null

