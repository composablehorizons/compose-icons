package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Footprints: ImageVector
    get() {
        if (_Footprints != null) return _Footprints!!
        
        _Footprints = ImageVector.Builder(
            name = "footprints",
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
                moveTo(4f, 16f)
                verticalLineToRelative(-2.38f)
                curveTo(4f, 11.5f, 2.97f, 10.5f, 3f, 8f)
                curveToRelative(0.03f, -2.72f, 1.49f, -6f, 4.5f, -6f)
                curveTo(9.37f, 2f, 10f, 3.8f, 10f, 5.5f)
                curveToRelative(0f, 3.11f, -2f, 5.66f, -2f, 8.68f)
                verticalLineTo(16f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 20f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -2.12f, 1.03f, -3.12f, 1f, -5.62f)
                curveToRelative(-0.03f, -2.72f, -1.49f, -6f, -4.5f, -6f)
                curveTo(14.63f, 6f, 14f, 7.8f, 14f, 9.5f)
                curveToRelative(0f, 3.11f, 2f, 5.66f, 2f, 8.68f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _Footprints!!
    }

private var _Footprints: ImageVector? = null

