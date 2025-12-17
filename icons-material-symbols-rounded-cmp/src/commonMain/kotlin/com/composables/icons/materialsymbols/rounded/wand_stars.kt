package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wand_stars: ImageVector
    get() {
        if (_Wand_stars != null) return _Wand_stars!!
        
        _Wand_stars = ImageVector.Builder(
            name = "wand_stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(646f, 522f)
                lineToRelative(-86f, 138f)
                quadToRelative(-11f, 17f, -30.5f, 14f)
                reflectiveQuadTo(505f, 651f)
                lineToRelative(-28f, -112f)
                lineToRelative(-273f, 273f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(148f, 812f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(273f, -274f)
                lineToRelative(-112f, -28f)
                quadToRelative(-20f, -5f, -23f, -24.5f)
                reflectiveQuadToRelative(14f, -30.5f)
                lineToRelative(138f, -85f)
                lineToRelative(-12f, -163f)
                quadToRelative(-2f, -20f, 16f, -29f)
                reflectiveQuadToRelative(33f, 4f)
                lineToRelative(125f, 105f)
                lineToRelative(151f, -61f)
                quadToRelative(19f, -8f, 33f, 6f)
                reflectiveQuadToRelative(6f, 33f)
                lineToRelative(-61f, 151f)
                lineToRelative(105f, 124f)
                quadToRelative(13f, 15f, 4f, 33f)
                reflectiveQuadToRelative(-29f, 16f)
                lineToRelative(-163f, -11f)
                close()
                moveTo(134f, 254f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(52f, -52f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(52f, 52f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-52f, 52f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-52f, -52f)
                close()
                moveToRelative(421f, 263f)
                lineToRelative(48f, -79f)
                lineToRelative(93f, 7f)
                lineToRelative(-60f, -71f)
                lineToRelative(35f, -86f)
                lineToRelative(-86f, 35f)
                lineToRelative(-71f, -59f)
                lineToRelative(7f, 92f)
                lineToRelative(-79f, 49f)
                lineToRelative(90f, 22f)
                lineToRelative(23f, 90f)
                close()
                moveToRelative(151f, 309f)
                lineToRelative(-52f, -52f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(52f, -52f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(52f, 52f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-52f, 52f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                close()
                moveTo(569f, 390f)
                close()
            }
        }.build()
        
        return _Wand_stars!!
    }

private var _Wand_stars: ImageVector? = null

