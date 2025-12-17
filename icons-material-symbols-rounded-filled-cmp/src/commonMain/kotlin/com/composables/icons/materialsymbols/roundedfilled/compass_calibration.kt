package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Compass_calibration: ImageVector
    get() {
        if (_Compass_calibration != null) return _Compass_calibration!!
        
        _Compass_calibration = ImageVector.Builder(
            name = "compass_calibration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -480f)
                quadToRelative(-48f, 0f, -92.5f, 15.5f)
                reflectiveQuadTo(308f, 462f)
                quadToRelative(-12f, 11f, -27.5f, 10f)
                reflectiveQuadTo(254f, 460f)
                lineTo(111f, 317f)
                quadToRelative(-12f, -12f, -12f, -30f)
                reflectiveQuadToRelative(14f, -29f)
                quadToRelative(78f, -66f, 171.5f, -102f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(102f, 0f, 195.5f, 36f)
                reflectiveQuadTo(847f, 258f)
                quadToRelative(14f, 11f, 14f, 29f)
                reflectiveQuadToRelative(-12f, 30f)
                lineTo(706f, 460f)
                quadToRelative(-11f, 11f, -26.5f, 12f)
                reflectiveQuadTo(652f, 462f)
                quadToRelative(-35f, -31f, -79.5f, -46.5f)
                reflectiveQuadTo(480f, 400f)
                close()
            }
        }.build()
        
        return _Compass_calibration!!
    }

private var _Compass_calibration: ImageVector? = null

