package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Wallet2: ImageVector
    get() {
        if (_Wallet2 != null) return _Wallet2!!
        
        _Wallet2 = ImageVector.Builder(
            name = "wallet2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.136f, 0.326f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 1.78f)
                verticalLineTo(3f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 4.5f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 13.5f)
                verticalLineToRelative(-9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.432f, -1.499f)
                close()
                moveTo(5.562f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(1.78f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.621f, -0.484f)
                close()
                moveTo(1.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Wallet2!!
    }

private var _Wallet2: ImageVector? = null

