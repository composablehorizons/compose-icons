package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShieldStar: ImageVector
    get() {
        if (_ShieldStar != null) return _ShieldStar!!
        
        _ShieldStar = ImageVector.Builder(
            name = "shield-star",
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
                moveTo(11.143f, 20.743f)
                arcToRelative(12f, 12f, 0f, false, true, -7.643f, -14.743f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, -3f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, 3f)
                curveToRelative(0.504f, 1.716f, 0.614f, 3.505f, 0.343f, 5.237f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.8f, 20.817f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, false, true, 0.217f, -0.665f)
                lineToRelative(2.428f, -0.352f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                close()
            }
        }.build()
        
        return _ShieldStar!!
    }

private var _ShieldStar: ImageVector? = null

