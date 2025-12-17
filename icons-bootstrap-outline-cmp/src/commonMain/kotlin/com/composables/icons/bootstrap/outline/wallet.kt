package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Wallet: ImageVector
    get() {
        if (_Wallet != null) return _Wallet!!
        
        _Wallet = ImageVector.Builder(
            name = "wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(15f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 0f, 12.5f)
                close()
                moveToRelative(1f, 1.732f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1f, -0.268f)
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null

