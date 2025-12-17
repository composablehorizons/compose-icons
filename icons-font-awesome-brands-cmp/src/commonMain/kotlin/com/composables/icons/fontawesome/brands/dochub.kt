package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Dochub: ImageVector
    get() {
        if (_Dochub != null) return _Dochub!!
        
        _Dochub = ImageVector.Builder(
            name = "dochub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 416f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(397.9f, 160f)
                horizontalLineTo(256f)
                verticalLineTo(19.6f)
                lineTo(397.9f, 160f)
                close()
                moveTo(304f, 192f)
                verticalLineToRelative(130f)
                curveToRelative(0f, 66.8f, -36.5f, 100.1f, -113.3f, 100.1f)
                horizontalLineTo(96f)
                verticalLineTo(84.8f)
                horizontalLineToRelative(94.7f)
                curveToRelative(12f, 0f, 23.1f, 0.8f, 33.1f, 2.5f)
                verticalLineToRelative(-84f)
                curveTo(212.9f, 1.1f, 201.4f, 0f, 189.2f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(512f)
                horizontalLineToRelative(189.2f)
                curveTo(329.7f, 512f, 400f, 447.4f, 400f, 318.1f)
                verticalLineTo(192f)
                horizontalLineToRelative(-96f)
                close()
            }
        }.build()
        
        return _Dochub!!
    }

private var _Dochub: ImageVector? = null

