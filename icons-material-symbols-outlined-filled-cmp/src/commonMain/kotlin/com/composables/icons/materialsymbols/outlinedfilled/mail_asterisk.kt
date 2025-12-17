package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mail_asterisk: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(311f)
                quadToRelative(-26f, -15f, -56.5f, -23.5f)
                reflectiveQuadTo(760f, 519f)
                quadToRelative(-100f, 0f, -170.5f, 70.5f)
                reflectiveQuadTo(519f, 760f)
                quadToRelative(0f, 11f, 0.5f, 20.5f)
                reflectiveQuadTo(522f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -280f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(480f, 440f)
                lineTo(160f, 240f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
            }
        }.build()
        
        return _Mail_asterisk!!
    }

private var _Mail_asterisk: ImageVector? = null

