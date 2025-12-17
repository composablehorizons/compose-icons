package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyRupee: ImageVector
    get() {
        if (_DocumentCurrencyRupee != null) return _DocumentCurrencyRupee!!
        
        _DocumentCurrencyRupee = ImageVector.Builder(
            name = "document-currency-rupee",
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
                moveToRelative(-4.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.769f, 0f, 1.43f, 0.463f, 1.719f, 1.125f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.094f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.719f, 1.125f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, 1.28f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.193f, -1.194f)
                arcToRelative(3.382f, 3.382f, 0f, false, false, 2.08f, -2.401f)
                horizontalLineToRelative(0.833f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.834f)
                arcTo(3.357f, 3.357f, 0f, false, false, 12.932f, 12f)
                horizontalLineToRelative(1.318f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(10.5f)
                curveToRelative(-0.04f, 0f, -0.08f, 0.003f, -0.12f, 0.01f)
                arcToRelative(3.425f, 3.425f, 0f, false, false, -0.255f, -0.01f)
                horizontalLineTo(9.75f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyRupee!!
    }

private var _DocumentCurrencyRupee: ImageVector? = null

