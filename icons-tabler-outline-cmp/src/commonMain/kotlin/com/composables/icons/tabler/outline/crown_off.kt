package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CrownOff: ImageVector
    get() {
        if (_CrownOff != null) return _CrownOff!!
        
        _CrownOff = ImageVector.Builder(
            name = "crown-off",
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
                moveTo(18f, 18f)
                horizontalLineToRelative(-13f)
                lineToRelative(-1.865f, -9.327f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.4f, -0.244f)
                lineToRelative(4.465f, 3.571f)
                lineToRelative(1.6f, -2.4f)
                moveToRelative(1.596f, -2.394f)
                lineToRelative(0.804f, -1.206f)
                lineToRelative(4f, 6f)
                lineToRelative(4.464f, -3.571f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.401f, 0.244f)
                lineToRelative(-1.363f, 6.818f)
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
        
        return _CrownOff!!
    }

private var _CrownOff: ImageVector? = null

