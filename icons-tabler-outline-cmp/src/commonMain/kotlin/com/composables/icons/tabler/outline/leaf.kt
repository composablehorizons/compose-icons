package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Leaf: ImageVector
    get() {
        if (_Leaf != null) return _Leaf!!
        
        _Leaf = ImageVector.Builder(
            name = "leaf",
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
                moveTo(5f, 21f)
                curveToRelative(0.5f, -4.5f, 2.5f, -8f, 7f, -10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                curveToRelative(6.218f, 0f, 10.5f, -3.288f, 11f, -12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.014f)
                curveToRelative(-9f, 0f, -11.986f, 4f, -12f, 9f)
                curveToRelative(0f, 1f, 0f, 3f, 2f, 5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Leaf!!
    }

private var _Leaf: ImageVector? = null

