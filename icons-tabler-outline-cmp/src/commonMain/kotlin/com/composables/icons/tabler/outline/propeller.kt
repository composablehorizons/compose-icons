package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Propeller: ImageVector
    get() {
        if (_Propeller != null) return _Propeller!!
        
        _Propeller = ImageVector.Builder(
            name = "propeller",
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
                moveTo(12f, 13f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.167f, 10.5f)
                curveToRelative(0.722f, -1.538f, 1.156f, -3.043f, 1.303f, -4.514f)
                curveToRelative(0.22f, -1.63f, -0.762f, -2.986f, -3.47f, -2.986f)
                reflectiveCurveToRelative(-3.69f, 1.357f, -3.47f, 2.986f)
                curveToRelative(0.147f, 1.471f, 0.581f, 2.976f, 1.303f, 4.514f)
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
                curveToRelative(1.3f, 1f, 2.967f, 0.833f, 4.321f, -1.512f)
                curveToRelative(1.354f, -2.345f, 0.67f, -3.874f, -0.85f, -4.498f)
                curveToRelative(-1.348f, -0.608f, -2.868f, -0.985f, -4.562f, -1.128f)
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
        }.build()
        
        return _Propeller!!
    }

private var _Propeller: ImageVector? = null

