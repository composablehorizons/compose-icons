package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MilitaryAward: ImageVector
    get() {
        if (_MilitaryAward != null) return _MilitaryAward!!
        
        _MilitaryAward = ImageVector.Builder(
            name = "military-award",
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
                moveTo(12f, 13f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, 8f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 10.5f)
                lineToRelative(-1f, -2.5f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.48f, 5.788f)
                arcToRelative(2f, 2f, 0f, false, false, 1.84f, 1.212f)
                horizontalLineToRelative(2.18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 10.5f)
                lineToRelative(1f, -2.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-2.48f, 5.788f)
                arcToRelative(2f, 2f, 0f, false, true, -1.84f, 1.212f)
                horizontalLineToRelative(-2.18f)
            }
        }.build()
        
        return _MilitaryAward!!
    }

private var _MilitaryAward: ImageVector? = null

