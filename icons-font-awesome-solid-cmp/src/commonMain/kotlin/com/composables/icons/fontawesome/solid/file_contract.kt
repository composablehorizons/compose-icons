package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileContract: ImageVector
    get() {
        if (_FileContract != null) return _FileContract!!
        
        _FileContract = ImageVector.Builder(
            name = "file-contract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveTo(64f, 72f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(80f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineTo(72f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(80f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                close()
                moveToRelative(192.81f, 248f)
                horizontalLineTo(304f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-47.19f)
                curveToRelative(-16.45f, 0f, -31.27f, -9.14f, -38.64f, -23.86f)
                curveToRelative(-2.95f, -5.92f, -8.09f, -6.52f, -10.17f, -6.52f)
                reflectiveCurveToRelative(-7.22f, 0.59f, -10.02f, 6.19f)
                lineToRelative(-7.67f, 15.34f)
                arcToRelative(15.986f, 15.986f, 0f, false, true, -14.31f, 8.84f)
                curveToRelative(-0.38f, 0f, -0.75f, -0.02f, -1.14f, -0.05f)
                curveToRelative(-6.45f, -0.45f, -12f, -4.75f, -14.03f, -10.89f)
                lineTo(144f, 354.59f)
                lineToRelative(-10.61f, 31.88f)
                curveToRelative(-5.89f, 17.66f, -22.38f, 29.53f, -41f, 29.53f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(12.39f)
                curveToRelative(4.83f, 0f, 9.11f, -3.08f, 10.64f, -7.66f)
                lineToRelative(18.19f, -54.64f)
                curveToRelative(3.3f, -9.81f, 12.44f, -16.41f, 22.78f, -16.41f)
                reflectiveCurveToRelative(19.48f, 6.59f, 22.77f, 16.41f)
                lineToRelative(13.88f, 41.64f)
                curveToRelative(19.77f, -16.19f, 54.05f, -9.7f, 66f, 14.16f)
                curveToRelative(2.02f, 4.06f, 5.96f, 6.5f, 10.16f, 6.5f)
                close()
                moveTo(377f, 105f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
            }
        }.build()
        
        return _FileContract!!
    }

private var _FileContract: ImageVector? = null

