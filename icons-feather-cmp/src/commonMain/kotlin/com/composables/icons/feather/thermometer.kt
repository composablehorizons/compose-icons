package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Thermometer: ImageVector
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
                moveTo(14f, 14.76f)
                verticalLineTo(3.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                verticalLineToRelative(11.26f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, 5f, 0f)
                close()
            }
        }.build()
        
        return _Thermometer!!
    }

private var _Thermometer: ImageVector? = null

