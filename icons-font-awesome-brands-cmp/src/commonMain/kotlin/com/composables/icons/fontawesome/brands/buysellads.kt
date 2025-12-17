package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Buysellads: ImageVector
    get() {
        if (_Buysellads != null) return _Buysellads!!
        
        _Buysellads = ImageVector.Builder(
            name = "buysellads",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 150.7f)
                lineToRelative(42.9f, 160.7f)
                horizontalLineToRelative(-85.8f)
                lineTo(224f, 150.7f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-65.3f, 325.3f)
                lineToRelative(-94.5f, -298.7f)
                horizontalLineTo(159.8f)
                lineTo(65.3f, 405.3f)
                horizontalLineTo(156f)
                lineToRelative(111.7f, -91.6f)
                lineToRelative(24.2f, 91.6f)
                horizontalLineToRelative(90.8f)
                close()
            }
        }.build()
        
        return _Buysellads!!
    }

private var _Buysellads: ImageVector? = null

