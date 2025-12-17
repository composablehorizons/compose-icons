package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CurrencyBangladeshi: ImageVector
    get() {
        if (_CurrencyBangladeshi != null) return _CurrencyBangladeshi!!
        
        _CurrencyBangladeshi = ImageVector.Builder(
            name = "currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, 16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, -16f)
                close()
                moveTo(5.94f, 5.5f)
                curveToRelative(0.944f, -0.945f, 2.56f, -0.276f, 2.56f, 1.06f)
                verticalLineTo(8f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(4.275f)
                curveToRelative(0f, 0.296f, 0.144f, 0.455f, 0.26f, 0.499f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4.402f, -1.77f)
                horizontalLineToRelative(-0.412f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.537f)
                curveToRelative(0.462f, 0f, 0.887f, 0.21f, 1.156f, 0.556f)
                curveToRelative(0.278f, 0.355f, 0.383f, 0.852f, 0.184f, 1.337f)
                arcToRelative(5.001f, 5.001f, 0f, false, true, -6.4f, 2.78f)
                curveTo(7.376f, 15.353f, 7f, 14.512f, 7f, 13.774f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(7f)
                verticalLineTo(6.56f)
                lineToRelative(-0.22f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.22f, -0.22f)
                close()
            }
        }.build()
        
        return _CurrencyBangladeshi!!
    }

private var _CurrencyBangladeshi: ImageVector? = null

