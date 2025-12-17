package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cheese: ImageVector
    get() {
        if (_Cheese != null) return _Cheese!!
        
        _Cheese = ImageVector.Builder(
            name = "cheese",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 288f)
                verticalLineToRelative(160f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(448f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(288f)
                close()
                moveTo(299.83f, 32f)
                arcToRelative(32f, 32f, 0f, false, false, -21.13f, 7f)
                lineTo(0f, 256f)
                horizontalLineToRelative(512f)
                curveToRelative(0f, -119.89f, -94f, -217.8f, -212.17f, -224f)
                close()
            }
        }.build()
        
        return _Cheese!!
    }

private var _Cheese: ImageVector? = null

