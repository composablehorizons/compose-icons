package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Coins: ImageVector
    get() {
        if (_Coins != null) return _Coins!!
        
        _Coins = ImageVector.Builder(
            name = "coins",
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
                moveTo(9f, 14f)
                curveToRelative(0f, 1.657f, 2.686f, 3f, 6f, 3f)
                reflectiveCurveToRelative(6f, -1.343f, 6f, -3f)
                reflectiveCurveToRelative(-2.686f, -3f, -6f, -3f)
                reflectiveCurveToRelative(-6f, 1.343f, -6f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.656f, 2.686f, 3f, 6f, 3f)
                reflectiveCurveToRelative(6f, -1.344f, 6f, -3f)
                verticalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                curveToRelative(0f, 1.072f, 1.144f, 2.062f, 3f, 2.598f)
                reflectiveCurveToRelative(4.144f, 0.536f, 6f, 0f)
                curveToRelative(1.856f, -0.536f, 3f, -1.526f, 3f, -2.598f)
                curveToRelative(0f, -1.072f, -1.144f, -2.062f, -3f, -2.598f)
                reflectiveCurveToRelative(-4.144f, -0.536f, -6f, 0f)
                curveToRelative(-1.856f, 0.536f, -3f, 1.526f, -3f, 2.598f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.888f, 0.772f, 1.45f, 2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                curveToRelative(0f, 0.888f, 0.772f, 1.45f, 2f, 2f)
            }
        }.build()
        
        return _Coins!!
    }

private var _Coins: ImageVector? = null

