package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EyeSpark: ImageVector
    get() {
        if (_EyeSpark != null) return _EyeSpark!!
        
        _EyeSpark = ImageVector.Builder(
            name = "eye-spark",
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
                moveTo(10f, 12f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.669f, 17.994f)
                quadToRelative(-5.18f, -0.18f, -8.669f, -5.994f)
                quadToRelative(3.6f, -6f, 9f, -6f)
                reflectiveQuadToRelative(9f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -3.5f, 3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.5f, 3.5f)
            }
        }.build()
        
        return _EyeSpark!!
    }

private var _EyeSpark: ImageVector? = null

