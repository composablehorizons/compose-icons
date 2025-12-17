package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BagHeart: ImageVector
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
                moveTo(10.5f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(5f)
                close()
                moveToRelative(1f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 7f, 0f)
                moveTo(14f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveTo(8f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _BagHeart!!
    }

private var _BagHeart: ImageVector? = null

