package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Polymer: ImageVector
    get() {
        if (_Polymer != null) return _Polymer!!
        
        _Polymer = ImageVector.Builder(
            name = "polymer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(321f, 800f)
                horizontalLineToRelative(-76f)
                quadToRelative(-22f, 0f, -40.5f, -11f)
                reflectiveQuadTo(175f, 759f)
                lineTo(42f, 519f)
                quadToRelative(-11f, -18f, -11f, -39f)
                reflectiveQuadToRelative(11f, -39f)
                lineToRelative(140f, -250f)
                quadToRelative(8f, -14f, 21.5f, -22.5f)
                reflectiveQuadTo(234f, 160f)
                horizontalLineToRelative(75f)
                quadToRelative(17f, 0f, 25.5f, 15f)
                reflectiveQuadToRelative(0.5f, 30f)
                lineTo(180f, 480f)
                lineToRelative(104f, 186f)
                lineToRelative(289f, -468f)
                quadToRelative(11f, -18f, 29f, -28f)
                reflectiveQuadToRelative(39f, -10f)
                horizontalLineToRelative(72f)
                quadToRelative(22f, 0f, 40.5f, 11f)
                reflectiveQuadToRelative(29.5f, 30f)
                lineToRelative(135f, 240f)
                quadToRelative(11f, 18f, 11f, 39f)
                reflectiveQuadToRelative(-11f, 39f)
                lineTo(778f, 769f)
                quadToRelative(-8f, 14f, -21.5f, 22.5f)
                reflectiveQuadTo(726f, 800f)
                horizontalLineToRelative(-75f)
                quadToRelative(-17f, 0f, -25.5f, -15f)
                reflectiveQuadToRelative(-0.5f, -30f)
                lineToRelative(155f, -275f)
                lineToRelative(-104f, -184f)
                lineToRelative(-287f, 466f)
                quadToRelative(-11f, 18f, -29f, 28f)
                reflectiveQuadToRelative(-39f, 10f)
                close()
            }
        }.build()
        
        return _Polymer!!
    }

private var _Polymer: ImageVector? = null

