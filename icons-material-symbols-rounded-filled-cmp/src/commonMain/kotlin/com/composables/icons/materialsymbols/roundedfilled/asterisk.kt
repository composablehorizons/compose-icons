package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) return _Asterisk!!
        
        _Asterisk = ImageVector.Builder(
            name = "asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-224f)
                lineTo(282f, 735f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(225f, 735f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(159f, -158f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                horizontalLineToRelative(224f)
                lineTo(225f, 282f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(158f, 159f)
                verticalLineToRelative(-224f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(224f)
                lineToRelative(158f, -159f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(735f, 282f)
                lineTo(576f, 440f)
                horizontalLineToRelative(224f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineTo(576f)
                lineToRelative(159f, 158f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(735f, 735f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(678f, 735f)
                lineTo(520f, 576f)
                verticalLineToRelative(224f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Asterisk!!
    }

private var _Asterisk: ImageVector? = null

