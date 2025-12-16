package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FilePen: ImageVector
    get() {
        if (_FilePen != null) return _FilePen!!
        
        _FilePen = ImageVector.Builder(
            name = "file-pen",
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
                moveTo(12.659f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -0.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9.34f)
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
                moveTo(10.378f, 12.622f)
                arcToRelative(1f, 1f, 0f, false, true, 3f, 3.003f)
                lineTo(8.36f, 20.637f)
                arcToRelative(2f, 2f, 0f, false, true, -0.854f, 0.506f)
                lineToRelative(-2.867f, 0.837f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.62f, -0.62f)
                lineToRelative(0.836f, -2.869f)
                arcToRelative(2f, 2f, 0f, false, true, 0.506f, -0.853f)
                close()
            }
        }.build()
        
        return _FilePen!!
    }

private var _FilePen: ImageVector? = null

