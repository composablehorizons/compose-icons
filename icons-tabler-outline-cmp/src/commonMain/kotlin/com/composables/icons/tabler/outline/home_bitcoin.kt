package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HomeBitcoin: ImageVector
    get() {
        if (_HomeBitcoin != null) return _HomeBitcoin!!
        
        _HomeBitcoin = ImageVector.Builder(
            name = "home-bitcoin",
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
                moveTo(17f, 21f)
                verticalLineToRelative(-6f)
                moveToRelative(2f, 0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 9f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-2f, -3f)
                horizontalLineToRelative(3f)
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(3f, -3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                horizontalLineToRelative(-3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 10.5f)
                lineToRelative(-7.5f, -7.5f)
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
                curveToRelative(0.387f, 0f, 0.748f, 0.11f, 1.054f, 0.3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-2.5f)
            }
        }.build()
        
        return _HomeBitcoin!!
    }

private var _HomeBitcoin: ImageVector? = null

