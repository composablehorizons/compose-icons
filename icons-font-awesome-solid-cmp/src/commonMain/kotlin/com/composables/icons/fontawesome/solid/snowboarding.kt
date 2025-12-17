package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Snowboarding: ImageVector
    get() {
        if (_Snowboarding != null) return _Snowboarding!!
        
        _Snowboarding = ImageVector.Builder(
            name = "snowboarding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 96f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(458.5f, 0f, 432f, 0f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(28.8f, 153.6f)
                curveToRelative(5.8f, 4.3f, 12.5f, 6.4f, 19.2f, 6.4f)
                curveToRelative(9.7f, 0f, 19.3f, -4.4f, 25.6f, -12.8f)
                curveToRelative(10.6f, -14.1f, 7.8f, -34.2f, -6.4f, -44.8f)
                lineToRelative(-111.4f, -83.5f)
                curveToRelative(-13.8f, -10.3f, -29.1f, -18.4f, -45.4f, -23.8f)
                lineToRelative(-63.7f, -21.2f)
                lineToRelative(-26.1f, -52.1f)
                curveTo(244.7f, 2f, 225.5f, -4.4f, 209.7f, 3.5f)
                curveToRelative(-15.8f, 7.9f, -22.2f, 27.1f, -14.3f, 42.9f)
                lineToRelative(29.1f, 58.1f)
                curveToRelative(5.7f, 11.4f, 15.6f, 19.9f, 27.7f, 24f)
                lineToRelative(16.4f, 5.5f)
                lineToRelative(-41.2f, 20.6f)
                curveToRelative(-21.8f, 10.9f, -35.4f, 32.8f, -35.4f, 57.2f)
                verticalLineToRelative(53.1f)
                lineToRelative(-74.1f, 24.7f)
                curveToRelative(-16.8f, 5.6f, -25.8f, 23.7f, -20.2f, 40.5f)
                curveToRelative(1.7f, 5.2f, 4.9f, 9.4f, 8.7f, 12.9f)
                lineToRelative(-38.7f, -14.1f)
                curveToRelative(-9.7f, -3.5f, -17.4f, -10.6f, -21.8f, -20f)
                curveToRelative(-5.6f, -12f, -19.9f, -17.2f, -31.9f, -11.6f)
                reflectiveCurveToRelative(-17.2f, 19.9f, -11.6f, 31.9f)
                curveToRelative(9.8f, 21f, 27.1f, 36.9f, 48.9f, 44.8f)
                lineToRelative(364.8f, 132.7f)
                curveToRelative(9.7f, 3.5f, 19.7f, 5.3f, 29.7f, 5.3f)
                curveToRelative(12.5f, 0f, 24.9f, -2.7f, 36.5f, -8.2f)
                curveToRelative(12f, -5.6f, 17.2f, -19.9f, 11.6f, -31.9f)
                reflectiveCurveTo(474f, 454.7f, 462f, 460.3f)
                curveToRelative(-9.3f, 4.4f, -19.8f, 4.8f, -29.5f, 1.3f)
                lineToRelative(-90.8f, -33.1f)
                curveToRelative(8.7f, -4.1f, 15.6f, -11.8f, 17.8f, -21.9f)
                lineToRelative(21.9f, -102f)
                curveToRelative(3.9f, -18.2f, -3.2f, -37.2f, -18.1f, -48.4f)
                lineToRelative(-52f, -39f)
                lineToRelative(66f, -30.5f)
                lineToRelative(83.5f, 62.9f)
                close()
                moveToRelative(-144.4f, 51.7f)
                lineToRelative(-19.7f, 92f)
                curveToRelative(-1.5f, 7.1f, -0.1f, 13.9f, 2.8f, 20f)
                lineToRelative(-169.4f, -61.6f)
                curveToRelative(2.7f, -0.2f, 5.4f, -0.4f, 8f, -1.3f)
                lineToRelative(85f, -28.4f)
                curveToRelative(19.6f, -6.5f, 32.8f, -24.8f, 32.8f, -45.5f)
                verticalLineTo(256f)
                lineToRelative(60.5f, 45.3f)
                close()
            }
        }.build()
        
        return _Snowboarding!!
    }

private var _Snowboarding: ImageVector? = null

