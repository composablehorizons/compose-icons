package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mail_off: ImageVector
    get() {
        if (_Mail_off != null) return _Mail_off!!
        
        _Mail_off = ImageVector.Builder(
            name = "mail_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383f, 497f)
                close()
                moveToRelative(194f, -34f)
                close()
                moveTo(791f, 905f)
                lineTo(686f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(89f, -139f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-366f)
                lineTo(575f, 461f)
                lineToRelative(-49f, -49f)
                lineToRelative(274f, -172f)
                horizontalLineTo(354f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                close()
            }
        }.build()
        
        return _Mail_off!!
    }

private var _Mail_off: ImageVector? = null

