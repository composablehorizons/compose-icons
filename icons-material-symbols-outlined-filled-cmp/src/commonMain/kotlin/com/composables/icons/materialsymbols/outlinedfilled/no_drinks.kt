package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_drinks: ImageVector
    get() {
        if (_No_drinks != null) return _No_drinks!!
        
        _No_drinks = ImageVector.Builder(
            name = "no_drinks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-206f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-271f, -271f)
                verticalLineToRelative(126f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(352f, -362f)
                lineTo(394f, 280f)
                horizontalLineToRelative(268f)
                lineToRelative(72f, -80f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(80f)
                lineTo(592f, 478f)
                close()
            }
        }.build()
        
        return _No_drinks!!
    }

private var _No_drinks: ImageVector? = null

