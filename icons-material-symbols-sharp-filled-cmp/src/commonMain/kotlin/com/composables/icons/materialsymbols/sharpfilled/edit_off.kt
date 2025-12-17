package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(622f, 507f)
                lineTo(453f, 338f)
                lineToRelative(252f, -252f)
                lineToRelative(168f, 171f)
                lineToRelative(-251f, 250f)
                close()
                moveTo(792f, 904f)
                lineTo(509f, 622f)
                lineTo(290f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-169f)
                lineToRelative(219f, -219f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-88f, -592f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

