package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileVolume: ImageVector
    get() {
        if (_FileVolume != null) return _FileVolume!!
        
        _FileVolume = ImageVector.Builder(
            name = "file-volume",
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
                moveTo(4f, 11.55f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, 0.706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14.502f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.826f, -0.381f)
                lineToRelative(-1.893f, 1.631f)
                arcToRelative(1f, 1f, 0f, false, true, -0.651f, 0.243f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.501f)
                verticalLineToRelative(3.006f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.501f)
                horizontalLineToRelative(1.129f)
                arcToRelative(1f, 1f, 0f, false, true, 0.652f, 0.243f)
                lineToRelative(1.893f, 1.633f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.826f, -0.38f)
                close()
            }
        }.build()
        
        return _FileVolume!!
    }

private var _FileVolume: ImageVector? = null

