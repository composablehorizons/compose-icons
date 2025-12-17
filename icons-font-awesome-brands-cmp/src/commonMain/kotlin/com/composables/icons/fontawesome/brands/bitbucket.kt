package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Bitbucket: ImageVector
    get() {
        if (_Bitbucket != null) return _Bitbucket!!
        
        _Bitbucket = ImageVector.Builder(
            name = "bitbucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.2f, 32f)
                arcTo(16f, 16f, 0f, false, false, 6f, 47.8f)
                arcToRelative(26.35f, 26.35f, 0f, false, false, 0.2f, 2.8f)
                lineToRelative(67.9f, 412.1f)
                arcToRelative(21.77f, 21.77f, 0f, false, false, 21.3f, 18.2f)
                horizontalLineToRelative(325.7f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -13.4f)
                lineTo(505f, 50.7f)
                arcToRelative(16f, 16f, 0f, false, false, -13.2f, -18.3f)
                arcToRelative(24.58f, 24.58f, 0f, false, false, -2.8f, -0.2f)
                lineTo(22.2f, 32f)
                close()
                moveToRelative(285.9f, 297.8f)
                horizontalLineToRelative(-104f)
                lineToRelative(-28.1f, -147f)
                horizontalLineToRelative(157.3f)
                lineToRelative(-25.2f, 147f)
                close()
            }
        }.build()
        
        return _Bitbucket!!
    }

private var _Bitbucket: ImageVector? = null

