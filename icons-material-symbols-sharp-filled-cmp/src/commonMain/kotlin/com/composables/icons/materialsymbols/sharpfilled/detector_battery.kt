package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Detector_battery: ImageVector
    get() {
        if (_Detector_battery != null) return _Detector_battery!!
        
        _Detector_battery = ImageVector.Builder(
            name = "detector_battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-160f, 80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(124f, -520f)
                lineToRelative(12f, 40f)
                horizontalLineToRelative(288f)
                lineToRelative(12f, -40f)
                horizontalLineTo(324f)
                close()
                moveToRelative(-46f, 120f)
                lineToRelative(-38f, -120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(200f)
                horizontalLineTo(720f)
                lineToRelative(-46f, 120f)
                horizontalLineTo(278f)
                close()
            }
        }.build()
        
        return _Detector_battery!!
    }

private var _Detector_battery: ImageVector? = null

