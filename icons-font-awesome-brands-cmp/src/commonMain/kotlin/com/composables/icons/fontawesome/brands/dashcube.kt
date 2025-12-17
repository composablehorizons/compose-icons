package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Dashcube: ImageVector
    get() {
        if (_Dashcube != null) return _Dashcube!!
        
        _Dashcube = ImageVector.Builder(
            name = "dashcube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(326.6f, 104f)
                horizontalLineTo(110.4f)
                curveToRelative(-51.1f, 0f, -91.2f, 43.3f, -91.2f, 93.5f)
                verticalLineTo(427f)
                curveToRelative(0f, 50.5f, 40.1f, 85f, 91.2f, 85f)
                horizontalLineToRelative(227.2f)
                curveToRelative(51.1f, 0f, 91.2f, -34.5f, 91.2f, -85f)
                verticalLineTo(0f)
                lineTo(326.6f, 104f)
                close()
                moveTo(153.9f, 416.5f)
                curveToRelative(-17.7f, 0f, -32.4f, -15.1f, -32.4f, -32.8f)
                verticalLineTo(240.8f)
                curveToRelative(0f, -17.7f, 14.7f, -32.5f, 32.4f, -32.5f)
                horizontalLineToRelative(140.7f)
                curveToRelative(17.7f, 0f, 32f, 14.8f, 32f, 32.5f)
                verticalLineToRelative(123.5f)
                lineToRelative(51.1f, 52.3f)
                horizontalLineTo(153.9f)
                close()
            }
        }.build()
        
        return _Dashcube!!
    }

private var _Dashcube: ImageVector? = null

