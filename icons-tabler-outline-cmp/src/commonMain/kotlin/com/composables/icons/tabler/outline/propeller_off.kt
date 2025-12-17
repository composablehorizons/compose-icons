package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PropellerOff: ImageVector
    get() {
        if (_PropellerOff != null) return _PropellerOff!!
        
        _PropellerOff = ImageVector.Builder(
            name = "propeller-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.448f, 10.432f)
                arcToRelative(3f, 3f, 0f, true, false, 4.106f, 4.143f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.272f, 10.272f)
                curveToRelative(0.66f, -1.459f, 1.058f, -2.888f, 1.198f, -4.286f)
                curveToRelative(0.22f, -1.63f, -0.762f, -2.986f, -3.47f, -2.986f)
                curveToRelative(-1.94f, 0f, -3f, 0.696f, -3.355f, 1.69f)
                moveToRelative(0.697f, 4.653f)
                curveToRelative(0.145f, 0.384f, 0.309f, 0.77f, 0.491f, 1.157f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.169f, 16.751f)
                curveToRelative(0.97f, 1.395f, 2.057f, 2.523f, 3.257f, 3.386f)
                curveToRelative(1.02f, 0.789f, 2.265f, 0.853f, 3.408f, -0.288f)
                moveToRelative(1.479f, -2.493f)
                curveToRelative(0.492f, -1.634f, -0.19f, -2.726f, -1.416f, -3.229f)
                curveToRelative(-0.82f, -0.37f, -1.703f, -0.654f, -2.65f, -0.852f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.664f, 13f)
                curveToRelative(-1.693f, 0.143f, -3.213f, 0.52f, -4.56f, 1.128f)
                curveToRelative(-1.522f, 0.623f, -2.206f, 2.153f, -0.852f, 4.498f)
                reflectiveCurveToRelative(3.02f, 2.517f, 4.321f, 1.512f)
                curveToRelative(1.2f, -0.863f, 2.287f, -1.991f, 3.258f, -3.386f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PropellerOff!!
    }

private var _PropellerOff: ImageVector? = null

