package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hdr_auto: ImageVector
    get() {
        if (_Hdr_auto != null) return _Hdr_auto!!
        
        _Hdr_auto = ImageVector.Builder(
            name = "hdr_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392f, 568f)
                horizontalLineToRelative(176f)
                lineToRelative(32f, 89f)
                quadToRelative(4f, 11f, 13f, 17f)
                reflectiveQuadToRelative(20f, 6f)
                quadToRelative(19f, 0f, 29.5f, -15.5f)
                reflectiveQuadTo(666f, 632f)
                lineTo(529f, 264f)
                quadToRelative(-4f, -11f, -13.5f, -17.5f)
                reflectiveQuadTo(494f, 240f)
                horizontalLineToRelative(-28f)
                quadToRelative(-12f, 0f, -21.5f, 6.5f)
                reflectiveQuadTo(431f, 264f)
                lineTo(294f, 633f)
                quadToRelative(-7f, 17f, 3.5f, 32f)
                reflectiveQuadToRelative(29.5f, 15f)
                quadToRelative(11f, 0f, 20f, -6.5f)
                reflectiveQuadToRelative(13f, -17.5f)
                lineToRelative(32f, -88f)
                close()
                moveToRelative(22f, -64f)
                lineToRelative(64f, -182f)
                horizontalLineToRelative(4f)
                lineToRelative(64f, 182f)
                horizontalLineTo(414f)
                close()
                moveToRelative(66f, 376f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Hdr_auto!!
    }

private var _Hdr_auto: ImageVector? = null

