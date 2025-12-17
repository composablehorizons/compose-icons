package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandPointer: ImageVector
    get() {
        if (_HandPointer != null) return _HandPointer!!
        
        _HandPointer = ImageVector.Builder(
            name = "hand-pointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(358.182f, 179.361f)
                curveToRelative(-19.493f, -24.768f, -52.679f, -31.945f, -79.872f, -19.098f)
                curveToRelative(-15.127f, -15.687f, -36.182f, -22.487f, -56.595f, -19.629f)
                verticalLineTo(67f)
                curveToRelative(0f, -36.944f, -29.736f, -67f, -66.286f, -67f)
                reflectiveCurveTo(89.143f, 30.056f, 89.143f, 67f)
                verticalLineToRelative(161.129f)
                curveToRelative(-19.909f, -7.41f, -43.272f, -5.094f, -62.083f, 8.872f)
                curveToRelative(-29.355f, 21.795f, -35.793f, 63.333f, -14.55f, 93.152f)
                lineToRelative(109.699f, 154.001f)
                curveTo(134.632f, 501.59f, 154.741f, 512f, 176f, 512f)
                horizontalLineToRelative(178.286f)
                curveToRelative(30.802f, 0f, 57.574f, -21.5f, 64.557f, -51.797f)
                lineToRelative(27.429f, -118.999f)
                arcTo(67.873f, 67.873f, 0f, false, false, 448f, 326f)
                verticalLineToRelative(-84f)
                curveToRelative(0f, -46.844f, -46.625f, -79.273f, -89.818f, -62.639f)
                close()
                moveTo(80.985f, 279.697f)
                lineToRelative(27.126f, 38.079f)
                curveToRelative(8.995f, 12.626f, 29.031f, 6.287f, 29.031f, -9.283f)
                verticalLineTo(67f)
                curveToRelative(0f, -25.12f, 36.571f, -25.16f, 36.571f, 0f)
                verticalLineToRelative(175f)
                curveToRelative(0f, 8.836f, 7.163f, 16f, 16f, 16f)
                horizontalLineToRelative(6.857f)
                curveToRelative(8.837f, 0f, 16f, -7.164f, 16f, -16f)
                verticalLineToRelative(-35f)
                curveToRelative(0f, -25.12f, 36.571f, -25.16f, 36.571f, 0f)
                verticalLineToRelative(35f)
                curveToRelative(0f, 8.836f, 7.163f, 16f, 16f, 16f)
                horizontalLineTo(272f)
                curveToRelative(8.837f, 0f, 16f, -7.164f, 16f, -16f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -25.12f, 36.571f, -25.16f, 36.571f, 0f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 8.836f, 7.163f, 16f, 16f, 16f)
                horizontalLineToRelative(6.857f)
                curveToRelative(8.837f, 0f, 16f, -7.164f, 16f, -16f)
                curveToRelative(0f, -25.121f, 36.571f, -25.16f, 36.571f, 0f)
                verticalLineToRelative(84f)
                curveToRelative(0f, 1.488f, -0.169f, 2.977f, -0.502f, 4.423f)
                lineToRelative(-27.43f, 119.001f)
                curveToRelative(-1.978f, 8.582f, -9.29f, 14.576f, -17.782f, 14.576f)
                horizontalLineTo(176f)
                curveToRelative(-5.769f, 0f, -11.263f, -2.878f, -14.697f, -7.697f)
                lineToRelative(-109.712f, -154f)
                curveToRelative(-14.406f, -20.223f, 14.994f, -42.818f, 29.394f, -22.606f)
                close()
                moveTo(176.143f, 400f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -8.837f, 6.268f, -16f, 14f, -16f)
                horizontalLineToRelative(6f)
                curveToRelative(7.732f, 0f, 14f, 7.163f, 14f, 16f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 8.837f, -6.268f, 16f, -14f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-7.733f, 0f, -14f, -7.163f, -14f, -16f)
                close()
                moveToRelative(75.428f, 0f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -8.837f, 6.268f, -16f, 14f, -16f)
                horizontalLineToRelative(6f)
                curveToRelative(7.732f, 0f, 14f, 7.163f, 14f, 16f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 8.837f, -6.268f, 16f, -14f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-7.732f, 0f, -14f, -7.163f, -14f, -16f)
                close()
                moveTo(327f, 400f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -8.837f, 6.268f, -16f, 14f, -16f)
                horizontalLineToRelative(6f)
                curveToRelative(7.732f, 0f, 14f, 7.163f, 14f, 16f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 8.837f, -6.268f, 16f, -14f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-7.732f, 0f, -14f, -7.163f, -14f, -16f)
                close()
            }
        }.build()
        
        return _HandPointer!!
    }

private var _HandPointer: ImageVector? = null

