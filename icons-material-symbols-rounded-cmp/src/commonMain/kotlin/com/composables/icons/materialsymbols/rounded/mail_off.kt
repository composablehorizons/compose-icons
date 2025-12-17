package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mail_off: ImageVector
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
                moveTo(763f, 876f)
                lineToRelative(-77f, -76f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineTo(83f, 197f)
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
                moveToRelative(117f, -636f)
                verticalLineToRelative(430f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 710f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 669f)
                verticalLineToRelative(-349f)
                lineTo(598f, 447f)
                quadToRelative(-14f, 9f, -27f, 4.5f)
                reflectiveQuadTo(551f, 436f)
                quadToRelative(-7f, -11f, -5f, -24.5f)
                reflectiveQuadToRelative(16f, -22.5f)
                lineToRelative(238f, -149f)
                horizontalLineTo(371f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(331f, 200f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
            }
        }.build()
        
        return _Mail_off!!
    }

private var _Mail_off: ImageVector? = null

