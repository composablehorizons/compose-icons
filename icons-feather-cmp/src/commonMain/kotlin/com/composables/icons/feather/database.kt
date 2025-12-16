package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
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
                moveTo(21f, 5f)
                arcTo(9f, 3f, 0f, false, true, 12f, 8f)
                arcTo(9f, 3f, 0f, false, true, 3f, 5f)
                arcTo(9f, 3f, 0f, false, true, 21f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveToRelative(0f, 1.66f, -4f, 3f, -9f, 3f)
                reflectiveCurveToRelative(-9f, -1.34f, -9f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.66f, 4f, 3f, 9f, 3f)
                reflectiveCurveToRelative(9f, -1.34f, 9f, -3f)
                verticalLineTo(5f)
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

