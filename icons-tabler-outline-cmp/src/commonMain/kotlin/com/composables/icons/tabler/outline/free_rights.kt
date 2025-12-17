package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FreeRights: ImageVector
    get() {
        if (_FreeRights != null) return _FreeRights!!
        
        _FreeRights = ImageVector.Builder(
            name = "free-rights",
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
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.867f, 9.75f)
                curveToRelative(-0.246f, -0.48f, -0.708f, -0.769f, -1.2f, -0.75f)
                horizontalLineToRelative(-1.334f)
                curveToRelative(-0.736f, 0f, -1.333f, 0.67f, -1.333f, 1.5f)
                curveToRelative(0f, 0.827f, 0.597f, 1.499f, 1.333f, 1.499f)
                horizontalLineToRelative(1.334f)
                curveToRelative(0.736f, 0f, 1.333f, 0.671f, 1.333f, 1.5f)
                curveToRelative(0f, 0.828f, -0.597f, 1.499f, -1.333f, 1.499f)
                horizontalLineToRelative(-1.334f)
                curveToRelative(-0.492f, 0.019f, -0.954f, -0.27f, -1.2f, -0.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6f)
                lineToRelative(1.5f, 1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 16.5f)
                lineToRelative(1.5f, 1.5f)
            }
        }.build()
        
        return _FreeRights!!
    }

private var _FreeRights: ImageVector? = null

