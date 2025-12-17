package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mark_email_read: ImageVector
    get() {
        if (_Mark_email_read != null) return _Mark_email_read!!
        
        _Mark_email_read = ImageVector.Builder(
            name = "mark_email_read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(638f, 880f)
                lineTo(468f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 56f)
                lineTo(638f, 880f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(254f)
                lineTo(639f, 655f)
                lineTo(524f, 540f)
                lineTo(355f, 709f)
                lineToRelative(91f, 91f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -280f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(480f, 440f)
                lineTo(160f, 240f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

