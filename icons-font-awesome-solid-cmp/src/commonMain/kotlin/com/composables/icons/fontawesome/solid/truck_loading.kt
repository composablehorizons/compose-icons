package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TruckLoading: ImageVector
    get() {
        if (_TruckLoading != null) return _TruckLoading!!
        
        _TruckLoading = ImageVector.Builder(
            name = "truck-loading",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(50.2f, 375.6f)
                curveToRelative(2.3f, 8.5f, 11.1f, 13.6f, 19.6f, 11.3f)
                lineToRelative(216.4f, -58f)
                curveToRelative(8.5f, -2.3f, 13.6f, -11.1f, 11.3f, -19.6f)
                lineToRelative(-49.7f, -185.5f)
                curveToRelative(-2.3f, -8.5f, -11.1f, -13.6f, -19.6f, -11.3f)
                lineTo(151f, 133.3f)
                lineToRelative(24.8f, 92.7f)
                lineToRelative(-61.8f, 16.5f)
                lineToRelative(-24.8f, -92.7f)
                lineToRelative(-77.3f, 20.7f)
                curveTo(3.4f, 172.8f, -1.7f, 181.6f, 0.6f, 190.1f)
                lineToRelative(49.6f, 185.5f)
                close()
                moveTo(384f, 0f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(323.6f)
                lineTo(5.9f, 450f)
                curveToRelative(-4.3f, 1.2f, -6.8f, 5.6f, -5.6f, 9.8f)
                lineToRelative(12.6f, 46.3f)
                curveToRelative(1.2f, 4.3f, 5.6f, 6.8f, 9.8f, 5.6f)
                lineToRelative(393.7f, -107.4f)
                curveTo(418.8f, 464.1f, 467.6f, 512f, 528f, 512f)
                curveToRelative(61.9f, 0f, 112f, -50.1f, 112f, -112f)
                verticalLineTo(0f)
                horizontalLineTo(384f)
                close()
                moveToRelative(144f, 448f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _TruckLoading!!
    }

private var _TruckLoading: ImageVector? = null

