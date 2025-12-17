package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cell: ImageVector
    get() {
        if (_Cell != null) return _Cell!!
        
        _Cell = ImageVector.Builder(
            name = "cell",
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
                moveTo(8f, 4f)
                lineToRelative(-4f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(4f, 2f)
                lineToRelative(4f, -2f)
                verticalLineToRelative(-5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                lineToRelative(4f, 2f)
                lineToRelative(4f, -2f)
                verticalLineToRelative(-5f)
                lineToRelative(-4f, -2f)
                lineToRelative(-4f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                verticalLineToRelative(5f)
                lineToRelative(4f, 2f)
                lineToRelative(4f, -2f)
                verticalLineToRelative(-5f)
            }
        }.build()
        
        return _Cell!!
    }

private var _Cell: ImageVector? = null

