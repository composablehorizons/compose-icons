package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Icons: ImageVector
    get() {
        if (_Icons != null) return _Icons!!
        
        _Icons = ImageVector.Builder(
            name = "icons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(116.65f, 219.35f)
                arcToRelative(15.68f, 15.68f, 0f, false, false, 22.65f, 0f)
                lineToRelative(96.75f, -99.83f)
                curveToRelative(28.15f, -29f, 26.5f, -77.1f, -4.91f, -103.88f)
                curveTo(203.75f, -7.7f, 163f, -3.5f, 137.86f, 22.44f)
                lineTo(128f, 32.58f)
                lineToRelative(-9.85f, -10.14f)
                curveTo(93.05f, -3.5f, 52.25f, -7.7f, 24.86f, 15.64f)
                curveToRelative(-31.41f, 26.78f, -33f, 74.85f, -5f, 103.88f)
                close()
                moveToRelative(143.92f, 100.49f)
                horizontalLineToRelative(-48f)
                lineToRelative(-7.08f, -14.24f)
                arcToRelative(27.39f, 27.39f, 0f, false, false, -25.66f, -17.78f)
                horizontalLineToRelative(-71.71f)
                arcToRelative(27.39f, 27.39f, 0f, false, false, -25.66f, 17.78f)
                lineToRelative(-7f, 14.24f)
                horizontalLineToRelative(-48f)
                arcTo(27.45f, 27.45f, 0f, false, false, 0f, 347.3f)
                verticalLineToRelative(137.25f)
                arcTo(27.44f, 27.44f, 0f, false, false, 27.43f, 512f)
                horizontalLineToRelative(233.14f)
                arcTo(27.45f, 27.45f, 0f, false, false, 288f, 484.55f)
                verticalLineTo(347.3f)
                arcToRelative(27.45f, 27.45f, 0f, false, false, -27.43f, -27.46f)
                close()
                moveTo(144f, 468f)
                arcToRelative(52f, 52f, 0f, true, true, 52f, -52f)
                arcToRelative(52f, 52f, 0f, false, true, -52f, 52f)
                close()
                moveToRelative(355.4f, -115.9f)
                horizontalLineToRelative(-60.58f)
                lineToRelative(22.36f, -50.75f)
                curveToRelative(2.1f, -6.65f, -3.93f, -13.21f, -12.18f, -13.21f)
                horizontalLineToRelative(-75.59f)
                curveToRelative(-6.3f, 0f, -11.66f, 3.9f, -12.5f, 9.1f)
                lineToRelative(-16.8f, 106.93f)
                curveToRelative(-1f, 6.3f, 4.88f, 11.89f, 12.5f, 11.89f)
                horizontalLineToRelative(62.31f)
                lineToRelative(-24.2f, 83f)
                curveToRelative(-1.89f, 6.65f, 4.2f, 12.9f, 12.23f, 12.9f)
                arcToRelative(13.26f, 13.26f, 0f, false, false, 10.92f, -5.25f)
                lineToRelative(92.4f, -138.91f)
                curveToRelative(4.88f, -6.91f, -1.16f, -15.7f, -10.87f, -15.7f)
                close()
                moveTo(478.08f, 0.33f)
                lineTo(329.51f, 23.17f)
                curveTo(314.87f, 25.42f, 304f, 38.92f, 304f, 54.83f)
                verticalLineTo(161.6f)
                arcToRelative(83.25f, 83.25f, 0f, false, false, -16f, -1.7f)
                curveToRelative(-35.35f, 0f, -64f, 21.48f, -64f, 48f)
                reflectiveCurveToRelative(28.65f, 48f, 64f, 48f)
                curveToRelative(35.2f, 0f, 63.73f, -21.32f, 64f, -47.66f)
                verticalLineTo(99.66f)
                lineToRelative(112f, -17.22f)
                verticalLineToRelative(47.18f)
                arcToRelative(83.25f, 83.25f, 0f, false, false, -16f, -1.7f)
                curveToRelative(-35.35f, 0f, -64f, 21.48f, -64f, 48f)
                reflectiveCurveToRelative(28.65f, 48f, 64f, 48f)
                curveToRelative(35.2f, 0f, 63.73f, -21.32f, 64f, -47.66f)
                verticalLineTo(32f)
                curveToRelative(0f, -19.48f, -16f, -34.42f, -33.92f, -31.67f)
                close()
            }
        }.build()
        
        return _Icons!!
    }

private var _Icons: ImageVector? = null

