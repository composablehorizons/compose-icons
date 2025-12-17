package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Done_all: ImageVector
    get() {
        if (_Done_all != null) return _Done_all!!
        
        _Done_all = ImageVector.Builder(
            name = "done_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(70f, 522f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadTo(71f, 466f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(142f, 142f)
                lineToRelative(14f, 14f)
                lineToRelative(14f, 14f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(296f, 692f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(240f, 692f)
                lineTo(70f, 522f)
                close()
                moveToRelative(424f, 85f)
                lineToRelative(340f, -340f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(890f, 324f)
                lineTo(522f, 692f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(296f, 522f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(141f, 141f)
                close()
                moveToRelative(169f, -282f)
                lineTo(522f, 466f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(466f, 466f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(141f, -141f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(663f, 325f)
                close()
            }
        }.build()
        
        return _Done_all!!
    }

private var _Done_all: ImageVector? = null

