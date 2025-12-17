package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Blog: ImageVector
    get() {
        if (_Blog != null) return _Blog!!
        
        _Blog = ImageVector.Builder(
            name = "blog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(172.2f, 226.8f)
                curveToRelative(-14.6f, -2.9f, -28.2f, 8.9f, -28.2f, 23.8f)
                verticalLineTo(301f)
                curveToRelative(0f, 10.2f, 7.1f, 18.4f, 16.7f, 22f)
                curveToRelative(18.2f, 6.8f, 31.3f, 24.4f, 31.3f, 45f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.5f, -48f, -48f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(248f)
                curveToRelative(0f, 89.5f, 82.1f, 160.2f, 175f, 140.7f)
                curveToRelative(54.4f, -11.4f, 98.3f, -55.4f, 109.7f, -109.7f)
                curveToRelative(17.4f, -82.9f, -37f, -157.2f, -112.5f, -172.2f)
                close()
                moveTo(209f, 0f)
                curveToRelative(-9.2f, -0.5f, -17f, 6.8f, -17f, 16f)
                verticalLineToRelative(31.6f)
                curveToRelative(0f, 8.5f, 6.6f, 15.5f, 15f, 15.9f)
                curveToRelative(129.4f, 7f, 233.4f, 112f, 240.9f, 241.5f)
                curveToRelative(0.5f, 8.4f, 7.5f, 15f, 15.9f, 15f)
                horizontalLineToRelative(32.1f)
                curveToRelative(9.2f, 0f, 16.5f, -7.8f, 16f, -17f)
                curveTo(503.4f, 139.8f, 372.2f, 8.6f, 209f, 0f)
                close()
                moveToRelative(0.3f, 96f)
                curveToRelative(-9.3f, -0.7f, -17.3f, 6.7f, -17.3f, 16.1f)
                verticalLineToRelative(32.1f)
                curveToRelative(0f, 8.4f, 6.5f, 15.3f, 14.8f, 15.9f)
                curveToRelative(76.8f, 6.3f, 138f, 68.2f, 144.9f, 145.2f)
                curveToRelative(0.8f, 8.3f, 7.6f, 14.7f, 15.9f, 14.7f)
                horizontalLineToRelative(32.2f)
                curveToRelative(9.3f, 0f, 16.8f, -8f, 16.1f, -17.3f)
                curveToRelative(-8.4f, -110.1f, -96.5f, -198.2f, -206.6f, -206.7f)
                close()
            }
        }.build()
        
        return _Blog!!
    }

private var _Blog: ImageVector? = null

