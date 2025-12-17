package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pencil: ImageVector
    get() {
        if (_Pencil != null) return _Pencil!!
        
        _Pencil = ImageVector.Builder(
            name = "pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineTo(10.5f, 1.793f)
                lineTo(14.207f, 5.5f)
                lineToRelative(1.647f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                close()
                moveToRelative(0.646f, 6.061f)
                lineTo(9.793f, 2.5f)
                lineTo(3.293f, 9f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.207f)
                close()
                moveToRelative(-7.468f, 7.468f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 13.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.175f, -0.032f)
                lineToRelative(-0.179f, 0.178f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.11f, 0.168f)
                lineToRelative(-2f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.65f, 0.65f)
                lineToRelative(5f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.168f, -0.11f)
                close()
            }
        }.build()
        
        return _Pencil!!
    }

private var _Pencil: ImageVector? = null

