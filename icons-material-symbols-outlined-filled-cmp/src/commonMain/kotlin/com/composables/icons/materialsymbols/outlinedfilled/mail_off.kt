package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mail_off: ImageVector
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
                moveTo(791f, 905f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineTo(126f)
                lineToRelative(-71f, -71f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(80f, -148f)
                lineTo(575f, 461f)
                lineToRelative(225f, -141f)
                verticalLineToRelative(-80f)
                lineTo(526f, 412f)
                lineTo(274f, 160f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
            }
        }.build()
        
        return _Mail_off!!
    }

private var _Mail_off: ImageVector? = null

