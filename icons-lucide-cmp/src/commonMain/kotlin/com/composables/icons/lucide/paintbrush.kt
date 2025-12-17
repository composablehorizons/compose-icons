package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Paintbrush: ImageVector
    get() {
        if (_Paintbrush != null) return _Paintbrush!!
        
        _Paintbrush = ImageVector.Builder(
            name = "paintbrush",
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
                moveTo(14.622f, 17.897f)
                lineToRelative(-10.68f, -2.913f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.376f, 2.622f)
                arcToRelative(1f, 1f, 0f, true, true, 3.002f, 3.002f)
                lineTo(17.36f, 9.643f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                lineToRelative(0.944f, 0.944f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 0f, 3.408f)
                lineToRelative(-0.944f, 0.944f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0f)
                lineTo(8.354f, 7.348f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                lineToRelative(0.944f, -0.944f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.408f, 0f)
                lineToRelative(0.944f, 0.944f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                curveToRelative(-1.804f, 2.71f, -3.97f, 3.46f, -6.583f, 3.948f)
                arcToRelative(0.507f, 0.507f, 0f, false, false, -0.302f, 0.819f)
                lineToRelative(7.32f, 8.883f)
                arcToRelative(1f, 1f, 0f, false, false, 1.185f, 0.204f)
                curveTo(12.735f, 20.405f, 16f, 16.792f, 16f, 15f)
            }
        }.build()
        
        return _Paintbrush!!
    }

private var _Paintbrush: ImageVector? = null

