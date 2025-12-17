package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BagHeart: ImageVector
    get() {
        if (_BagHeart != null) return _BagHeart!!
        
        _BagHeart = ImageVector.Builder(
            name = "bag-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 4f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                close()
                moveTo(8f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.5f, 2.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8f, 1f)
                moveToRelative(0f, 6.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _BagHeart!!
    }

private var _BagHeart: ImageVector? = null

