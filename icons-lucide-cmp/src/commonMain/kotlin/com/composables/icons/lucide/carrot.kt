package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Carrot: ImageVector
    get() {
        if (_Carrot != null) return _Carrot!!
        
        _Carrot = ImageVector.Builder(
            name = "carrot",
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
                moveTo(2.27f, 21.7f)
                reflectiveCurveToRelative(9.87f, -3.5f, 12.73f, -6.36f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.36f, -6.37f)
                curveTo(5.77f, 11.84f, 2.27f, 21.7f, 2.27f, 21.7f)
                close()
                moveTo(8.64f, 14f)
                lineToRelative(-2.05f, -2.04f)
                moveTo(15.34f, 15f)
                lineToRelative(-2.46f, -2.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                reflectiveCurveToRelative(-1.33f, -2f, -3.5f, -2f)
                curveTo(16.86f, 7f, 15f, 9f, 15f, 9f)
                reflectiveCurveToRelative(1.33f, 2f, 3.5f, 2f)
                reflectiveCurveTo(22f, 9f, 22f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                reflectiveCurveToRelative(-2f, 1.33f, -2f, 3.5f)
                reflectiveCurveTo(15f, 9f, 15f, 9f)
                reflectiveCurveToRelative(2f, -1.84f, 2f, -3.5f)
                curveTo(17f, 3.33f, 15f, 2f, 15f, 2f)
                close()
            }
        }.build()
        
        return _Carrot!!
    }

private var _Carrot: ImageVector? = null

