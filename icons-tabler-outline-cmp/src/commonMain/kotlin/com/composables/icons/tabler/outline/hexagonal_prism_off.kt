package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HexagonalPrismOff: ImageVector
    get() {
        if (_HexagonalPrismOff != null) return _HexagonalPrismOff!!
        
        _HexagonalPrismOff = ImageVector.Builder(
            name = "hexagonal-prism-off",
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
                moveTo(20.792f, 6.996f)
                lineToRelative(-3.775f, 2.643f)
                arcToRelative(2.005f, 2.005f, 0f, false, true, -1.147f, 0.361f)
                horizontalLineToRelative(-1.87f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-0.41f, 0f, -0.81f, -0.126f, -1.146f, -0.362f)
                lineToRelative(-3.774f, -2.641f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                verticalLineToRelative(11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 10f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.972f, 16.968f)
                arcToRelative(2.01f, 2.01f, 0f, false, false, 0.028f, -0.337f)
                verticalLineToRelative(-9.262f)
                curveToRelative(0f, -0.655f, -0.318f, -1.268f, -0.853f, -1.643f)
                lineToRelative(-3.367f, -2.363f)
                arcToRelative(2f, 2f, 0f, false, false, -1.147f, -0.363f)
                horizontalLineToRelative(-7.266f)
                arcToRelative(1.99f, 1.99f, 0f, false, false, -1.066f, 0.309f)
                moveToRelative(-2.345f, 1.643f)
                lineToRelative(-1.103f, 0.774f)
                arcToRelative(2.006f, 2.006f, 0f, false, false, -0.853f, 1.644f)
                verticalLineToRelative(9.261f)
                curveToRelative(0f, 0.655f, 0.318f, 1.269f, 0.853f, 1.644f)
                lineToRelative(3.367f, 2.363f)
                arcToRelative(2f, 2f, 0f, false, false, 1.147f, 0.362f)
                horizontalLineToRelative(7.265f)
                curveToRelative(0.41f, 0f, 0.811f, -0.126f, 1.147f, -0.363f)
                lineToRelative(2.26f, -1.587f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _HexagonalPrismOff!!
    }

private var _HexagonalPrismOff: ImageVector? = null

