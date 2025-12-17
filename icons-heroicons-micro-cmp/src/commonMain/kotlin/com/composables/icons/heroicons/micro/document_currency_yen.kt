package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyYen: ImageVector
    get() {
        if (_DocumentCurrencyYen != null) return _DocumentCurrencyYen!!
        
        _DocumentCurrencyYen = ImageVector.Builder(
            name = "document-currency-yen",
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
                moveToRelative(3.663f, 1.801f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.2f, 0.9f)
                lineTo(6.313f, 8f)
                horizontalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 5f, 12f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(11f)
                arcTo(0.75f, 0.75f, 0f, false, false, 11f, 8f)
                horizontalLineTo(9.687f)
                lineToRelative(1.35f, -1.799f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.2f, -0.9f)
                lineTo(8f, 7.75f)
                lineTo(6.163f, 5.3f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyYen!!
    }

private var _DocumentCurrencyYen: ImageVector? = null

