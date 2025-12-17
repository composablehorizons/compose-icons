package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PostageHeart: ImageVector
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
                moveTo(3.5f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                horizontalLineTo(15f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                verticalLineTo(0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                moveTo(3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                curveTo(2.175f, 7.236f, 6.336f, 4.31f, 8f, 5.982f)
                curveTo(9.664f, 4.309f, 13.825f, 7.236f, 8f, 11f)
            }
        }.build()
        
        return _PostageHeart!!
    }

private var _PostageHeart: ImageVector? = null

