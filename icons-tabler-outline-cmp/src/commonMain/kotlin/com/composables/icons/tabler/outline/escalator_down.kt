package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EscalatorDown: ImageVector
    get() {
        if (_EscalatorDown != null) return _EscalatorDown!!
        
        _EscalatorDown = ImageVector.Builder(
            name = "escalator-down",
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
                moveTo(4.5f, 7f)
                horizontalLineToRelative(2.733f)
                arcToRelative(2f, 2f, 0f, false, true, 1.337f, 0.513f)
                lineToRelative(9.43f, 8.487f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, 5f)
                horizontalLineToRelative(-2.733f)
                arcToRelative(2f, 2f, 0f, false, true, -1.337f, -0.513f)
                lineToRelative(-9.43f, -8.487f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 3f)
                verticalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
        }.build()
        
        return _EscalatorDown!!
    }

private var _EscalatorDown: ImageVector? = null

