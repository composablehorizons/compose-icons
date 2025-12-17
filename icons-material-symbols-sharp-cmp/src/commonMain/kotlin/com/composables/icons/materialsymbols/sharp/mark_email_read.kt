package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mark_email_read: ImageVector
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
                moveTo(480f, 440f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveToRelative(0f, 80f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(206f)
                lineToRelative(80f, 80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(254f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(-174f)
                lineTo(480f, 520f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 80f)
                close()
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

