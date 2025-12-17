package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PackageOpen: ImageVector
    get() {
        if (_PackageOpen != null) return _PackageOpen!!
        
        _PackageOpen = ImageVector.Builder(
            name = "package-open",
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
                moveTo(12f, 22f)
                verticalLineToRelative(-9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.17f, 2.21f)
                arcToRelative(1.67f, 1.67f, 0f, false, true, 1.63f, 0f)
                lineTo(21f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, 0f, 3.36f)
                lineTo(8.82f, 14.79f)
                arcToRelative(1.655f, 1.655f, 0f, false, true, -1.64f, 0f)
                lineTo(3f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, 0f, -3.36f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 13f)
                verticalLineToRelative(3.87f)
                arcToRelative(2.06f, 2.06f, 0f, false, true, -1.11f, 1.83f)
                lineToRelative(-6f, 3.08f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, -1.78f, 0f)
                lineToRelative(-6f, -3.08f)
                arcTo(2.06f, 2.06f, 0f, false, true, 4f, 16.87f)
                verticalLineTo(13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0f, false, false, 0f, -3.36f)
                lineTo(8.83f, 2.2f)
                arcToRelative(1.64f, 1.64f, 0f, false, false, -1.63f, 0f)
                lineTo(3f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0f, false, false, 0f, 3.36f)
                lineToRelative(12.18f, 6.86f)
                arcToRelative(1.636f, 1.636f, 0f, false, false, 1.63f, 0f)
                close()
            }
        }.build()
        
        return _PackageOpen!!
    }

private var _PackageOpen: ImageVector? = null

