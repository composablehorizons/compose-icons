package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) return _CurrencyRupee!!
        
        _CurrencyRupee = ImageVector.Builder(
            name = "currency-rupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3.06f)
                horizontalLineToRelative(2.726f)
                curveToRelative(1.22f, 0f, 2.12f, 0.575f, 2.325f, 1.724f)
                horizontalLineTo(4f)
                verticalLineToRelative(1.051f)
                horizontalLineToRelative(5.051f)
                curveTo(8.855f, 7.001f, 8f, 7.558f, 6.788f, 7.558f)
                horizontalLineTo(4f)
                verticalLineToRelative(1.317f)
                lineTo(8.437f, 14f)
                horizontalLineToRelative(2.11f)
                lineTo(6.095f, 8.884f)
                horizontalLineToRelative(0.855f)
                curveToRelative(2.316f, -0.018f, 3.465f, -1.476f, 3.688f, -3.049f)
                horizontalLineTo(12f)
                verticalLineTo(4.784f)
                horizontalLineToRelative(-1.345f)
                curveToRelative(-0.08f, -0.778f, -0.357f, -1.335f, -0.793f, -1.732f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _CurrencyRupee!!
    }

private var _CurrencyRupee: ImageVector? = null

