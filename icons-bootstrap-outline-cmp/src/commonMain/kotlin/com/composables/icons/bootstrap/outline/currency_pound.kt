package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) return _CurrencyPound!!
        
        _CurrencyPound = ImageVector.Builder(
            name = "currency-pound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8.585f)
                horizontalLineToRelative(1.969f)
                curveToRelative(0.115f, 0.465f, 0.186f, 0.939f, 0.186f, 1.43f)
                curveToRelative(0f, 1.385f, -0.736f, 2.496f, -2.075f, 2.771f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineToRelative(-1.24f)
                horizontalLineTo(6.492f)
                verticalLineToRelative(-0.129f)
                curveToRelative(0.825f, -0.525f, 1.135f, -1.446f, 1.135f, -2.694f)
                curveToRelative(0f, -0.465f, -0.07f, -0.913f, -0.168f, -1.352f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(-0.972f)
                horizontalLineTo(7.22f)
                curveToRelative(-0.186f, -0.723f, -0.372f, -1.455f, -0.372f, -2.247f)
                curveToRelative(0f, -1.274f, 1.047f, -2.066f, 2.58f, -2.066f)
                arcToRelative(5.3f, 5.3f, 0f, false, true, 2.103f, 0.465f)
                verticalLineTo(2.456f)
                arcTo(5.6f, 5.6f, 0f, false, false, 9.348f, 2f)
                curveTo(6.865f, 2f, 5.322f, 3.291f, 5.322f, 5.366f)
                curveToRelative(0f, 0.775f, 0.195f, 1.515f, 0.399f, 2.247f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _CurrencyPound!!
    }

private var _CurrencyPound: ImageVector? = null

