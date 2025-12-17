package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyBangladeshi: ImageVector
    get() {
        if (_DocumentCurrencyBangladeshi != null) return _DocumentCurrencyBangladeshi!!
        
        _DocumentCurrencyBangladeshi = ImageVector.Builder(
            name = "document-currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 2f)
                horizontalLineToRelative(4.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(3.122f, 3.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.439f, 1.061f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 14f)
                horizontalLineTo(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-9f)
                close()
                moveTo(6f, 5.207f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.585f, -1.378f)
                arcTo(1.441f, 1.441f, 0f, false, true, 7.5f, 5.118f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0f, 0.212f, 0.089f, 0.39f, 0.2f, 0.49f)
                curveToRelative(0.098f, 0.092f, 0.206f, 0.12f, 0.33f, 0.085f)
                curveToRelative(0.6f, -0.167f, 1.151f, -0.449f, 1.63f, -0.821f)
                horizontalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                horizontalLineToRelative(1.858f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.628f, 1.16f)
                arcToRelative(6.26f, 6.26f, 0f, false, true, -3.552f, 2.606f)
                arcToRelative(1.825f, 1.825f, 0f, false, true, -1.75f, -0.425f)
                arcTo(2.17f, 2.17f, 0f, false, true, 6f, 10.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.793f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyBangladeshi!!
    }

private var _DocumentCurrencyBangladeshi: ImageVector? = null

