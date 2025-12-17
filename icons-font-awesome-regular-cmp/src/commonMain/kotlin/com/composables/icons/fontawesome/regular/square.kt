package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Square: ImageVector
    get() {
        if (_Square != null) return _Square!!
        
        _Square = ImageVector.Builder(
            name = "square",
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
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-6f, 400f)
                horizontalLineTo(54f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineTo(86f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(340f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(340f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                close()
            }
        }.build()
        
        return _Square!!
    }

private var _Square: ImageVector? = null

