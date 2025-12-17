package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mail_off: ImageVector
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
                moveTo(763f, 876f)
                lineToRelative(-77f, -76f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineTo(126f)
                lineToRelative(-43f, -43f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(92f, -170f)
                quadToRelative(-11f, 5f, -22f, 3.5f)
                reflectiveQuadTo(812f, 698f)
                lineTo(575f, 461f)
                lineToRelative(209f, -131f)
                quadToRelative(14f, -9f, 16f, -22.5f)
                reflectiveQuadToRelative(-5f, -24.5f)
                quadToRelative(-7f, -11f, -20f, -15f)
                reflectiveQuadToRelative(-27f, 5f)
                lineTo(526f, 412f)
                lineTo(342f, 228f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(429f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                close()
            }
        }.build()
        
        return _Mail_off!!
    }

private var _Mail_off: ImageVector? = null

