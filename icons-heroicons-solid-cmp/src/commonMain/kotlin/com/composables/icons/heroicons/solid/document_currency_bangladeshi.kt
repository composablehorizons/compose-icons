package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyBangladeshi: ImageVector
    get() {
        if (_DocumentCurrencyBangladeshi != null) return _DocumentCurrencyBangladeshi!!
        
        _DocumentCurrencyBangladeshi = ImageVector.Builder(
            name = "document-currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineTo(9f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineTo(16.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(7.875f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(5.625f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineTo(3.375f)
                close()
                moveToRelative(10.5f, 1.875f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, false, true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, false, false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
                moveToRelative(-3.75f, 5.56f)
                curveToRelative(0f, -1.336f, -1.616f, -2.005f, -2.56f, -1.06f)
                lineToRelative(-0.22f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(0.22f, -0.22f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(9f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.671f, 0.307f, 1.453f, 1.068f, 1.815f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 5.993f, -2.123f)
                curveToRelative(0.233f, -0.487f, 0.14f, -1f, -0.136f, -1.37f)
                arcTo(1.459f, 1.459f, 0f, false, false, 14.757f, 15f)
                horizontalLineToRelative(-0.507f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.349f)
                arcToRelative(2.999f, 2.999f, 0f, false, true, -3.887f, 1.21f)
                curveToRelative(-0.091f, -0.043f, -0.212f, -0.186f, -0.212f, -0.46f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(-1.94f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyBangladeshi!!
    }

private var _DocumentCurrencyBangladeshi: ImageVector? = null

