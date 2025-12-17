package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Spaces: ImageVector
    get() {
        if (_Spaces != null) return _Spaces!!
        
        _Spaces = ImageVector.Builder(
            name = "spaces",
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
                moveTo(6.045f, 9.777f)
                arcToRelative(6f, 6f, 0f, true, false, 5.951f, 0.023f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.997f, 20.196f)
                arcToRelative(6f, 6f, 0f, true, false, -2.948f, -5.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.95f, 9.785f)
                quadToRelative(0.05f, -0.386f, 0.05f, -0.785f)
                arcToRelative(6f, 6f, 0f, true, false, -3.056f, 5.23f)
            }
        }.build()
        
        return _Spaces!!
    }

private var _Spaces: ImageVector? = null

