package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(41f)
                verticalLineToRelative(114f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(61f, -167f)
                lineTo(659f, 543f)
                quadToRelative(5f, -42f, -8.5f, -81.5f)
                reflectiveQuadTo(607f, 392f)
                quadToRelative(-29f, -29f, -68.5f, -42.5f)
                reflectiveQuadTo(457f, 341f)
                lineTo(300f, 185f)
                lineToRelative(60f, -65f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(485f)
                close()
                moveToRelative(-400f, -65f)
                quadToRelative(23f, 0f, 44.5f, -5f)
                reflectiveQuadToRelative(41.5f, -16f)
                lineTo(321f, 434f)
                quadToRelative(-11f, 20f, -16f, 41.5f)
                reflectiveQuadToRelative(-5f, 44.5f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -20f, 7.5f, -38.5f)
                reflectiveQuadTo(409f, 449f)
                lineToRelative(142f, 142f)
                quadToRelative(-14f, 14f, -32.5f, 21.5f)
                reflectiveQuadTo(480f, 620f)
                close()
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

