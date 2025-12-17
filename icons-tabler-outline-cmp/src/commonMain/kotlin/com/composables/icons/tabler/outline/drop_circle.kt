package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DropCircle: ImageVector
    get() {
        if (_DropCircle != null) return _DropCircle!!
        
        _DropCircle = ImageVector.Builder(
            name = "drop-circle",
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
                moveTo(10.07f, 15.34f)
                curveToRelative(1.115f, 0.88f, 2.74f, 0.88f, 3.855f, 0f)
                curveToRelative(1.115f, -0.88f, 1.398f, -2.388f, 0.671f, -3.575f)
                lineToRelative(-2.596f, -3.765f)
                lineToRelative(-2.602f, 3.765f)
                curveToRelative(-0.726f, 1.187f, -0.443f, 2.694f, 0.672f, 3.575f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
        }.build()
        
        return _DropCircle!!
    }

private var _DropCircle: ImageVector? = null

