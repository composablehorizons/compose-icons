package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.IceCreamBowl: ImageVector
    get() {
        if (_IceCreamBowl != null) return _IceCreamBowl!!
        
        _IceCreamBowl = ImageVector.Builder(
            name = "ice-cream-bowl",
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
                moveTo(12f, 17f)
                curveToRelative(5f, 0f, 8f, -2.69f, 8f, -6f)
                horizontalLineTo(4f)
                curveToRelative(0f, 3.31f, 3f, 6f, 8f, 6f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(8f)
                moveToRelative(-4f, -3f)
                verticalLineToRelative(3f)
                moveTo(5.14f, 11f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.71f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.14f, 11f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.71f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
            }
        }.build()
        
        return _IceCreamBowl!!
    }

private var _IceCreamBowl: ImageVector? = null

