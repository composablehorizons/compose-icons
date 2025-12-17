package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hands: ImageVector
    get() {
        if (_Hands != null) return _Hands!!
        
        _Hands = ImageVector.Builder(
            name = "hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(204.8f, 230.4f)
                curveToRelative(-10.6f, -14.1f, -30.7f, -17f, -44.8f, -6.4f)
                curveToRelative(-14.1f, 10.6f, -17f, 30.7f, -6.4f, 44.8f)
                lineToRelative(38.1f, 50.8f)
                curveToRelative(4.8f, 6.4f, 4.1f, 15.3f, -1.5f, 20.9f)
                lineToRelative(-12.8f, 12.8f)
                curveToRelative(-6.7f, 6.7f, -17.6f, 6.2f, -23.6f, -1.1f)
                lineTo(64f, 244.4f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                reflectiveCurveTo(0f, 78.3f, 0f, 96f)
                verticalLineToRelative(218.4f)
                curveToRelative(0f, 10.9f, 3.7f, 21.5f, 10.5f, 30f)
                lineToRelative(104.1f, 134.3f)
                curveToRelative(5f, 6.5f, 8.4f, 13.9f, 10.4f, 21.7f)
                curveToRelative(1.8f, 6.9f, 8.1f, 11.6f, 15.3f, 11.6f)
                horizontalLineTo(272f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(384f)
                curveToRelative(0f, -27.7f, -9f, -54.6f, -25.6f, -76.8f)
                lineToRelative(-57.6f, -76.8f)
                close()
                moveTo(608f, 64f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(148.4f)
                lineToRelative(-89.8f, 107.8f)
                curveToRelative(-6f, 7.2f, -17f, 7.7f, -23.6f, 1.1f)
                lineToRelative(-12.8f, -12.8f)
                curveToRelative(-5.6f, -5.6f, -6.3f, -14.5f, -1.5f, -20.9f)
                lineToRelative(38.1f, -50.8f)
                curveToRelative(10.6f, -14.1f, 7.7f, -34.2f, -6.4f, -44.8f)
                curveToRelative(-14.1f, -10.6f, -34.2f, -7.7f, -44.8f, 6.4f)
                lineToRelative(-57.6f, 76.8f)
                curveTo(361f, 329.4f, 352f, 356.3f, 352f, 384f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(131.7f)
                curveToRelative(7.1f, 0f, 13.5f, -4.7f, 15.3f, -11.6f)
                curveToRelative(2f, -7.8f, 5.4f, -15.2f, 10.4f, -21.7f)
                lineToRelative(104.1f, -134.3f)
                curveToRelative(6.8f, -8.5f, 10.5f, -19.1f, 10.5f, -30f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Hands!!
    }

private var _Hands: ImageVector? = null

