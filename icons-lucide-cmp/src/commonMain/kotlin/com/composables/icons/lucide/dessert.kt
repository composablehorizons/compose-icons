package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dessert: ImageVector
    get() {
        if (_Dessert != null) return _Dessert!!
        
        _Dessert = ImageVector.Builder(
            name = "dessert",
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
                moveTo(10.162f, 3.167f)
                arcTo(10f, 10f, 0f, false, false, 2f, 13f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, -0.006f)
                arcToRelative(10f, 10f, 0f, false, false, -8.161f, -9.826f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.804f, 14.869f)
                arcToRelative(9f, 9f, 0f, false, true, -17.608f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 4f)
                arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                close()
            }
        }.build()
        
        return _Dessert!!
    }

private var _Dessert: ImageVector? = null

