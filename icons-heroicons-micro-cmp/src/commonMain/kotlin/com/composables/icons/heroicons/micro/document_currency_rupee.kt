package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyRupee: ImageVector
    get() {
        if (_DocumentCurrencyRupee != null) return _DocumentCurrencyRupee!!
        
        _DocumentCurrencyRupee = ImageVector.Builder(
            name = "document-currency-rupee",
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
                moveTo(5.75f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                curveToRelative(0.698f, 0f, 1.3f, 0.409f, 1.582f, 1f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.582f)
                curveToRelative(-0.281f, 0.591f, -0.884f, 1f, -1.582f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, 1.28f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-0.567f, -0.567f)
                arcTo(3.256f, 3.256f, 0f, false, false, 8.913f, 9f)
                horizontalLineToRelative(1.337f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.913f)
                arcToRelative(3.232f, 3.232f, 0f, false, false, -0.424f, -1f)
                horizontalLineToRelative(1.761f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyRupee!!
    }

private var _DocumentCurrencyRupee: ImageVector? = null

