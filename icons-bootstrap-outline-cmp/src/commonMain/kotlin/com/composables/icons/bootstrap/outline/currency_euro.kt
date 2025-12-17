package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) return _CurrencyEuro!!
        
        _CurrencyEuro = ImageVector.Builder(
            name = "currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9.42f)
                horizontalLineToRelative(1.063f)
                curveTo(5.4f, 12.323f, 7.317f, 14f, 10.34f, 14f)
                curveToRelative(0.622f, 0f, 1.167f, -0.068f, 1.659f, -0.185f)
                verticalLineToRelative(-1.3f)
                curveToRelative(-0.484f, 0.119f, -1.045f, 0.17f, -1.659f, 0.17f)
                curveToRelative(-2.1f, 0f, -3.455f, -1.198f, -3.775f, -3.264f)
                horizontalLineToRelative(4.017f)
                verticalLineToRelative(-0.928f)
                horizontalLineTo(6.497f)
                verticalLineToRelative(-0.936f)
                quadToRelative(-0.002f, -0.165f, 0.008f, -0.329f)
                horizontalLineToRelative(4.078f)
                verticalLineToRelative(-0.927f)
                horizontalLineTo(6.618f)
                curveToRelative(0.388f, -1.898f, 1.719f, -2.985f, 3.723f, -2.985f)
                curveToRelative(0.614f, 0f, 1.175f, 0.05f, 1.659f, 0.177f)
                verticalLineTo(2.194f)
                arcTo(6.6f, 6.6f, 0f, false, false, 10.341f, 2f)
                curveToRelative(-2.928f, 0f, -4.82f, 1.569f, -5.244f, 4.3f)
                horizontalLineTo(4f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(1.265f)
                horizontalLineTo(4f)
                verticalLineToRelative(0.928f)
                close()
            }
        }.build()
        
        return _CurrencyEuro!!
    }

private var _CurrencyEuro: ImageVector? = null

