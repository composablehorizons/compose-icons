package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pipette: ImageVector
    get() {
        if (_Pipette != null) return _Pipette!!
        
        _Pipette = ImageVector.Builder(
            name = "pipette",
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
                moveTo(12f, 9f)
                lineToRelative(-8.414f, 8.414f)
                arcTo(2f, 2f, 0f, false, false, 3f, 18.828f)
                verticalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                arcTo(2f, 2f, 0f, false, true, 3.828f, 21f)
                horizontalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineTo(15f, 12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                lineToRelative(0.4f, 0.4f)
                arcToRelative(1f, 1f, 0f, true, true, -3f, 3f)
                lineToRelative(-3.8f, -3.8f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, -3f)
                lineToRelative(0.4f, 0.4f)
                lineToRelative(3.4f, -3.4f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                lineToRelative(0.414f, -0.414f)
            }
        }.build()
        
        return _Pipette!!
    }

private var _Pipette: ImageVector? = null

