package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyEuro: ImageVector
    get() {
        if (_DocumentCurrencyEuro != null) return _DocumentCurrencyEuro!!
        
        _DocumentCurrencyEuro = ImageVector.Builder(
            name = "document-currency-euro",
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
                moveToRelative(4.552f, 2.734f)
                curveToRelative(0.354f, -0.59f, 0.72f, -0.734f, 0.948f, -0.734f)
                curveToRelative(0.228f, 0f, 0.594f, 0.145f, 0.948f, 0.734f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.286f, -0.772f)
                curveTo(9.71f, 4.588f, 8.924f, 4f, 8f, 4f)
                curveToRelative(-0.924f, 0f, -1.71f, 0.588f, -2.234f, 1.462f)
                curveToRelative(-0.192f, 0.32f, -0.346f, 0.67f, -0.464f, 1.038f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.268f)
                arcToRelative(7.003f, 7.003f, 0f, false, false, 0f, 1f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.552f)
                curveToRelative(0.118f, 0.367f, 0.272f, 0.717f, 0.464f, 1.037f)
                curveTo(6.29f, 12.412f, 7.076f, 13f, 8f, 13f)
                curveToRelative(0.924f, 0f, 1.71f, -0.588f, 2.234f, -1.463f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.286f, -0.771f)
                curveToRelative(-0.354f, 0.59f, -0.72f, 0.734f, -0.948f, 0.734f)
                curveToRelative(-0.228f, 0f, -0.594f, -0.145f, -0.948f, -0.734f)
                arcToRelative(3.078f, 3.078f, 0f, false, true, -0.142f, -0.266f)
                horizontalLineToRelative(0.34f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.727f)
                arcToRelative(5.496f, 5.496f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(0.727f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.34f)
                arcToRelative(3.08f, 3.08f, 0f, false, true, 0.142f, -0.266f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyEuro!!
    }

private var _DocumentCurrencyEuro: ImageVector? = null

