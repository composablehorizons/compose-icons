package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) return _Thermometer!!
        
        _Thermometer = ImageVector.Builder(
            name = "thermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476.8f, 20.4f)
                curveToRelative(-37.5f, -30.7f, -95.5f, -26.3f, -131.9f, 10.2f)
                lineToRelative(-45.7f, 46f)
                lineToRelative(50.5f, 50.5f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-50.4f, -50.5f)
                lineToRelative(-45.1f, 45.4f)
                lineToRelative(50.3f, 50.4f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineTo(209f, 167.4f)
                lineToRelative(-45.1f, 45.4f)
                lineTo(214f, 263f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-50.1f, -50.2f)
                lineTo(96f, 281.1f)
                verticalLineTo(382f)
                lineTo(7f, 471f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(89f, -89f)
                horizontalLineToRelative(99.9f)
                lineTo(484f, 162.6f)
                curveToRelative(34.9f, -34.9f, 42.2f, -101.5f, -7.2f, -142.2f)
                close()
            }
        }.build()
        
        return _Thermometer!!
    }

private var _Thermometer: ImageVector? = null

