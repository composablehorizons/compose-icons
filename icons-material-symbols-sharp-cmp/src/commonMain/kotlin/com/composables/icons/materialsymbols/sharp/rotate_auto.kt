package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rotate_auto: ImageVector
    get() {
        if (_Rotate_auto != null) return _Rotate_auto!!
        
        _Rotate_auto = ImageVector.Builder(
            name = "rotate_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 640f)
                horizontalLineToRelative(64f)
                lineToRelative(32f, -92f)
                horizontalLineToRelative(146f)
                lineToRelative(32f, 92f)
                horizontalLineToRelative(62f)
                lineTo(512f, 280f)
                horizontalLineToRelative(-64f)
                lineTo(312f, 640f)
                close()
                moveToRelative(114f, -144f)
                lineToRelative(52f, -150f)
                horizontalLineToRelative(4f)
                lineToRelative(52f, 150f)
                horizontalLineTo(426f)
                close()
                moveToRelative(54f, 384f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 66f, 25f, 124.5f)
                reflectiveQuadToRelative(68.5f, 102f)
                quadToRelative(43.5f, 43.5f, 102f, 69f)
                reflectiveQuadTo(480f, 801f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-89f, 0f, -161.5f, 43.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(55f, -73f, 138f, -116.5f)
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
        
        return _Rotate_auto!!
    }

private var _Rotate_auto: ImageVector? = null

