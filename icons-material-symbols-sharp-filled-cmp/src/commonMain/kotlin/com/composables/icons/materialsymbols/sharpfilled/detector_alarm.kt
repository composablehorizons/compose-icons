package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Detector_alarm: ImageVector
    get() {
        if (_Detector_alarm != null) return _Detector_alarm!!
        
        _Detector_alarm = ImageVector.Builder(
            name = "detector_alarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(323f, -101f)
                lineTo(621f, 598f)
                lineToRelative(57f, -57f)
                lineToRelative(141f, 142f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-566f, 0f)
                lineToRelative(-56f, -56f)
                lineToRelative(141f, -142f)
                lineToRelative(57f, 57f)
                lineToRelative(-142f, 141f)
                close()
                moveToRelative(127f, -419f)
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
        
        return _Detector_alarm!!
    }

private var _Detector_alarm: ImageVector? = null

