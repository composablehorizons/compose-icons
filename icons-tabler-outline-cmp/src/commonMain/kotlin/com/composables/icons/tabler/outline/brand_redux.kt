package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandRedux: ImageVector
    get() {
        if (_BrandRedux != null) return _BrandRedux!!
        
        _BrandRedux = ImageVector.Builder(
            name = "brand-redux",
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
                moveTo(16.54f, 7f)
                curveToRelative(-0.805f, -2.365f, -2.536f, -4f, -4.54f, -4f)
                curveToRelative(-2.774f, 0f, -5.023f, 2.632f, -5.023f, 6.496f)
                curveToRelative(0f, 1.956f, 1.582f, 4.727f, 2.512f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.711f, 11.979f)
                curveToRelative(-1.656f, 1.877f, -2.214f, 4.185f, -1.211f, 5.911f)
                curveToRelative(1.387f, 2.39f, 5.138f, 2.831f, 8.501f, 0.9f)
                curveToRelative(1.703f, -0.979f, 2.875f, -3.362f, 3.516f, -4.798f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.014f, 19.99f)
                curveToRelative(2.511f, 0f, 4.523f, -0.438f, 5.487f, -2.1f)
                curveToRelative(1.387f, -2.39f, -0.215f, -5.893f, -3.579f, -7.824f)
                curveToRelative(-1.702f, -0.979f, -4.357f, -1.235f, -5.927f, -1.07f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.493f, 9.862f)
                curveToRelative(0.48f, 0.276f, 1.095f, 0.112f, 1.372f, -0.366f)
                arcToRelative(1f, 1f, 0f, false, false, -0.367f, -1.365f)
                arcToRelative(1.007f, 1.007f, 0f, false, false, -1.373f, 0.366f)
                arcToRelative(1f, 1f, 0f, false, false, 0.368f, 1.365f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 15.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 14f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
        }.build()
        
        return _BrandRedux!!
    }

private var _BrandRedux: ImageVector? = null

