package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PostageHeart: ImageVector
    get() {
        if (_PostageHeart != null) return _PostageHeart!!
        
        _PostageHeart = ImageVector.Builder(
            name = "postage-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(8f, 11f)
                curveTo(2.175f, 7.236f, 6.336f, 4.31f, 8f, 5.982f)
                curveTo(9.664f, 4.309f, 13.825f, 7.236f, 8f, 11f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                horizontalLineTo(15f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                close()
                moveTo(4f, 14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
        }.build()
        
        return _PostageHeart!!
    }

private var _PostageHeart: ImageVector? = null

