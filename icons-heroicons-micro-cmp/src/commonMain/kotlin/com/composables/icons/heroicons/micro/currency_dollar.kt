package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) return _CurrencyDollar!!
        
        _CurrencyDollar = ImageVector.Builder(
            name = "currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.375f, 5.5f)
                horizontalLineToRelative(0.875f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-0.875f)
                arcToRelative(0.875f, 0.875f, 0f, true, true, 0f, -1.75f)
                close()
                moveTo(8.75f, 10.5f)
                verticalLineTo(8.75f)
                horizontalLineToRelative(0.875f)
                arcToRelative(0.875f, 0.875f, 0f, false, true, 0f, 1.75f)
                horizontalLineTo(8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveTo(7.25f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(0.875f)
                arcToRelative(2.375f, 2.375f, 0f, true, true, 0f, 4.75f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(12f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(8.75f)
                horizontalLineToRelative(-0.875f)
                arcToRelative(2.375f, 2.375f, 0f, true, true, 0f, -4.75f)
                horizontalLineToRelative(0.875f)
                verticalLineToRelative(-0.25f)
                close()
            }
        }.build()
        
        return _CurrencyDollar!!
    }

private var _CurrencyDollar: ImageVector? = null

