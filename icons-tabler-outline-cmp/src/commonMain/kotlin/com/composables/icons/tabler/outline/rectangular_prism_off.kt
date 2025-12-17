package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RectangularPrismOff: ImageVector
    get() {
        if (_RectangularPrismOff != null) return _RectangularPrismOff!!
        
        _RectangularPrismOff = ImageVector.Builder(
            name = "rectangular-prism-off",
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
                moveTo(8.18f, 8.18f)
                lineToRelative(-4.18f, 2.093f)
                curveToRelative(-0.619f, 0.355f, -1f, 1.01f, -1f, 1.718f)
                verticalLineToRelative(5.018f)
                curveToRelative(0f, 0.709f, 0.381f, 1.363f, 1f, 1.717f)
                lineToRelative(4f, 2.008f)
                arcToRelative(2.016f, 2.016f, 0f, false, false, 2f, 0f)
                lineToRelative(7.146f, -3.578f)
                moveToRelative(2.67f, -1.337f)
                lineToRelative(0.184f, -0.093f)
                curveToRelative(0.619f, -0.355f, 1f, -1.01f, 1f, -1.718f)
                verticalLineToRelative(-5.018f)
                arcToRelative(1.98f, 1.98f, 0f, false, false, -1f, -1.717f)
                lineToRelative(-4f, -2.008f)
                arcToRelative(2.016f, 2.016f, 0f, false, false, -2f, 0f)
                lineToRelative(-3.146f, 1.575f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                verticalLineToRelative(-7.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 13.5f)
                lineToRelative(3.048f, -1.458f)
                moveToRelative(2.71f, -1.296f)
                lineToRelative(5.742f, -2.746f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 11f)
                lineToRelative(5.5f, 2.5f)
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
        
        return _RectangularPrismOff!!
    }

private var _RectangularPrismOff: ImageVector? = null

