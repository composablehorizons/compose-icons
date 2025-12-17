package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandWeibo: ImageVector
    get() {
        if (_BrandWeibo != null) return _BrandWeibo!!
        
        _BrandWeibo = ImageVector.Builder(
            name = "brand-weibo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.972f, 8.183f)
                curveToRelative(2.81f, -2.987f, 6.162f, -4.207f, 8.006f, -2.24f)
                curveToRelative(0.298f, 0.316f, 0.554f, 0.773f, 0.736f, 1.266f)
                lineToRelative(0.127f, -0.031f)
                curveToRelative(2.064f, -0.469f, 4f, 1.287f, 3.817f, 3.544f)
                lineToRelative(-0.005f, 0.036f)
                lineToRelative(0.15f, 0.057f)
                curveToRelative(1.46f, 0.574f, 2.14f, 1.355f, 2.193f, 3.081f)
                lineToRelative(0.004f, 0.231f)
                curveToRelative(0f, 3.776f, -4.107f, 6.873f, -9f, 6.873f)
                curveToRelative(-4.854f, 0f, -9f, -2.72f, -9f, -6.565f)
                curveToRelative(0f, -2.04f, 1.068f, -4.222f, 2.972f, -6.252f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
        }.build()
        
        return _BrandWeibo!!
    }

private var _BrandWeibo: ImageVector? = null

