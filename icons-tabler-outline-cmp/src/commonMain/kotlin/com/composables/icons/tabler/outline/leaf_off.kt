package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LeafOff: ImageVector
    get() {
        if (_LeafOff != null) return _LeafOff!!
        
        _LeafOff = ImageVector.Builder(
            name = "leaf-off",
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
                curveToRelative(0.475f, -4.27f, 2.3f, -7.64f, 6.331f, -9.683f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.618f, 6.623f)
                curveToRelative(-1.874f, 1.625f, -2.625f, 3.877f, -2.632f, 6.377f)
                curveToRelative(0f, 1f, 0f, 3f, 2f, 5f)
                horizontalLineToRelative(3.014f)
                curveToRelative(2.733f, 0f, 5.092f, -0.635f, 6.92f, -2.087f)
                moveToRelative(1.899f, -2.099f)
                curveToRelative(1.224f, -1.872f, 1.987f, -4.434f, 2.181f, -7.814f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.014f)
                curveToRelative(-2.863f, 0f, -5.118f, 0.405f, -6.861f, 1.118f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _LeafOff!!
    }

private var _LeafOff: ImageVector? = null

