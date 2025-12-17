package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Candy: ImageVector
    get() {
        if (_Candy != null) return _Candy!!
        
        _Candy = ImageVector.Builder(
            name = "candy",
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
                moveTo(7.05f, 11.293f)
                lineToRelative(4.243f, -4.243f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 0f)
                lineToRelative(2.829f, 2.83f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                lineToRelative(-4.243f, 4.243f)
                arcToRelative(2f, 2f, 0f, false, true, -2.828f, 0f)
                lineToRelative(-2.829f, -2.831f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.243f, 9.172f)
                lineToRelative(3.086f, -0.772f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.697f, -2.516f)
                lineToRelative(-2.216f, -2.217f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.44f, 0.47f)
                lineToRelative(-1.248f, 2.913f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.172f, 16.243f)
                lineToRelative(-0.772f, 3.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.516f, 0.697f)
                lineToRelative(-2.217f, -2.216f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.47f, -2.44f)
                lineToRelative(2.913f, -1.248f)
            }
        }.build()
        
        return _Candy!!
    }

private var _Candy: ImageVector? = null

