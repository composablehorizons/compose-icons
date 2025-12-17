package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Comment_bank: ImageVector
    get() {
        if (_Comment_bank != null) return _Comment_bank!!
        
        _Comment_bank = ImageVector.Builder(
            name = "comment_bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 440f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(500f)
                verticalLineToRelative(280f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
            }
        }.build()
        
        return _Comment_bank!!
    }

private var _Comment_bank: ImageVector? = null

