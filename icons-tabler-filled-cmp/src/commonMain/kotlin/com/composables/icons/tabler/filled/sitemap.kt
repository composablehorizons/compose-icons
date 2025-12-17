package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Sitemap: ImageVector
    get() {
        if (_Sitemap != null) return _Sitemap!!
        
        _Sitemap = ImageVector.Builder(
            name = "sitemap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 16.667f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 16.667f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4.667f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.645f, 0f, -3f, 1.355f, -3f, 3f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.564f, 0.436f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.564f, 0f, 1f, 0.436f, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.645f, -1.355f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Sitemap!!
    }

private var _Sitemap: ImageVector? = null

