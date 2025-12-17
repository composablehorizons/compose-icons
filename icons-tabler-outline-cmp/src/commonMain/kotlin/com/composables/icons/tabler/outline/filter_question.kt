package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FilterQuestion: ImageVector
    get() {
        if (_FilterQuestion != null) return _FilterQuestion!!
        
        _FilterQuestion = ImageVector.Builder(
            name = "filter-question",
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
                moveTo(15f, 19f)
                lineToRelative(-6f, 2f)
                verticalLineToRelative(-8.5f)
                lineToRelative(-4.48f, -4.928f)
                arcToRelative(2f, 2f, 0f, false, true, -0.52f, -1.345f)
                verticalLineToRelative(-2.227f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                lineToRelative(-4.414f, 4.414f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19f)
                arcToRelative(2.003f, 2.003f, 0f, false, false, 0.914f, -3.782f)
                arcToRelative(1.98f, 1.98f, 0f, false, false, -2.414f, 0.483f)
            }
        }.build()
        
        return _FilterQuestion!!
    }

private var _FilterQuestion: ImageVector? = null

