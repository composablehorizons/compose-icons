package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShieldMinus: ImageVector
    get() {
        if (_ShieldMinus != null) return _ShieldMinus!!
        
        _ShieldMinus = ImageVector.Builder(
            name = "shield-minus",
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
                moveTo(12.46f, 20.871f)
                curveToRelative(-0.153f, 0.046f, -0.306f, 0.089f, -0.46f, 0.129f)
                arcToRelative(12f, 12f, 0f, false, true, -8.5f, -15f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, -3f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, 3f)
                arcToRelative(12f, 12f, 0f, false, true, -0.916f, 9.015f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _ShieldMinus!!
    }

private var _ShieldMinus: ImageVector? = null

