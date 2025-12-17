package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.YCombinator: ImageVector
    get() {
        if (_YCombinator != null) return _YCombinator!!
        
        _YCombinator = ImageVector.Builder(
            name = "y-combinator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 32f)
                verticalLineToRelative(448f)
                horizontalLineTo(0f)
                verticalLineTo(32f)
                horizontalLineToRelative(448f)
                close()
                moveTo(236f, 287.5f)
                lineTo(313.5f, 142f)
                horizontalLineToRelative(-32.7f)
                lineTo(235f, 233f)
                curveToRelative(-4.7f, 9.3f, -9f, 18.3f, -12.8f, 26.8f)
                lineTo(210f, 233f)
                lineToRelative(-45.2f, -91f)
                horizontalLineToRelative(-35f)
                lineToRelative(76.7f, 143.8f)
                verticalLineToRelative(94.5f)
                horizontalLineTo(236f)
                verticalLineToRelative(-92.8f)
                close()
            }
        }.build()
        
        return _YCombinator!!
    }

private var _YCombinator: ImageVector? = null

