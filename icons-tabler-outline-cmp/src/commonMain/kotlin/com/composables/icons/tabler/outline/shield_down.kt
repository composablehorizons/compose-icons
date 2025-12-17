package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShieldDown: ImageVector
    get() {
        if (_ShieldDown != null) return _ShieldDown!!
        
        _ShieldDown = ImageVector.Builder(
            name = "shield-down",
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
                moveTo(12.444f, 20.876f)
                curveToRelative(-0.147f, 0.044f, -0.295f, 0.085f, -0.444f, 0.124f)
                arcToRelative(12f, 12f, 0f, false, true, -8.5f, -15f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, -3f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, 3f)
                arcToRelative(12f, 12f, 0f, false, true, 0.117f, 6.343f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 19f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
        }.build()
        
        return _ShieldDown!!
    }

private var _ShieldDown: ImageVector? = null

