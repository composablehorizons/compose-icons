package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HotelService: ImageVector
    get() {
        if (_HotelService != null) return _HotelService!!
        
        _HotelService = ImageVector.Builder(
            name = "hotel-service",
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
                moveTo(8.5f, 10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 11f, 0f)
                verticalLineToRelative(10.5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, 0.71f, -2.444f, 1.88f, -3.175f)
                lineToRelative(4.424f, -2.765f)
                curveToRelative(1.055f, -0.66f, 1.696f, -1.316f, 1.696f, -2.56f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _HotelService!!
    }

private var _HotelService: ImageVector? = null

