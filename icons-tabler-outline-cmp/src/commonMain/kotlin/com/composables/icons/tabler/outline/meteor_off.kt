package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MeteorOff: ImageVector
    get() {
        if (_MeteorOff != null) return _MeteorOff!!
        
        _MeteorOff = ImageVector.Builder(
            name = "meteor-off",
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
                moveTo(9.75f, 5.761f)
                lineToRelative(3.25f, -2.761f)
                lineToRelative(-1f, 5f)
                lineToRelative(9f, -5f)
                lineToRelative(-5f, 9f)
                horizontalLineToRelative(5f)
                lineToRelative(-2.467f, 2.536f)
                moveToRelative(-1.983f, 2.04f)
                lineToRelative(-2.441f, 2.51f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -8.855f, -9.506f)
                lineToRelative(2.322f, -1.972f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _MeteorOff!!
    }

private var _MeteorOff: ImageVector? = null

