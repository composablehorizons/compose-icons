package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Domain_verification: ImageVector
    get() {
        if (_Domain_verification != null) return _Domain_verification!!
        
        _Domain_verification = ImageVector.Builder(
            name = "domain_verification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(278f, -58f)
                lineTo(296f, 520f)
                lineToRelative(58f, -58f)
                lineToRelative(84f, 84f)
                lineToRelative(168f, -168f)
                lineToRelative(58f, 58f)
                lineToRelative(-226f, 226f)
                close()
                moveToRelative(-278f, 58f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Domain_verification!!
    }

private var _Domain_verification: ImageVector? = null

