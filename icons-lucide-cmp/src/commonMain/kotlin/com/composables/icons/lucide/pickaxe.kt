package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pickaxe: ImageVector
    get() {
        if (_Pickaxe != null) return _Pickaxe!!
        
        _Pickaxe = ImageVector.Builder(
            name = "pickaxe",
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
                moveTo(14f, 13f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(11f, 9.999f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.973f, 4.027f)
                arcTo(13f, 13f, 0f, false, false, 5.902f, 2.373f)
                curveToRelative(-1.398f, 0.342f, -1.092f, 2.158f, 0.277f, 2.601f)
                arcToRelative(19.9f, 19.9f, 0f, false, true, 5.822f, 3.024f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.001f, 11.999f)
                arcToRelative(19.9f, 19.9f, 0f, false, true, 3.024f, 5.824f)
                curveToRelative(0.444f, 1.369f, 2.26f, 1.676f, 2.603f, 0.278f)
                arcTo(13f, 13f, 0f, false, false, 20f, 8.069f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.352f, 3.352f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineToRelative(-5.296f, 5.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(5.296f, -5.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, -1.704f)
                close()
            }
        }.build()
        
        return _Pickaxe!!
    }

private var _Pickaxe: ImageVector? = null

