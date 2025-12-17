package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tshirt: ImageVector
    get() {
        if (_Tshirt != null) return _Tshirt!!
        
        _Tshirt = ImageVector.Builder(
            name = "tshirt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(631.2f, 96.5f)
                lineTo(436.5f, 0f)
                curveTo(416.4f, 27.8f, 371.9f, 47.2f, 320f, 47.2f)
                reflectiveCurveTo(223.6f, 27.8f, 203.5f, 0f)
                lineTo(8.8f, 96.5f)
                curveToRelative(-7.9f, 4f, -11.1f, 13.6f, -7.2f, 21.5f)
                lineToRelative(57.2f, 114.5f)
                curveToRelative(4f, 7.9f, 13.6f, 11.1f, 21.5f, 7.2f)
                lineToRelative(56.6f, -27.7f)
                curveToRelative(10.6f, -5.2f, 23f, 2.5f, 23f, 14.4f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(226.3f)
                curveToRelative(0f, -11.8f, 12.4f, -19.6f, 23f, -14.4f)
                lineToRelative(56.6f, 27.7f)
                curveToRelative(7.9f, 4f, 17.5f, 0.8f, 21.5f, -7.2f)
                lineTo(638.3f, 118f)
                curveToRelative(4f, -7.9f, 0.8f, -17.6f, -7.1f, -21.5f)
                close()
            }
        }.build()
        
        return _Tshirt!!
    }

private var _Tshirt: ImageVector? = null

