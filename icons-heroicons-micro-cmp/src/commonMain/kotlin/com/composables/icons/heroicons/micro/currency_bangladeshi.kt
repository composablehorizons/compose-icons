package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyBangladeshi: ImageVector
    get() {
        if (_CurrencyBangladeshi != null) return _CurrencyBangladeshi!!
        
        _CurrencyBangladeshi = ImageVector.Builder(
            name = "currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveTo(5.25f, 4.707f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.78f, -1.237f)
                curveToRelative(0.841f, -0.842f, 2.28f, -0.246f, 2.28f, 0.944f)
                verticalLineTo(6f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3.098f)
                curveToRelative(0f, 0.549f, 0.295f, 0.836f, 0.545f, 0.87f)
                arcToRelative(3.241f, 3.241f, 0f, false, false, 2.799f, -0.966f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.708f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.695f, 1.032f)
                arcToRelative(4.751f, 4.751f, 0f, false, true, -5.066f, 2.92f)
                curveToRelative(-1.266f, -0.177f, -1.837f, -1.376f, -1.837f, -2.356f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(4.707f)
                close()
            }
        }.build()
        
        return _CurrencyBangladeshi!!
    }

private var _CurrencyBangladeshi: ImageVector? = null

