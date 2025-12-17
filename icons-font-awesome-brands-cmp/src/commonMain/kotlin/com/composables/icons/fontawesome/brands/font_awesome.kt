package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FontAwesome: ImageVector
    get() {
        if (_FontAwesome != null) return _FontAwesome!!
        
        _FontAwesome = ImageVector.Builder(
            name = "font-awesome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                arcTo(48f, 48f, 0f, false, false, 0f, 80f)
                verticalLineTo(432f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineTo(400f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(80f)
                arcTo(48f, 48f, 0f, false, false, 400f, 32f)
                close()
                moveTo(336f, 312f)
                curveToRelative(-31.6f, 11.2f, -41.2f, 16f, -59.8f, 16f)
                curveToRelative(-31.4f, 0f, -43.2f, -16f, -74.6f, -16f)
                arcToRelative(80f, 80f, 0f, false, false, -25.6f, 4f)
                verticalLineTo(284f)
                arcToRelative(85.9f, 85.9f, 0f, false, true, 25.6f, -4f)
                curveToRelative(31.2f, 0f, 43.2f, 16f, 74.6f, 16f)
                curveToRelative(10.2f, 0f, 17.8f, -1.4f, 27.8f, -4.6f)
                verticalLineToRelative(-96f)
                curveToRelative(-10f, 3.2f, -17.6f, 4.6f, -27.8f, 4.6f)
                curveToRelative(-31.4f, 0f, -43.2f, -16f, -74.6f, -16f)
                curveToRelative(-25.4f, 0f, -37.4f, 10.4f, -57.6f, 14.4f)
                verticalLineTo(352f)
                arcToRelative(16f, 16f, 0f, false, true, -32f, 0f)
                verticalLineTo(160f)
                arcToRelative(16f, 16f, 0f, false, true, 32f, 0f)
                verticalLineToRelative(6.4f)
                curveToRelative(20.2f, -4f, 32.2f, -14.4f, 57.6f, -14.4f)
                curveToRelative(31.2f, 0f, 43.2f, 16f, 74.6f, 16f)
                curveToRelative(18.6f, 0f, 28.2f, -4.8f, 59.8f, -16f)
                close()
            }
        }.build()
        
        return _FontAwesome!!
    }

private var _FontAwesome: ImageVector? = null

