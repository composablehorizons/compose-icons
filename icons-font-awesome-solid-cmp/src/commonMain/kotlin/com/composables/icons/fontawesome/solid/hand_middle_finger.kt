package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandMiddleFinger: ImageVector
    get() {
        if (_HandMiddleFinger != null) return _HandMiddleFinger!!
        
        _HandMiddleFinger = ImageVector.Builder(
            name = "hand-middle-finger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479.93f, 317.12f)
                arcToRelative(37.33f, 37.33f, 0f, false, false, -28.28f, -36.19f)
                lineTo(416f, 272f)
                verticalLineToRelative(-49.59f)
                curveToRelative(0f, -11.44f, -9.69f, -21.29f, -23.15f, -23.54f)
                lineToRelative(-38.4f, -6.4f)
                curveTo(336.63f, 189.5f, 320f, 200.86f, 320f, 216f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, false, true, -16f, 0f)
                verticalLineTo(50f)
                curveToRelative(0f, -26.28f, -20.25f, -49.2f, -46.52f, -50f)
                arcTo(48f, 48f, 0f, false, false, 208f, 48f)
                verticalLineToRelative(200f)
                arcToRelative(8f, 8f, 0f, false, true, -16f, 0f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -15.15f, -16.63f, -26.51f, -34.45f, -23.54f)
                lineToRelative(-30.68f, 5.12f)
                curveToRelative(-18f, 3f, -30.87f, 16.12f, -30.87f, 31.38f)
                verticalLineTo(376f)
                arcToRelative(8f, 8f, 0f, false, true, -16f, 0f)
                verticalLineToRelative(-76f)
                lineToRelative(-27.36f, 15f)
                arcTo(37.34f, 37.34f, 0f, false, false, 32f, 348.4f)
                verticalLineToRelative(73.47f)
                arcToRelative(37.31f, 37.31f, 0f, false, false, 10.93f, 26.39f)
                lineToRelative(30.93f, 30.93f)
                arcTo(112f, 112f, 0f, false, false, 153.05f, 512f)
                horizontalLineToRelative(215f)
                arcTo(112f, 112f, 0f, false, false, 480f, 400f)
                close()
            }
        }.build()
        
        return _HandMiddleFinger!!
    }

private var _HandMiddleFinger: ImageVector? = null

