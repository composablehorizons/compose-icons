package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RosetteDiscountOff: ImageVector
    get() {
        if (_RosetteDiscountOff != null) return _RosetteDiscountOff!!
        
        _RosetteDiscountOff = ImageVector.Builder(
            name = "rosette-discount-off",
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
                moveTo(9f, 15f)
                lineToRelative(3f, -3f)
                moveToRelative(2f, -2f)
                lineToRelative(1f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.148f, 9.145f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, 0.352f, 0.855f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.35f, -0.142f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.148f, 14.145f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, 0.352f, 0.855f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.35f, -0.142f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.887f, 4.89f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 0.863f, -0.53f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 3.12f, 0f)
                lineToRelative(0.7f, 0.7f)
                curveToRelative(0.412f, 0.41f, 0.97f, 0.64f, 1.55f, 0.64f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 2.2f, 2.2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.58f, 0.23f, 1.138f, 0.64f, 1.55f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 0f, 3.12f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -0.528f, 0.858f)
                moveToRelative(-0.757f, 3.248f)
                arcToRelative(2.193f, 2.193f, 0f, false, true, -1.555f, 0.644f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -1.55f, 0.64f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -3.12f, 0f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -1.55f, -0.64f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -2.2f, -2.2f)
                verticalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -0.64f, -1.55f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 0f, -3.12f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 0.64f, -1.55f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.604f, 0.244f, -1.152f, 0.638f, -1.55f)
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
        
        return _RosetteDiscountOff!!
    }

private var _RosetteDiscountOff: ImageVector? = null

