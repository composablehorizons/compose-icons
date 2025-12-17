package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Line_axis: ImageVector
    get() {
        if (_Line_axis != null) return _Line_axis!!
        
        _Line_axis = ImageVector.Builder(
            name = "line_axis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(110f, 670f)
                lineToRelative(213f, -213f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 103f)
                lineToRelative(67f, -76f)
                lineToRelative(-224f, -207f)
                lineToRelative(-213f, 213f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(216f, -216f)
                quadToRelative(23f, -23f, 54.5f, -23.5f)
                reflectiveQuadTo(436f, 212f)
                lineToRelative(228f, 209f)
                lineToRelative(132f, -150f)
                quadToRelative(11f, -13f, 28.5f, -13f)
                reflectiveQuadToRelative(29.5f, 12f)
                quadToRelative(11f, 11f, 11.5f, 26.5f)
                reflectiveQuadTo(855f, 324f)
                lineTo(722f, 474f)
                lineToRelative(126f, 116f)
                quadToRelative(14f, 12f, 14f, 30f)
                reflectiveQuadToRelative(-13f, 31f)
                quadToRelative(-12f, 12f, -29f, 12f)
                reflectiveQuadToRelative(-30f, -11f)
                lineTo(666f, 538f)
                lineToRelative(-70f, 78f)
                quadToRelative(-23f, 26f, -57f, 27.5f)
                reflectiveQuadTo(480f, 620f)
                lineTo(380f, 520f)
                lineTo(170f, 730f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                close()
            }
        }.build()
        
        return _Line_axis!!
    }

private var _Line_axis: ImageVector? = null

