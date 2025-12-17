package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stacked_line_chart: ImageVector
    get() {
        if (_Stacked_line_chart != null) return _Stacked_line_chart!!
        
        _Stacked_line_chart = ImageVector.Builder(
            name = "stacked_line_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(110f, 770f)
                lineToRelative(213f, -213f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 103f)
                lineToRelative(256f, -289f)
                quadToRelative(11f, -13f, 28.5f, -13f)
                reflectiveQuadToRelative(29.5f, 12f)
                quadToRelative(11f, 11f, 11.5f, 26.5f)
                reflectiveQuadTo(855f, 424f)
                lineTo(596f, 716f)
                quadToRelative(-23f, 26f, -57f, 27.5f)
                reflectiveQuadTo(480f, 720f)
                lineTo(380f, 620f)
                lineTo(170f, 830f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                close()
                moveToRelative(0f, -240f)
                lineToRelative(213f, -213f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 103f)
                lineToRelative(256f, -289f)
                quadToRelative(11f, -13f, 28.5f, -13f)
                reflectiveQuadToRelative(29.5f, 12f)
                quadToRelative(11f, 11f, 11.5f, 26.5f)
                reflectiveQuadTo(855f, 184f)
                lineTo(596f, 476f)
                quadToRelative(-23f, 26f, -57f, 27.5f)
                reflectiveQuadTo(480f, 480f)
                lineTo(380f, 380f)
                lineTo(170f, 590f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                close()
            }
        }.build()
        
        return _Stacked_line_chart!!
    }

private var _Stacked_line_chart: ImageVector? = null

