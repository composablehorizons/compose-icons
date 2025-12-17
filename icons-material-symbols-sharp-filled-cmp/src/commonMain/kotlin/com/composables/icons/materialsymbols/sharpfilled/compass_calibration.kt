package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Compass_calibration: ImageVector
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
                moveTo(280f, 486f)
                lineTo(80f, 286f)
                quadToRelative(80f, -80f, 183.5f, -123f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(113f, 0f, 216.5f, 43f)
                reflectiveQuadTo(880f, 286f)
                lineTo(680f, 486f)
                quadToRelative(-41f, -41f, -92f, -63.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-57f, 0f, -108f, 22.5f)
                reflectiveQuadTo(280f, 486f)
                close()
            }
        }.build()
        
        return _Compass_calibration!!
    }

private var _Compass_calibration: ImageVector? = null

