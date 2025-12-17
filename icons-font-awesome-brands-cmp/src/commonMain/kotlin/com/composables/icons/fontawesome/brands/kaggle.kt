package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Kaggle: ImageVector
    get() {
        if (_Kaggle != null) return _Kaggle!!
        
        _Kaggle = ImageVector.Builder(
            name = "kaggle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304.2f, 501.5f)
                lineTo(158.4f, 320.3f)
                lineTo(298.2f, 185f)
                curveToRelative(2.6f, -2.7f, 1.7f, -10.5f, -5.3f, -10.5f)
                horizontalLineToRelative(-69.2f)
                curveToRelative(-3.5f, 0f, -7f, 1.8f, -10.5f, 5.3f)
                lineTo(80.9f, 313.5f)
                verticalLineTo(7.5f)
                quadToRelative(0f, -7.5f, -7.5f, -7.5f)
                horizontalLineTo(21.5f)
                quadTo(14f, 0f, 14f, 7.5f)
                verticalLineToRelative(497f)
                quadToRelative(0f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(51.9f)
                quadToRelative(7.5f, 0f, 7.5f, -7.5f)
                verticalLineToRelative(-109f)
                lineToRelative(30.8f, -29.3f)
                lineToRelative(110.5f, 140.6f)
                curveToRelative(3f, 3.5f, 6.5f, 5.3f, 10.5f, 5.3f)
                horizontalLineToRelative(66.9f)
                quadToRelative(5.25f, 0f, 6f, -3f)
                close()
            }
        }.build()
        
        return _Kaggle!!
    }

private var _Kaggle: ImageVector? = null

