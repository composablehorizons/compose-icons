package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HouseHeart: ImageVector
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
                moveTo(8f, 6.982f)
                curveTo(9.664f, 5.309f, 13.825f, 8.236f, 8f, 12f)
                curveTo(2.175f, 8.236f, 6.336f, 5.309f, 8f, 6.982f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.707f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineTo(0.646f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.707f)
                lineTo(2f, 8.207f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 15f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8.207f)
                lineToRelative(0.646f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.707f)
                lineTo(13f, 5.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                close()
                moveTo(13f, 7.207f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(7.207f)
                lineToRelative(5f, -5f)
                close()
            }
        }.build()
        
        return _HouseHeart!!
    }

private var _HouseHeart: ImageVector? = null

