package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Whisk: ImageVector
    get() {
        if (_Whisk != null) return _Whisk!!
        
        _Whisk = ImageVector.Builder(
            name = "whisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.015f, 3.035f)
                lineToRelative(-16.515f, 16.465f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.173f, 17.619f)
                arcToRelative(4.63f, 4.63f, 0f, false, false, 3.284f, 3.26f)
                arcToRelative(4.67f, 4.67f, 0f, false, false, 4.487f, -1.194f)
                curveToRelative(1.85f, -1.836f, 4.07f, -10.65f, 4.07f, -10.65f)
                reflectiveCurveToRelative(-8.88f, 2.296f, -10.639f, 4.132f)
                arcToRelative(4.59f, 4.59f, 0f, false, false, -1.202f, 4.452f)
            }
        }.build()
        
        return _Whisk!!
    }

private var _Whisk: ImageVector? = null

