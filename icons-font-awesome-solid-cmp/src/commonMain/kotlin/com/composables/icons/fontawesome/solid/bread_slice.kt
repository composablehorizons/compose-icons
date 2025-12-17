package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BreadSlice: ImageVector
    get() {
        if (_BreadSlice != null) return _BreadSlice!!
        
        _BreadSlice = ImageVector.Builder(
            name = "bread-slice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 0f)
                curveTo(108f, 0f, 0f, 93.4f, 0f, 169.14f)
                curveTo(0f, 199.44f, 24.24f, 224f, 64f, 224f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 17.67f, 16.12f, 32f, 36f, 32f)
                horizontalLineToRelative(376f)
                curveToRelative(19.88f, 0f, 36f, -14.33f, 36f, -32f)
                verticalLineTo(224f)
                curveToRelative(39.76f, 0f, 64f, -24.56f, 64f, -54.86f)
                curveTo(576f, 93.4f, 468f, 0f, 288f, 0f)
                close()
            }
        }.build()
        
        return _BreadSlice!!
    }

private var _BreadSlice: ImageVector? = null

