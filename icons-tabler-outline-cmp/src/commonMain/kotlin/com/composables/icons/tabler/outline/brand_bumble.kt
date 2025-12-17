package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBumble: ImageVector
    get() {
        if (_BrandBumble != null) return _BrandBumble!!
        
        _BrandBumble = ImageVector.Builder(
            name = "brand-bumble",
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
                moveTo(7f, 12f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.268f, 3f)
                horizontalLineToRelative(-8.536f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -1.268f, 0.748f)
                lineToRelative(-4.268f, 7.509f)
                arcToRelative(1.507f, 1.507f, 0f, false, false, 0f, 1.486f)
                lineToRelative(4.268f, 7.509f)
                curveToRelative(0.26f, 0.462f, 0.744f, 0.747f, 1.268f, 0.748f)
                horizontalLineToRelative(8.536f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, 1.268f, -0.748f)
                lineToRelative(4.268f, -7.509f)
                arcToRelative(1.507f, 1.507f, 0f, false, false, 0f, -1.486f)
                lineToRelative(-4.268f, -7.509f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -1.268f, -0.748f)
                close()
            }
        }.build()
        
        return _BrandBumble!!
    }

private var _BrandBumble: ImageVector? = null

