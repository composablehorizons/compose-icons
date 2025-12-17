package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandLizard: ImageVector
    get() {
        if (_HandLizard != null) return _HandLizard!!
        
        _HandLizard = ImageVector.Builder(
            name = "hand-lizard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(556.686f, 290.542f)
                lineTo(410.328f, 64.829f)
                curveTo(397.001f, 44.272f, 374.417f, 32f, 349.917f, 32f)
                horizontalLineTo(56f)
                curveTo(25.121f, 32f, 0f, 57.122f, 0f, 88f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 44.112f, 35.888f, 80f, 80f, 80f)
                horizontalLineToRelative(196.042f)
                lineToRelative(-18.333f, 48f)
                horizontalLineTo(144f)
                curveToRelative(-48.523f, 0f, -88f, 39.477f, -88f, 88f)
                curveToRelative(0f, 30.879f, 25.121f, 56f, 56f, 56f)
                horizontalLineToRelative(131.552f)
                curveToRelative(2.987f, 0f, 5.914f, 0.549f, 8.697f, 1.631f)
                lineTo(352f, 408.418f)
                verticalLineTo(480f)
                horizontalLineToRelative(224f)
                verticalLineTo(355.829f)
                curveToRelative(0f, -23.225f, -6.679f, -45.801f, -19.314f, -65.287f)
                close()
                moveTo(528f, 432f)
                horizontalLineTo(400f)
                verticalLineToRelative(-23.582f)
                curveToRelative(0f, -19.948f, -12.014f, -37.508f, -30.604f, -44.736f)
                lineToRelative(-99.751f, -38.788f)
                arcTo(71.733f, 71.733f, 0f, false, false, 243.552f, 320f)
                horizontalLineTo(112f)
                curveToRelative(-4.411f, 0f, -8f, -3.589f, -8f, -8f)
                curveToRelative(0f, -22.056f, 17.944f, -40f, 40f, -40f)
                horizontalLineToRelative(113.709f)
                curveToRelative(19.767f, 0f, 37.786f, -12.407f, 44.84f, -30.873f)
                lineToRelative(24.552f, -64.281f)
                curveToRelative(8.996f, -23.553f, -8.428f, -48.846f, -33.63f, -48.846f)
                horizontalLineTo(80f)
                curveToRelative(-17.645f, 0f, -32f, -14.355f, -32f, -32f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -4.411f, 3.589f, -8f, 8f, -8f)
                horizontalLineToRelative(293.917f)
                curveToRelative(8.166f, 0f, 15.693f, 4.09f, 20.137f, 10.942f)
                lineToRelative(146.358f, 225.715f)
                arcTo(71.84f, 71.84f, 0f, false, true, 528f, 355.829f)
                verticalLineTo(432f)
                close()
            }
        }.build()
        
        return _HandLizard!!
    }

private var _HandLizard: ImageVector? = null

