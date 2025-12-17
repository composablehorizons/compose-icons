package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hdr_auto: ImageVector
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
                moveTo(276f, 680f)
                horizontalLineToRelative(76f)
                lineToRelative(40f, -112f)
                horizontalLineToRelative(176f)
                lineToRelative(40f, 112f)
                horizontalLineToRelative(76f)
                lineTo(520f, 240f)
                horizontalLineToRelative(-80f)
                lineTo(276f, 680f)
                close()
                moveToRelative(138f, -176f)
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

