package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Peace: ImageVector
    get() {
        if (_Peace != null) return _Peace!!
        
        _Peace = ImageVector.Builder(
            name = "peace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(184f, 248f)
                curveToRelative(0f, 31.93f, -8.2f, 61.97f, -22.57f, 88.17f)
                lineTo(280f, 240.63f)
                verticalLineTo(74.97f)
                curveToRelative(86.23f, 15.21f, 152f, 90.5f, 152f, 181.03f)
                close()
                moveTo(216f, 437.03f)
                curveToRelative(-33.86f, -5.97f, -64.49f, -21.2f, -89.29f, -43.02f)
                lineTo(216f, 322.57f)
                verticalLineToRelative(114.46f)
                close()
                moveToRelative(64f, -114.46f)
                lineTo(369.29f, 394f)
                curveToRelative(-24.8f, 21.82f, -55.43f, 37.05f, -89.29f, 43.02f)
                verticalLineTo(322.57f)
                close()
                moveToRelative(-64f, -247.6f)
                verticalLineToRelative(165.66f)
                lineTo(86.57f, 344.17f)
                curveTo(72.2f, 317.97f, 64f, 287.93f, 64f, 256f)
                curveToRelative(0f, -90.53f, 65.77f, -165.82f, 152f, -181.03f)
                close()
            }
        }.build()
        
        return _Peace!!
    }

private var _Peace: ImageVector? = null

