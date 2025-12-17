package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cuboid: ImageVector
    get() {
        if (_Cuboid != null) return _Cuboid!!
        
        _Cuboid = ImageVector.Builder(
            name = "cuboid",
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
                moveTo(21.12f, 6.4f)
                lineToRelative(-6.05f, -4.06f)
                arcToRelative(2f, 2f, 0f, false, false, -2.17f, -0.05f)
                lineTo(2.95f, 8.41f)
                arcToRelative(2f, 2f, 0f, false, false, -0.95f, 1.7f)
                verticalLineToRelative(5.82f)
                arcToRelative(2f, 2f, 0f, false, false, 0.88f, 1.66f)
                lineToRelative(6.05f, 4.07f)
                arcToRelative(2f, 2f, 0f, false, false, 2.17f, 0.05f)
                lineToRelative(9.95f, -6.12f)
                arcToRelative(2f, 2f, 0f, false, false, 0.95f, -1.7f)
                verticalLineTo(8.06f)
                arcToRelative(2f, 2f, 0f, false, false, -0.88f, -1.66f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 22f)
                verticalLineToRelative(-8f)
                lineTo(2.25f, 9.15f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                lineToRelative(11.77f, -6.87f)
            }
        }.build()
        
        return _Cuboid!!
    }

private var _Cuboid: ImageVector? = null

