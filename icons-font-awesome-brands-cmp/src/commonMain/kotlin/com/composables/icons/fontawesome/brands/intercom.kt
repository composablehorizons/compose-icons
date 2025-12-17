package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Intercom: ImageVector
    get() {
        if (_Intercom != null) return _Intercom!!
        
        _Intercom = ImageVector.Builder(
            name = "intercom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392f, 32f)
                horizontalLineTo(56f)
                curveTo(25.1f, 32f, 0f, 57.1f, 0f, 88f)
                verticalLineToRelative(336f)
                curveToRelative(0f, 30.9f, 25.1f, 56f, 56f, 56f)
                horizontalLineToRelative(336f)
                curveToRelative(30.9f, 0f, 56f, -25.1f, 56f, -56f)
                verticalLineTo(88f)
                curveToRelative(0f, -30.9f, -25.1f, -56f, -56f, -56f)
                close()
                moveToRelative(-108.3f, 82.1f)
                curveToRelative(0f, -19.8f, 29.9f, -19.8f, 29.9f, 0f)
                verticalLineToRelative(199.5f)
                curveToRelative(0f, 19.8f, -29.9f, 19.8f, -29.9f, 0f)
                verticalLineTo(114.1f)
                close()
                moveToRelative(-74.6f, -7.5f)
                curveToRelative(0f, -19.8f, 29.9f, -19.8f, 29.9f, 0f)
                verticalLineToRelative(216.5f)
                curveToRelative(0f, 19.8f, -29.9f, 19.8f, -29.9f, 0f)
                verticalLineTo(106.6f)
                close()
                moveToRelative(-74.7f, 7.5f)
                curveToRelative(0f, -19.8f, 29.9f, -19.8f, 29.9f, 0f)
                verticalLineToRelative(199.5f)
                curveToRelative(0f, 19.8f, -29.9f, 19.8f, -29.9f, 0f)
                verticalLineTo(114.1f)
                close()
                moveTo(59.7f, 144f)
                curveToRelative(0f, -19.8f, 29.9f, -19.8f, 29.9f, 0f)
                verticalLineToRelative(134.3f)
                curveToRelative(0f, 19.8f, -29.9f, 19.8f, -29.9f, 0f)
                verticalLineTo(144f)
                close()
                moveToRelative(323.4f, 227.8f)
                curveToRelative(-72.8f, 63f, -241.7f, 65.4f, -318.1f, 0f)
                curveToRelative(-15f, -12.8f, 4.4f, -35.5f, 19.4f, -22.7f)
                curveToRelative(65.9f, 55.3f, 216.1f, 53.9f, 279.3f, 0f)
                curveToRelative(14.9f, -12.9f, 34.3f, 9.8f, 19.4f, 22.7f)
                close()
                moveToRelative(5.2f, -93.5f)
                curveToRelative(0f, 19.8f, -29.9f, 19.8f, -29.9f, 0f)
                verticalLineTo(144f)
                curveToRelative(0f, -19.8f, 29.9f, -19.8f, 29.9f, 0f)
                verticalLineToRelative(134.3f)
                close()
            }
        }.build()
        
        return _Intercom!!
    }

private var _Intercom: ImageVector? = null

