package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyPound: ImageVector
    get() {
        if (_DocumentCurrencyPound != null) return _DocumentCurrencyPound!!
        
        _DocumentCurrencyPound = ImageVector.Builder(
            name = "document-currency-pound",
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
                moveToRelative(-3.674f, 9.583f)
                arcToRelative(2.249f, 2.249f, 0f, false, true, 3.765f, -2.174f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                arcTo(3.75f, 3.75f, 0f, false, false, 9.076f, 15f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.156f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -0.206f, 1.559f)
                lineToRelative(-0.156f, 0.439f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.042f, 0.923f)
                lineToRelative(0.439f, -0.22f)
                arcToRelative(2.113f, 2.113f, 0f, false, true, 1.613f, -0.115f)
                arcToRelative(3.613f, 3.613f, 0f, false, false, 2.758f, -0.196f)
                lineToRelative(0.44f, -0.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.671f, -1.341f)
                lineToRelative(-0.44f, 0.22f)
                arcToRelative(2.113f, 2.113f, 0f, false, true, -1.613f, 0.114f)
                arcToRelative(3.612f, 3.612f, 0f, false, false, -1.745f, -0.134f)
                curveToRelative(0.048f, -0.341f, 0.062f, -0.686f, 0.042f, -1.029f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.379f)
                lineToRelative(-0.045f, -0.167f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyPound!!
    }

private var _DocumentCurrencyPound: ImageVector? = null

