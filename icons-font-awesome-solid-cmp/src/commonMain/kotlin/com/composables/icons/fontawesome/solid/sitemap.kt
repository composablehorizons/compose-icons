package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sitemap: ImageVector
    get() {
        if (_Sitemap != null) return _Sitemap!!
        
        _Sitemap = ImageVector.Builder(
            name = "sitemap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 352f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-24f, -80f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-57.59f)
                curveToRelative(0f, -21.17f, -17.23f, -38.41f, -38.41f, -38.41f)
                horizontalLineTo(344f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(40f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(256f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(64f)
                horizontalLineTo(94.41f)
                curveTo(73.23f, 224f, 56f, 241.23f, 56f, 262.41f)
                verticalLineTo(320f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-48f)
                close()
                moveToRelative(264f, 80f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Sitemap!!
    }

private var _Sitemap: ImageVector? = null

