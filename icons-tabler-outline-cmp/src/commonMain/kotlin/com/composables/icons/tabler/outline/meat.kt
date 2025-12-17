package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Meat: ImageVector
    get() {
        if (_Meat != null) return _Meat!!
        
        _Meat = ImageVector.Builder(
            name = "meat",
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
                moveTo(13.62f, 8.382f)
                lineToRelative(1.966f, -1.967f)
                arcToRelative(2f, 2f, 0f, true, true, 3.414f, -1.415f)
                arcToRelative(2f, 2f, 0f, true, true, -1.413f, 3.414f)
                lineToRelative(-1.82f, 1.821f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.904f, 18.596f)
                curveToRelative(2.733f, 2.734f, 5.9f, 4f, 7.07f, 2.829f)
                curveToRelative(1.172f, -1.172f, -0.094f, -4.338f, -2.828f, -7.071f)
                curveToRelative(-2.733f, -2.734f, -5.9f, -4f, -7.07f, -2.829f)
                curveToRelative(-1.172f, 1.172f, 0.094f, 4.338f, 2.828f, 7.071f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 16f)
                lineToRelative(1f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.975f, 21.425f)
                curveToRelative(3.905f, -3.906f, 4.855f, -9.288f, 2.121f, -12.021f)
                curveToRelative(-2.733f, -2.734f, -8.115f, -1.784f, -12.02f, 2.121f)
            }
        }.build()
        
        return _Meat!!
    }

private var _Meat: ImageVector? = null

