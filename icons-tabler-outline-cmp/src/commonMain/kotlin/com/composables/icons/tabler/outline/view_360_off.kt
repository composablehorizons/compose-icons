package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.View360Off: ImageVector
    get() {
        if (_View360Off != null) return _View360Off!!
        
        _View360Off = ImageVector.Builder(
            name = "view-360-off",
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
                moveTo(8.335f, 8.388f)
                arcToRelative(19f, 19f, 0f, false, false, -0.335f, 3.612f)
                curveToRelative(0f, 4.97f, 1.79f, 9f, 4f, 9f)
                curveToRelative(1.622f, 0f, 3.018f, -2.172f, 3.646f, -5.294f)
                moveToRelative(0.354f, -3.706f)
                curveToRelative(0f, -4.97f, -1.79f, -9f, -4f, -9f)
                curveToRelative(-1.035f, 0f, -1.979f, 0.885f, -2.689f, 2.337f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.65f, 5.623f)
                arcToRelative(9f, 9f, 0f, true, false, 12.71f, 12.745f)
                moveToRelative(1.684f, -2.328f)
                arcToRelative(9f, 9f, 0f, false, false, -12.094f, -12.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.32f, 8.349f)
                curveToRelative(-3.136f, 0.625f, -5.32f, 2.025f, -5.32f, 3.651f)
                curveToRelative(0f, 2.21f, 4.03f, 4f, 9f, 4f)
                curveToRelative(1.286f, 0f, 2.51f, -0.12f, 3.616f, -0.336f)
                moveToRelative(3.059f, -0.98f)
                curveToRelative(1.445f, -0.711f, 2.325f, -1.653f, 2.325f, -2.684f)
                curveToRelative(0f, -2.21f, -4.03f, -4f, -9f, -4f)
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
        
        return _View360Off!!
    }

private var _View360Off: ImageVector? = null

