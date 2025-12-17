package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Edit_square: ImageVector
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
                moveTo(360f, 600f)
                verticalLineToRelative(-170f)
                lineToRelative(425f, -425f)
                lineToRelative(167f, 171f)
                lineToRelative(-422f, 424f)
                horizontalLineTo(360f)
                close()
                moveToRelative(424f, -368f)
                lineToRelative(57f, -56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-57f, 56f)
                lineToRelative(56f, 56f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(437f)
                lineTo(280f, 397f)
                verticalLineToRelative(283f)
                horizontalLineToRelative(282f)
                lineToRelative(278f, -278f)
                verticalLineToRelative(438f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Edit_square!!
    }

private var _Edit_square: ImageVector? = null

