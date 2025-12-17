package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ribbon: ImageVector
    get() {
        if (_Ribbon != null) return _Ribbon!!
        
        _Ribbon = ImageVector.Builder(
            name = "ribbon",
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
                moveTo(12f, 11.22f)
                curveTo(11f, 9.997f, 10f, 9f, 10f, 8f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                curveToRelative(0f, 1f, -0.998f, 2.002f, -2.01f, 3.22f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                lineToRelative(2.57f, -3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.243f, 9.016f)
                arcToRelative(7f, 7f, 0f, false, true, 11.507f, -0.009f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.35f, 14.53f)
                lineTo(12f, 11.22f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.35f, 14.53f)
                curveTo(7.728f, 12.246f, 6f, 10.221f, 6f, 7f)
                arcToRelative(6f, 5f, 0f, false, true, 12f, 0f)
                curveToRelative(-0.005f, 3.22f, -1.778f, 5.235f, -3.43f, 7.5f)
                lineToRelative(3.557f, 4.527f)
                arcToRelative(1f, 1f, 0f, false, true, -0.203f, 1.43f)
                lineToRelative(-1.894f, 1.36f)
                arcToRelative(1f, 1f, 0f, false, true, -1.384f, -0.215f)
                lineTo(12f, 18f)
                lineToRelative(-2.679f, 3.593f)
                arcToRelative(1f, 1f, 0f, false, true, -1.39f, 0.213f)
                lineToRelative(-1.865f, -1.353f)
                arcToRelative(1f, 1f, 0f, false, true, -0.203f, -1.422f)
                close()
            }
        }.build()
        
        return _Ribbon!!
    }

private var _Ribbon: ImageVector? = null

