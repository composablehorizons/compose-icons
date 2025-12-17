package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Detector_status: ImageVector
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
                moveTo(438f, 840f)
                lineTo(296f, 698f)
                lineToRelative(57f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(169f, -170f)
                lineToRelative(57f, 57f)
                lineToRelative(-226f, 226f)
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
                verticalLineToRelative(-120f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(120f)
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

