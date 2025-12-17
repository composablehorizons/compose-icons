package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Basket3: ImageVector
    get() {
        if (_Basket3 != null) return _Basket3!!
        
        _Basket3 = ImageVector.Builder(
            name = "basket3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.757f, 1.071f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.172f, 0.686f)
                lineTo(3.383f, 6f)
                horizontalLineToRelative(9.234f)
                lineTo(10.07f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.858f, -0.514f)
                lineTo(13.783f, 6f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 6f)
                horizontalLineToRelative(1.717f)
                lineTo(5.07f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.686f, -0.172f)
                close()
                moveTo(2.468f, 15.426f)
                lineTo(0.943f, 9f)
                horizontalLineToRelative(14.114f)
                lineToRelative(-1.525f, 6.426f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.729f, 0.574f)
                horizontalLineTo(3.197f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.73f, -0.574f)
                close()
            }
        }.build()
        
        return _Basket3!!
    }

private var _Basket3: ImageVector? = null

