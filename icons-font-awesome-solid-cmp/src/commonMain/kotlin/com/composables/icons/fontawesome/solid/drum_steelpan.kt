package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DrumSteelpan: ImageVector
    get() {
        if (_DrumSteelpan != null) return _DrumSteelpan!!
        
        _DrumSteelpan = ImageVector.Builder(
            name = "drum-steelpan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 32f)
                curveTo(128.94f, 32f, 0f, 89.31f, 0f, 160f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 70.69f, 128.94f, 128f, 288f, 128f)
                reflectiveCurveToRelative(288f, -57.31f, 288f, -128f)
                verticalLineTo(160f)
                curveToRelative(0f, -70.69f, -128.94f, -128f, -288f, -128f)
                close()
                moveToRelative(-82.99f, 158.36f)
                curveToRelative(-4.45f, 16.61f, -14.54f, 30.57f, -28.31f, 40.48f)
                curveTo(100.23f, 217.46f, 48f, 190.78f, 48f, 160f)
                curveToRelative(0f, -30.16f, 50.11f, -56.39f, 124.04f, -70.03f)
                lineToRelative(25.6f, 44.34f)
                curveToRelative(9.86f, 17.09f, 12.48f, 36.99f, 7.37f, 56.05f)
                close()
                moveTo(288f, 240f)
                curveToRelative(-21.08f, 0f, -41.41f, -1f, -60.89f, -2.7f)
                curveToRelative(8.06f, -26.13f, 32.15f, -45.3f, 60.89f, -45.3f)
                reflectiveCurveToRelative(52.83f, 19.17f, 60.89f, 45.3f)
                curveTo(329.41f, 239f, 309.08f, 240f, 288f, 240f)
                close()
                moveToRelative(64f, -144f)
                curveToRelative(0f, 35.29f, -28.71f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.71f, -64f, -64f)
                verticalLineTo(82.96f)
                curveToRelative(20.4f, -1.88f, 41.8f, -2.96f, 64f, -2.96f)
                reflectiveCurveToRelative(43.6f, 1.08f, 64f, 2.96f)
                verticalLineTo(96f)
                close()
                moveToRelative(46.93f, 134.9f)
                curveToRelative(-13.81f, -9.91f, -23.94f, -23.9f, -28.4f, -40.54f)
                curveToRelative(-5.11f, -19.06f, -2.49f, -38.96f, 7.38f, -56.04f)
                lineToRelative(25.65f, -44.42f)
                curveTo(477.72f, 103.5f, 528f, 129.79f, 528f, 160f)
                curveToRelative(0f, 30.83f, -52.4f, 57.54f, -129.07f, 70.9f)
                close()
            }
        }.build()
        
        return _DrumSteelpan!!
    }

private var _DrumSteelpan: ImageVector? = null

