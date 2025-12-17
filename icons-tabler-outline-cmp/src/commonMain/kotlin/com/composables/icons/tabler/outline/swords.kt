package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Swords: ImageVector
    get() {
        if (_Swords != null) return _Swords!!
        
        _Swords = ImageVector.Builder(
            name = "swords",
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
                moveTo(21f, 3f)
                verticalLineToRelative(5f)
                lineToRelative(-11f, 9f)
                lineToRelative(-4f, 4f)
                lineToRelative(-3f, -3f)
                lineToRelative(4f, -4f)
                lineToRelative(9f, -11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 13f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.32f, 17.32f)
                lineToRelative(3.68f, 3.68f)
                lineToRelative(3f, -3f)
                lineToRelative(-3.365f, -3.365f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5.5f)
                lineToRelative(-2f, -2.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                lineToRelative(3f, 2.5f)
            }
        }.build()
        
        return _Swords!!
    }

private var _Swords: ImageVector? = null

