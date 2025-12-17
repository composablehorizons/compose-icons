package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Detector_status: ImageVector
    get() {
        if (_Detector_status != null) return _Detector_status!!
        
        _Detector_status = ImageVector.Builder(
            name = "detector_status",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 727f)
                lineToRelative(141f, -141f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(636f, 585f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(636f, 642f)
                lineTo(466f, 812f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-86f, -86f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(57f, 57f)
                close()
                moveTo(200f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                close()
                moveToRelative(124f, 120f)
                lineToRelative(12f, 40f)
                horizontalLineToRelative(288f)
                lineToRelative(12f, -40f)
                horizontalLineTo(324f)
                close()
                moveToRelative(12f, 120f)
                quadToRelative(-26f, 0f, -47f, -15.5f)
                reflectiveQuadTo(260f, 384f)
                lineToRelative(-20f, -64f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, 68f)
                quadToRelative(-9f, 23f, -29f, 37.5f)
                reflectiveQuadTo(620f, 440f)
                horizontalLineTo(336f)
                close()
                moveTo(200f, 200f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Detector_status!!
    }

private var _Detector_status: ImageVector? = null

