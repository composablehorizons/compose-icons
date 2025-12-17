package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Helmet: ImageVector
    get() {
        if (_Helmet != null) return _Helmet!!
        
        _Helmet = ImageVector.Builder(
            name = "helmet",
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
                moveTo(12f, 4f)
                arcToRelative(9f, 9f, 0f, false, true, 5.656f, 16f)
                horizontalLineToRelative(-11.312f)
                arcToRelative(9f, 9f, 0f, false, true, 5.656f, -16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                horizontalLineToRelative(-8.8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.968f, 1.246f)
                curveToRelative(0.507f, 2f, 1.596f, 3.418f, 3.268f, 4.254f)
                curveToRelative(2f, 1f, 4.333f, 1.5f, 7f, 1.5f)
            }
        }.build()
        
        return _Helmet!!
    }

private var _Helmet: ImageVector? = null

