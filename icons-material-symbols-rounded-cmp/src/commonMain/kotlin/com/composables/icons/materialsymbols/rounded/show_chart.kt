package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Show_chart: ImageVector
    get() {
        if (_Show_chart != null) return _Show_chart!!
        
        _Show_chart = ImageVector.Builder(
            name = "show_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(110f, 710f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(213f, -213f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 103f)
                lineToRelative(256f, -289f)
                quadToRelative(11f, -13f, 28.5f, -13f)
                reflectiveQuadToRelative(29.5f, 12f)
                quadToRelative(11f, 11f, 11.5f, 26.5f)
                reflectiveQuadTo(855f, 304f)
                lineTo(596f, 596f)
                quadToRelative(-23f, 26f, -57f, 27.5f)
                reflectiveQuadTo(480f, 600f)
                lineTo(380f, 500f)
                lineTo(170f, 710f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                close()
            }
        }.build()
        
        return _Show_chart!!
    }

private var _Show_chart: ImageVector? = null

