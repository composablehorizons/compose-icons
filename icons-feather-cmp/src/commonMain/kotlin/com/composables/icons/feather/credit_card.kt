package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) return _CreditCard!!
        
        _CreditCard = ImageVector.Builder(
            name = "credit-card",
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
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, false, true, 23f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 21f, 20f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, false, true, 1f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 3f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 10f)
                lineTo(23f, 10f)
            }
        }.build()
        
        return _CreditCard!!
    }

private var _CreditCard: ImageVector? = null

