package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Detector_offline: ImageVector
    get() {
        if (_Detector_offline != null) return _Detector_offline!!
        
        _Detector_offline = ImageVector.Builder(
            name = "detector_offline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(376f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(104f, -104f)
                lineToRelative(-104f, -104f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-104f, 104f)
                lineToRelative(104f, 104f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                lineToRelative(-104f, 104f)
                close()
                moveToRelative(-52f, -520f)
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
        
        return _Detector_offline!!
    }

private var _Detector_offline: ImageVector? = null

