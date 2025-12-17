package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyBangladeshi: ImageVector
    get() {
        if (_DocumentCurrencyBangladeshi != null) return _DocumentCurrencyBangladeshi!!
        
        _DocumentCurrencyBangladeshi = ImageVector.Builder(
            name = "document-currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(1.97f, 4.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.78f, 0.178f)
                verticalLineTo(8f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.098f)
                curveToRelative(0f, 0.98f, 0.571f, 2.18f, 1.837f, 2.356f)
                arcToRelative(4.751f, 4.751f, 0f, false, false, 5.066f, -2.92f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.695f, -1.031f)
                horizontalLineTo(11.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.343f)
                arcToRelative(3.241f, 3.241f, 0f, false, true, -2.798f, 0.966f)
                curveToRelative(-0.25f, -0.035f, -0.545f, -0.322f, -0.545f, -0.87f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(6.415f)
                curveToRelative(0f, -1.19f, -1.439f, -1.786f, -2.28f, -0.945f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyBangladeshi!!
    }

private var _DocumentCurrencyBangladeshi: ImageVector? = null

