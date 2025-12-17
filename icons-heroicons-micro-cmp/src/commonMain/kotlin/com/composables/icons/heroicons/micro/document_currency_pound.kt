package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyPound: ImageVector
    get() {
        if (_DocumentCurrencyPound != null) return _DocumentCurrencyPound!!
        
        _DocumentCurrencyPound = ImageVector.Builder(
            name = "document-currency-pound",
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
                moveToRelative(5.44f, 3.44f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.12f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.061f, -1.061f)
                arcTo(3f, 3f, 0f, false, false, 6f, 7.999f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.225f)
                curveToRelative(-0.116f, 0.571f, -0.62f, 1f, -1.225f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(7.2f)
                curveToRelative(0.156f, -0.304f, 0.257f, -0.642f, 0.289f, -1f)
                horizontalLineTo(9.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(7.5f)
                curveToRelative(0f, -0.384f, 0.146f, -0.767f, 0.44f, -1.06f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyPound!!
    }

private var _DocumentCurrencyPound: ImageVector? = null

