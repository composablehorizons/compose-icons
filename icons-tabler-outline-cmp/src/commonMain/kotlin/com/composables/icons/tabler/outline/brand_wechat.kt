package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWechat: ImageVector
    get() {
        if (_BrandWechat != null) return _BrandWechat!!
        
        _BrandWechat = ImageVector.Builder(
            name = "brand-wechat",
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
                moveTo(16.5f, 10f)
                curveToRelative(3.038f, 0f, 5.5f, 2.015f, 5.5f, 4.5f)
                curveToRelative(0f, 1.397f, -0.778f, 2.645f, -2f, 3.47f)
                lineToRelative(0f, 2.03f)
                lineToRelative(-1.964f, -1.178f)
                arcToRelative(6.649f, 6.649f, 0f, false, true, -1.536f, 0.178f)
                curveToRelative(-3.038f, 0f, -5.5f, -2.015f, -5.5f, -4.5f)
                reflectiveCurveToRelative(2.462f, -4.5f, 5.5f, -4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.197f, 15.698f)
                curveToRelative(-0.69f, 0.196f, -1.43f, 0.302f, -2.197f, 0.302f)
                arcToRelative(8.008f, 8.008f, 0f, false, true, -2.612f, -0.432f)
                lineToRelative(-2.388f, 1.432f)
                verticalLineToRelative(-2.801f)
                curveToRelative(-1.237f, -1.082f, -2f, -2.564f, -2f, -4.199f)
                curveToRelative(0f, -3.314f, 3.134f, -6f, 7f, -6f)
                curveToRelative(3.782f, 0f, 6.863f, 2.57f, 7f, 5.785f)
                lineToRelative(0f, 0.233f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 14f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _BrandWechat!!
    }

private var _BrandWechat: ImageVector? = null

