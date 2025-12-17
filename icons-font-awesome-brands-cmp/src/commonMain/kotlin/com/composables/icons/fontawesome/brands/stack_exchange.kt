package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.StackExchange: ImageVector
    get() {
        if (_StackExchange != null) return _StackExchange!!
        
        _StackExchange = ImageVector.Builder(
            name = "stack-exchange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.7f, 332.3f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(22f)
                curveToRelative(0f, 37.7f, -29.3f, 68f, -65.3f, 68f)
                horizontalLineToRelative(-19f)
                lineTo(259.3f, 512f)
                verticalLineToRelative(-89.7f)
                horizontalLineTo(83f)
                curveToRelative(-36f, 0f, -65.3f, -30.3f, -65.3f, -68f)
                verticalLineToRelative(-22f)
                close()
                moveToRelative(0f, -23.6f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(-85f)
                horizontalLineTo(17.7f)
                verticalLineToRelative(85f)
                close()
                moveToRelative(0f, -109.4f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(-85f)
                horizontalLineTo(17.7f)
                verticalLineToRelative(85f)
                close()
                moveTo(365f, 0f)
                horizontalLineTo(83f)
                curveTo(47f, 0f, 17.7f, 30.3f, 17.7f, 67.7f)
                verticalLineTo(90f)
                horizontalLineToRelative(412.7f)
                verticalLineTo(67.7f)
                curveTo(430.3f, 30.3f, 401f, 0f, 365f, 0f)
                close()
            }
        }.build()
        
        return _StackExchange!!
    }

private var _StackExchange: ImageVector? = null

