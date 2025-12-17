package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mail_asterisk: ImageVector
    get() {
        if (_Mail_asterisk != null) return _Mail_asterisk!!
        
        _Mail_asterisk = ImageVector.Builder(
            name = "mail_asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, -40f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                lineTo(480f, 520f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveTo(715f, 918f)
                lineToRelative(-70f, -40f)
                lineToRelative(46f, -78f)
                horizontalLineToRelative(-91f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(91f)
                lineToRelative(-46f, -78f)
                lineToRelative(70f, -40f)
                lineToRelative(45f, 78f)
                lineToRelative(45f, -78f)
                lineToRelative(70f, 40f)
                lineToRelative(-46f, 78f)
                horizontalLineToRelative(91f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-91f)
                lineToRelative(46f, 78f)
                lineToRelative(-70f, 40f)
                lineToRelative(-45f, -78f)
                lineToRelative(-45f, 78f)
                close()
            }
        }.build()
        
        return _Mail_asterisk!!
    }

private var _Mail_asterisk: ImageVector? = null

