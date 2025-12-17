package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Wallet: ImageVector
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
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 3.5f)
                verticalLineToRelative(0.401f)
                arcToRelative(2.986f, 2.986f, 0f, false, false, -1.5f, -0.401f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.546f, 0f, -1.059f, 0.146f, -1.5f, 0.401f)
                verticalLineTo(3.5f)
                close()
                moveTo(3.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 6.5f)
                verticalLineToRelative(0.401f)
                arcTo(2.986f, 2.986f, 0f, false, true, 3.5f, 6.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.546f, 0f, 1.059f, 0.146f, 1.5f, 0.401f)
                verticalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 5f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, false, false, 1.938f, -1.505f)
                curveToRelative(0.068f, -0.268f, 0.286f, -0.495f, 0.562f, -0.495f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 9.5f)
                verticalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 12.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(0.276f, 0f, 0.494f, 0.227f, 0.562f, 0.495f)
                arcTo(2f, 2f, 0f, false, false, 8f, 10f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null

