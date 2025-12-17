package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.778f, 0.085f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 0.5f)
                verticalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.314f, 0.464f)
                lineTo(14.5f, 8f)
                lineToRelative(0.186f, 0.464f)
                lineToRelative(-0.003f, 0.001f)
                lineToRelative(-0.006f, 0.003f)
                lineToRelative(-0.023f, 0.009f)
                arcToRelative(12f, 12f, 0f, false, true, -0.397f, 0.15f)
                curveToRelative(-0.264f, 0.095f, -0.631f, 0.223f, -1.047f, 0.35f)
                curveToRelative(-0.816f, 0.252f, -1.879f, 0.523f, -2.71f, 0.523f)
                curveToRelative(-0.847f, 0f, -1.548f, -0.28f, -2.158f, -0.525f)
                lineToRelative(-0.028f, -0.01f)
                curveTo(7.68f, 8.71f, 7.14f, 8.5f, 6.5f, 8.5f)
                curveToRelative(-0.7f, 0f, -1.638f, 0.23f, -2.437f, 0.477f)
                arcTo(20f, 20f, 0f, false, false, 3f, 9.342f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(0.282f)
                curveToRelative(0.226f, -0.079f, 0.496f, -0.17f, 0.79f, -0.26f)
                curveTo(4.606f, 0.272f, 5.67f, 0f, 6.5f, 0f)
                curveToRelative(0.84f, 0f, 1.524f, 0.277f, 2.121f, 0.519f)
                lineToRelative(0.043f, 0.018f)
                curveTo(9.286f, 0.788f, 9.828f, 1f, 10.5f, 1f)
                curveToRelative(0.7f, 0f, 1.638f, -0.23f, 2.437f, -0.477f)
                arcToRelative(20f, 20f, 0f, false, false, 1.349f, -0.476f)
                lineToRelative(0.019f, -0.007f)
                lineToRelative(0.004f, -0.002f)
                horizontalLineToRelative(0.001f)
                moveTo(14f, 1.221f)
                curveToRelative(-0.22f, 0.078f, -0.48f, 0.167f, -0.766f, 0.255f)
                curveToRelative(-0.81f, 0.252f, -1.872f, 0.523f, -2.734f, 0.523f)
                curveToRelative(-0.886f, 0f, -1.592f, -0.286f, -2.203f, -0.534f)
                lineToRelative(-0.008f, -0.003f)
                curveTo(7.662f, 1.21f, 7.139f, 1f, 6.5f, 1f)
                curveToRelative(-0.669f, 0f, -1.606f, 0.229f, -2.415f, 0.478f)
                arcTo(21f, 21f, 0f, false, false, 3f, 1.845f)
                verticalLineToRelative(6.433f)
                curveToRelative(0.22f, -0.078f, 0.48f, -0.167f, 0.766f, -0.255f)
                curveTo(4.576f, 7.77f, 5.638f, 7.5f, 6.5f, 7.5f)
                curveToRelative(0.847f, 0f, 1.548f, 0.28f, 2.158f, 0.525f)
                lineToRelative(0.028f, 0.01f)
                curveTo(9.32f, 8.29f, 9.86f, 8.5f, 10.5f, 8.5f)
                curveToRelative(0.668f, 0f, 1.606f, -0.229f, 2.415f, -0.478f)
                arcTo(21f, 21f, 0f, false, false, 14f, 7.655f)
                verticalLineTo(1.222f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

