package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) return _Thermometer!!
        
        _Thermometer = ImageVector.Builder(
            name = "thermometer",
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
                moveTo(14f, 4f)
                verticalLineToRelative(10.54f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
            }
        }.build()
        
        return _Thermometer!!
    }

private var _Thermometer: ImageVector? = null

