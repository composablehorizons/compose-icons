package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Edit_square: ImageVector
    get() {
        if (_Edit_square != null) return _Edit_square!!
        
        _Edit_square = ImageVector.Builder(
            name = "edit_square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(437f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-278f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(438f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -360f)
                close()
                moveTo(360f, 600f)
                verticalLineToRelative(-170f)
                lineToRelative(425f, -425f)
                lineToRelative(167f, 171f)
                lineToRelative(-422f, 424f)
                horizontalLineTo(360f)
                close()
                moveToRelative(481f, -424f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, 56f)
                close()
                moveTo(440f, 520f)
                horizontalLineToRelative(56f)
                lineToRelative(232f, -232f)
                lineToRelative(-28f, -28f)
                lineToRelative(-29f, -28f)
                lineToRelative(-231f, 231f)
                verticalLineToRelative(57f)
                close()
                moveToRelative(260f, -260f)
                lineToRelative(-29f, -28f)
                lineToRelative(29f, 28f)
                lineToRelative(28f, 28f)
                lineToRelative(-28f, -28f)
                close()
            }
        }.build()
        
        return _Edit_square!!
    }

private var _Edit_square: ImageVector? = null

