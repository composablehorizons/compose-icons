package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Diamond_shine: ImageVector
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
                moveTo(480f, 880f)
                lineTo(120f, 524f)
                lineToRelative(200f, -244f)
                horizontalLineToRelative(320f)
                lineToRelative(200f, 244f)
                lineTo(480f, 880f)
                close()
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
                moveTo(480f, 768f)
                lineToRelative(210f, -208f)
                horizontalLineTo(270f)
                lineToRelative(210f, 208f)
                close()
                moveTo(358f, 360f)
                lineToRelative(-99f, 120f)
                horizontalLineToRelative(442f)
                lineToRelative(-99f, -120f)
                horizontalLineTo(358f)
                close()
            }
        }.build()
        
        return _Diamond_shine!!
    }

private var _Diamond_shine: ImageVector? = null

