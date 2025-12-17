package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HexagonalPrism: ImageVector
    get() {
        if (_HexagonalPrism != null) return _HexagonalPrism!!
        
        _HexagonalPrism = ImageVector.Builder(
            name = "hexagonal-prism",
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
                horizontalLineToRelative(-7.74f)
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
                verticalLineToRelative(11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.853f, 18.274f)
                lineToRelative(3.367f, 2.363f)
                arcToRelative(2f, 2f, 0f, false, false, 1.147f, 0.363f)
                horizontalLineToRelative(7.265f)
                curveToRelative(0.41f, 0f, 0.811f, -0.126f, 1.147f, -0.363f)
                lineToRelative(3.367f, -2.363f)
                curveToRelative(0.536f, -0.375f, 0.854f, -0.99f, 0.854f, -1.643f)
                verticalLineToRelative(-9.262f)
                curveToRelative(0f, -0.655f, -0.318f, -1.268f, -0.853f, -1.643f)
                lineToRelative(-3.367f, -2.363f)
                arcToRelative(2f, 2f, 0f, false, false, -1.147f, -0.363f)
                horizontalLineToRelative(-7.266f)
                curveToRelative(-0.41f, 0f, -0.811f, 0.126f, -1.147f, 0.363f)
                lineToRelative(-3.367f, 2.363f)
                arcToRelative(2.006f, 2.006f, 0f, false, false, -0.853f, 1.644f)
                verticalLineToRelative(9.261f)
                curveToRelative(0f, 0.655f, 0.318f, 1.269f, 0.853f, 1.644f)
                close()
            }
        }.build()
        
        return _HexagonalPrism!!
    }

private var _HexagonalPrism: ImageVector? = null

