package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Simplybuilt: ImageVector
    get() {
        if (_Simplybuilt != null) return _Simplybuilt!!
        
        _Simplybuilt = ImageVector.Builder(
            name = "simplybuilt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481.2f, 64f)
                horizontalLineToRelative(-106f)
                curveToRelative(-14.5f, 0f, -26.6f, 11.8f, -26.6f, 26.3f)
                verticalLineToRelative(39.6f)
                horizontalLineTo(163.3f)
                verticalLineTo(90.3f)
                curveToRelative(0f, -14.5f, -12f, -26.3f, -26.6f, -26.3f)
                horizontalLineToRelative(-106f)
                curveTo(16.1f, 64f, 4.3f, 75.8f, 4.3f, 90.3f)
                verticalLineToRelative(331.4f)
                curveToRelative(0f, 14.5f, 11.8f, 26.3f, 26.6f, 26.3f)
                horizontalLineToRelative(450.4f)
                curveToRelative(14.8f, 0f, 26.6f, -11.8f, 26.6f, -26.3f)
                verticalLineTo(90.3f)
                curveToRelative(-0.2f, -14.5f, -12f, -26.3f, -26.7f, -26.3f)
                close()
                moveTo(149.8f, 355.8f)
                curveToRelative(-36.6f, 0f, -66.4f, -29.7f, -66.4f, -66.4f)
                curveToRelative(0f, -36.9f, 29.7f, -66.6f, 66.4f, -66.6f)
                curveToRelative(36.9f, 0f, 66.6f, 29.7f, 66.6f, 66.6f)
                curveToRelative(0f, 36.7f, -29.7f, 66.4f, -66.6f, 66.4f)
                close()
                moveToRelative(212.4f, 0f)
                curveToRelative(-36.9f, 0f, -66.6f, -29.7f, -66.6f, -66.6f)
                curveToRelative(0f, -36.6f, 29.7f, -66.4f, 66.6f, -66.4f)
                curveToRelative(36.6f, 0f, 66.4f, 29.7f, 66.4f, 66.4f)
                curveToRelative(0f, 36.9f, -29.8f, 66.6f, -66.4f, 66.6f)
                close()
            }
        }.build()
        
        return _Simplybuilt!!
    }

private var _Simplybuilt: ImageVector? = null

