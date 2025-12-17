package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.LifeRing: ImageVector
    get() {
        if (_LifeRing != null) return _LifeRing!!
        
        _LifeRing = ImageVector.Builder(
            name = "life-ring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 504f)
                curveToRelative(136.967f, 0f, 248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                close()
                moveToRelative(-103.398f, -76.72f)
                lineToRelative(53.411f, -53.411f)
                curveToRelative(31.806f, 13.506f, 68.128f, 13.522f, 99.974f, 0f)
                lineToRelative(53.411f, 53.411f)
                curveToRelative(-63.217f, 38.319f, -143.579f, 38.319f, -206.796f, 0f)
                close()
                moveTo(336f, 256f)
                curveToRelative(0f, 44.112f, -35.888f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.888f, -80f, -80f)
                reflectiveCurveToRelative(35.888f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.888f, 80f, 80f)
                close()
                moveToRelative(91.28f, 103.398f)
                lineToRelative(-53.411f, -53.411f)
                curveToRelative(13.505f, -31.806f, 13.522f, -68.128f, 0f, -99.974f)
                lineToRelative(53.411f, -53.411f)
                curveToRelative(38.319f, 63.217f, 38.319f, 143.579f, 0f, 206.796f)
                close()
                moveTo(359.397f, 84.72f)
                lineToRelative(-53.411f, 53.411f)
                curveToRelative(-31.806f, -13.505f, -68.128f, -13.522f, -99.973f, 0f)
                lineTo(152.602f, 84.72f)
                curveToRelative(63.217f, -38.319f, 143.579f, -38.319f, 206.795f, 0f)
                close()
                moveTo(84.72f, 152.602f)
                lineToRelative(53.411f, 53.411f)
                curveToRelative(-13.506f, 31.806f, -13.522f, 68.128f, 0f, 99.974f)
                lineTo(84.72f, 359.398f)
                curveToRelative(-38.319f, -63.217f, -38.319f, -143.579f, 0f, -206.796f)
                close()
            }
        }.build()
        
        return _LifeRing!!
    }

private var _LifeRing: ImageVector? = null

