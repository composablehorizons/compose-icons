package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Digg: ImageVector
    get() {
        if (_Digg != null) return _Digg!!
        
        _Digg = ImageVector.Builder(
            name = "digg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(81.7f, 172.3f)
                horizontalLineTo(0f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(132.7f)
                verticalLineTo(96f)
                horizontalLineToRelative(-51f)
                verticalLineToRelative(76.3f)
                close()
                moveToRelative(0f, 133.4f)
                horizontalLineTo(50.9f)
                verticalLineToRelative(-92.3f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                close()
                moveToRelative(297.2f, -133.4f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(81.8f)
                verticalLineToRelative(28.5f)
                horizontalLineToRelative(-81.8f)
                verticalLineTo(416f)
                horizontalLineTo(512f)
                verticalLineTo(172.3f)
                horizontalLineTo(378.9f)
                close()
                moveToRelative(81.8f, 133.4f)
                horizontalLineToRelative(-30.8f)
                verticalLineToRelative(-92.3f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                close()
                moveToRelative(-235.6f, 41f)
                horizontalLineToRelative(82.1f)
                verticalLineToRelative(28.5f)
                horizontalLineToRelative(-82.1f)
                verticalLineTo(416f)
                horizontalLineToRelative(133.3f)
                verticalLineTo(172.3f)
                horizontalLineTo(225.1f)
                verticalLineToRelative(174.4f)
                close()
                moveToRelative(51.2f, -133.3f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                horizontalLineToRelative(-30.8f)
                verticalLineToRelative(-92.3f)
                close()
                moveTo(153.3f, 96f)
                horizontalLineToRelative(51.3f)
                verticalLineToRelative(51f)
                horizontalLineToRelative(-51.3f)
                verticalLineTo(96f)
                close()
                moveToRelative(0f, 76.3f)
                horizontalLineToRelative(51.3f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(-51.3f)
                verticalLineTo(172.3f)
                close()
            }
        }.build()
        
        return _Digg!!
    }

private var _Digg: ImageVector? = null

