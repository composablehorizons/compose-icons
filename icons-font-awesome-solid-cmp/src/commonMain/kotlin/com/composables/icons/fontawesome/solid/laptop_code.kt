package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaptopCode: ImageVector
    get() {
        if (_LaptopCode != null) return _LaptopCode!!
        
        _LaptopCode = ImageVector.Builder(
            name = "laptop-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(255.03f, 261.65f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(11.31f, -11.31f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineTo(253.25f, 192f)
                lineToRelative(35.71f, -35.72f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineToRelative(-11.31f, -11.31f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineToRelative(-58.34f, 58.34f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(58.35f, 58.34f)
                close()
                moveToRelative(96.01f, -11.3f)
                lineToRelative(11.31f, 11.31f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(58.34f, -58.34f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineToRelative(-58.34f, -58.34f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineToRelative(-11.31f, 11.31f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineTo(386.75f, 192f)
                lineToRelative(-35.71f, 35.72f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                close()
                moveTo(624f, 416f)
                horizontalLineTo(381.54f)
                curveToRelative(-0.74f, 19.81f, -14.71f, 32f, -32.74f, 32f)
                horizontalLineTo(288f)
                curveToRelative(-18.69f, 0f, -33.02f, -17.47f, -32.77f, -32f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 35.2f, 28.8f, 64f, 64f, 64f)
                horizontalLineToRelative(512f)
                curveToRelative(35.2f, 0f, 64f, -28.8f, 64f, -64f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(576f, 48f)
                curveToRelative(0f, -26.4f, -21.6f, -48f, -48f, -48f)
                horizontalLineTo(112f)
                curveTo(85.6f, 0f, 64f, 21.6f, 64f, 48f)
                verticalLineToRelative(336f)
                horizontalLineToRelative(512f)
                verticalLineTo(48f)
                close()
                moveToRelative(-64f, 272f)
                horizontalLineTo(128f)
                verticalLineTo(64f)
                horizontalLineToRelative(384f)
                verticalLineToRelative(256f)
                close()
            }
        }.build()
        
        return _LaptopCode!!
    }

private var _LaptopCode: ImageVector? = null

