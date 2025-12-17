package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bottle: ImageVector
    get() {
        if (_Bottle != null) return _Bottle!!
        
        _Bottle = ImageVector.Builder(
            name = "bottle",
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
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 3.5f)
                curveToRelative(0f, 1.626f, 0.507f, 3.212f, 1.45f, 4.537f)
                lineToRelative(0.05f, 0.07f)
                arcToRelative(8.093f, 8.093f, 0f, false, true, 1.5f, 4.694f)
                verticalLineToRelative(6.199f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6.2f)
                curveToRelative(0f, -1.682f, 0.524f, -3.322f, 1.5f, -4.693f)
                lineToRelative(0.05f, -0.07f)
                arcToRelative(7.823f, 7.823f, 0f, false, false, 1.45f, -4.537f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14.803f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 1f, -0.803f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1f, -0.805f)
            }
        }.build()
        
        return _Bottle!!
    }

private var _Bottle: ImageVector? = null

