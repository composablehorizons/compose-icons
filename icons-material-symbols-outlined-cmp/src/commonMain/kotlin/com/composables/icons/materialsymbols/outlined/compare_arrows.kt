package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Compare_arrows: ImageVector
    get() {
        if (_Compare_arrows != null) return _Compare_arrows!!
        
        _Compare_arrows = ImageVector.Builder(
            name = "compare_arrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                lineToRelative(-56f, -57f)
                lineToRelative(103f, -103f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(287f)
                lineTo(264f, 457f)
                lineToRelative(56f, -57f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
                moveToRelative(320f, -240f)
                lineTo(440f, 360f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 57f)
                lineToRelative(-103f, 103f)
                horizontalLineToRelative(287f)
                verticalLineToRelative(80f)
                horizontalLineTo(593f)
                lineToRelative(103f, 103f)
                lineToRelative(-56f, 57f)
                close()
            }
        }.build()
        
        return _Compare_arrows!!
    }

private var _Compare_arrows: ImageVector? = null

