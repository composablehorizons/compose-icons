package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HouseAdd: ImageVector
    get() {
        if (_HouseAdd != null) return _HouseAdd!!
        
        _HouseAdd = ImageVector.Builder(
            name = "house-add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.707f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineTo(0.646f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(2f, 8.207f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 15f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(7.207f)
                lineToRelative(5f, -5f)
                lineToRelative(6.646f, 6.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(13f, 5.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-3.5f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
        }.build()
        
        return _HouseAdd!!
    }

private var _HouseAdd: ImageVector? = null

