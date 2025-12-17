package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HouseHeart: ImageVector
    get() {
        if (_HouseHeart != null) return _HouseHeart!!
        
        _HouseHeart = ImageVector.Builder(
            name = "house-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.293f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineTo(11f, 3.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.293f)
                lineToRelative(2.354f, 2.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.707f)
                lineTo(8f, 2.207f)
                lineTo(1.354f, 8.853f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 9.293f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 15f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                close()
                moveToRelative(-6f, -0.811f)
                curveToRelative(1.664f, -1.673f, 5.825f, 1.254f, 0f, 5.018f)
                curveToRelative(-5.825f, -3.764f, -1.664f, -6.691f, 0f, -5.018f)
            }
        }.build()
        
        return _HouseHeart!!
    }

private var _HouseHeart: ImageVector? = null

