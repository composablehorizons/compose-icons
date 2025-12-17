package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HomeHeart: ImageVector
    get() {
        if (_HomeHeart != null) return _HomeHeart!!
        
        _HomeHeart = ImageVector.Builder(
            name = "home-heart",
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
                moveTo(21f, 12f)
                lineToRelative(-9f, -9f)
                lineToRelative(-9f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.39f, 0f, 0.754f, 0.112f, 1.061f, 0.304f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21.5f)
                lineToRelative(2.518f, -2.58f)
                arcToRelative(1.74f, 1.74f, 0f, false, false, 0f, -2.413f)
                arcToRelative(1.627f, 1.627f, 0f, false, false, -2.346f, 0f)
                lineToRelative(-0.168f, 0.172f)
                lineToRelative(-0.168f, -0.172f)
                arcToRelative(1.627f, 1.627f, 0f, false, false, -2.346f, 0f)
                arcToRelative(1.74f, 1.74f, 0f, false, false, 0f, 2.412f)
                lineToRelative(2.51f, 2.59f)
                close()
            }
        }.build()
        
        return _HomeHeart!!
    }

private var _HomeHeart: ImageVector? = null

