package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DiamondPlus: ImageVector
    get() {
        if (_DiamondPlus != null) return _DiamondPlus!!
        
        _DiamondPlus = ImageVector.Builder(
            name = "diamond-plus",
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
                moveTo(12f, 8f)
                verticalLineToRelative(8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.7f, 10.3f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, 3.41f)
                lineToRelative(7.59f, 7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 3.41f, 0f)
                lineToRelative(7.59f, -7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, -3.41f)
                lineTo(13.7f, 2.71f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, -3.41f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
        }.build()
        
        return _DiamondPlus!!
    }

private var _DiamondPlus: ImageVector? = null

