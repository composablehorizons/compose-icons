package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FontAwesomeAlt: ImageVector
    get() {
        if (_FontAwesomeAlt != null) return _FontAwesomeAlt!!
        
        _FontAwesomeAlt = ImageVector.Builder(
            name = "font-awesome-alt",
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
                moveToRelative(16f, 400f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(80f)
                arcTo(16f, 16f, 0f, false, true, 48f, 64f)
                horizontalLineTo(400f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveTo(201.6f, 152f)
                curveToRelative(-25.4f, 0f, -37.4f, 10.4f, -57.6f, 14.4f)
                verticalLineTo(160f)
                arcToRelative(16f, 16f, 0f, false, false, -32f, 0f)
                verticalLineTo(352f)
                arcToRelative(16f, 16f, 0f, false, false, 32f, 0f)
                verticalLineTo(198.4f)
                curveToRelative(20.2f, -4f, 32.2f, -14.4f, 57.6f, -14.4f)
                curveToRelative(31.4f, 0f, 43.2f, 16f, 74.6f, 16f)
                curveToRelative(10.2f, 0f, 17.8f, -1.4f, 27.8f, -4.6f)
                verticalLineToRelative(96f)
                curveToRelative(-10f, 3.2f, -17.6f, 4.6f, -27.8f, 4.6f)
                curveToRelative(-31.4f, 0f, -43.4f, -16f, -74.6f, -16f)
                arcToRelative(85.9f, 85.9f, 0f, false, false, -25.6f, 4f)
                verticalLineToRelative(32f)
                arcToRelative(80f, 80f, 0f, false, true, 25.6f, -4f)
                curveToRelative(31.4f, 0f, 43.2f, 16f, 74.6f, 16f)
                curveToRelative(18.6f, 0f, 28.2f, -4.8f, 59.8f, -16f)
                verticalLineTo(152f)
                curveToRelative(-31.6f, 11.2f, -41.2f, 16f, -59.8f, 16f)
                curveTo(244.8f, 168f, 232.8f, 152f, 201.6f, 152f)
                close()
            }
        }.build()
        
        return _FontAwesomeAlt!!
    }

private var _FontAwesomeAlt: ImageVector? = null

